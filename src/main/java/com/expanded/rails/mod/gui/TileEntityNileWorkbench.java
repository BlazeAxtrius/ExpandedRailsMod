package com.expanded.rails.mod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

import javax.annotation.Nullable;

public class TileEntityNileWorkbench extends TileEntity implements IInventory
{
private ItemStack[] inventory;
public IInventory craftResult = new InventoryCraftResult();
public ItemStack[] craftMatrixInventory;
public TileEntityNileWorkbench() {
super();
inventory = new ItemStack[32];
craftMatrixInventory = new ItemStack[9]; //TODO: magic number
}
@Override
public int getSizeInventory() {
return inventory.length;
}
@Override
public ItemStack getStackInSlot(int i) {
return this.inventory[i];
}
@Override
public String getName() {
return "Nile Table";
}
@Override
public boolean hasCustomName() {
return false;
}
@Override
public int getInventoryStackLimit() {
return 64;
}
@Override
public ItemStack decrStackSize(int slot, int amount) {
ItemStack itemStack = getStackInSlot(slot);
if (itemStack != null) {
if (itemStack.stackSize <= amount) {
setInventorySlotContents(slot, null);
}
else {
itemStack = itemStack.splitStack(amount);
if (itemStack.stackSize == 0) {
setInventorySlotContents(slot, null);
}
}
}
return itemStack;
}

    @Nullable
    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }


@Override
public void setInventorySlotContents(int i, ItemStack itemstack) {
inventory[i] = itemstack;
if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
itemstack.stackSize = getInventoryStackLimit();
}
markDirty();
}
@Override
public boolean isUseableByPlayer(EntityPlayer entityplayer) {
return entityplayer.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5) <= 64;
}
@Override
public void openInventory(EntityPlayer playerIn) {}
@Override
public void closeInventory(EntityPlayer playerIn) {}
@Override
public boolean isItemValidForSlot(int i, ItemStack itemstack) {
return true;
}
@Override
public void readFromNBT(NBTTagCompound nbtTagCompound) {
super.readFromNBT(nbtTagCompound);
// Read in the ItemStacks in the inventory from NBT
NBTTagList tagList = nbtTagCompound.getTagList("Items", 10);
inventory = new ItemStack[this.getSizeInventory()];
for (int i = 0; i < tagList.tagCount(); ++i) {
NBTTagCompound tagCompound = (NBTTagCompound) tagList.getCompoundTagAt(i);
byte slot = tagCompound.getByte("Slot");
if (slot >= 0 && slot < inventory.length) {
inventory[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
}
}
// Read in the Crafting Matrix from NBT
NBTTagList craftingTag = nbtTagCompound.getTagList("CraftingMatrix", 10);
craftMatrixInventory = new ItemStack[9]; //TODO: magic number
for (int i = 0; i < craftingTag.tagCount(); ++i) {
NBTTagCompound tagCompound = (NBTTagCompound) craftingTag.getCompoundTagAt(i);
byte slot = tagCompound.getByte("Slot");
if (slot >= 0 && slot < craftMatrixInventory.length) {
craftMatrixInventory[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
}
}
// Read craftingResult from NBT
NBTTagCompound tagCraftResult = nbtTagCompound.getCompoundTag("CraftingResult");
craftResult.setInventorySlotContents(0, ItemStack.loadItemStackFromNBT(tagCraftResult));
}
@Override
public NBTTagCompound writeToNBT(NBTTagCompound nbtTagCompound) {
super.writeToNBT(nbtTagCompound);
// Write the ItemStacks in the inventory to NBT
NBTTagList tagList = new NBTTagList();
for (int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {
if (inventory[currentIndex] != null) {
NBTTagCompound tagCompound = new NBTTagCompound();
tagCompound.setByte("Slot", (byte) currentIndex);
inventory[currentIndex].writeToNBT(tagCompound);
tagList.appendTag(tagCompound);
}
}
nbtTagCompound.setTag("Items", tagList);
// Write Crafting Matrix to NBT
NBTTagList craftingTag = new NBTTagList();
for (int currentIndex = 0; currentIndex < craftMatrixInventory.length; ++currentIndex) {
if (craftMatrixInventory[currentIndex] != null) {
NBTTagCompound tagCompound = new NBTTagCompound();
tagCompound.setByte("Slot", (byte) currentIndex);
craftMatrixInventory[currentIndex].writeToNBT(tagCompound);
craftingTag.appendTag(tagCompound);
}
}
nbtTagCompound.setTag("CraftingMatrix", craftingTag);
// Write craftingResult to NBT
if (craftResult.getStackInSlot(0) != null)
nbtTagCompound.setTag("CraftingResult", craftResult.getStackInSlot(0).writeToNBT(new NBTTagCompound()));
    return nbtTagCompound;
}
public int getField(int id)
{
return 0;
}
public void setField(int id, int value) {}
public int getFieldCount()
{
return 0;
}
public void clear()
{
for (int i = 0; i < this.inventory.length; ++i)
{
this.inventory[i] = null;
}
}
}
