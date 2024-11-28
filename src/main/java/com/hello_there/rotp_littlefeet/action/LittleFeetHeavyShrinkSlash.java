package com.hello_there.rotp_littlefeet.action;

import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.punch.StandEntityPunch;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.util.mc.damage.StandEntityDamageSource;
import com.hello_there.rotp_littlefeet.init.InitEffects;
import com.hello_there.rotp_littlefeet.init.InitSounds;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;

public class LittleFeetHeavyShrinkSlash extends StandEntityHeavyAttack {


    public LittleFeetHeavyShrinkSlash(StandEntityHeavyAttack.Builder builder) {
        super(builder);
    }

    @Override
    public StandEntityPunch punchEntity(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
        return new LittleFeetShrinkSlash.LittleFeetShrinkSlashInstance(stand, target, dmgSource)
                .copyProperties(super.punchEntity(stand, target, dmgSource))
                .armorPiercing((float) stand.getAttackDamage() * 0.15F)
                .disableBlocking((float) stand.getProximityRatio(target) - 0.25F)
                .impactSound(InitSounds.LITTLE_FEET_SHRINK_SLASH)
                .damage((float) stand.getAttackDamage() * 1.25F)
                .reduceKnockback(5.0F);

    }

    public static class LittleFeetShrinkSlashInstance extends StandEntityHeavyAttack.HeavyPunchInstance {

        public LittleFeetShrinkSlashInstance(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
            super(stand, target, dmgSource);
        }

        @Override
        protected void afterAttack(StandEntity stand, Entity target, StandEntityDamageSource dmgSource, StandEntityTask task, boolean hurt, boolean killed) {
            super.afterAttack(stand, target, dmgSource, task, hurt, killed);

            if (hurt && target instanceof LivingEntity) {
                LivingEntity livingTarget = (LivingEntity) target;

                livingTarget.addEffect(new EffectInstance(InitEffects.SHRINKING.get(), 999999999, 1, false, false));
            }
        }
    }

}
