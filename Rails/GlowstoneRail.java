package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class GlowstoneRail extends AllRails
{
    public IIcon theIcon;

    public GlowstoneRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:GlowstoneRail");
        setLightValue(0.7F);
        // TODO Auto-generated constructor stub
    }

    private void setLightValue(float f) {
		// TODO Auto-generated method stub
		
	}

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }
}