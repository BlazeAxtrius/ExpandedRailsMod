package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class MonorailArmed extends AllRails
{

    public MonorailArmed(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:ArmedMonorail");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onMinecartPass(World worldObj, EntityMinecart cart, BlockPos pos)
    {
        if (worldObj.getBlockState(new BlockPos(pos)).getBlock() == ERMBase.monorailArmed)
        {
            IBlockState blockMetaData = worldObj.getBlockState(new BlockPos(pos));
            worldObj.createExplosion(cart, pos.getX(), pos.getY(), pos.getZ(), 0.3F, false);
            worldObj.newExplosion(cart, pos.getX(), pos.getY(), pos.getZ(), 3.5F, true, true);
        }
    }
}