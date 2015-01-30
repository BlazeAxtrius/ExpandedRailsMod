package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class MonorailChain extends AllRails
{

    public MonorailChain(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:ChainMonorail");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
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