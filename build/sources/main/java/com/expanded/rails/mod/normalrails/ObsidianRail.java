package com.expanded.rails.mod.normalrails;

import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;

public class ObsidianRail extends BlockRail
{
	
	public ObsidianRail(int par1)
	{
		super();
		setHardness(0.7F);
		setSoundType(SoundType.METAL);
		setUnlocalizedName("expandedrails:ObsidianRail");
		setResistance(2000.0F);
	}
}