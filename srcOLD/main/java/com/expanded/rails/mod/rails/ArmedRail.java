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
    
    public void onMinecartPass(World worldObj, EntityMinecart cart, BlockPos pos1)
    {
        if (worldObj.getBlockState(pos1).getBlock() == ERMBase.armedRail)
        {
            IBlockState blockMetaData = worldObj.getBlockState(pos1);
            worldObj.createExplosion(cart, x, y, z, 0.3F, false);
            worldObj.newExplosion(cart, x, y, z, 3.5F, true, true);
        }
    }
}