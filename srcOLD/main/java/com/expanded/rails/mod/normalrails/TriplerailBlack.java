package com.expanded.rails.mod.normalrails;

import net.minecraft.block.Block;

import com.expanded.rails.mod.rails.AllRails;

public class TriplerailBlack extends AllRails
{

    public TriplerailBlack(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:TriplerailBlack");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
    }

}