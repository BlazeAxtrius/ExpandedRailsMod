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
        func_149711_c(0.7F);
        func_149672_a(SoundType.field_185852_e);
        func_149663_c("expandedrails:ArmedRail");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos) {
        if (world.func_180495_p(new BlockPos(pos)).func_177230_c() == ERMBase.armedRail)
        {
            world.func_72876_a(cart, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p(), 0.3F, false);
            world.func_72885_a(cart, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p(), 3.5F, true, true);
        }
    }
}
