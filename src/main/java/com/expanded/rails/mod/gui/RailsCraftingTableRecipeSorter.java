package com.expanded.rails.mod.gui;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class RailsCraftingTableRecipeSorter implements Comparator
{
    final RailsCraftingTableCraftingManager railsCraftingTableCraftingManager; //Possible problem on par1//
    RailsCraftingTableRecipeSorter(RailsCraftingTableCraftingManager par1RailsCraftingTableCraftingManager)
    {
        //possible problem after "=" changed from par1CraftingManager//
        this.railsCraftingTableCraftingManager = par1RailsCraftingTableCraftingManager;
    }

    public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
    {
    	//return par1IRecipe instanceof RailsCraftingTableShapelessRecipes && par2IRecipe instanceof RailsCraftingTableShapedRecipes ? 1 : (par2IRecipe instanceof RailsCraftingTableShapelessRecipes && par1IRecipe instanceof RailsCraftingTableShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
        return par1IRecipe instanceof ShapelessRecipes && par2IRecipe instanceof ShapedRecipes ? 1 : (par2IRecipe instanceof ShapelessRecipes && par1IRecipe instanceof ShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
    }
    public int compare(Object par1Obj, Object par2Obj)
    {
        return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
    }
}