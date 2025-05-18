package com.xynodev.blockbarista.item.custom;

import com.xynodev.blockbarista.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class DrinkItem extends Item {
    public DrinkItem(Properties properites) {
        super(properites.stacksTo(1));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        ItemStack resultStack = super.finishUsingItem(stack, world, entity);

        if (entity instanceof Player player && !player.getAbilities().instabuild) {
            ItemStack mugStack = new ItemStack(ModItems.MUG.get());

            return mugStack;
        }

        return resultStack;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}
