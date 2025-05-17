package com.xynodev.blockbarista.item;

import com.xynodev.blockbarista.BlockBarista;
import com.xynodev.blockbarista.item.custom.DrinkItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BlockBarista.MOD_ID);

    public static final DeferredItem<Item> MUG = ITEMS.register("mug",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COFFEE = ITEMS.register("coffee",
            () -> new DrinkItem(new Item.Properties().food(ModFoodProperties.COFFEE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
