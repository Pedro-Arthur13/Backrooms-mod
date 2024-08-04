package net.arthur.backroomsmod.datagen;

import net.arthur.backroomsmod.block.ModBlocks;
import net.arthur.backroomsmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        //Aqui que adicionaremos as coisas pra nossas tags
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_VALUABLE_BLOCKS) // Tag de minerios raros pra o detector de metal detectar
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .forceAddTag(BlockTags.GOLD_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_GARNET_BLOCK,
                        ModBlocks.END_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.PINK_GARNET_ORE_BLOCK,
                        ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK,

                        ModBlocks.RAW_PINK_GARNET_BLOCK,
                        ModBlocks.PINK_GARNET_STAIRS,
                        ModBlocks.PINK_GARNET_PRESSURE_PLATE,
                        ModBlocks.PINK_GARNET_SLAB,
                        ModBlocks.PINK_GARNET_GATE,
                        ModBlocks.PINK_GARNET_FENCE,
                        ModBlocks.PINK_GARNET_TRAPDOOR,
                        ModBlocks.PINK_GARNET_DOOR,
                        ModBlocks.PINK_GARNET_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PINK_GARNET_BLOCK,
                        ModBlocks.END_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.RAW_PINK_GARNET_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_ORE_BLOCK,
                        ModBlocks.PINK_GARNET_STAIRS,
                         ModBlocks.PINK_GARNET_SLAB);

        // O codigo a seguir serve para fazer com que os blocos consigam se juntar uns aos outros
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PINK_GARNET_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PINK_GARNET_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PINK_GARNET_GATE);

        //Tag for Netherite
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK,new Identifier("fabric","needs_tool_level_4")))
                .add(ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK);

        //Tag for our custom tool material (Pink Garnet)
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK,new Identifier("fabric","needs_tool_level_5")))
                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK);

    }
}
