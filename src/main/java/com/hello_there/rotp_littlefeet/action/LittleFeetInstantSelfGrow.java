package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;

public class LittleFeetInstantSelfGrow extends StandEntityAction {

    public LittleFeetInstantSelfGrow(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        PlayerEntity user = (PlayerEntity) standEntity.getUser();

        float targetScale = 1F;

        for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
            ScaleData userScaleData = scaleType.getScaleData(user);
            userScaleData.setScale(targetScale);
        }

        for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
            ScaleData standScaleData = scaleType.getScaleData(standEntity);
            standScaleData.setScale(targetScale);
        }
    }
}
