package com.hello_there.rotp_littlefeet.standeffect;

import com.github.standobyte.jojo.action.stand.effect.StandEffectInstance;
import com.github.standobyte.jojo.action.stand.effect.StandEffectType;
import com.hello_there.rotp_littlefeet.init.InitSounds;
import com.hello_there.rotp_littlefeet.init.InitStandEffects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.SoundCategory;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.util.ScaleUtils;

public class LittleFeetShrinkTargetEffect extends StandEffectInstance {

    public LittleFeetShrinkTargetEffect() {
        this(InitStandEffects.SHRINK_TARGET.get());
    }

    public LittleFeetShrinkTargetEffect(StandEffectType<?> effectType) {
        super(effectType);
    }

    @Override
    protected void start() {}

    @Deprecated
    // TODO remove this when the next public update comes out
    protected void tickTarget(LivingEntity target) {}

    private static final float MIN_SCALE = 0.15F;
    private static final float SHRINK_INCREMENT = 0.05F;
    private static final int SHRINK_INTERVAL = 160;
    @Override
    protected void tick() {
        if (!world.isClientSide()) {
            LivingEntity target = null;
            Entity t = getTarget();
            if (t instanceof LivingEntity) target = (LivingEntity) t;
            // TODO when the next update comes out, replace the monstrosity above with this line:
//            LivingEntity target = getTargetLiving();
            if (target == null) return;

            if (tickCount % SHRINK_INTERVAL == 0) {
                float currentScale = ScaleUtils.getMotionScale(target);

                if (currentScale > MIN_SCALE) {
                    float newScale = Math.max(MIN_SCALE, currentScale - SHRINK_INCREMENT);

                    ScaleUtils.setScaleOnSpawn(target, newScale);
                    ScaleUtils.getFallingScale(target, Math.max(0.1F, newScale * 1.5F));
                    ScaleUtils.getMotionScale(target, Math.max(0.2F, newScale * 1.2F));
                    ScaleUtils.getJumpHeightScale(target, Math.max(0.5F, newScale * 1.5F));
                    ScaleUtils.getModelHeightScale(target, Math.max(0.5F, newScale * 1.5F));
                    ScaleUtils.getModelWidthScale(target, Math.max(0.5F, newScale * 1.5F));
                    ScaleUtils.getBoundingBoxWidthScale(target, Math.max(0.5F, newScale * 1.5F));
                    ScaleUtils.getBoundingBoxHeightScale(target, Math.max(0.5F, newScale * 1.5F));
                    ScaleUtils.getHealthScale(target, Math.max(0.5F, newScale));
                    ScaleUtils.getExplosionScale(target, Math.max(0.5F, newScale));

                    world.playSound(null, target.blockPosition(), InitSounds.LITTLE_FEET_SHRINK.get(), SoundCategory.PLAYERS, 1.0F, 1.0F);
                }
            }
        }
    }

    @Override
    protected void stop() {
        if (!world.isClientSide()) {
            LivingEntity target = null;
            Entity t = getTarget();
            if (t instanceof LivingEntity) target = (LivingEntity) t;
            // TODO when the next update comes out, replace the monstrosity above with this line:
//            LivingEntity target = getTargetLiving();
            if (target != null) {
                for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
                    ScaleData userScaleData = scaleType.getScaleData(target);
                    userScaleData.setScale(1f);
                }
            }
        }
    }

    @Override
    protected boolean needsTarget() {
        return true;
    }

}
