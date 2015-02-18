package com.expanded.rails.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import java.util.Random;

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
    
    private Random rand = new Random();
    
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
    			TileEntityRailsCraftingTable  RailsCraftingTable = (TileEntityRailsCraftingTable) worldIn.getTileEntity(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
    			if (RailsCraftingTable != null) {
    				playerIn.openGui(ERMBase.instance, 3, worldIn, pos.getX(), pos.getY() , pos.getZ());
    			}
    		}
    		return true;
    	}
    	}
    	
    	 public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
    	 {
    	 dropInventory(worldIn, pos.getX(), pos.getY(), pos.getZ());
    	 super.breakBlock(worldIn, pos, state);
    	 }
    	 private void dropInventory(World world, int x, int y, int z) {
    	 TileEntity RailsCraftingTable = world.getTileEntity(new BlockPos(x, y, z));
    	 if (!(RailsCraftingTable instanceof IInventory))
    	 return;
    	 IInventory inventory = (IInventory) RailsCraftingTable;
    	 for (int i = 0; i < inventory.getSizeInventory(); i++) {
    	 ItemStack itemStack = inventory.getStackInSlot(i);
    	 if (itemStack != null && itemStack.stackSize > 0) {
    	 float dX = rand.nextFloat() * 0.8F + 0.1F;
    	 float dY = rand.nextFloat() * 0.8F + 0.1F;
    	 float dZ = rand.nextFloat() * 0.8F + 0.1F;
    	 EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, new ItemStack(itemStack.getItem(), itemStack.stackSize, itemStack.getItemDamage()));
    	 if (itemStack.hasTagCompound()) {
    	 entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
    	 }
    	 float factor = 0.05F;
    	 entityItem.motionX = rand.nextGaussian() * factor;
    	 entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
    	 entityItem.motionZ = rand.nextGaussian() * factor;
    	 world.spawnEntityInWorld(entityItem);
    	 itemStack.stackSize = 0;
    	 }
    	 }
    }
}
