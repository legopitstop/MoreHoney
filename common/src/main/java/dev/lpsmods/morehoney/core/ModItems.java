package dev.lpsmods.morehoney.core;

import dev.lpsmods.morehoney.Constants;
import dev.lpsmods.morehoney.item.HoneyLemonTeaItem;
import dev.lpsmods.morehoney.item.MoreHoneyFoodComponents;
import dev.lpsmods.morehoney.item.MoreHoneyItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {
    // Create Items
    public static final Item HONEY_LEMON_TEA;
    public static final Item HONEY_COOKED_BEEF;
    public static final Item HONEY_COOKED_CHICKEN;
    public static final Item HONEY_COOKED_MUTTON;
    public static final Item HONEY_COOKED_PORKCHOP;
    public static final Item HONEY_COOKIE;
    public static final Item HONEY_PANCAKES;
    public static final Item HONEY_SANDWICH;
    public static final Item HONEY_TOASTIE;
    public static final Item HONEY_WAFFLE;

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
    }

    public static void init() {}
    
    static {
        HONEY_LEMON_TEA = registerItem("", new HoneyLemonTeaItem(new Item.Properties().stacksTo(16).food(MoreFoodComponents.HOT_BEVERAGE).recipeRemainder(MoreFoodItems.HOT_BEVERAGE_CUP)));
        HONEY_COOKED_BEEF = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreHoneyFoodComponents.HONEY_COOKED_BEEF)));
        HONEY_COOKED_CHICKEN = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreHoneyFoodComponents.HONEY_COOKED_CHICKEN)));
        HONEY_COOKED_MUTTON = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreHoneyFoodComponents.HONEY_COOKED_MUTTON)));
        HONEY_COOKED_PORKCHOP =registerItem("",  new MoreHoneyItem(new Item.Properties().food(MoreHoneyFoodComponents.HONEY_COOKED_PORKCHOP)));
        HONEY_COOKIE = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreHoneyFoodComponents.HONEY_COOKIE)));
        HONEY_PANCAKES = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreFoodComponents.PANCAKES)));
        HONEY_SANDWICH = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreHoneyFoodComponents.HONEY_SANDWICH)));
        HONEY_TOASTIE = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreFoodComponents.CHEESE_TOASTIE)));
        HONEY_WAFFLE = registerItem("", new MoreHoneyItem(new Item.Properties().food(MoreFoodComponents.WAFFLE)));
    }
}
