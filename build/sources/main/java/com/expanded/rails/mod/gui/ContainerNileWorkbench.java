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
slotCraft = new SlotNileCrafting(playerInventory.player, this.craftMatrix, tileTable.craftResult, 0, 124, 35);
this.addSlotToContainer(slotCraft);
int i;
int j;
tileEntity = tileTable;
updateCraftingMatrix();
for (i = 0; i < 3; ++i)
{
for (j = 0; j < 3; ++j)
{
this.addSlotToContainer(new Slot(this.craftMatrix, j + i * 3, 30 + j * 18, 17 + i * 18));
}
}
for (i = 0; i < 3; ++i)
{
for (j = 0; j < 9; ++j)
{
this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
}
}
for (i = 0; i < 9; ++i)
{
this.addSlotToContainer(new Slot(playerInventory, i, 8 + i * 18, 142));
}
this.onCraftMatrixChanged(this.craftMatrix);
}
private void updateCraftingMatrix() {
for (int i = 0; i < craftMatrix.getSizeInventory(); i++) {
craftMatrix.setInventorySlotContents(i, tileEntity.craftMatrixInventory[i]);
}
}
public void onCraftMatrixChanged(IInventory inventoryIn)
{
tileEntity.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj));
}
@Override
public void onContainerClosed(EntityPlayer par1EntityPlayer)
{
super.onContainerClosed(par1EntityPlayer);
saveCraftingMatrix();
}
private void saveCraftingMatrix() {
for (int i = 0; i < craftMatrix.getSizeInventory(); i++) {
tileEntity.craftMatrixInventory[i] = craftMatrix.getStackInSlot(i);
}
}
@Override
public boolean canInteractWith(EntityPlayer entityPlayer)
{
return tileEntity.isUseableByPlayer(entityPlayer);
}
public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
{
ItemStack itemstack = null;
Slot slot = (Slot)this.inventorySlots.get(index);
if (slot != null && slot.getHasStack())
{
ItemStack itemstack1 = slot.getStack();
itemstack = itemstack1.copy();
if (index == 0)
{
if (!this.mergeItemStack(itemstack1, 10, 46, true))
{
return null;
}
slot.onSlotChange(itemstack1, itemstack);
}
else if (index >= 10 && index < 37)
{
if (!this.mergeItemStack(itemstack1, 37, 46, false))
{
return null;
}
}
else if (index >= 37 && index < 46)
{
if (!this.mergeItemStack(itemstack1, 10, 37, false))
{
return null;
}
}
else if (!this.mergeItemStack(itemstack1, 10, 46, false))
{
return null;
}
if (itemstack1.stackSize == 0)
{
slot.putStack((ItemStack)null);
}
else
{
slot.onSlotChanged();
}
if (itemstack1.stackSize == itemstack.stackSize)
{
return null;
}
slot.onPickupFromSlot(playerIn, itemstack1);
}
return itemstack;
}
public boolean canMergeSlot(ItemStack p_94530_1_, Slot p_94530_2_)
{
return p_94530_2_.inventory != tileEntity.craftResult && super.canMergeSlot(p_94530_1_, p_94530_2_);
}
}