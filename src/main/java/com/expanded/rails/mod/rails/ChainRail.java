package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class ChainRail extends AllRails
{

    public ChainRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:ChainRail");
        // TODO Auto-generated constructor stub
    }


    /**public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
    		  int blockMetaData = world.getBlockMetadata(x, y, z);
    		  if ((blockMetaData & 0x8) == 0)
    		  {
    			  double var24 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);
    			  if (var24 < 0.1D)
    			  {
    				  cart.motionX += 0.11D;
    				  cart.motionY += 0.0D;
    				  cart.motionZ += 0.11D;
    				  }
    			  }
    		  }*/

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        if (world.getBlock(x, y, z) == ERMBase.chainRail)
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