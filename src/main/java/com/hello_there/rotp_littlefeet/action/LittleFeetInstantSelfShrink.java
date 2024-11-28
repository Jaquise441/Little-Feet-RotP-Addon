package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleType;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.util.ScaleUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class LittleFeetInstantSelfShrink extends StandEntityAction {

    private static final float TARGET_SCALE = 0.15F;

    public LittleFeetInstantSelfShrink(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        PlayerEntity user = (PlayerEntity) standEntity.getUser();

        ResourceLocation baseScaleId = new ResourceLocation("pehkui", "base");
        ScaleType baseScaleType = ScaleRegistries.SCALE_TYPES.get(baseScaleId);

        if (baseScaleType != null) {
            ScaleData userScaleData = baseScaleType.getScaleData(user);
            ScaleData standScaleData = baseScaleType.getScaleData(standEntity);

            if (userScaleData != null) {
                userScaleData.setScale(TARGET_SCALE);
                applyAdditionalScales(user, TARGET_SCALE);
            }

            if (standScaleData != null) {
                standScaleData.setScale(TARGET_SCALE);
                applyAdditionalScales(standEntity, TARGET_SCALE);
            }
        }
    }

    private void applyAdditionalScales(Entity entity, float scale) {
        ScaleUtils.getMotionScale(entity, scale);
        ScaleUtils.getJumpHeightScale(entity, scale);
        ScaleUtils.getBoundingBoxWidthScale(entity, scale);
        ScaleUtils.getBoundingBoxHeightScale(entity, scale);
    }
}
