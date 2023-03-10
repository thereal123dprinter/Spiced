package net.printer.spiced.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.printer.spiced.SpicedMod;

public class Items {
    public static final Item RAW_COFFEE_BEANS = registerItem("raw_coffee_beans", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).build())));
    public static final Item COFFEE_BEANS = registerItem("coffee_beans", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(.2f).build())));
    public static final Item ROASTED_COFFEE_BEANS = registerItem("roasted_coffee_beans", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(1).saturationModifier(.2f).build())));
    public static final Item CHILI_PEPPER = registerItem("chili_pepper", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(.6f).build())));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpicedMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SpicedMod.LOGGER.debug("Registering mod items for " + SpicedMod.MOD_ID);
    }
}
