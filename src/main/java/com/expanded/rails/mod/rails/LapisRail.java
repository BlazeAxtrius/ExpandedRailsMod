package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class LapisRail extends AllRails
{

    public LapisRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:LapisRail");
        // TODO Auto-generated constructor stub
    }

    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return true;
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        if (world.getBlock(x, y, z) == ERMBase.lapisRail)
        {
            cart.motionY = 1.0D;
        }
    }
}