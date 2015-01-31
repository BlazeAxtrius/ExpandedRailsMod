package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class TriplerailLapis extends AllRails
{

    public TriplerailLapis(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:LapisTriplerail");
        // TODO Auto-generated constructor stub
    }

    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        if (world.getBlockState(pos1).getBlock() == ERMBase.monorailLapis)
        {
            cart.motionY = 1.0D;
        }
    }
}