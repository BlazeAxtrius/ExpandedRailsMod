package com.expanded.rails.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExpandedItem extends Item
{
    public ExpandedItem(int par1)
    {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.MISC);
        setUnlocalizedName("expandedItem");
    }
    
}
