package com.expanded.rails.mod.blocks;

import com.expanded.rails.mod.CommonProxy;
import com.expanded.rails.mod.ERMBase;
import com.expanded.rails.mod.gui.TileEntityNileWorkbench;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockNileWorkbench extends BlockWorkbench {
public BlockNileWorkbench() {
super();
this.setHardness(2F);
this.setResistance(12.5F);
this.setSoundType(SoundType.WOOD);
}
private Random rand = new Random();

@Override
public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
{
if (playerIn.isSneaking())
return false;
else {
if (!worldIn.isRemote) {
TileEntityNileWorkbench tileNileTable = (TileEntityNileWorkbench) worldIn.getTileEntity(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
if (tileNileTable != null) {
playerIn.openGui(ERMBase.instance, CommonProxy.NileTable, worldIn, pos.getX(), pos.getY() , pos.getZ());
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
TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
if (!(tileEntity instanceof IInventory))
return;
IInventory inventory = (IInventory) tileEntity;
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
