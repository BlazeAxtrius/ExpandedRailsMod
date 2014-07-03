package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MonorailDiamond extends BlockRail
{
    public IIcon theIcon;

    public MonorailDiamond(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:DiamondMonorail");
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
        this.theIcon = par1IconRegister.registerIcon("expandedrails:DiamondMonorail_Turn");
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public float getRailMaxSpeed(World world, EntityMinecart cart, int y, int x, int z)
    {
        return 0.5f;
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        int blockMetaData = world.getBlockMetadata(x, y, z);

        if ((blockMetaData & 0x8) == 0)
        {
            {
                cart.motionX *= 3.5D;
                cart.motionY *= 0.0D;
                cart.motionZ *= 3.5D;
            }
        }
    }
}