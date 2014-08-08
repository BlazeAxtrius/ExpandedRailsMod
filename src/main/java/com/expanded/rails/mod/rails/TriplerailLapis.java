package com.expanded.rails.mod.rails;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;
import com.expanded.rails.mod.rails.AllRails;

public class TriplerailLapis extends AllRails
{
    public IIcon theIcon;

    public TriplerailLapis(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:LapisTriplerail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        if (world.getBlock(x, y, z) == ERMBase.triplerailLapis)
        {
            cart.motionY = 1.0D;
        }
    }
}