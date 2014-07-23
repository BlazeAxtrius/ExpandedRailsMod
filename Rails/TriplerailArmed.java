package com.expanded.rails.mod.rails;

import com.expanded.rails.mod.ERMBase;
import com.expanded.rails.mod.rails.AllRails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.IIcon;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TriplerailArmed extends AllRails
{
    public IIcon theIcon;

    public TriplerailArmed(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:ArmedTriplerail");
        setBlockBounds(0.0F, 0.0F, 0.0F, 0.500F, 0.125F, 1.0F);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        if (world.getBlock(x, y, z) == ERMBase.triplerailArmed)
        {
            int blockMetaData = world.getBlockMetadata(x, y, z);
            world.createExplosion(cart, x, y, z, 0.3F, false);
            world.newExplosion(cart, x, y, z, 3.5F, true, true);
        }
    }
}