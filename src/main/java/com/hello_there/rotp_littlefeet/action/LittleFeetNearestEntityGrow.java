package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.hello_there.rotp_littlefeet.init.InitEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LittleFeetNearestEntityGrow extends StandEntityAction {

    private static final double SEARCH_RADIUS = 60.0D;

    public LittleFeetNearestEntityGrow(Builder builder) {
        super(builder);
    }

    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        PlayerEntity user = (PlayerEntity) standEntity.getUser();

        List<LivingEntity> entities = world.getEntitiesOfClass(LivingEntity.class, user.getBoundingBox().inflate(SEARCH_RADIUS),
                entity -> entity.hasEffect(InitEffects.SHRINKING.get()) && entity != user);

        Optional<LivingEntity> nearestEntity = entities.stream()
                .min(Comparator.comparingDouble(entity -> entity.distanceTo(user)));

        nearestEntity.ifPresent(entity -> {
            entity.removeEffect(InitEffects.SHRINKING.get());

            for (ScaleType scaleType : ScaleRegistries.SCALE_TYPES.values()) {
                ScaleData scaleData = scaleType.getScaleData(entity);
                scaleData.setScale(1.0F);
            }
        });
    }
}
