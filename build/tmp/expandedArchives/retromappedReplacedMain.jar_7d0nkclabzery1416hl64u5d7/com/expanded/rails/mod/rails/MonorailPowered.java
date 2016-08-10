package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MonorailPowered extends BlockRail
{

    public MonorailPowered(int par1)
    {
        super();
        func_149711_c(0.7F);
        func_149672_a(SoundType.field_185854_g);
        func_149663_c("expandedrailsmod:MonorailPowered");
        // TODO Auto-generated constructor stub
    }

    public void func_176213_c(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.field_72995_K)
        {
            state = this.func_176564_a(worldIn, pos, state, true);

            if (this.field_150053_a)
            {
                state.func_189546_a(worldIn, pos, this);
            }
        }
    }

    /**
     * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
     * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
     * block, etc.
     */
    public void func_189540_a(IBlockState state, World worldIn, BlockPos pos, Block blockIn)
    {
        if (!worldIn.field_72995_K)
        {
            BlockRailBase.EnumRailDirection blockrailbase$enumraildirection = (BlockRailBase.EnumRailDirection)state.func_177229_b(this.func_176560_l());
            boolean flag = false;

            if (!worldIn.func_180495_p(pos.func_177977_b()).isSideSolid(worldIn, pos.func_177977_b(), EnumFacing.UP))
            {
                flag = true;
            }

            if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_EAST && !worldIn.func_180495_p(pos.func_177974_f()).isSideSolid(worldIn, pos.func_177974_f(), EnumFacing.UP))
            {
                flag = true;
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_WEST && !worldIn.func_180495_p(pos.func_177976_e()).isSideSolid(worldIn, pos.func_177976_e(), EnumFacing.UP))
            {
                flag = true;
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_NORTH && !worldIn.func_180495_p(pos.func_177978_c()).isSideSolid(worldIn, pos.func_177978_c(), EnumFacing.UP))
            {
                flag = true;
            }
            else if (blockrailbase$enumraildirection == BlockRailBase.EnumRailDirection.ASCENDING_SOUTH && !worldIn.func_180495_p(pos.func_177968_d()).isSideSolid(worldIn, pos.func_177968_d(), EnumFacing.UP))
            {
                flag = true;
            }

            if (flag && !worldIn.func_175623_d(pos))
            {
                this.func_176226_b(worldIn, pos, state, 0);
                worldIn.func_175698_g(pos);
            }
            else
            {
                this.func_189541_b(state, worldIn, pos, blockIn);
            }
        }
    }
}
