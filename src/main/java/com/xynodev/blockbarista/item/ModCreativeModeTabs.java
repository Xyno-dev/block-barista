package com.xynodev.blockbarista.item;

import com.xynodev.blockbarista.BlockBarista;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockBarista.MOD_ID);

    public static final Supplier<CreativeModeTab> BLOCK_BARISTA_TAB = CREATIVE_MODE_TAB.register("block_barista_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.MUG.get()))
                    .title(Component.translatable("creativetab.blockbarista.block_barista_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MUG);
                        output.accept(ModItems.COFFEE);
                        output.accept(ModItems.COFFEE_BEAN);
                        output.accept(ModItems.ROASTED_COFFEE_BEAN);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
