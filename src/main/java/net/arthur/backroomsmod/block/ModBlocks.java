package net.arthur.backroomsmod.block;

import net.arthur.backroomsmod.BackroomsMod;
import net.arthur.backroomsmod.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block DEEPSLATE_PINK_GARNET_ORE_BLOCK = registerBlock("deepslate_pink_garnet_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE),
                    UniformIntProvider.create(3,6))); // quanto de xp vai droppar(entre 3,6)
    public static final Block END_PINK_GARNET_ORE_BLOCK = registerBlock("end_pink_garnet_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE),
                    UniformIntProvider.create(2,3)));
    public static final Block NETHER_PINK_GARNET_ORE_BLOCK = registerBlock("nether_pink_garnet_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE),
                    UniformIntProvider.create(3,6)));

    public static final Block PINK_GARNET_ORE_BLOCK = registerBlock("pink_garnet_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE),
                    UniformIntProvider.create(3,5)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs",
            new StairsBlock(ModBlocks.PINK_GARNET_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    //O wooden é pra indicar se o botao pode ser pressionado por projeteis, 10 ticks = half-second
    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON),BlockSetType.IRON,10,true));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.IRON));
    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PINK_GARNET_GATE = registerBlock("pink_garnet_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK),WoodType.ACACIA));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR),BlockSetType.IRON));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR),BlockSetType.IRON));

    public static final Block BACKROOM_WALL = registerBlock("backroom_wall",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    public static final Block BACKROOM_FLOOR = registerBlock("backroom_floor",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));
    public static final Block BACKROOM_LIGHT = registerBlock("backroom_light",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).luminance(9)));



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
