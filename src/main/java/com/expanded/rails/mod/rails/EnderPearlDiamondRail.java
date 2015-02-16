package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EnderPearlDiamondRail extends AllRails{

	public EnderPearlDiamondRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:EnderPearlRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public boolean canPlaceBlockAt(World par1World, BlockPos pos)
    {
    	//return !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
        return !par1World.doesBlockHaveSolidTopSurface(par1World, pos);
    }

    @Override
    //public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    public void onNeighborBlockChange(World par1World, BlockPos pos1, IBlockState state, Block par5)
    {
        if (!par1World.isRemote)
        {
            IBlockState i1 = par1World.getBlockState(pos1);
            IBlockState j1 = i1;

            //if (this.isPowered)

            boolean flag = false;

            //if (par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4))
            if (par1World.doesBlockHaveSolidTopSurface(par1World, pos1))
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
                this.onNeighborChangedInternal(par1World, pos1, state, par5);
            }
        }
    }
        
        public float getRailMaxSpeed(World world, EntityMinecart cart, int y, int x, int z)
        {
            return 0.5f;
        }

        @Override
        public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
        {
            IBlockState blockMetaData = world.getBlockState(pos1);

            //if ((blockMetaData & 0x8) == 0)
            {
                {
                    cart.motionX *= 3.5D;
                    cart.motionY *= 0.0D;
                    cart.motionZ *= 3.5D;
                }
            }
            
    }
}
