package net.arthur.backroomsmod.datagen;

import net.arthur.backroomsmod.block.ModBlocks;
import net.arthur.backroomsmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PINK_GARNET_BLOCK); // Drop itself
        addDrop(ModBlocks.RAW_PINK_GARNET_BLOCK); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_STAIRS); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_PRESSURE_PLATE); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_BUTTON); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_FENCE); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_WALL); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_GATE); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_TRAPDOOR); // Drop itself
        addDrop(ModBlocks.PINK_GARNET_DOOR, doorDrops(ModBlocks.PINK_GARNET_DOOR));
        addDrop(ModBlocks.PINK_GARNET_SLAB,slabDrops(ModBlocks.PINK_GARNET_SLAB)); //Isso aqui pq quando vc tem duas slabs em um bloco e quebra ele vai dropar 2 slabs

        addDrop(ModBlocks.PINK_GARNET_ORE_BLOCK,oreDrops(ModBlocks.PINK_GARNET_ORE_BLOCK,
                ModItems.RAW_PINK_GARNET)); // O primeiro é com toque suave e o segundo é normal
        addDrop(ModBlocks.END_PINK_GARNET_ORE_BLOCK,oreDrops(ModBlocks.END_PINK_GARNET_ORE_BLOCK,
                ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK,oreDrops(ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK,
                ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK,oreDrops(ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK,
                ModItems.RAW_PINK_GARNET));



    }
}
