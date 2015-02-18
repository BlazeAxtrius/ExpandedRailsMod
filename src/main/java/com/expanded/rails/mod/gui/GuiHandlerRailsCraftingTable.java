package com.expanded.rails.mod.gui;

import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.expanded.rails.mod.ERMBase;

public class GuiHandlerRailsCraftingTable implements IGuiHandler
{
    //public GuiHandlerRailsCraftingTable()
    //{
        // TODO Auto-generated constructor stub
    //}
	
	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
    { 
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

            if(!(tileEntity instanceof TileEntityRailsCraftingTable))

            {
                    switch(ID)
                    {
                    case 0: return ID == 0 && world.getBlockState(new BlockPos(x, y, z)) == ERMBase.railsCraftingTable ? new ContainerRailsCraftingTable(player.inventory, world, x, y, z) : false;
                    }
            }
            if (ID == 3)
            {
                    return new ContainerRailsCraftingTable(player.inventory, world, x, y, z);
            }

            return null;
            
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
            TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

            if(!(tileEntity instanceof TileEntityRailsCraftingTable))
            {
                    switch(ID)
                    {
                    case 0: return ID == 0 && world.getBlockState(new BlockPos(x, y, z)) == ERMBase.railsCraftingTable ? new GuiRailsCraftingTable(player.inventory, world, x, y, z) : false;
                    }
            }
            if (ID == 3)
            {
                    return new GuiRailsCraftingTable(player.inventory, world, x, y, z);
            }

            return null;
    }
}
