package net.arthur.backroomsmod.block.custom;

import net.arthur.backroomsmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class PaxelItem extends MiningToolItem {
    //No momento (04/08/2024) os items paxel não fazem caminhos de terra nem descascam madeiras, ainda é um pouco mais avançado
    public PaxelItem(ToolMaterial material,float attackDamage, float attackSpeed,  Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL_MINABLE, settings);
    }
}
