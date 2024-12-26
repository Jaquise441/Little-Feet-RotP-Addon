package com.hello_there.rotp_littlefeet.init;

import com.github.standobyte.jojo.action.stand.effect.StandEffectType;
import com.hello_there.rotp_littlefeet.LittleFeetAddon;
import com.hello_there.rotp_littlefeet.standeffect.LittleFeetShrinkTargetEffect;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStandEffects {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandEffectType<?>> STAND_EFFECTS = DeferredRegister.create(
            (Class<StandEffectType<?>>) ((Class<?>) StandEffectType.class),
            LittleFeetAddon.MOD_ID
    );

    public static final RegistryObject<StandEffectType<?>> SHRINK_TARGET = STAND_EFFECTS.register("lf_shrink_target",
            () -> new StandEffectType<>(LittleFeetShrinkTargetEffect::new)
    );
}