package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.hello_there.rotp_littlefeet.standeffect.LittleFeetShrinkTargetEffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public class LittleFeetInstantSelfShrink extends StandEntityAction {

    private static final float TARGET_SCALE = 0.15F;

    public LittleFeetInstantSelfShrink(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
            LivingEntity user = userPower.getUser();
            LittleFeetShrinkTargetEffect.setShrinkScaleValue(user, TARGET_SCALE);
            LittleFeetShrinkTargetEffect.updateStandEntityScale(user, standEntity);
        }
    }
}
