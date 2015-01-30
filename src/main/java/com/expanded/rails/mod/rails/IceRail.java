package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

public class IceRail extends AllRails
{

    public IceRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:IceRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
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
}