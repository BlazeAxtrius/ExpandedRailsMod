package com.expanded.rails.mod.rails;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChainRail extends BlockRail
{

    public ChainRail(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.METAL);
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

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        if (world.getBlockState(pos1).getBlock() == ERMBase.chainRail)
        {
            IBlockState blockMetaData = world.getBlockState(pos1);
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