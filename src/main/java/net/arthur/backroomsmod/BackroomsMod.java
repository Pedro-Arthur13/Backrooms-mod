package net.arthur.backroomsmod;

import net.arthur.backroomsmod.block.ModBlocks;
import net.arthur.backroomsmod.item.ModItemGroup;
import net.arthur.backroomsmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackroomsMod implements ModInitializer {
	public static final String MOD_ID = "backrooms_mod"; /* Static pq é usado em all mod*/
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}