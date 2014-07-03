package com.expanded.rails.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IIconRegister;

public class ExpandedItem extends Item
{
    public ExpandedItem(int par1)
    {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("expandedItem");
    }
}
