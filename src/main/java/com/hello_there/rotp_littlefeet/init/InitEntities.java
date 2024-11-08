package com.hello_there.rotp_littlefeet.init;

import com.hello_there.rotp_littlefeet.LittleFeetAddon;

import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(
            ForgeRegistries.ENTITIES, LittleFeetAddon.MOD_ID);
};
