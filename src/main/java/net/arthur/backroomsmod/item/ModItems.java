package net.arthur.backroomsmod.item;

import net.arthur.backroomsmod.BackroomsMod;
import net.arthur.backroomsmod.block.ModBlocks;
import net.arthur.backroomsmod.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new FabricItemSettings()));

    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
            new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(256)));

    private static Item registerItem(String name,Item item){
        // Registrando o item passado pelo parametro
        return Registry.register(Registries.ITEM, new Identifier(BackroomsMod.MOD_ID,name),item);

    }
    private static void itemGroupIngredients(FabricItemGroupEntries entries){
        entries.add(PINK_GARNET);
        entries.add(RAW_PINK_GARNET);
        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        entries.add(ModBlocks.PINK_GARNET_BLOCK);
        entries.add(ModBlocks.BACKROOM_WALL);
        entries.add(ModBlocks.BACKROOM_FLOOR);
    }

    //Log of the registry items
    public static void registerModItems(){
        BackroomsMod.LOGGER.info("Registering Mod items for "+BackroomsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
