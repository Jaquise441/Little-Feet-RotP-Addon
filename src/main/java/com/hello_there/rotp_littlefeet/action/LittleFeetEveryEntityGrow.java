package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.hello_there.rotp_littlefeet.init.InitEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;

public class LittleFeetEveryEntityGrow extends StandEntityAction {

    private static final double SEARCH_RADIUS = 60.0D;

    public LittleFeetEveryEntityGrow(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        for (LivingEntity entity : world.getEntitiesOfClass(LivingEntity.class, standEntity.getBoundingBox().inflate(SEARCH_RADIUS))) {
            if (entity.hasEffect(InitEffects.SHRINKING.get())) {
                entity.removeEffect(InitEffects.SHRINKING.get());

                for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
                    ScaleData scaleData = scaleType.getScaleData(entity);
                    scaleData.setScale(1.0F);
                }
            }
        }
    }
}
