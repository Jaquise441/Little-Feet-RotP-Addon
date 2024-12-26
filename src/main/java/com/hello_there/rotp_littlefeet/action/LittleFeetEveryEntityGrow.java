package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.hello_there.rotp_littlefeet.init.InitStandEffects;

import net.minecraft.world.World;

public class LittleFeetEveryEntityGrow extends StandEntityAction {

    public LittleFeetEveryEntityGrow(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
            userPower.getContinuousEffects().getEffects()
            .filter(effect -> effect.effectType == InitStandEffects.SHRINK_TARGET.get())
            .forEach(effect -> effect.remove());
        }
    }
}
