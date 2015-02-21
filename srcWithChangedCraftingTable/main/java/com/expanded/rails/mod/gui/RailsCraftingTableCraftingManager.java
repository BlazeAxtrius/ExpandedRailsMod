package com.expanded.rails.mod.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;
import com.expanded.rails.mod.Stacks;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class RailsCraftingTableCraftingManager
{
    private static final RailsCraftingTableCraftingManager instance = new RailsCraftingTableCraftingManager();
    private List recipes = Lists.newArrayList();
    private static final String __OBFID = "CL_00000090";

    public static RailsCraftingTableCraftingManager getInstance()
    {
        return instance;
    }

    private RailsCraftingTableCraftingManager()
    {
    	recipes = new ArrayList();
        //Your recipes go here
        Collections.sort(this.recipes, new RailsCraftingTableRecipeSorter(this));
        this.addRecipe(new ItemStack(ERMBase.obsidianRail, 16), new Object[] {"XYXX", "YXXY", "XXYX", "ZZZZ", 'X', Stacks.railIronBaseStack, 'Y', Stacks.obsidianBarStack, 'Z', Stacks.ironNailStack});
        addRecipe(new ItemStack(ERMBase.diamondRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.diamondBarStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.diamondNetherRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railNetherrackBaseStack, 'y', Stacks.diamondBarStack, 'z', Stacks.netherrackNailStack);
        addRecipe(new ItemStack(ERMBase.diamondObsidianRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railObsidianBaseStack, 'y', Stacks.diamondBarStack, 'z', Stacks.obsidianNailStack);
        addRecipe(new ItemStack(ERMBase.lapisRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.lapisStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.iceRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.iceStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.glowstoneRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.glowstoneDustStack, 'y', Stacks.obsidianBarStack, 'z', Stacks.goldNailStack);
        addRecipe(new ItemStack(ERMBase.brickRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.brickStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.netherStarRail, 64), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.netherStarStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.emeraldRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.emeraldBarStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.enderPearlRail, 32), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.enderPearlStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.chainRail, 16), "xyxx", "cxxy", "xxcx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.obsidianBarStack, 'c', Stacks.ironIngotStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.armedRail, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.railIronBaseStack, 'y', Stacks.explosiveBarStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.monorailDiamond, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railDiamondBaseStack, 'z', Stacks.diamondNailStack);
        addRecipe(new ItemStack(ERMBase.monorailGlowing, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.glowstoneDustStack, 'z', Stacks.goldNailStack);
        addRecipe(new ItemStack(ERMBase.monorailGrayOrange, 16), " x  ", "y  x", "  y ", "zzzz", 'x', Stacks.grayclothStack, 'y', Stacks.orangeclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailNether, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railNetherrackBaseStack, 'z', Stacks.netherrackNailStack);
        addRecipe(new ItemStack(ERMBase.monorailObsidian, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railObsidianBaseStack, 'z', Stacks.obsidianNailStack);
        addRecipe(new ItemStack(ERMBase.monorailRedGreen, 16), " x  ", "y  x", "  y ", "zzzz", 'x', Stacks.redclothStack, 'y', Stacks.greenclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailYellowBlue, 16), " x  ", "y  x", "  y ", "zzzz", 'x', Stacks.yellowclothStack, 'y', Stacks.blueclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailEmerald, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railEmeraldBaseStack, 'z', Stacks.emeraldNailStack);
        addRecipe(new ItemStack(ERMBase.monorailLapis, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railLapisBaseStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.monorailGold, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railGoldBaseStack, 'z', Stacks.goldNailStack);
        addRecipe(new ItemStack(ERMBase.monorailPowered, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'x', Stacks.redstoneStack, 'y', Stacks.railGoldBaseStack, 'z', Stacks.goldNailStack);
        addRecipe(new ItemStack(ERMBase.monorailArmed, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railArmedBaseStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.monorailChain, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railChainBaseStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.monorailIce, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railIceBaseStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.monorailEnderPearl, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.railEnderPearlBaseStack, 'z', Stacks.ironNailStack);
        addRecipe(new ItemStack(ERMBase.monorailBlack, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.blackclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailBlue, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.blueclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailBrown, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.brownclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailCyan, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.cyanclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailGray, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.grayclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailGreen, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.greenclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailLightblue, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.lightblueclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailLightgray, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.lightgrayclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailLime, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.limeclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailMagenta, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.magentaclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailOrange, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.orangeclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailPink, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.pinkclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailPurple, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.purpleclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailRed, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.redclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailWhite, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.whiteclothStack, 'z', Stacks.woolenNailStack);
        addRecipe(new ItemStack(ERMBase.monorailYellow, 16), " y  ", "y  y", "  y ", "zzzz", 'y', Stacks.yellowclothStack, 'z', Stacks.woolenNailStack);
        //Triplerails
        addRecipe(new ItemStack(ERMBase.triplerailDiamond, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railDiamondBaseStack, 'z', Stacks.diamondNailStack, 'x', Stacks.monorailDiamondStack);
        addRecipe(new ItemStack(ERMBase.triplerailGlowing, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.glowstoneDustStack, 'z', Stacks.goldNailStack, 'x', Stacks.monorailGlowingStack);
        addRecipe(new ItemStack(ERMBase.triplerailNether, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railNetherrackBaseStack, 'z', Stacks.netherrackNailStack, 'x', Stacks.monorailNetherStack);
        addRecipe(new ItemStack(ERMBase.triplerailObsidian, 16), "xyxx ", "yxxy", "xxyx", "zzzz", 'y', Stacks.railObsidianBaseStack, 'z', Stacks.obsidianNailStack, 'x', Stacks.monorailObsidianStack);
        addRecipe(new ItemStack(ERMBase.triplerailEmerald, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railEmeraldBaseStack, 'z', Stacks.emeraldNailStack, 'x', Stacks.monorailEmeraldStack);
        addRecipe(new ItemStack(ERMBase.triplerailLapis, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railLapisBaseStack, 'z', Stacks.ironNailStack, 'x', Stacks.monorailLapisStack);
        addRecipe(new ItemStack(ERMBase.triplerailPowered, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railGoldBaseStack, 'z', Stacks.goldNailStack, 'x', Stacks.monorailPoweredStack);
        addRecipe(new ItemStack(ERMBase.triplerailArmed, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railArmedBaseStack, 'z', Stacks.ironNailStack, 'x', Stacks.monorailArmedStack);
        addRecipe(new ItemStack(ERMBase.triplerailChain, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railChainBaseStack, 'z', Stacks.ironNailStack, 'x', Stacks.monorailChainStack);
        addRecipe(new ItemStack(ERMBase.triplerailIce, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railIceBaseStack, 'z', Stacks.ironNailStack, 'x', Stacks.monorailIceStack);
        addRecipe(new ItemStack(ERMBase.triplerailEnderPearl, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.railEnderPearlBaseStack, 'z', Stacks.ironNailStack, 'x', Stacks.monorailEnderPearlStack);
        addRecipe(new ItemStack(ERMBase.triplerailBlack, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.blackclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailBlackStack);
        addRecipe(new ItemStack(ERMBase.triplerailBlue, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.blueclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailBlueStack);
        addRecipe(new ItemStack(ERMBase.triplerailBrown, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.brownclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailBrownStack);
        addRecipe(new ItemStack(ERMBase.triplerailCyan, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.cyanclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailCyanStack);
        addRecipe(new ItemStack(ERMBase.triplerailGray, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.grayclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailGrayStack);
        addRecipe(new ItemStack(ERMBase.triplerailGreen, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.greenclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailGreenStack);
        addRecipe(new ItemStack(ERMBase.triplerailLightblue, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.lightblueclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailLightblueStack);
        addRecipe(new ItemStack(ERMBase.triplerailLightgray, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.lightgrayclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailLightgrayStack);
        addRecipe(new ItemStack(ERMBase.triplerailLime, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.limeclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailLimeStack);
        addRecipe(new ItemStack(ERMBase.triplerailMagenta, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.magentaclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailMagentaStack);
        addRecipe(new ItemStack(ERMBase.triplerailOrange, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.orangeclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailOrangeStack);
        addRecipe(new ItemStack(ERMBase.triplerailPink, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.pinkclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailPinkStack);
        addRecipe(new ItemStack(ERMBase.triplerailPurple, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.purpleclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailPurpleStack);
        addRecipe(new ItemStack(ERMBase.triplerailRed, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.redclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailRedStack);
        addRecipe(new ItemStack(ERMBase.triplerailWhite, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.whiteclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailWhiteStack);
        addRecipe(new ItemStack(ERMBase.triplerailYellow, 16), "xyxx", "yxxy", "xxyx", "zzzz", 'y', Stacks.yellowclothStack, 'z', Stacks.woolenNailStack, 'x', Stacks.monorailYellowStack);
        Collections.sort(this.recipes, new RailsCraftingTableRecipeSorter(this));
    }

    public RailsCraftingTableShapedRecipes addRecipe(ItemStack stack, Object ... recipeComponents)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (recipeComponents[i] instanceof String[])
        {
            String[] astring = (String[])((String[])recipeComponents[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (recipeComponents[i] instanceof String)
            {
                String s2 = (String)recipeComponents[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = Maps.newHashMap(); i < recipeComponents.length; i += 2)
        {
            Character character = (Character)recipeComponents[i];
            ItemStack itemstack1 = null;

            if (recipeComponents[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)recipeComponents[i + 1]);
            }
            else if (recipeComponents[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)recipeComponents[i + 1], 1, 32767);
            }
            else if (recipeComponents[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)recipeComponents[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        RailsCraftingTableShapedRecipes shapedrecipes = new RailsCraftingTableShapedRecipes(j, k, aitemstack, stack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack stack, Object ... recipeComponents)
    {
        ArrayList arraylist = Lists.newArrayList();
        Object[] aobject = recipeComponents;
        int i = recipeComponents.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + object1.getClass().getName() + "!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(stack, arraylist));
    }

    public void addRecipe(IRecipe recipe)
    {
        this.recipes.add(recipe);
    }

    public ItemStack findMatchingRecipe(InventoryCrafting p_82787_1_, World worldIn)
    {
        Iterator iterator = this.recipes.iterator();
        IRecipe irecipe;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            irecipe = (IRecipe)iterator.next();
        }
        while (!irecipe.matches(p_82787_1_, worldIn));

        return irecipe.getCraftingResult(p_82787_1_);
    }

    public ItemStack[] func_180303_b(InventoryCrafting p_180303_1_, World worldIn)
    {
        Iterator iterator = this.recipes.iterator();

        while (iterator.hasNext())
        {
            IRecipe irecipe = (IRecipe)iterator.next();

            if (irecipe.matches(p_180303_1_, worldIn))
            {
                return irecipe.getRemainingItems(p_180303_1_);
            }
        }

        ItemStack[] aitemstack = new ItemStack[p_180303_1_.getSizeInventory()];

        for (int i = 0; i < aitemstack.length; ++i)
        {
            aitemstack[i] = p_180303_1_.getStackInSlot(i);
        }

        return aitemstack;
    }

    public List getRecipeList()
    {
        return this.recipes;
    }
}