package com.expanded.rails.mod.rails;

import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MonorailEmerald extends BlockRail
{

    public MonorailEmerald(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.METAL);
        setUnlocalizedName("expandedrails:EmeraldMonorail");
        // TODO Auto-generated constructor stub
    }

    public float getRailMaxSpeed(World world, EntityMinecart cart, int y, int x, int z)
    {
        return 0.8f;
    }

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        IBlockState blockMetaData = world.getBlockState(pos1);

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