package net.arthur.backroomsmod.util;

import net.arthur.backroomsmod.BackroomsMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLE_BLOCKS =
                createBlockTag("metal_detector_valuable_blocks");

        private static TagKey<Block> createBlockTag(String name) { // O nome aqui é do arquivo json
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BackroomsMod.MOD_ID, name));
        }

        private static TagKey<Block> createCommonBlockTag(String name) { // O nome aqui é do arquivo json
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }

    }

    public static class Items {
        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BackroomsMod.MOD_ID, name));
        }

        private static TagKey<Item> createCommonBlockTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }

}