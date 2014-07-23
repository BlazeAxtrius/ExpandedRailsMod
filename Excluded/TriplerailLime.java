package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class TriplerailLime extends BlockRail
{
    public IIcon theIcon;

    public TriplerailLime(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:TriplerailLime");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
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

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }
}