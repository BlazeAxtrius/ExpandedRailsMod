package com.expanded.rails.mod.normalrails;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.expanded.rails.mod.rails.AllRails;

public class BlackWoolRail extends AllRails
{

    public BlackWoolRail(int par1)
    {
    	super(par1);
    	GameRegistry.registerBlock(this, "BlackWoolRail");
        setHardness(0.7F);
        setStepSound(Block.soundTypeCloth);
        setUnlocalizedName("expandedrails:BlackWoolRail");
        // TODO Auto-generated constructor stub
    }

}