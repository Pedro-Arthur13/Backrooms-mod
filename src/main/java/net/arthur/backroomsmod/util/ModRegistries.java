package net.arthur.backroomsmod.util;

import net.arthur.backroomsmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerModFuels();
    }
    public static void registerModFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PEAT_BRICK, 200); // o valor  por quantos ticks vai queimar
    }
}
