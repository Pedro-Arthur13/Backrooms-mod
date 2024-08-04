package net.arthur.backroomsmod.datagen;

import net.arthur.backroomsmod.block.ModBlocks;
import net.arthur.backroomsmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool pinkGarnetTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
        //O codigo acima permite usar a textura do bloco como uma especie de template (ao mesmo tempo que da a textura pro bloco)

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_PINK_GARNET_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOM_FLOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOM_LIGHT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BACKROOM_WALL);

        //Non block block
        pinkGarnetTexturePool.stairs(ModBlocks.PINK_GARNET_STAIRS);
        pinkGarnetTexturePool.slab(ModBlocks.PINK_GARNET_SLAB);
        pinkGarnetTexturePool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
        pinkGarnetTexturePool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkGarnetTexturePool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkGarnetTexturePool.fenceGate(ModBlocks.PINK_GARNET_GATE);
        pinkGarnetTexturePool.wall(ModBlocks.PINK_GARNET_WALL);

        //Para a Door e a Trapdoor é necessário uma textura de item e de bloco(top and botton)
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED); // Item 2d
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED); // Item 2d


        itemModelGenerator.register(ModItems.PEAT_BRICK, Models.GENERATED); // Item 2d
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED); // Item 2d
        itemModelGenerator.register(ModItems.EAT_DIAMOND_PICKAXE, Models.GENERATED); // Item 2d
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED); // Item 2d

        itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD); // Precisa ser handheld pra ser mostrado da forma correta em terceira pesoa
        itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD); // Precisa ser handheld pra ser mostrado da forma correta em terceira pesoa
        itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD); // Precisa ser handheld pra ser mostrado da forma correta em terceira pesoa
        itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD); // Precisa ser handheld pra ser mostrado da forma correta em terceira pesoa
        itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD); // Precisa ser handheld pra ser mostrado da forma correta em terceira pesoa


    }
}
