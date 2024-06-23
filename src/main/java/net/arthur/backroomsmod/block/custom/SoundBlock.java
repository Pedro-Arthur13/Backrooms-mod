package net.arthur.backroomsmod.block.custom;

import net.arthur.backroomsmod.BackroomsMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SoundBlock extends Block {
    public SoundBlock(Settings settings) {
        super(settings);
    }

    //Normalmente o metodo a seguir é chamado 4 vezes, duas para o client e duas para o servidor
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(player.isSneaking()){
            world.playSound(player,pos, SoundEvents.BLOCK_NOTE_BLOCK_BANJO.value(),
                    SoundCategory.BLOCKS,1f,1f);
            return ActionResult.SUCCESS;
        }else{
            world.playSound(player,pos, SoundEvents.AMBIENT_CAVE.value(),
                    SoundCategory.BLOCKS,1f,1f);
            return ActionResult.CONSUME;

        }


//        if(world.isClient()){
//            if(hand == Hand.MAIN_HAND){
//                BackroomsMod.LOGGER.info("Client | Main hand");
//
//            }else{
//                BackroomsMod.LOGGER.info("Client | Off hand");
//
//            }
//        }else{
//            if(hand == Hand.MAIN_HAND){
//                BackroomsMod.LOGGER.info("Server | Main hand");
//
//            }else{
//                BackroomsMod.LOGGER.info("Server | Off hand");
//
//            }
//        }
//        return ActionResult.SUCCESS; // Swing of the hand


    }
    //Chamado toda vez que alguem passa por cima do bloco
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        world.playSound(entity, pos, SoundEvents.BLOCK_NOTE_BLOCK_BIT.value(), SoundCategory.BLOCKS, 1f, 1f);
        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {

        tooltip.add(Text.translatable("tooltip.backrooms_mod.sound_block.tooltip.shift"));

    }
}
