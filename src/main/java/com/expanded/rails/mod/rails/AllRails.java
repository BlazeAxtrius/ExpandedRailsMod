package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AllRails extends ExpandedRail
{
	
	public AllRails () 
	{
	super();
    setHardness(0.7F);
    setStepSound(Block.soundTypeMetal);
    }
	 
}
