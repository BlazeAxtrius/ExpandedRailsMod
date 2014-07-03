package com.expanded.rails.mod.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntity;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import com.expanded.rails.mod.CommonProxy;
//import expanded.rails.mod.entity.RailBrakeModel;
//import expanded.rails.mod.entity.TileEntityRailBrakeEntity;
//import expanded.rails.mod.entity.TileEntityRailBrakeRenderer;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers()
    {
        //      ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRailBrakeEntity.class, new TileEntityRailBrakeRenderer());
        //  	RenderingRegistry.registerEntityRenderingHandler(TileEntityRailBrakeEntity.class, new TileEntityRailBrakeRenderer(new RailBrakeModel()));
    }

    //public void registerRenderInformation() {
        //RenderingRegistry.registerEntityRenderingHandler(TileEntityRailBrakeEntity.class, new TileEntityRailBrakeRenderer());
    //}

    /*public void registerRenderThings() {
    }*/

}