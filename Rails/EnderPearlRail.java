package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class EnderPearlRail extends AllRails
{
    public IIcon theIcon;

    public EnderPearlRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:EnderPearlRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
    	//return !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
        return !par1World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4);
    }

    //public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
    {
        if (!par1World.isRemote)
        {
            int i1 = par1World.getBlockMetadata(par2, par3, par4);
            int j1 = i1;

            //if (this.isPowered)
            if (this.isPowered())
            {
                j1 = i1 & 7;
            }

            boolean flag = false;

            //if (par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4))
            if (par1World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4))
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
                this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
                par1World.setBlockToAir(par2, par3, par4);
            }
            else
            {
            	//this.func_94358_a(par1World, par2, par3, par4, i1, j1, par5);
                this.func_150048_a(par1World, par2, par3, par4, i1, j1, par5);
            }
        }
    }
}