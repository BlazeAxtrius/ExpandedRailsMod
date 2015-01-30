package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class ArmedRail extends AllRails
{

    public ArmedRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:ArmedRail");
        // TODO Auto-generated constructor stub
    }
    
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1, int x, int y, int z)
    {
        if (world.getBlockState(pos1).getBlock() == ERMBase.armedRail)
        {
            IBlockState blockMetaData = world.getBlockState(pos1);
            world.createExplosion(cart, x, y, z, 0.3F, false);
            world.newExplosion(cart, x, y, z, 3.5F, true, true);
        }
    }
}