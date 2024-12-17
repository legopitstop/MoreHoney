package dev.lpsmods.morehoney;

import dev.lpsmods.morehoney.core.ModCreativeModeTabs;
import dev.lpsmods.morehoney.core.ModItems;
import dev.lpsmods.morehoney.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class Bootstrap {
    public static void init() {
        ModItems.init();
        ModCreativeModeTabs.init();
    }
}