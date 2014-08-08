package com.expanded.rails.mod.gui;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class RailsCraftingTableShapedRecipes implements IRecipe
{
    private int recipeWidth;
    private int recipeHeight;
    private ItemStack recipeItems[];
    private ItemStack recipeOutput;
    public final ItemStack recipeOutputItemID;
    //private boolean field_92101_f;
    private static final String __OBFID = "CL_00000093";

    public RailsCraftingTableShapedRecipes(int i, int j, ItemStack aitemstack[], ItemStack itemstack)
    {
        recipeOutputItemID = itemstack;
        recipeWidth = i;
        recipeHeight = j;
        recipeItems = aitemstack;
        recipeOutput = itemstack;
    }

    public ItemStack getRecipeOutput()
    {
        return recipeOutput;
    }

    @Override
    public boolean matches(InventoryCrafting inventorycrafting, World world)
    {
        for (int i = 0; i <= 4 - recipeWidth; i++)
        {
            for (int j = 0; j <= 5 - recipeHeight; j++)
            {
                if (this.func_21137_a(inventorycrafting, i, j, true))
                {
                    return true;
                }

                if (this.func_21137_a(inventorycrafting, i, j, false))
                {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean func_21137_a(InventoryCrafting inventorycrafting, int i, int j, boolean flag)
    {
        for (int k = 0; k < 4; k++)
        {
            //from 4 to 5//
            for (int l = 0; l < 5; l++)
            {
                int i1 = k - i;
                int j1 = l - j;
                ItemStack itemstack = null;

                if (i1 >= 0 && j1 >= 0 && i1 < recipeWidth && j1 < recipeHeight)
                {
                    if (flag)
                    {
                        itemstack = recipeItems[(recipeWidth - i1 - 1) + j1 * recipeWidth];
                    }
                    else
                    {
                        itemstack = recipeItems[i1 + j1 * recipeWidth];
                    }
                }

                ItemStack itemstack1 = inventorycrafting.getStackInRowAndColumn(k, l);

                if (itemstack1 != null || itemstack != null)
                {
                    if (itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                    {
                        return false;
                    }

                    if (itemstack.getItem() != itemstack1.getItem())
                    {
                        return false;
                    }

                    if (itemstack.getItemDamage() != 32767 && itemstack.getItemDamage() != itemstack1.getItemDamage())
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    //public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting)
    //{
        //ItemStack itemstack = this.getRecipeOutput().copy();

        //if (this.field_92101_f)
        //{
            //for (int i = 0; i < par1InventoryCrafting.getSizeInventory(); ++i)
            //{
                //ItemStack itemstack1 = par1InventoryCrafting.getStackInSlot(i);

                //if (itemstack1 != null && itemstack1.hasTagCompound())
                //{
                    //itemstack.setTagCompound((NBTTagCompound)itemstack1.stackTagCompound.copy());
                //}
            //}
        //}

        //return itemstack;
    //}

    /**
* Returns the size of the recipe area
*/
    //public int getRecipeSize()
    //{
        //return this.recipeWidth * this.recipeHeight;
    //}

    //public RailsCraftingTableShapedRecipes func_92100_c()
    //{
        //this.field_92101_f = true;
        //return this;
    //}
    
    public ItemStack getCraftingResult(InventoryCrafting inventorycrafting)
    {
        return new ItemStack(recipeOutput.getItem(), recipeOutput.stackSize, recipeOutput.getItemDamage());
    }

    public int getRecipeSize()
    {
        return recipeWidth * recipeHeight;
    }
}