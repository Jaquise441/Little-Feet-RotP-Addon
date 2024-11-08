package com.hello_there.rotp_littlefeet.init;

import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.action.stand.StandEntityBlock;
import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.StandEntityLightAttack;
import com.github.standobyte.jojo.action.stand.StandEntityMeleeBarrage;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;
import com.hello_there.rotp_littlefeet.LittleFeetAddon;
import com.hello_there.rotp_littlefeet.action.*;
import com.hello_there.rotp_littlefeet.entity.LittleFeetEntity;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), LittleFeetAddon.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), LittleFeetAddon.MOD_ID);

    // ======================================== Example Stand ========================================


    // Create all the abilities here...
    public static final RegistryObject<StandEntityAction> LITTLE_FEET_PUNCH = ACTIONS.register("little_feet_punch",
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.LITTLE_FEET_PUNCH_LIGHT)));

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_BARRAGE = ACTIONS.register("little_feet_barrage",
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.LITTLE_FEET_PUNCH_BARRAGE)));

    public static final RegistryObject<StandEntityHeavyAttack> LITTLE_FEET_FINISHER_PUNCH = ACTIONS.register("little_feet_finisher_punch",
            () -> new LittleFeetDoubleShrinkSlash(new StandEntityHeavyAttack.Builder() // TODO finisher ability
                    .punchSound(InitSounds.LITTLE_FEET_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityHeavyAttack> LITTLE_FEET_HEAVY_PUNCH = ACTIONS.register("little_feet_heavy_punch",
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .shiftVariationOf(LITTLE_FEET_PUNCH).shiftVariationOf(LITTLE_FEET_BARRAGE)
                    .setFinisherVariation(LITTLE_FEET_FINISHER_PUNCH)
                    .punchSound(InitSounds.LITTLE_FEET_PUNCH_HEAVY)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityLightAttack> LITTLE_FEET_SHRINK_SLASH = ACTIONS.register("little_feet_shrink_slash",
            () -> new LittleFeetShrinkSlash(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.LITTLE_FEET_SHRINK_SLASH)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_BLOCK = ACTIONS.register("little_feet_block",
            () -> new StandEntityBlock());

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_INSTANT_SELF_SHRINK = ACTIONS.register("little_feet_instant_self_shrink",
            () -> new LittleFeetInstantSelfShrink(new StandEntityAction.Builder()
                    .standSound(InitSounds.LITTLE_FEET_INSTANT_SELF_SHRINK)
                    .staminaCost(75)
                    .cooldown(80)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_INSTANT_SELF_GROW = ACTIONS.register("little_feet_instant_self_grow",
            () -> new LittleFeetInstantSelfGrow(new StandEntityAction.Builder()
                    .standSound(InitSounds.LITTLE_FEET_INSTANT_SELF_GROW)
                    .shiftVariationOf(LITTLE_FEET_INSTANT_SELF_SHRINK)
                    .staminaCost(75)
                    .cooldown(80)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_SLOW_SELF_SHRINK = ACTIONS.register("little_feet_slow_self_shrink",
            () -> new LittleFeetSlowSelfShrink(new StandEntityAction.Builder()
                    .holdType(80)
                    .standSound(InitSounds.LITTLE_FEET_SLOW_SELF_SHRINK)
                    .staminaCost(75)
                    .cooldown(80)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_SLOW_SELF_GROW = ACTIONS.register("little_feet_slow_self_grow",
            () -> new LittleFeetSlowSelfGrow(new StandEntityAction.Builder()
                    .holdType(80)
                    .standSound(InitSounds.LITTLE_FEET_SLOW_SELF_GROW)
                    .shiftVariationOf(LITTLE_FEET_SLOW_SELF_SHRINK)
                    .staminaCost(75)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_NEAREST_ENTITY_GROW = ACTIONS.register("little_feet_nearest_entity_grow",
            () -> new LittleFeetNearestEntityGrow(new StandEntityAction.Builder()
                    .standSound(InitSounds.LITTLE_FEET_SLOW_SELF_GROW)
                    .staminaCost(75)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> LITTLE_FEET_EVERY_ENTITY_GROW = ACTIONS.register("little_feet_every_entity_grow",
            () -> new LittleFeetEveryEntityGrow(new StandEntityAction.Builder()
                    .standSound(InitSounds.LITTLE_FEET_SLOW_SELF_GROW)
                    .shiftVariationOf(LITTLE_FEET_NEAREST_ENTITY_GROW)
                    .staminaCost(75)
                    .partsRequired(StandPart.ARMS)));


    // ...then create the Stand type instance. Moves, stats, entity sizes, and a few other things are determined here.
    public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<LittleFeetEntity>> LITTLE_FEET_STAND =
            new EntityStandRegistryObject<>("little_feet",
                    STANDS,
                    () -> new EntityStandType.Builder<StandStats>()
                            .color(0x6600CC)
                            .leftClickHotbar(
                                    LITTLE_FEET_PUNCH.get(),
                                    LITTLE_FEET_BARRAGE.get(),
                                    LITTLE_FEET_SHRINK_SLASH.get()
                            )
                            .rightClickHotbar(
                                    LITTLE_FEET_BLOCK.get(),
                                    LITTLE_FEET_INSTANT_SELF_SHRINK.get(),
                                    LITTLE_FEET_SLOW_SELF_SHRINK.get(),
                                    LITTLE_FEET_NEAREST_ENTITY_GROW.get()
                            )
                            .defaultStats(StandStats.class, new StandStats.Builder()
                                    .tier(4)
                                    .power(7)
                                    .speed(12)
                                    .range(3, 4)
                                    .durability(15)
                                    .precision(6)
                                    .build())
                            .addSummonShout(InitSounds.LITTLE_FEET_SUMMON_VOICELINE)
                            .addOst(InitSounds.LITTLE_FEET_OST)
                            .build(),

                    InitEntities.ENTITIES,
                    () -> new StandEntityType<LittleFeetEntity>(LittleFeetEntity::new, 0.7F, 2.1F)
                            .summonSound(InitSounds.LITTLE_FEET_SUMMON_SOUND)
                            .unsummonSound(InitSounds.LITTLE_FEET_UNSUMMON_SOUND))
                    .withDefaultStandAttributes();



    // ======================================== ??? ========================================



}
