package com.expanded.rails.mod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;

public class SlotNileCrafting extends SlotCrafting{
private final IInventory craftMatrix;
private final EntityPlayer thePlayer;
private int amountCrafted;
private static final String __OBFID = "CL_00001761";
public SlotNileCrafting(EntityPlayer player, InventoryCrafting craftingInventory, IInventory p_i45790_3_, int slotIndex, int xPosition, int yPosition)
{
super(player, craftingInventory, p_i45790_3_, slotIndex, xPosition, yPosition);
this.thePlayer = player;
this.craftMatrix = craftingInventory;
}
public boolean func_75214_a(ItemStack stack)
{
return false;
}
public ItemStack func_75209_a(int amount)
{
if (this.func_75216_d())
{
this.amountCrafted += Math.min(amount, func_75211_c().field_77994_a);
}
return super.func_75209_a(amount);
}
protected void func_75210_a(ItemStack stack, int amount)
{
this.amountCrafted += amount;
this.func_75208_c(stack);
}
}
