package com.expanded.rails.mod.normalrails;

import com.expanded.rails.mod.rails.AllRails;

import net.minecraft.block.Block;

public class MonorailNether extends AllRails
{

    public MonorailNether(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:NetherMonorail");
        // TODO Auto-generated constructor stub
    }

}