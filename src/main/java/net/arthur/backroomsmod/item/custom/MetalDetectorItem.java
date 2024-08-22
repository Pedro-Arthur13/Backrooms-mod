package net.arthur.backroomsmod.item.custom;

import net.arthur.backroomsmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MetalDetectorItem extends Item {

    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    // useOnBlock -> quando o item está em tua mão e tu clicas em um bloco
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        //Verificando se estamos no client ou no server
        if(!context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            // Vai rodar desde a posiçao clicada pelo usuario e vai procurar até a camada 0
            // e + 64, pq o mine tem até a camada -64
            for(int i = 0; i<positionClicked.getY()+64;i++){
                BlockState blockState = context.getWorld().getBlockState(positionClicked.down(i));
                Block block = blockState.getBlock(); // pegar qual o bloco atual sendo verificado

                if(isValuableBlock(blockState)){
                    outputValuableCoordinates(positionClicked.down(i),player,block);
                    foundBlock = true;
                    break;
                }


            }
            if(!foundBlock){
                player.sendMessage(Text.translatable("item.backrooms_mod.metal_detector.no_valuables"));
            }
        }

        context.getStack().damage(1,context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        return ActionResult.SUCCESS;


    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.backrooms_mod.metal_detector.tooltip.shift"));
        }else{
            tooltip.add(Text.translatable("tooltip.backrooms_mod.metal_detector.tooltip"));

        }
    }

    private void outputValuableCoordinates(BlockPos position, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Valuable found: "+ block.getName().getString()+ " at ("+
                position.getX() + ", "+position.getY() + ", " +position.getZ() + ")"));
    }

    private boolean isValuableBlock(BlockState blockState) {
        return blockState.isIn(ModTags.Blocks.METAL_DETECTOR_VALUABLE_BLOCKS);
    }
}
