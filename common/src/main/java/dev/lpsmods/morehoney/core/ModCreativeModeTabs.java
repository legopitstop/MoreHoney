package dev.lpsmods.morehoney.core;

import dev.lpsmods.morehoney.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTabs {
    public static final CreativeModeTab MAIN;

    private static CreativeModeTab registerTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), tab);
    }

    public static void init() {}

    static {
        MAIN = registerTab("morehoney", CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("itemGroup."+Constants.MOD_ID)).icon(() -> {
            return new ItemStack(Items.HONEYCOMB);
        }).displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
            out.accept(ModItems.HONEY_LEMON_TEA);
            out.accept(ModItems.HONEY_COOKED_BEEF);
            out.accept(ModItems.HONEY_COOKED_CHICKEN);
            out.accept(ModItems.HONEY_COOKED_MUTTON);
            out.accept(ModItems.HONEY_COOKED_PORKCHOP);
            out.accept(ModItems.HONEY_COOKIE);
            out.accept(ModItems.HONEY_PANCAKES);
            out.accept(ModItems.HONEY_SANDWICH);
            out.accept(ModItems.HONEY_TOASTIE);
            out.accept(ModItems.HONEY_WAFFLE);
        }).build());
    }
}
