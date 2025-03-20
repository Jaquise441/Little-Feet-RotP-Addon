package com.hello_there.rotp_littlefeet.entity;

import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;

import net.minecraft.world.World;

public class LittleFeetEntity extends StandEntity {
    public LittleFeetEntity(StandEntityType<LittleFeetEntity> type, World world) {
        super(type, world);
    }

    @Override
    public float getLeapStrength() {
        return super.getLeapStrength() * 2F;
    }
}
