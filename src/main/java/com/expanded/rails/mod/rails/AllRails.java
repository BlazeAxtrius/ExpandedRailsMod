package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;

public class AllRails extends ExpandedRail
{
	
	public AllRails (int par1) 
	{
	super(par1);
    setHardness(0.7F);
    setStepSound(Block.soundTypeMetal);
    }
	 
	//@SideOnly(Side.CLIENT)
    //public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    //{
        //return p_149691_2_ >= 6 ? this.theIcon : this.blockIcon;
    //}

    //@SideOnly(Side.CLIENT)
    //public void registerBlockIcons(IIconRegister p_149651_1_)
    //{
        //super.registerBlockIcons(p_149651_1_);
        //this.theIcon = p_149651_1_.registerIcon(this.getTextureName() + "_Turn");
        //this.theIcon = par1IconRegister.registerIcon("expandedrails:ArmedRail_Turn");
    //}
}
