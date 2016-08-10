package com.expanded.rails.mod.rails;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ArmedRail extends BlockRail
{
	
    public ArmedRail(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.METAL);
        setUnlocalizedName("expandedrails:ArmedRail");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos) {
        if (world.getBlockState(new BlockPos(pos)).getBlock() == ERMBase.armedRail)
        {
            world.createExplosion(cart, pos.getX(), pos.getY(), pos.getZ(), 0.3F, false);
            world.newExplosion(cart, pos.getX(), pos.getY(), pos.getZ(), 3.5F, true, true);
        }
    }
}