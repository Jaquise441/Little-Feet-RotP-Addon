package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import virtuoel.pehkui.util.ScaleUtils;

public class LittleFeetInstantSelfShrink extends StandEntityAction {

    private static final float TARGET_SCALE = 0.15F;

    public LittleFeetInstantSelfShrink(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        PlayerEntity user = (PlayerEntity) standEntity.getUser();

        ScaleUtils.setScaleOnSpawn(user, TARGET_SCALE);
        ScaleUtils.setScaleOnSpawn(standEntity, TARGET_SCALE);

        ScaleUtils.getMotionScale(user, TARGET_SCALE);
        ScaleUtils.getJumpHeightScale(user, TARGET_SCALE);
        ScaleUtils.getBoundingBoxWidthScale(user, TARGET_SCALE);
        ScaleUtils.getBoundingBoxHeightScale(user, TARGET_SCALE);
    }
}
