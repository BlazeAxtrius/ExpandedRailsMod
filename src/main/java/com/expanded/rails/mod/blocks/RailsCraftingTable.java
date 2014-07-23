package com.expanded.rails.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.expanded.rails.mod.ERMBase;
import net.minecraft.util.IIcon;

public class RailsCraftingTable extends Block
{
    private IIcon workbenchIconTop;
    private IIcon workbenchIconFront;
    
    public RailsCraftingTable(int par1)
    {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
    public IIcon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.workbenchIconTop : (par1 == 0 ? Blocks.planks.getBlockTextureFromSide(par1) : (par1 != 2 && par1 != 4 ? this.blockIcon : this.workbenchIconFront));
    }

    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("expandedrails:Rails_Crafting_Table_Side");
        this.workbenchIconTop = par1IconRegister.registerIcon("expandedrails:Rails_Crafting_Table_Top");
        this.workbenchIconFront = par1IconRegister.registerIcon("expandedrails:Rails_Crafting_Table_Front");
    }

    //Possible error on "ExpandedRailsMod.instance"//

    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
    {
        if (!player.isSneaking())
        {
         player.openGui(ERMBase.instance, 0, var1, var2, var3, var4);
            player.openGui(ERMBase.modid, 0, var1, var2, var3, var4);
            return true;
        }
        else
        {
            return false;
        }
    }
}
