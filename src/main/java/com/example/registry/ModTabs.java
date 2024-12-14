package com.example.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

    public static void register() {}

    public static final CreativeModeTab EXAMPLE_TAB = RegistryFabric.registerTab("example_tab", () -> FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM))
            .title(Component.translatable("itemGroup.exampleMod"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.EXAMPLE_ITEM);
            })
            .build());
}
