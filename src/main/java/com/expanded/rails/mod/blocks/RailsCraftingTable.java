package com.expanded.rails.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;
import com.expanded.rails.mod.gui.TileEntityRailsCraftingTable;

public class RailsCraftingTable extends BlockContainer
{
    
    public RailsCraftingTable(int par1)
    {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }

    //Possible error on "ExpandedRailsMod.instance"//
    
    @Override
    public TileEntity createNewTileEntity(World world, int par1) {
    return new TileEntityRailsCraftingTable();
    }
    
    //public boolean onBlockActivated(World var1, BlockPos pos1, IBlockState state, EntityPlayer playerIn, EnumFacing side,
			//float hitX, float hitY, float hitZ) {
    	
    	//if (var1.isRemote) {
			//return true;
    	    //}
		//else
	        //{
            //playerIn.openGui(ERMBase.instance, 3, var1, pos1.getX(), pos1.getY(), pos1.getZ());
            //playerIn.openGui(ERMBase.modid, 3, var1, pos1.getX(), pos1.getY(), pos1.getZ());
            //return true;
            //}
    	//}
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    	{
    	if (playerIn.isSneaking())
    		return false;
    	else {
    		if (!worldIn.isRemote) {
    			TileEntityRailsCraftingTable tileNileTable = (TileEntityRailsCraftingTable) worldIn.getTileEntity(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
    			if (tileNileTable != null) {
    				playerIn.openGui(ERMBase.instance, 3, worldIn, pos.getX(), pos.getY() , pos.getZ());
    			}
    		}
    		return true;
    	}
    }
}
