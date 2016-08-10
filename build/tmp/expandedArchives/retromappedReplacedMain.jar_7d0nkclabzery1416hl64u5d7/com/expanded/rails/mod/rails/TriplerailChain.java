package com.expanded.rails.mod.rails;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TriplerailChain extends BlockRail
{

    public TriplerailChain(int par1)
    {
        super();
        func_149711_c(0.7F);
        func_149672_a(SoundType.field_185852_e);
        func_149663_c("expandedrails:ChainTriplerail");
        //setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void onMinecartPass(World world, EntityMinecart cart, BlockPos pos1)
    {
        if (world.func_180495_p(pos1).func_177230_c() == ERMBase.chainRail)
        {
            IBlockState blockMetaData = world.func_180495_p(pos1);
            double var41 = Math.sqrt(cart.field_70159_w * cart.field_70159_w + cart.field_70179_y * cart.field_70179_y);

            if (var41 < 0.05D)
            {
                double var43 = 0.1D;
                cart.field_70159_w += cart.field_70159_w / var41 * var43;
                cart.field_70179_y += cart.field_70179_y / var41 * var43;
            }
            else
            {
                cart.field_70159_w += 0.0D;
                cart.field_70179_y += 0.0D;
            }
        }
    }
}
