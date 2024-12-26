package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.hello_there.rotp_littlefeet.standeffect.LittleFeetShrinkTargetEffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import virtuoel.pehkui.api.ScaleTypes;

public class LittleFeetSlowSelfShrink extends StandEntityAction {

    private static final float TARGET_SCALE = 0.15F;
    private static final float SCALE_DECREMENT = 0.02F;

    public LittleFeetSlowSelfShrink(Builder builder) {
        super(builder);
    }

    @Override
    public void standTickPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
            LivingEntity user = userPower.getUser();
            float currentScale = ScaleTypes.BASE.getScaleData(user).getScale();

            if (currentScale > TARGET_SCALE) {
                float newScale = Math.max(TARGET_SCALE, currentScale - SCALE_DECREMENT);
                LittleFeetShrinkTargetEffect.setShrinkScaleValue(user, newScale);
            }
            LittleFeetShrinkTargetEffect.updateStandEntityScale(user, standEntity);
        }
    }
}
