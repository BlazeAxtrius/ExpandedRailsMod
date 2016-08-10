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
        func_149711_c(0.7F);
        func_149672_a(SoundType.field_185852_e);
        func_149663_c("expandedrails:LapisRail");
        // TODO Auto-generated constructor stub
    }

    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return true;
    }

    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        if (world.func_180495_p(pos1).func_177230_c() == ERMBase.lapisRail)
        {
            cart.field_70181_x = 1.0D;
        }
    }
}
