package com.expanded.rails.mod.normalrails;

import net.minecraft.block.BlockRail;
import net.minecraft.block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class MonorailYellowBlue extends BlockRail
{

    public MonorailYellowBlue(int par1)
    {
        super();
        setHardness(0.7F);
        setSoundType(SoundType.CLOTH);
        setUnlocalizedName("expandedrails:YellowBlueMonorail");
        // TODO Auto-generated constructor stub
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