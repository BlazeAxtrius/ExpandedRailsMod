package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MonorailYellowBlue extends BlockRail
{
    public IIcon theIcon;

    public MonorailYellowBlue(int par1)
    {
        super();
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setBlockTextureName("expandedrails:YellowBlueMonorail");
        // TODO Auto-generated constructor stub
    }

    public IIcon getIcon(int par1, int par2)
    {
        return par2 >= 6 ? this.theIcon : this.blockIcon;
    }

    public void registerIcons(IIconRegister par1IconRegister)
    {
        super.registerBlockIcons(par1IconRegister);
        this.theIcon = par1IconRegister.registerIcon("expandedrails:YellowBlueMonorail_Turn");
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        cart.attackEntityFrom(DamageSource.cactus, 0.3F);
    }

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity player)
    {
        player.attackEntityFrom(DamageSource.cactus, 0.3F);
    }
}