package com.expanded.rails.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
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

    public boolean onBlockActivated(World var1, BlockPos pos1, IBlockState state, EntityPlayer playerIn, EnumFacing side,
			float hitX, float hitY, float hitZ) {
    	
    	if (var1.isRemote) {
			return true;
    	    }
		else
	        {
            playerIn.openGui(ERMBase.instance, 1, var1, pos1.getX(), pos1.getY(), pos1.getZ());
            playerIn.openGui(ERMBase.modid, 1, var1, pos1.getX(), pos1.getY(), pos1.getZ());
            return true;
            }
    	}
    }
