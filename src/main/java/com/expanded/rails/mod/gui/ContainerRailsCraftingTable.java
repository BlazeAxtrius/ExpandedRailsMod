package com.expanded.rails.mod.gui;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import com.expanded.rails.mod.gui.TileEntityRailsCraftingTable;

import com.expanded.rails.mod.ERMBase;

public class ContainerRailsCraftingTable extends Container
{
    /** The crafting matrix inventory (3x3). */

    public InventoryCrafting craftMatrix = new InventoryCrafting(this, this.width + 1, this.height);
    public IInventory craftResult = new InventoryCraftResult();

    public final int 	width = 3,
                        height = 4,
                        width_ = 4,
                        height_ = 1;

    private World worldObj;
    private int posX;
    private int posY;
    private int posZ;
    public TileEntityRailsCraftingTable RailsCraftingTable;
    private SlotRailsCraftingTable slotCraft;
    private BlockPos field_178145_h;
    
    public ContainerRailsCraftingTable(TileEntityRailsCraftingTable  RailsCraftingTable, InventoryPlayer par1InventoryPlayer, World par2World, BlockPos pos1)
    {
        this.worldObj = par2World;
        this.addSlotToContainer(new SlotRailsCraftingTable(par1InventoryPlayer.player, this.craftMatrix, this.craftResult, 0, 120, 25));
        int l;
        int i1;
        int l_;
        int i1_;

        for (l = 0; l < this.height; ++l)
        {
            for (i1 = 0; i1 < this.width; ++i1)
            {
                //change on "l + i1 * 4" from "i1 + l * 3"
                this.addSlotToContainer(new Slot(this.craftMatrix, i1 + l * this.width, 26 + i1 * 18, 7 + l * 18));
            }
        }

        for (l = 0; l < this.height_; ++l)
        {
            for (i1 = 0; i1 < this.width_; ++i1)
            {
                //change on "l + i1 * 4" from "i1 + l * 3"
                this.addSlotToContainer(new Slot(this.craftMatrix, i1 + l * this.width_ + 12, 98 + i1 * 18, 61 + l * 18));
            }
        }

        /**		for (l_ = 0; l_ < 1; ++l_)
        		{
        			for (i1_ = 0; i1_ < 4; ++i1_)
        			{
        				this.addSlotToContainer(new Slot(this.craftMatrix_, i1_ + l_ * 3, 98 + i1_ * 18, 61 + l_ * 18));
        				}
        			}*/
        for (l = 0; l < 3; ++l)
        {
            for (i1 = 0; i1 < 9; ++i1)
            {
                this.addSlotToContainer(new Slot(par1InventoryPlayer, i1 + l * 9 + 9, 8 + i1 * 18, 94 + l * 18));
            }
        }

        for (l = 0; l < 9; ++l)
        {
            this.addSlotToContainer(new Slot(par1InventoryPlayer, l, 8 + l * 18, 152));
        }

        this.onCraftMatrixChanged(this.craftMatrix);
        /**this.onCraftMatrixChanged(this.craftMatrix_);*/
    }

	/*** Callback for when the crafting matrix is changed.*/ //Changes: if + return, RCTCraftingManager <- CraftingManager
    public void onCraftMatrixChanged(IInventory par1IInventory)
    {
        this.craftResult.setInventorySlotContents(0, RailsCraftingTableCraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj));

        //if (this.craftResult.getStackInSlot(0) != null)
        //{
            //return;
        //}
    }

    /*** Called when the container is closed.*/
    public void onContainerClosed(EntityPlayer par1EntityPlayer)
    {
        super.onContainerClosed(par1EntityPlayer);

        if (!this.worldObj.isRemote)
        {
            //change on "i < 20", "i < 16", "i < this.craftMatrix.getSizeInventory()", "i < 12" from "i < 9"
            for (int i = 0; i < 16; ++i)
            {
                ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);

                if (itemstack != null)
                {
                	par1EntityPlayer.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }
 
    private void saveCraftingMatrix() {
    for (int i = 0; i < craftMatrix.getSizeInventory(); i++) {
    	 RailsCraftingTable.craftMatrixInventory[i] = craftMatrix.getStackInSlot(i);
    }
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
    	return  RailsCraftingTable.isUseableByPlayer(par1EntityPlayer);
        //return this.worldObj.getBlockState(this.field_178145_h).getBlock() != ERMBase.railsCraftingTable ? false : par1EntityPlayer.getDistanceSq((double)this.field_178145_h.getX() + 0.5D, (double)this.field_178145_h.getY() + 0.5D, (double)this.field_178145_h.getZ() + 0.5D) <= 64.0D;
    }

    /*** Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.*/
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 0)
            {
                // from 10 -> 13 -> 17 -> 21//
                if (!this.mergeItemStack(itemstack1, 17, 53, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 >= 17 && par2 < 44)
            {
                if (!this.mergeItemStack(itemstack1, 44, 53, false))
                {
                    return null;
                }
            }
            else if (par2 >= 44 && par2 < 53)
            {
                if (!this.mergeItemStack(itemstack1, 17, 44, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 17, 53, false))
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

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }

    public boolean canMergeSlot(ItemStack par1ItemStack, Slot par2Slot)
    {
        return par2Slot.inventory != this.craftResult && super.canMergeSlot(par1ItemStack, par2Slot);
    }

}