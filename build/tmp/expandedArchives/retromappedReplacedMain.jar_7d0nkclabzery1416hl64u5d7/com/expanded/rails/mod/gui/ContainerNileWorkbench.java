package com.expanded.rails.mod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ContainerNileWorkbench extends Container
{
public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
//public IInventory craftResult = new InventoryCraftResult();
private World worldObj;
private BlockPos field_178145_h;
public TileEntityNileWorkbench tileEntity;
private SlotNileCrafting slotCraft;
private static final String __OBFID = "CL_00001744";
public ContainerNileWorkbench(TileEntityNileWorkbench tileTable, InventoryPlayer playerInventory, World worldIn, BlockPos p_i45800_3_)
{
this.worldObj = worldIn;
this.field_178145_h = p_i45800_3_;
slotCraft = new SlotNileCrafting(playerInventory.field_70458_d, this.craftMatrix, tileTable.craftResult, 0, 124, 35);
this.func_75146_a(slotCraft);
int i;
int j;
tileEntity = tileTable;
updateCraftingMatrix();
for (i = 0; i < 3; ++i)
{
for (j = 0; j < 3; ++j)
{
this.func_75146_a(new Slot(this.craftMatrix, j + i * 3, 30 + j * 18, 17 + i * 18));
}
}
for (i = 0; i < 3; ++i)
{
for (j = 0; j < 9; ++j)
{
this.func_75146_a(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
}
}
for (i = 0; i < 9; ++i)
{
this.func_75146_a(new Slot(playerInventory, i, 8 + i * 18, 142));
}
this.func_75130_a(this.craftMatrix);
}
private void updateCraftingMatrix() {
for (int i = 0; i < craftMatrix.func_70302_i_(); i++) {
craftMatrix.func_70299_a(i, tileEntity.craftMatrixInventory[i]);
}
}
public void func_75130_a(IInventory inventoryIn)
{
tileEntity.craftResult.func_70299_a(0, CraftingManager.func_77594_a().func_82787_a(this.craftMatrix, this.worldObj));
}
@Override
public void func_75134_a(EntityPlayer par1EntityPlayer)
{
super.func_75134_a(par1EntityPlayer);
saveCraftingMatrix();
}
private void saveCraftingMatrix() {
for (int i = 0; i < craftMatrix.func_70302_i_(); i++) {
tileEntity.craftMatrixInventory[i] = craftMatrix.func_70301_a(i);
}
}
@Override
public boolean func_75145_c(EntityPlayer entityPlayer)
{
return tileEntity.func_70300_a(entityPlayer);
}
public ItemStack func_82846_b(EntityPlayer playerIn, int index)
{
ItemStack itemstack = null;
Slot slot = (Slot)this.field_75151_b.get(index);
if (slot != null && slot.func_75216_d())
{
ItemStack itemstack1 = slot.func_75211_c();
itemstack = itemstack1.func_77946_l();
if (index == 0)
{
if (!this.func_75135_a(itemstack1, 10, 46, true))
{
return null;
}
slot.func_75220_a(itemstack1, itemstack);
}
else if (index >= 10 && index < 37)
{
if (!this.func_75135_a(itemstack1, 37, 46, false))
{
return null;
}
}
else if (index >= 37 && index < 46)
{
if (!this.func_75135_a(itemstack1, 10, 37, false))
{
return null;
}
}
else if (!this.func_75135_a(itemstack1, 10, 46, false))
{
return null;
}
if (itemstack1.field_77994_a == 0)
{
slot.func_75215_d((ItemStack)null);
}
else
{
slot.func_75218_e();
}
if (itemstack1.field_77994_a == itemstack.field_77994_a)
{
return null;
}
slot.func_82870_a(playerIn, itemstack1);
}
return itemstack;
}
public boolean func_94530_a(ItemStack p_94530_1_, Slot p_94530_2_)
{
return p_94530_2_.field_75224_c != tileEntity.craftResult && super.func_94530_a(p_94530_1_, p_94530_2_);
}
}
