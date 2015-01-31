package com.expanded.rails.mod.normalrails;

import net.minecraft.block.Block;

import com.expanded.rails.mod.rails.AllRails;

public class MonorailBrown extends AllRails
{

    public MonorailBrown(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:MonorailBrown");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
    }

}