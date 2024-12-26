package com.hello_there.rotp_littlefeet.action;

import java.util.Comparator;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.hello_there.rotp_littlefeet.init.InitStandEffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public class LittleFeetNearestEntityGrow extends StandEntityAction {

    public LittleFeetNearestEntityGrow(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
            LivingEntity user = userPower.getUser();

            userPower.getContinuousEffects().getEffects()
            .filter(effect -> effect.effectType == InitStandEffects.SHRINK_TARGET.get() && effect.getTarget() != null)
            .min(Comparator.comparingDouble(effect -> effect.getTarget().distanceTo(user)))
            .ifPresent(nearestTargetEffect -> {
                nearestTargetEffect.remove();
            });
        }
    }
}
