package net.arthur.backroomsmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModPoisonSwordItem extends SwordItem {
    public ModPoisonSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    // Metodo chamado sempre quando vc da um hit em uma entidade
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON,
                200,1),attacker);//(duração,amplifier,status effect)
        // o amplifier é o nivel do poison
        // precisa colocar attacker dps pra saber dem quem se originou tudo isso
        return super.postHit(stack, target, attacker);
    }
}
