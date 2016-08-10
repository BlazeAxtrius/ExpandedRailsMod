package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EmeraldRail extends BlockRail
{

    public EmeraldRail(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.METAL);
        setUnlocalizedName("expandedrails:EmeraldRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public float getRailMaxSpeed(World world, EntityMinecart cart, int y, int x, int z)
    {
        return 0.8f;
    }

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        //if ((blockMetaData & 0x8) == 0)
        {
            {
                cart.motionX *= 5.0D;
                cart.motionY *= 0.0D;
                cart.motionZ *= 5.0D;
            }
        }
    }
}