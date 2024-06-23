package net.arthur.backroomsmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    //Cada 1 em huger equivale a meia perna de fome
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING),0.25f).build();
    public static final FoodComponent EAT_DIAMOND_PICKAXE = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING),0.25f).build();
}
