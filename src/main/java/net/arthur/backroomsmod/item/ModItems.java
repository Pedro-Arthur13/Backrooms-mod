package net.arthur.backroomsmod.item;

import net.arthur.backroomsmod.BackroomsMod;
import net.arthur.backroomsmod.block.ModBlocks;
import net.arthur.backroomsmod.block.custom.PaxelItem;
import net.arthur.backroomsmod.item.custom.MetalDetectorItem;
import net.arthur.backroomsmod.item.custom.ModPoisonSwordItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
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
    
    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));

    public static final Item PEAT_BRICK = registerItem("peat_brick",
            new Item(new FabricItemSettings()));
    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new ModPoisonSwordItem(ModToolMaterial.PINK_GARNET,4,10f,new FabricItemSettings()));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.PINK_GARNET,1,10f,new FabricItemSettings()));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterial.PINK_GARNET,1,10f,new FabricItemSettings()));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterial.PINK_GARNET,100,10f,new FabricItemSettings()));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterial.PINK_GARNET,5,-2f,new FabricItemSettings()));

    public static final Item PINK_GARNET_PAXEL = registerItem("pink_garnet_paxel",
            new PaxelItem(ModToolMaterial.PINK_GARNET,0,0,new FabricItemSettings()));

    public static final Item EAT_DIAMOND_PICKAXE = registerItem("eat_diamond_pickaxe",
            new Item(new FabricItemSettings().food(ModFoodComponents.EAT_DIAMOND_PICKAXE)));

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
