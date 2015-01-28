package com.expanded.rails.mod.rails;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class ObsidianRail extends AllRails
{

    public ObsidianRail()
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:ObsidianRail");
        setResistance(2000.0F);
    }
}