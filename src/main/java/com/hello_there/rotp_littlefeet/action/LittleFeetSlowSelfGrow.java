package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import virtuoel.pehkui.util.ScaleUtils;

public class LittleFeetSlowSelfGrow extends StandEntityAction {

    private static final float TARGET_SCALE = 1.0F;
    private static final float SCALE_INCREMENT = 0.02F;

    public LittleFeetSlowSelfGrow(Builder builder) {
        super(builder);
    }

    @Override
    public void standTickPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        PlayerEntity user = (PlayerEntity) standEntity.getUser();

        incrementScaleTowardsTarget(user);
        incrementScaleTowardsTarget(standEntity);
    }

    private void incrementScaleTowardsTarget(Entity entity) {
        float currentScale = ScaleUtils.getModelWidthScale(entity);

        if (currentScale < TARGET_SCALE) {
            float newScale = Math.min(TARGET_SCALE, currentScale + SCALE_INCREMENT);

            ScaleUtils.setScaleOnSpawn(entity, newScale);
            ScaleUtils.getFallingScale(entity, Math.max(0.1F, newScale * 1.5F));
            ScaleUtils.getMotionScale(entity, Math.max(0.2F, newScale * 1.2F));
            ScaleUtils.getJumpHeightScale(entity, newScale);
            ScaleUtils.getModelHeightScale(entity, newScale);
            ScaleUtils.getModelWidthScale(entity, newScale);
            ScaleUtils.getBoundingBoxWidthScale(entity, newScale);
            ScaleUtils.getBoundingBoxHeightScale(entity, newScale);
        }
    }
}
