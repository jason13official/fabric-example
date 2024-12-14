package com.example.registry;

import com.example.ExampleMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class RegistryFabric {

    public static void register() {
        ModItems.register();
    }

    public static <T extends Item> T registerItem(String itemID, Supplier<T> itemSupplier) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ExampleMod.MOD_ID, itemID), itemSupplier.get());
    }
}
