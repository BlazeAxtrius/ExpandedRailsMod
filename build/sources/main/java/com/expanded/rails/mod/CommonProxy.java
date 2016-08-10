package com.expanded.rails.mod;

import com.expanded.rails.mod.gui.ContainerNileWorkbench;
import com.expanded.rails.mod.gui.GuiNileWorkbench;
import com.expanded.rails.mod.gui.TileEntityNileWorkbench;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler{
public static final int NileTable = 0;
public static final int PetPack = 1;
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
if(ID == NileTable) {
TileEntity target = world.getTileEntity(new BlockPos(x, y, z));
if(!(target instanceof TileEntityNileWorkbench))
return null;
TileEntityNileWorkbench tileNileTable = (TileEntityNileWorkbench)target;
ContainerNileWorkbench tableContainer = new ContainerNileWorkbench(tileNileTable, player.inventory, world, new BlockPos(x, y, z));
return tableContainer;
}
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
if(ID == NileTable) {
TileEntity target = world.getTileEntity(new BlockPos(x, y, z));
if(!(target instanceof TileEntityNileWorkbench))
return null;
TileEntityNileWorkbench tileNileTable = (TileEntityNileWorkbench)target;
GuiNileWorkbench tableGui = new GuiNileWorkbench(player.inventory, tileNileTable, world, new BlockPos(x, y, z));
return tableGui;
}
return null;
}

public void preInit(FMLPreInitializationEvent event) {

    ERMBase.init();
    ERMBase.register();
}

public void init(FMLInitializationEvent event) {
	
}

public void postInit(FMLPostInitializationEvent event) {
}

}
