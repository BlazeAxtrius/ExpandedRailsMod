package com.expanded.rails.mod;

import com.expanded.rails.mod.gui.ContainerRailsCraftingTable;
import com.expanded.rails.mod.gui.GuiRailsCraftingTable;
import com.expanded.rails.mod.gui.TileEntityRailsCraftingTable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler{

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void init(FMLInitializationEvent event) {
    	
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public static final int RailsCraftingTable = 0;
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    if(ID == RailsCraftingTable) {
    TileEntity target = world.getTileEntity(new BlockPos(x, y, z));
    if(!(target instanceof TileEntityRailsCraftingTable))
    return null;
    TileEntityRailsCraftingTable tileNileTable = (TileEntityRailsCraftingTable)target;
    ContainerRailsCraftingTable tableContainer = new ContainerRailsCraftingTable(tileNileTable, player.inventory, world, new BlockPos(x, y, z));
    return tableContainer;
    }
    return null;
    }
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    if(ID == RailsCraftingTable) {
    TileEntity target = world.getTileEntity(new BlockPos(x, y, z));
    if(!(target instanceof TileEntityRailsCraftingTable))
    return null;
    TileEntityRailsCraftingTable tileNileTable = (TileEntityRailsCraftingTable)target;
    GuiRailsCraftingTable tableGui = new GuiRailsCraftingTable(tileNileTable, player.inventory, world, new BlockPos(x, y, z));
    return tableGui;
    }
    return null;
    }
}