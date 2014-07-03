package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailBase;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import com.expanded.rails.mod.ERMBase;

public class LapisRail extends BlockRail
{
    public IIcon theIcon;

    public LapisRail(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:LapisRail");
        // TODO Auto-generated constructor stub
    }

    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return true;
    }

    public IIcon getIcon(int par1, int par2)
    {
        return par2 >= 6 ? this.theIcon : this.blockIcon;
    }

    public void registerIcons(IIconRegister par1IconRegister)
    {
        super.registerBlockIcons(par1IconRegister);
        this.theIcon = par1IconRegister.registerIcon("expandedrails:LapisRail_Turn");
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        if (world.getBlock(x, y, z) == ERMBase.lapisRail)
        {
            cart.motionY = 1.0D;
        }
    }
}