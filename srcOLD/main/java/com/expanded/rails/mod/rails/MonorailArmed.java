package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.entity.item.EntityMinecart;
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

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        if (world.getBlock(x, y, z) == ERMBase.monorailArmed)
        {
            int blockMetaData = world.getBlockMetadata(x, y, z);
            world.createExplosion(cart, x, y, z, 0.3F, false);
            world.newExplosion(cart, x, y, z, 3.5F, true, true);
        }
    }
}