package net.arthur.backroomsmod.datagen;

import net.arthur.backroomsmod.block.ModBlocks;
import net.arthur.backroomsmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET) // First is the result
                .pattern("SSS")
                .pattern("SPS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('P',ModItems.PINK_GARNET)
                //2 criterios
                .criterion(hasItem(Items.STONE),conditionsFromItem(Items.STONE))//O item necessario para essa reiceita ser desbloqueada no livoro de receitas
                .criterion(hasItem(ModItems.PINK_GARNET),conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_PINK_GARNET) + "_")); //Pega o mesmo nome do item

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BUTTON) // First is the result
                .pattern("   ")
                .pattern(" P ")
                .pattern("   ")
                .input('P',ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET),conditionsFromItem(ModItems.PINK_GARNET)) // Critério para ter Pink Garnet no inventário
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_BUTTON) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_SWORD) // First is the result
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" M ")
                .input('P',ModItems.PINK_GARNET)
                .input('M',Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET),conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_SWORD) + "_"));

                //Receita reversivel de bloco
                offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,ModItems.PINK_GARNET,
                        RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK);

                offerSmelting(exporter, List.of(ModItems.RAW_PINK_GARNET,ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.END_PINK_GARNET_ORE_BLOCK, ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.PINK_GARNET_ORE_BLOCK),RecipeCategory.MISC,ModItems.PINK_GARNET,0.25f,200,
                        "pink_garnet");
                offerBlasting(exporter, List.of(ModItems.RAW_PINK_GARNET,ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.END_PINK_GARNET_ORE_BLOCK, ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK,
                        ModBlocks.PINK_GARNET_ORE_BLOCK),RecipeCategory.MISC,ModItems.PINK_GARNET,0.25f,200,
                "pink_garnet");
                offerPressurePlateRecipe(exporter,ModBlocks.PINK_GARNET_PRESSURE_PLATE,ModItems.PINK_GARNET);

                offerWallRecipe(exporter,RecipeCategory.MISC,ModBlocks.BACKROOM_WALL,ModItems.PINK_GARNET);

                offerSlabRecipe(exporter,RecipeCategory.MISC,ModBlocks.PINK_GARNET_SLAB,ModItems.PINK_GARNET);

                createFenceRecipe(ModBlocks.PINK_GARNET_FENCE, Ingredient.ofItems(ModItems.PINK_GARNET));

                createFenceGateRecipe(ModBlocks.PINK_GARNET_GATE, Ingredient.ofItems(ModItems.PINK_GARNET));




    }
}
