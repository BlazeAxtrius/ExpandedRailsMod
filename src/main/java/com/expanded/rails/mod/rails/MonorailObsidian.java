package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;

public class MonorailObsidian extends AllRails
{

    public MonorailObsidian(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:ObsidianMonorail");
        setResistance(2000.0F);
        // TODO Auto-generated constructor stub
    }

}