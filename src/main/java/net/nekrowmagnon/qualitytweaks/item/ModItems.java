package net.nekrowmagnon.qualitytweaks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nekrowmagnon.qualitytweaks.QualityTweaks;

public class ModItems {
    public static final Item SCULK_REMNANT = registerItem("sculk_remnant", new Item(new Item.Settings()));
    public static final Item FUSING_SCULK_REMNANT = registerItem("fusing_sculk_remnant", new Item(new Item.Settings()));
    public static final Item WITHERING_SCULK_REMNANT = registerItem("withering_sculk_remnant", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(QualityTweaks.MOD_ID, name), item);
    }

    public static void registerModItems() {
        QualityTweaks.LOGGER.info("Registering Mod Items for " + QualityTweaks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(SCULK_REMNANT);
           entries.add(FUSING_SCULK_REMNANT);
           entries.add(WITHERING_SCULK_REMNANT);
        });
    }
}