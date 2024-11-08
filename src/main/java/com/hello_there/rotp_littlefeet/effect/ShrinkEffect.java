package com.hello_there.rotp_littlefeet.effect;

import com.github.standobyte.jojo.potion.UncurableEffect;
import com.hello_there.rotp_littlefeet.init.InitSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectType;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.util.ScaleUtils;

public class ShrinkEffect extends UncurableEffect {
    private static final float MIN_SCALE = 0.15F;
    private static final float SHRINK_INCREMENT = 0.05F;
    private static final int SHRINK_INTERVAL = 160;

    public ShrinkEffect(int color) {
        super(EffectType.HARMFUL, color);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        World world = entity.level;
        if (!world.isClientSide && entity != null) {
            float currentScale = ScaleUtils.getMotionScale(entity);

            if (currentScale > MIN_SCALE) {
                float newScale = Math.max(MIN_SCALE, currentScale - SHRINK_INCREMENT);

                ScaleUtils.setScaleOnSpawn(entity, newScale);
                ScaleUtils.getFallingScale(entity, Math.max(0.1F, newScale * 1.5F));
                ScaleUtils.getMotionScale(entity, Math.max(0.2F, newScale * 1.2F));
                ScaleUtils.getJumpHeightScale(entity, Math.max(0.5F, newScale * 1.5F));
                ScaleUtils.getModelHeightScale(entity, Math.max(0.5F, newScale * 1.5F));
                ScaleUtils.getModelWidthScale(entity, Math.max(0.5F, newScale * 1.5F));
                ScaleUtils.getBoundingBoxWidthScale(entity, Math.max(0.5F, newScale * 1.5F));
                ScaleUtils.getBoundingBoxHeightScale(entity, Math.max(0.5F, newScale * 1.5F));
                ScaleUtils.getHealthScale(entity, Math.max(0.5F, newScale));
                ScaleUtils.getExplosionScale(entity, Math.max(0.5F, newScale));

                world.playSound(null, entity.blockPosition(), InitSounds.LITTLE_FEET_SHRINK.get(), SoundCategory.PLAYERS, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % SHRINK_INTERVAL == 0;
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, net.minecraft.entity.ai.attributes.AttributeModifierManager attributeManager, int amplifier) {
        super.removeAttributeModifiers(entity, attributeManager, amplifier);

        float targetScale = 1F;

        for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
            ScaleData userScaleData = scaleType.getScaleData(entity);
            userScaleData.setScale(targetScale);
        }
    }
}