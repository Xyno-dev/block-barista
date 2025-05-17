package com.xynodev.blockbarista.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties COFFEE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 3), 1.00f).build();

}