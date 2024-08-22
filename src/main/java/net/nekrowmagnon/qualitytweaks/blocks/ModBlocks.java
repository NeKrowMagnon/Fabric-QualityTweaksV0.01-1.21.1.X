package net.nekrowmagnon.qualitytweaks.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nekrowmagnon.qualitytweaks.QualityTweaks;

public class ModBlocks {
    public static final Block COMPACT_OAK_LEAVES = registerBlock("compact_oak_leaves",
            new Block(AbstractBlock.Settings.create().strength(0.4f)
                   .sounds(BlockSoundGroup.GRASS).burnable().noCollision().solid()));
    public static final Block COMPACT_BIRCH_LEAVES = registerBlock("compact_birch_leaves",
            new Block(AbstractBlock.Settings.create().strength(0.4f)
                    .sounds(BlockSoundGroup.GRASS).burnable()));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(QualityTweaks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(QualityTweaks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        QualityTweaks.LOGGER.info("Registering Mod Blocks for " + QualityTweaks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.COMPACT_OAK_LEAVES);
            entries.add(ModBlocks.COMPACT_BIRCH_LEAVES);
        });
    }
}
