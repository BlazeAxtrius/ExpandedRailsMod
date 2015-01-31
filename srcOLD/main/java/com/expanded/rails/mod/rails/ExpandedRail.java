package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;

public class ExpandedRail extends BlockRail
{
    public ExpandedRail(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
    }

    /**if (world.getBlockId(x - 1, y, z) == Block.torchWood.blockID || world.getBlockId(x + 1, y, z) == Block.torchWood.blockID || world.getBlockId(x, y, z - 1) == Block.torchWood.blockID || world.getBlockId(x, y, z + 1) == Block.torchWood.blockID)
    {
      int blockMetaData = world.getBlockMetadata(x, y, z);
      if ((blockMetaData & 0x8) == 0)
      {
    	  double var24 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);
    	  if (var24 > 0.1D)
    	  {
    		  cart.motionX *= 0.95D;
    		  cart.motionY *= 0.0D;
    		  cart.motionZ *= 0.95D;
    		  }
    	  }
      }

    if (world.getBlockId(x - 1, y, z) == Block.torchWood.blockID || world.getBlockId(x + 1, y, z) == Block.torchWood.blockID || world.getBlockId(x, y, z - 1) == Block.torchWood.blockID || world.getBlockId(x, y, z + 1) == Block.torchWood.blockID)
    {
      int blockMetaData = world.getBlockMetadata(x, y, z);
      if ((blockMetaData & 0x8) == 0)
      {
    	  double var24 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);
    	  if (var24 > 0.1D)
    	  {
    		  cart.motionX *= 1.5D;
    		  cart.motionY *= 0.0D;
    		  cart.motionZ *= 1.5D;
    		  }
    	  }
      }

    if (world.getBlockId(x - 1, y, z) == Block.torchWood.blockID || world.getBlockId(x + 1, y, z) == Block.torchWood.blockID || world.getBlockId(x, y, z - 1) == Block.torchWood.blockID || world.getBlockId(x, y, z + 1) == Block.torchWood.blockID)
    {
      int blockMetaData = world.getBlockMetadata(x, y, z);
      if ((blockMetaData & 0x8) == 0)
      {
    	  double var24 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);
    	  if (var24 > 0.1D)
    	  {
    		  cart.motionX *= 5.0D;
    		  cart.motionY *= 0.0D;
    		  cart.motionZ *= 5.0D;
    		  }
    	  }
      }*/

}