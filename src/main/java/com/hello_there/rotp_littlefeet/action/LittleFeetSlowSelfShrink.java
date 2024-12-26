package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import virtuoel.pehkui.util.ScaleUtils;

public class LittleFeetSlowSelfShrink extends StandEntityAction {

    private static final float TARGET_SCALE = 0.15F;
    private static final float SCALE_DECREMENT = 0.02F;

    public LittleFeetSlowSelfShrink(Builder builder) {
        super(builder);
    }

    @Override
    public void standTickPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        PlayerEntity user = (PlayerEntity) standEntity.getUser();

        float currentScale = ScaleUtils.getMotionScale(user);

        if (currentScale > TARGET_SCALE) {
            float newScale = Math.max(TARGET_SCALE, currentScale - SCALE_DECREMENT);

            ScaleUtils.setScaleOnSpawn(user, newScale);
            ScaleUtils.setScaleOnSpawn(standEntity, newScale);

            ScaleUtils.getMotionScale(user, newScale);
            ScaleUtils.getJumpHeightScale(user, newScale);
            ScaleUtils.getFallingScale(user, newScale);
            ScaleUtils.getModelHeightScale(user, newScale);
            ScaleUtils.getModelWidthScale(user, newScale);
            ScaleUtils.getBoundingBoxWidthScale(user, newScale);
            ScaleUtils.getBoundingBoxHeightScale(user, newScale);

            ScaleUtils.getMotionScale(standEntity, newScale);
            ScaleUtils.getJumpHeightScale(standEntity, newScale);
            ScaleUtils.getBoundingBoxWidthScale(standEntity, newScale);
            ScaleUtils.getBoundingBoxHeightScale(standEntity, newScale);
        }
    }
}
