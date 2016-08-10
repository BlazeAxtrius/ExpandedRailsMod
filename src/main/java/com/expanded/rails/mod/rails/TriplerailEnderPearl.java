package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TriplerailEnderPearl extends BlockRail
{

    public TriplerailEnderPearl(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.METAL);
        setUnlocalizedName("expandedrails:EnderPearlTriplerail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public boolean canPlaceBlockAt(World par1World, BlockPos pos)
    {
        //return !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
        return !par1World.getBlockState(pos.down()).isSideSolid(par1World, pos.down(), EnumFacing.UP);
    }

    @Override
    //public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    public void neighborChanged(IBlockState state, World par1World, BlockPos pos1, Block par5)
    {
        if (!par1World.isRemote)
        {
            IBlockState i1 = par1World.getBlockState(pos1);
            IBlockState j1 = i1;

            //if (this.isPowered)

            boolean flag = false;

            //if (par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4))
            if (par1World.getBlockState(pos1.down()).isSideSolid(par1World, pos1.down(), EnumFacing.UP))
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
                this.dropBlockAsItem(par1World, pos1, par1World.getBlockState(pos1), 0);
                par1World.setBlockToAir(pos1);
            }
            else
            {
                //this.func_94358_a(par1World, par2, par3, par4, i1, j1, par5);
                this.neighborChanged(state, par1World, pos1, par5);
            }
        }
    }
}