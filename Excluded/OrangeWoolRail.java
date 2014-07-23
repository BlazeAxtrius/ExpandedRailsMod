package com.expanded.rails.mod.rails;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class OrangeWoolRail extends BlockRail
{
    public IIcon theIcon;

    public OrangeWoolRail(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeCloth);
        setBlockTextureName("expandedrails:OrangeWoolRail");
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