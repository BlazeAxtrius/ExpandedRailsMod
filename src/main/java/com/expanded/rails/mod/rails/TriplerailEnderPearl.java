package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TriplerailEnderPearl extends BlockRail
{
    public IIcon theIcon;

    public TriplerailEnderPearl(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:EnderPearlTriplerail");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
    }

    public IIcon getIcon(int par1, int par2)
    {
        return par2 >= 6 ? this.theIcon : this.blockIcon;
    }

    public void registerIcons(IIconRegister par1IconRegister)
    {
        super.registerBlockIcons(par1IconRegister);
        this.theIcon = par1IconRegister.registerIcon("expandedrails:YellowBlueMonorail_Turn");
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return !par1World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4);
    }

    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
    {
        if (!par1World.isRemote)
        {
            int i1 = par1World.getBlockMetadata(par2, par3, par4);
            int j1 = i1;

            if (this.isPowered())
            {
                j1 = i1 & 7;
            }

            boolean flag = false;

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
                this.func_150048_a(par1World, par2, par3, par4, i1, j1, par5);
            }
        }
    }
}