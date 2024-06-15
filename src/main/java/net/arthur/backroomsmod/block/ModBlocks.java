package net.arthur.backroomsmod.block;

import net.arthur.backroomsmod.BackroomsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block DEEPSLATE_PINK_GARNET_ORE_BLOCK = registerBlock("deepslate_pink_garnet_ore_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block END_PINK_GARNET_ORE_BLOCK = registerBlock("end_pink_garnet_ore_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block NETHER_PINK_GARNET_ORE_BLOCK = registerBlock("nether_pink_garnet_ore_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PINK_GARNET_ORE_BLOCK = registerBlock("pink_garnet_ore_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BACKROOM_WALL = registerBlock("backroom_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    public static final Block BACKROOM_FLOOR = registerBlock("backroom_floor",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block); // chama a funcao de assosciar o block ao item
        return Registry.register(Registries.BLOCK, new Identifier(BackroomsMod.MOD_ID, // registrando o bloco em si
                name),block);
    }


    //Temos que registrar o block e associalo a um item, caso contrario só via comandos
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,
                new Identifier(BackroomsMod.MOD_ID,name), new BlockItem(block,
                        new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        BackroomsMod.LOGGER.info("Registering Modblocks for "+BackroomsMod.MOD_ID);
    }
}
