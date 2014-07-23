package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.block.BlockIce;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.material.Material;

import java.util.Random;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class IceRail extends AllRails
{
    public IIcon theIcon;

    public IceRail(int par1)
    {
        super(par1);
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:IceRail");
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        int blockMetaData = world.getBlockMetadata(x, y, z);

        if ((blockMetaData & 0x8) == 0)
        {
            double var24 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);

            if (var24 > 0.1D)
            {
                cart.motionX *= 0.95D;
                cart.motionY *= 0.0D;
                cart.motionZ *= 0.95D;
            }
        }
    }
}