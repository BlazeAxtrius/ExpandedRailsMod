package com.expanded.rails.mod.rails;

import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IceRail extends BlockRail
{

    public IceRail(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.METAL);
        setUnlocalizedName("expandedrails:IceRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
    }
    
    public float getRailMinSpeed(World world, EntityMinecart cart, int y, int x, int z)
    {
        return 0.2f;
    }

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        IBlockState blockMetaData = world.getBlockState(pos1);

        //if ((blockMetaData & 0x8) == 0)
        {
            double var24 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);

            if (var24 > 0.1D)
            {
                cart.motionX *= 0.80D;
                cart.motionY *= 0.0D;
                cart.motionZ *= 0.80D;
            }
        }
    }
}