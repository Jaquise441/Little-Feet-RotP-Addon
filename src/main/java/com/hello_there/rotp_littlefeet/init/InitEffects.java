package com.hello_there.rotp_littlefeet.init;

import com.hello_there.rotp_littlefeet.LittleFeetAddon;
import com.hello_there.rotp_littlefeet.effect.ShrinkEffect;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEffects {
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(
            ForgeRegistries.POTIONS,
            LittleFeetAddon.MOD_ID
    );

    public static final RegistryObject<Effect> SHRINKING = EFFECTS.register("shrinking",
            () -> new ShrinkEffect(0x6600CC)
    );
}