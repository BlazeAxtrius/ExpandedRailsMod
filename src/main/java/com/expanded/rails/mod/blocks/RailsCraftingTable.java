package com.expanded.rails.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class RailsCraftingTable extends Block
{
    
    public RailsCraftingTable(int par1)
    {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    //Possible error on "ExpandedRailsMod.instance"//

    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
    {
        if (!player.isSneaking())
        {
         player.openGui(ERMBase.instance, 0, var1, var2, var3, var4);
            player.openGui(ERMBase.modid, 0, var1, var2, var3, var4);
            return true;
        }
        else
        {
            return false;
        }
    }
}
