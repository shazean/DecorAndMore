package com.shim.decorandmore.blocks;

import com.shim.decorandmore.items.SlabStoolItem;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.BlockHitResult;

public class SlabStoolBlock extends SlabBlock {
    public static final EnumProperty<DyeColor> COLOR = EnumProperty.create("color", DyeColor.class);

    public SlabStoolBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(COLOR, DyeColor.WHITE));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_56388_) {
        p_56388_.add(TYPE, WATERLOGGED, COLOR);
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!itemstack.isEmpty() && itemstack.getItem() instanceof DyeItem dyeItem) {
            if (!level.isClientSide) {
                level.setBlock(pos, state.setValue(SlabStoolBlock.COLOR, dyeItem.getDyeColor()), 3);
                player.awardStat(Stats.ITEM_USED.get(itemstack.getItem()));
                level.playSound((Player) null, pos, SoundEvents.DYE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
                if (!player.getAbilities().instabuild) itemstack.shrink(1);

                return InteractionResult.PASS;
            }
        }
        return itemstack.getItem() instanceof BlockItem && (new BlockPlaceContext(player, hand, itemstack, hitResult)).canPlace() ? InteractionResult.PASS : InteractionResult.SUCCESS;
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide && !player.isCreative() && level.getGameRules().getBoolean(GameRules.RULE_DOBLOCKDROPS)) {
            ItemStack itemStack = new ItemStack(this);
            DyeColor dyeColor = state.getValue(COLOR);
            CompoundTag stateTag = new CompoundTag();
            stateTag.putInt("dye_color", dyeColor.getId());
            itemStack.addTagElement("BlockStateTag", stateTag);
            ItemEntity itementity = new ItemEntity(level, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ(), itemStack);
            itementity.setDefaultPickUpDelay();
            level.addFreshEntity(itementity);

            if (state.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
                level.addFreshEntity(itementity.copy()); //add second slab
            }

        }
        super.playerWillDestroy(level, pos, state, player);
    }
}