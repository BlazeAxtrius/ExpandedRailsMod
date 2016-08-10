package com.expanded.rails.mod.rails;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LapisRail extends BlockRail
{

    public LapisRail(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.METAL);
        setUnlocalizedName("expandedrails:LapisRail");
        // TODO Auto-generated constructor stub
    }

    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return true;
    }

    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        if (world.getBlockState(pos1).getBlock() == ERMBase.lapisRail)
        {
            cart.motionY = 1.0D;
        }
    }
}