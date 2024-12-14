package com.example.registry;

import net.minecraft.world.item.Item;

public class ModItems {

    public static void register() {}

    public static final Item EXAMPLE_ITEM = RegistryFabric.registerItem("example_item", () -> new Item(new Item.Properties()));
}
