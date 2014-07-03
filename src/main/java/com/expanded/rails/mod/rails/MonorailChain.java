package com.expanded.rails.mod.rails;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MonorailChain extends BlockRail
{
    public IIcon theIcon;

    public MonorailChain(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:ChainMonorail");
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
        this.theIcon = par1IconRegister.registerIcon("expandedrails:ChainMonorail_Turn");
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        if (world.getBlock(x, y, z) == ERMBase.monorailChain)
        {
            int blockMetaData = world.getBlockMetadata(x, y, z);
            double var41 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);

            if (var41 < 0.05D)
            {
                double var43 = 0.1D;
                cart.motionX += cart.motionX / var41 * var43;
                cart.motionZ += cart.motionZ / var41 * var43;
            }
            else
            {
                cart.motionX += 0.0D;
                cart.motionZ += 0.0D;
            }
        }
    }
}