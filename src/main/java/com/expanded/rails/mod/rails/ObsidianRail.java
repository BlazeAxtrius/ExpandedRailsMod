package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;

public class ObsidianRail extends AllRails
{
	
	public ObsidianRail(int par1)
	{
		super(par1);
		setHardness(0.7F);
		setStepSound(Block.soundTypeMetal);
		setUnlocalizedName("expandedrails:ObsidianRail");
		setResistance(2000.0F);
	}
}