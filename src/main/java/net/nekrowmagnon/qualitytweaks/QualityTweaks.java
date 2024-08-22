package net.nekrowmagnon.qualitytweaks;

import net.fabricmc.api.ModInitializer;

import net.nekrowmagnon.qualitytweaks.blocks.ModBlocks;
import net.nekrowmagnon.qualitytweaks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QualityTweaks implements ModInitializer {
	public static final String MOD_ID = "qualitytweaks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}