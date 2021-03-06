package com.expanded.rails.mod.rails;

import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IceRail extends BlockRail
{

    public IceRail(int par1)
    {
        super();
        func_149711_c(0.7F);
        func_149672_a(SoundType.field_185852_e);
        func_149663_c("expandedrails:IceRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
    }
    
    public float getRailMinSpeed(World world, EntityMinecart cart, int y, int x, int z)
    {
        return 0.2f;
    }

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        IBlockState blockMetaData = world.func_180495_p(pos1);

        //if ((blockMetaData & 0x8) == 0)
        {
            double var24 = Math.sqrt(cart.field_70159_w * cart.field_70159_w + cart.field_70179_y * cart.field_70179_y);

            if (var24 > 0.1D)
            {
                cart.field_70159_w *= 0.80D;
                cart.field_70181_x *= 0.0D;
                cart.field_70179_y *= 0.80D;
            }
        }
    }
}
