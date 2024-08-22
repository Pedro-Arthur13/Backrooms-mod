package net.arthur.backroomsmod;

import net.arthur.backroomsmod.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BackroomsModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //O codigo a seguir faz com que os pixels vazios dos blocos sejam transparentes e nao opacos
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());
    }
}
