package com.expanded.rails.mod.gui;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RailsCraftingTableShapedRecipes implements IRecipe
{
    private int recipeWidth;
    private int recipeHeight;
    private ItemStack recipeItems[];
    private ItemStack recipeOutput;
    public final ItemStack recipeOutputItemID;

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
                if (func_21137_a(inventorycrafting, i, j, true))
                {
                    return true;
                }

                if (func_21137_a(inventorycrafting, i, j, false))
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

                if (itemstack1 == null && itemstack == null)
                {
                    continue;
                }

                if (itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                {
                    return false;
                }

                if (itemstack != itemstack1)
                {
                    return false;
                }

                if (itemstack.getItemDamage() != -1 && itemstack.getItemDamage() != itemstack1.getItemDamage())
                {
                    return false;
                }
            }
        }

        return true;
    }

    public ItemStack getCraftingResult(InventoryCrafting inventorycrafting)
    {
        return new ItemStack(recipeOutput.getItem(), recipeOutput.stackSize, recipeOutput.getItemDamage());
    }

    public int getRecipeSize()
    {
        return recipeWidth * recipeHeight;
    }
}
