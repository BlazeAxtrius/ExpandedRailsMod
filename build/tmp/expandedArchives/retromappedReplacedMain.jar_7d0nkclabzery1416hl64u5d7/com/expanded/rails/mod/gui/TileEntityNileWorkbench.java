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
public int func_70302_i_() {
return inventory.length;
}
@Override
public ItemStack func_70301_a(int i) {
return this.inventory[i];
}
@Override
public String func_70005_c_() {
return "Nile Table";
}
@Override
public boolean func_145818_k_() {
return false;
}
@Override
public int func_70297_j_() {
return 64;
}
@Override
public ItemStack func_70298_a(int slot, int amount) {
ItemStack itemStack = func_70301_a(slot);
if (itemStack != null) {
if (itemStack.field_77994_a <= amount) {
func_70299_a(slot, null);
}
else {
itemStack = itemStack.func_77979_a(amount);
if (itemStack.field_77994_a == 0) {
func_70299_a(slot, null);
}
}
}
return itemStack;
}

    @Nullable
    @Override
    public ItemStack func_70304_b(int index) {
        return null;
    }


@Override
public void func_70299_a(int i, ItemStack itemstack) {
inventory[i] = itemstack;
if (itemstack != null && itemstack.field_77994_a > func_70297_j_()) {
itemstack.field_77994_a = func_70297_j_();
}
func_70296_d();
}
@Override
public boolean func_70300_a(EntityPlayer entityplayer) {
return entityplayer.func_70092_e(this.field_174879_c.func_177958_n() + 0.5, this.field_174879_c.func_177956_o() + 0.5, this.field_174879_c.func_177952_p() + 0.5) <= 64;
}
@Override
public void func_174889_b(EntityPlayer playerIn) {}
@Override
public void func_174886_c(EntityPlayer playerIn) {}
@Override
public boolean func_94041_b(int i, ItemStack itemstack) {
return true;
}
@Override
public void func_145839_a(NBTTagCompound nbtTagCompound) {
super.func_145839_a(nbtTagCompound);
// Read in the ItemStacks in the inventory from NBT
NBTTagList tagList = nbtTagCompound.func_150295_c("Items", 10);
inventory = new ItemStack[this.func_70302_i_()];
for (int i = 0; i < tagList.func_74745_c(); ++i) {
NBTTagCompound tagCompound = (NBTTagCompound) tagList.func_150305_b(i);
byte slot = tagCompound.func_74771_c("Slot");
if (slot >= 0 && slot < inventory.length) {
inventory[slot] = ItemStack.func_77949_a(tagCompound);
}
}
// Read in the Crafting Matrix from NBT
NBTTagList craftingTag = nbtTagCompound.func_150295_c("CraftingMatrix", 10);
craftMatrixInventory = new ItemStack[9]; //TODO: magic number
for (int i = 0; i < craftingTag.func_74745_c(); ++i) {
NBTTagCompound tagCompound = (NBTTagCompound) craftingTag.func_150305_b(i);
byte slot = tagCompound.func_74771_c("Slot");
if (slot >= 0 && slot < craftMatrixInventory.length) {
craftMatrixInventory[slot] = ItemStack.func_77949_a(tagCompound);
}
}
// Read craftingResult from NBT
NBTTagCompound tagCraftResult = nbtTagCompound.func_74775_l("CraftingResult");
craftResult.func_70299_a(0, ItemStack.func_77949_a(tagCraftResult));
}
@Override
public NBTTagCompound func_189515_b(NBTTagCompound nbtTagCompound) {
super.func_189515_b(nbtTagCompound);
// Write the ItemStacks in the inventory to NBT
NBTTagList tagList = new NBTTagList();
for (int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {
if (inventory[currentIndex] != null) {
NBTTagCompound tagCompound = new NBTTagCompound();
tagCompound.func_74774_a("Slot", (byte) currentIndex);
inventory[currentIndex].func_77955_b(tagCompound);
tagList.func_74742_a(tagCompound);
}
}
nbtTagCompound.func_74782_a("Items", tagList);
// Write Crafting Matrix to NBT
NBTTagList craftingTag = new NBTTagList();
for (int currentIndex = 0; currentIndex < craftMatrixInventory.length; ++currentIndex) {
if (craftMatrixInventory[currentIndex] != null) {
NBTTagCompound tagCompound = new NBTTagCompound();
tagCompound.func_74774_a("Slot", (byte) currentIndex);
craftMatrixInventory[currentIndex].func_77955_b(tagCompound);
craftingTag.func_74742_a(tagCompound);
}
}
nbtTagCompound.func_74782_a("CraftingMatrix", craftingTag);
// Write craftingResult to NBT
if (craftResult.func_70301_a(0) != null)
nbtTagCompound.func_74782_a("CraftingResult", craftResult.func_70301_a(0).func_77955_b(new NBTTagCompound()));
    return nbtTagCompound;
}
public int func_174887_a_(int id)
{
return 0;
}
public void func_174885_b(int id, int value) {}
public int func_174890_g()
{
return 0;
}
public void func_174888_l()
{
for (int i = 0; i < this.inventory.length; ++i)
{
this.inventory[i] = null;
}
}
}
