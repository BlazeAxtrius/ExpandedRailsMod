package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnderPearlRail extends BlockRail
{

    public EnderPearlRail(int par1)
    {
        super();
        func_149711_c(0.7F);
        func_149672_a(SoundType.field_185852_e);
        func_149663_c("expandedrails:EnderPearlRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public boolean func_176196_c(World par1World, BlockPos pos)
    {
    	//return !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
        return !par1World.func_180495_p(pos.func_177977_b()).isSideSolid(par1World, pos.func_177977_b(), EnumFacing.UP);
    }

    @Override
    //public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    public void func_189540_a(IBlockState state, World par1World, BlockPos pos1, Block par5)
    {
        if (!par1World.field_72995_K)
        {
            IBlockState i1 = par1World.func_180495_p(pos1);
            IBlockState j1 = i1;

            //if (this.isPowered)

            boolean flag = false;

            //if (par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4))
            if (par1World.func_180495_p(pos1.func_177977_b()).isSideSolid(par1World, pos1.func_177977_b(), EnumFacing.UP))
            {
                flag = true;
            }

            /**if (j1 == 2 && par1World.doesBlockHaveSolidTopSurface(par2 + 1, par3, par4))
            {
                flag = true;
            }

            if (j1 == 3 && par1World.doesBlockHaveSolidTopSurface(par2 - 1, par3, par4))
            {
                flag = true;
            }

            if (j1 == 4 && par1World.doesBlockHaveSolidTopSurface(par2, par3, par4 - 1))
            {
                flag = true;
            }

            if (j1 == 5 && par1World.doesBlockHaveSolidTopSurface(par2, par3, par4 + 1))
            {
                flag = true;
            }*/

            if (flag)
            {
                this.func_176226_b(par1World, pos1, par1World.func_180495_p(pos1), 0);
                par1World.func_175698_g(pos1);
            }
            else
            {
            	//this.func_94358_a(par1World, par2, par3, par4, i1, j1, par5);
                this.func_189540_a(state, par1World, pos1, par5);
            }
        }
    }
}
