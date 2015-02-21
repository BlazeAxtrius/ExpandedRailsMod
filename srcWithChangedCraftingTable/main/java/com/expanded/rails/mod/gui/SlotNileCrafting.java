package com.expanded.rails.mod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;

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
public boolean isItemValid(ItemStack stack)
{
return false;
}
public ItemStack decrStackSize(int amount)
{
if (this.getHasStack())
{
this.amountCrafted += Math.min(amount, this.getStack().stackSize);
}
return super.decrStackSize(amount);
}
protected void onCrafting(ItemStack stack, int amount)
{
this.amountCrafted += amount;
this.onCrafting(stack);
}
}