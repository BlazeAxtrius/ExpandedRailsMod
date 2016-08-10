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
this.func_149711_c(2F);
this.func_149752_b(12.5F);
this.func_149672_a(SoundType.field_185848_a);
}
private Random rand = new Random();

@Override
public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
{
if (playerIn.func_70093_af())
return false;
else {
if (!worldIn.field_72995_K) {
TileEntityNileWorkbench tileNileTable = (TileEntityNileWorkbench) worldIn.func_175625_s(new BlockPos(pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p()));
if (tileNileTable != null) {
playerIn.openGui(ERMBase.instance, CommonProxy.NileTable, worldIn, pos.func_177958_n(), pos.func_177956_o() , pos.func_177952_p());
}
}
return true;
}
}
public void func_180663_b(World worldIn, BlockPos pos, IBlockState state)
{
dropInventory(worldIn, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p());
super.func_180663_b(worldIn, pos, state);
}
private void dropInventory(World world, int x, int y, int z) {
TileEntity tileEntity = world.func_175625_s(new BlockPos(x, y, z));
if (!(tileEntity instanceof IInventory))
return;
IInventory inventory = (IInventory) tileEntity;
for (int i = 0; i < inventory.func_70302_i_(); i++) {
ItemStack itemStack = inventory.func_70301_a(i);
if (itemStack != null && itemStack.field_77994_a > 0) {
float dX = rand.nextFloat() * 0.8F + 0.1F;
float dY = rand.nextFloat() * 0.8F + 0.1F;
float dZ = rand.nextFloat() * 0.8F + 0.1F;
EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, new ItemStack(itemStack.func_77973_b(), itemStack.field_77994_a, itemStack.func_77952_i()));
if (itemStack.func_77942_o()) {
entityItem.func_92059_d().func_77982_d((NBTTagCompound) itemStack.func_77978_p().func_74737_b());
}
float factor = 0.05F;
entityItem.field_70159_w = rand.nextGaussian() * factor;
entityItem.field_70181_x = rand.nextGaussian() * factor + 0.2F;
entityItem.field_70179_y = rand.nextGaussian() * factor;
world.func_72838_d(entityItem);
itemStack.field_77994_a = 0;
}
}
}
}
