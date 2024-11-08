package com.hello_there.rotp_littlefeet.init;

import java.util.function.Supplier;

import com.github.standobyte.jojo.init.ModSounds;
import com.github.standobyte.jojo.util.mc.OstSoundList;
import com.hello_there.rotp_littlefeet.LittleFeetAddon;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(
            ForgeRegistries.SOUND_EVENTS, LittleFeetAddon.MOD_ID); // TODO sounds.json
    
    public static final RegistryObject<SoundEvent> LITTLE_FEET_SUMMON_VOICELINE = SOUNDS.register("formaggio_little_feet",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "formaggio_little_feet")));

    public static final Supplier<SoundEvent> LITTLE_FEET_SUMMON_SOUND = SOUNDS.register("little_feet_summon",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_summon")));
    
    public static final Supplier<SoundEvent> LITTLE_FEET_UNSUMMON_SOUND = ModSounds.STAND_UNSUMMON_DEFAULT;
    
    public static final Supplier<SoundEvent> LITTLE_FEET_PUNCH_LIGHT = ModSounds.STAND_PUNCH_LIGHT;
    
    public static final Supplier<SoundEvent> LITTLE_FEET_PUNCH_HEAVY = ModSounds.STAND_PUNCH_HEAVY;
    
    public static final Supplier<SoundEvent> LITTLE_FEET_PUNCH_BARRAGE = ModSounds.STAND_PUNCH_LIGHT;

    public static final RegistryObject<SoundEvent> LITTLE_FEET_INSTANT_SELF_SHRINK = SOUNDS.register("little_feet_instant_self_shrink",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_instant_self_shrink")));

    public static final RegistryObject<SoundEvent> LITTLE_FEET_SLOW_SELF_SHRINK = SOUNDS.register("little_feet_slow_self_shrink",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_slow_self_shrink")));

    public static final RegistryObject<SoundEvent> LITTLE_FEET_SHRINK = SOUNDS.register("little_feet_shrink2",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_shrink2")));

    public static final RegistryObject<SoundEvent> LITTLE_FEET_INSTANT_SELF_GROW = SOUNDS.register("little_feet_instant_self_grow",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_instant_self_grow")));

    public static final RegistryObject<SoundEvent> LITTLE_FEET_SLOW_SELF_GROW = SOUNDS.register("little_feet_slow_self_grow",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_slow_self_grow")));

    public static final RegistryObject<SoundEvent> LITTLE_FEET_SHRINK_SLASH = SOUNDS.register("little_feet_shrink_slash",
            () -> new SoundEvent(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_shrink_slash")));

    public static final OstSoundList LITTLE_FEET_OST = new OstSoundList(
            new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet_ost"), SOUNDS);
}
