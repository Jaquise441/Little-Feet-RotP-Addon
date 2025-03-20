package com.hello_there.rotp_littlefeet.standeffect;

import java.util.Optional;
import java.util.Set;

import com.github.standobyte.jojo.action.stand.effect.StandEffectInstance;
import com.github.standobyte.jojo.action.stand.effect.StandEffectType;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.hello_there.rotp_littlefeet.init.InitSounds;
import com.hello_there.rotp_littlefeet.init.InitStandEffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleModifier;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleTypes;
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

    private static final float MIN_SCALE = 0.15F;
    private static final float SHRINK_INCREMENT = 0.05F;
    private static final int SHRINK_INTERVAL = 160;
    @Override
    protected void tick() {
        if (!world.isClientSide()) {
            LivingEntity target = getTargetLiving();
            if (target == null) return;

            if (tickCount % SHRINK_INTERVAL == 0) {
                float currentScale = ScaleUtils.getMotionScale(target);

                if (currentScale > MIN_SCALE) {
                    float newScale = Math.max(MIN_SCALE, currentScale - SHRINK_INCREMENT);
                    setShrinkScaleValue(target, newScale);
                    world.playSound(null, target.blockPosition(), InitSounds.LITTLE_FEET_SHRINK.get(), SoundCategory.PLAYERS, 1.0F, 1.0F);
                }
            }
            updateStandEntityScale(target);
        }
    }

    public static void setShrinkScaleValue(LivingEntity target, float scale) {
        if (scale < 1) {
            ScaleData targetScale = ScaleTypes.BASE.getScaleData(target);
            targetScale.setScaleTickDelay(1);
            targetScale.setTargetScale(scale);
            ScaleTypes.ATTACK.getScaleData(target).setScale(scale);
            ScaleTypes.DEFENSE.getScaleData(target).setScale(scale);
            ScaleTypes.KNOCKBACK.getScaleData(target).setScale((scale - 0.15f) / 0.85f);
            ScaleTypes.MINING_SPEED.getScaleData(target).setScale(scale);
            ScaleTypes.HEALTH.getScaleData(target).setScale(scale);

        }
    }

    public static void resetShrink(LivingEntity target) {
        for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
            ScaleData userScaleData = scaleType.getScaleData(target);
            userScaleData.resetScale();
        }
    }

    public static void updateStandEntityScale(LivingEntity standUser) {
        Optional<StandEntity> targetStand = IStandPower.getStandPowerOptional(standUser).resolve().map(power -> {
            if (power.getStandManifestation() instanceof StandEntity) {
                return (StandEntity) power.getStandManifestation();
            }
            return null;
        });
        targetStand.ifPresent(standEntity -> updateStandEntityScale(standUser, standEntity));
    }

    public static void updateStandEntityScale(LivingEntity standUser, StandEntity standEntity) {
        float baseScale = ScaleTypes.BASE.getScaleData(standUser).getScale();
        ScaleTypes.BASE.getScaleData(standEntity).setScale(baseScale);
        for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
        ScaleData userScaleData = scaleType.getScaleData(standUser);
            ScaleData standScaleData = scaleType.getScaleData(standEntity);
            
            Set<ScaleModifier> standModifiers = standScaleData.getBaseValueModifiers();
            standModifiers.clear();
            standModifiers.addAll(userScaleData.getBaseValueModifiers());
            standScaleData.setScaleTickDelay(userScaleData.getScaleTickDelay());
            standScaleData.setBaseScale(userScaleData.getBaseScale());
            standScaleData.setTargetScale(userScaleData.getTargetScale());
        }
    }

    @Override
    protected void stop() {
        if (!world.isClientSide()) {
            LivingEntity target = getTargetLiving();
            if (target != null) {
                resetShrink(target);
            }
        }
    }

    @Override
    protected boolean needsTarget() {
        return true;
    }
    
    
    
    @Mod.EventBusSubscriber
    public static class EventHandler {
        
        @SubscribeEvent
        public static void onStandSummon(EntityJoinWorldEvent event) {
            if (!event.getWorld().isClientSide() && event.getEntity() instanceof StandEntity) {
                StandEntity stand = (StandEntity) event.getEntity();
                LivingEntity user = stand.getUser();
                if (user != null) {
                    updateStandEntityScale(user, stand);
                }
            }
        }
        
    }

}
