package com.enk.lostsoulsmain.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NewEffect extends StatusEffect {

    public static final StatusEffect INFINITY_EFFECT = new NewEffect();

    public NewEffect() {
        super(StatusEffectCategory.HARMFUL, 0xAD3EC9);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int interval = 60;
        return duration % interval == 0;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getHealth() > 2.0f) {
            entity.damage(entity.getDamageSources().magic(), 2.0f);
        }

        if (entity instanceof net.minecraft.entity.player.PlayerEntity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 80, 0, false, false));
        }

        if (entity instanceof net.minecraft.entity.player.PlayerEntity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 80, 4, false, false));
        }
    }

    public static void register () {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("lostsoulsmain", "infinityeffect"), INFINITY_EFFECT);
    }
}
