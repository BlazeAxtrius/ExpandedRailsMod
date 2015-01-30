package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

public class TriplerailDiamond extends AllRails
{

    public TriplerailDiamond(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrailsmod:DiamondTriplerail");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
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