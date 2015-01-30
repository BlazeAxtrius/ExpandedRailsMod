package com.expanded.rails.mod.normalrails;

import net.minecraft.block.Block;

import com.expanded.rails.mod.rails.AllRails;

public class BlueWoolRail extends AllRails 
{

    public BlueWoolRail(int par1)
    {
    	super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeCloth);
        setUnlocalizedName("expandedrailsmod:BlueWoolRail");
        // TODO Auto-generated constructor stub
    }
    
}