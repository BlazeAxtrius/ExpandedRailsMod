package com.expanded.rails.mod.rails;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class ObsidianRail extends BlockRail
{
    public IIcon theIcon;

    public ObsidianRail(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:ObsidianRail");
        setResistance(2000.0F);
    }

    public IIcon getIcon(int par1, int par2)
    {
        return par2 >= 6 ? this.theIcon : this.blockIcon;
    }

    public void registerIcons(IIconRegister par1IconRegister)
    {
        super.registerBlockIcons(par1IconRegister);
        this.theIcon = par1IconRegister.registerIcon("expandedrails:YellowBlueMonorail_Turn");
    }
}