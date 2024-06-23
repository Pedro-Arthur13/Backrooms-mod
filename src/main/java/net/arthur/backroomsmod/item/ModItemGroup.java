package net.arthur.backroomsmod.item;

import net.arthur.backroomsmod.BackroomsMod;
import net.arthur.backroomsmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BackroomsMod.MOD_ID,"pink_garnet_group"),
            FabricItemGroup.builder().displayName(Text.translatable(
                    "itemgroup.pink_garnet_group")).icon(() -> new
                    ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                    entries.add(ModItems.PINK_GARNET);
                    entries.add(ModItems.RAW_PINK_GARNET);

                    entries.add(ModItems.METAL_DETECTOR);
                    entries.add(ModBlocks.SOUND_BLOCK);
                    entries.add(ModItems.CAULIFLOWER);
                    entries.add(ModItems.EAT_DIAMOND_PICKAXE);

                    entries.add(ModItems.PEAT_BRICK);

                    entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                    entries.add(ModBlocks.PINK_GARNET_BLOCK);
                    entries.add(ModBlocks.PINK_GARNET_ORE_BLOCK);
                    entries.add(ModBlocks.END_PINK_GARNET_ORE_BLOCK);
                    entries.add(ModBlocks.NETHER_PINK_GARNET_ORE_BLOCK);
                    entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE_BLOCK);

            }).build());
    public static final ItemGroup BACKROOMS_MOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BackroomsMod.MOD_ID,"backrooms_mod_group"),
            FabricItemGroup.builder().displayName(Text.translatable(
                    "itemgroup.backrooms_mod_group")).icon(() -> new
                    ItemStack(ModBlocks.BACKROOM_WALL)).entries((displayContext, entries) -> {
                    entries.add(ModBlocks.BACKROOM_WALL);
                    entries.add(ModBlocks.BACKROOM_FLOOR);
                    entries.add(ModBlocks.BACKROOM_LIGHT);

            }).build());


    public static void registerItemGroups(){

    }
}
