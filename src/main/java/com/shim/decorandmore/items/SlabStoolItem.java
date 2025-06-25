package com.shim.decorandmore.items;

import com.shim.decorandmore.blocks.SlabStoolBlock;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class SlabStoolItem extends BlockItem {
    public SlabStoolItem(Block p_40565_, Properties p_40566_) {
        super(p_40565_, p_40566_);
    }

    @Override
    protected boolean placeBlock(BlockPlaceContext context, BlockState state) {
        CompoundTag nbt = context.getItemInHand().getOrCreateTag().getCompound("BlockStateTag");

        Tag tag = nbt.get("dye_color");
        if (tag != null) {
            state = state.setValue(SlabStoolBlock.COLOR,  DyeColor.byId(Integer.parseInt(tag.getAsString())));
            context.getLevel().setBlock(context.getClickedPos(), state, 3);
            context.getItemInHand().shrink(1);
        }
        return super.placeBlock(context, state);
    }
}
