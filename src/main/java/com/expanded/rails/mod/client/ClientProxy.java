package com.expanded.rails.mod.client;

import com.expanded.rails.mod.CommonProxy;
import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//import expanded.rails.mod.entity.RailBrakeModel;
//import expanded.rails.mod.entity.TileEntityRailBrakeEntity;
//import expanded.rails.mod.entity.TileEntityRailBrakeRenderer;

public class ClientProxy extends CommonProxy
{
         //     ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRailBrakeEntity.class, new TileEntityRailBrakeRenderer());
         // 	RenderingRegistry.registerEntityRenderingHandler(TileEntityRailBrakeEntity.class, new TileEntityRailBrakeRenderer(new RailBrakeModel()));

    //public void registerRenderInformation() {
        //RenderingRegistry.registerEntityRenderingHandler(TileEntityRailBrakeEntity.class, new TileEntityRailBrakeRenderer());
    //}

    /*public void registerRenderThings() {
    }*/
	
	//public GuiHandlerRailsCraftingTable guiHandlerRailsCraftingTable = new GuiHandlerRailsCraftingTable();
	
	//@EventHandler
    //public void load(FMLInitializationEvent event)
    //{
		//NetworkRegistry.INSTANCE.registerGuiHandler(this, guiHandlerRailsCraftingTable);
    //}
	
        @Override
        public void preInit(FMLPreInitializationEvent event) {
            super.preInit(event);
        }

        @Override
        public void init(FMLInitializationEvent event) {
            super.init(event);

            ERMBase.registerRenders();

        }

        public static void registerRender(Block block) {
            //Wool Rails//
              Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.whiteWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "whiteWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.orangeWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "orangeWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.magentaWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "magentaWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.lightblueWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "lightblueWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.yellowWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "yellowWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.limeWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "limeWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.pinkWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "pinkWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.grayWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "grayWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.lightgrayWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "lightgrayWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.cyanWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "cyanWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.purpleWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "purpleWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.blueWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "blueWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.brownWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "brownWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.greenWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "greenWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.redWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "redWoolRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.blackWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "blackWoolRail", "inventory"));
//            //Normalrail//
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.obsidianRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "obsidianRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.diamondRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "diamondRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.lapisRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "lapisRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.iceRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "iceRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.glowstoneRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "glowstoneRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.diamondNetherRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "diamondNetherRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.diamondObsidianRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "diamondObsidianRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.brickRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "brickRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.emeraldRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "emeraldRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.netherStarRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "netherStarRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.enderPearlRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.chainRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "chainRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.armedRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "armedRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.railsCraftingTable), 0, new ModelResourceLocation(ERMBase.modid + ":" + "railsCraftingTable", "inventory"));
//            //Monorail//
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailDiamond), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailDiamond", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailGlowing), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGlowing", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailGrayOrange), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGrayOrange", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailNether), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailNether", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailObsidian), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailObsidian", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailRedGreen), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailRedGreen", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailYellowBlue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailYellowBlue", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailEmerald), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailEmerald", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailLapis), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLapis", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailGold), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGold", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailPowered), 0,new ModelResourceLocation(ERMBase.modid+":"+"MonorailPowered", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailIce), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailIce", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailChain), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailChain", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailArmed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailArmed", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailEnderPearl), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailEnderPearl", "inventory"));
//            //Triplerail//
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailDiamond), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailDiamond", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailGlowing), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailGlowing", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailNether), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailNether", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailObsidian), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailObsidian", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailEmerald), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailEmerald", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailLapis), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLapis", "inventory"));
//            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailPowered), 0,new ModelResourceLocation(ERMBase.modid+":"+"triplerailPowered", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailIce), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailIce", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailChain), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailChain", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailArmed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailArmed", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailEnderPearl), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailEnderPearl", "inventory"));
//            //Wool Monorails//
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailWhite), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailWhite", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailOrange), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailOrange", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailMagenta), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailMagenta", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailLightblue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLightblue", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailYellow), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailYellow", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailLime), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLime", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailPink), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailPink", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailGray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGray", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailLightgray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLightgray", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailCyan), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailCyan", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailPurple), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailPurple", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailBlue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailBlue", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailBrown), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailBrown", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailGreen), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGreen", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailRed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailRed", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.monorailBlack), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailBlack", "inventory"));
//            //wool Triplerails//
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailWhite), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailWhite", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailOrange), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailOrange", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailMagenta), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailMagenta", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailLightblue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLightblue", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailYellow), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailYellow", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailLime), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLime", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailPink), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailPink", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailGray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailGray", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailLightgray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLightgray", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailCyan), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailCyan", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailPurple), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailPurple", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailBlue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailBlue", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailBrown), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailBrown", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailGreen), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailGreen", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailRed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailRed", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.triplerailBlack), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailBlack", "inventory"));
//
//            //Crafting Table//
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.railsCraftingTable), 0, new ModelResourceLocation(ERMBase.modid + ":" + "railsCraftingTable", "inventory"));
//
//            //New Rails//
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.enderPearlDiamondRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlDiamondRail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.enderPearlDiamondMonorail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlDiamondMonorail", "inventory"));
//            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(ERMBase.enderPearlDiamondTriplerail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlDiamondTriplerail", "inventory"));

            //Custom Items//
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.emeraldBar), 0,new ModelResourceLocation(ERMBase.modid+":"+"emeraldBar", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.diamondBar), 0,new ModelResourceLocation(ERMBase.modid+":"+"diamondBar", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.obsidianBar), 0,new ModelResourceLocation(ERMBase.modid+":"+"obsidianBar", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.lapisBar), 0,new ModelResourceLocation(ERMBase.modid+":"+"lapisBar", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.explosiveBar), 0,new ModelResourceLocation(ERMBase.modid+":"+"explosiveBar", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.ironNail), 0,new ModelResourceLocation(ERMBase.modid+":"+"ironNail", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.goldNail), 0,new ModelResourceLocation(ERMBase.modid+":"+"goldNail", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.diamondNail), 0,new ModelResourceLocation(ERMBase.modid+":"+"diamondNail", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.emeraldNail), 0,new ModelResourceLocation(ERMBase.modid+":"+"emeraldNail", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.obsidianNail), 0,new ModelResourceLocation(ERMBase.modid+":"+"obsidianNail", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.netherrackNail), 0,new ModelResourceLocation(ERMBase.modid+":"+"netherrackNail", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.woolenNail), 0,new ModelResourceLocation(ERMBase.modid+":"+"woolenNail", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.netherIngot), 0,new ModelResourceLocation(ERMBase.modid+":"+"netherIngot", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railIronBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railIronBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railDiamondBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railDiamondBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railObsidianBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railObsidianBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railNetherrackBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railNetherrackBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railEmeraldBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railEmeraldBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railLapisBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railLapisBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railGoldBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railGoldBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railArmedBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railArmedBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railChainBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railChainBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railIceBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railIceBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.railEnderPearlBase), 0,new ModelResourceLocation(ERMBase.modid+":"+"railEnderPearlBase", "inventory"));
            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register((ERMBase.obsidianChunk), 0,new ModelResourceLocation(ERMBase.modid+":"+"obsidianChunk", "inventory"));
        }

        @Override
        public void postInit(FMLPostInitializationEvent event) {
            super.postInit(event);
        }

}
    