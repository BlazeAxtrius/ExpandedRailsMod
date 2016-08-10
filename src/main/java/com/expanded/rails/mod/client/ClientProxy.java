package com.expanded.rails.mod.client;

import com.expanded.rails.mod.CommonProxy;
import com.expanded.rails.mod.ERMBase;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
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
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.whiteWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "whiteWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.orangeWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "orangeWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.magentaWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "magentaWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.lightblueWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "lightblueWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.yellowWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "yellowWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.limeWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "limeWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.pinkWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "pinkWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.grayWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "grayWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.lightgrayWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "lightgrayWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.cyanWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "cyanWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.purpleWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "purpleWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.blueWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "blueWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.brownWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "brownWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.greenWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "greenWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.redWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "redWoolRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.blackWoolRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "blackWoolRail", "inventory"));
            //Normalrail//
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.obsidianRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "obsidianRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.diamondRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "diamondRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.lapisRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "lapisRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.iceRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "iceRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.glowstoneRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "glowstoneRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.diamondNetherRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "diamondNetherRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.diamondObsidianRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "diamondObsidianRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.brickRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "brickRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.emeraldRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "emeraldRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.netherStarRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "netherStarRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.enderPearlRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.chainRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "chainRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.armedRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "armedRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.railsCraftingTable), 0, new ModelResourceLocation(ERMBase.modid + ":" + "railsCraftingTable", "inventory"));
            //Monorail//
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailDiamond), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailDiamond", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailGlowing), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGlowing", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailGrayOrange), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGrayOrange", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailNether), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailNether", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailObsidian), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailObsidian", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailRedGreen), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailRedGreen", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailYellowBlue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailYellowBlue", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailEmerald), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailEmerald", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailLapis), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLapis", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailGold), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGold", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailPowered), 0,new ModelResourceLocation(ERMBase.modid+":"+"MonorailPowered", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailIce), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailIce", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailChain), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailChain", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailArmed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailArmed", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailEnderPearl), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailEnderPearl", "inventory"));
            //Triplerail//
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailDiamond), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailDiamond", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailGlowing), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailGlowing", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailNether), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailNether", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailObsidian), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailObsidian", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailEmerald), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailEmerald", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailLapis), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLapis", "inventory"));
            //ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailPowered), 0,new ModelResourceLocation(ERMBase.modid+":"+"triplerailPowered", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailIce), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailIce", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailChain), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailChain", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailArmed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailArmed", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailEnderPearl), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailEnderPearl", "inventory"));
            //Wool Monorails//
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailWhite), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailWhite", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailOrange), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailOrange", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailMagenta), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailMagenta", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailLightblue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLightblue", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailYellow), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailYellow", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailLime), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLime", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailPink), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailPink", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailGray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGray", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailLightgray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailLightgray", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailCyan), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailCyan", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailPurple), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailPurple", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailBlue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailBlue", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailBrown), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailBrown", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailGreen), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailGreen", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailRed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailRed", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.monorailBlack), 0, new ModelResourceLocation(ERMBase.modid + ":" + "monorailBlack", "inventory"));
            //wool Triplerails//
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailWhite), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailWhite", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailOrange), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailOrange", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailMagenta), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailMagenta", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailLightblue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLightblue", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailYellow), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailYellow", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailLime), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLime", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailPink), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailPink", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailGray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailGray", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailLightgray), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailLightgray", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailCyan), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailCyan", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailPurple), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailPurple", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailBlue), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailBlue", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailBrown), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailBrown", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailGreen), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailGreen", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailRed), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailRed", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.triplerailBlack), 0, new ModelResourceLocation(ERMBase.modid + ":" + "triplerailBlack", "inventory"));

            //Crafting Table//
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.railsCraftingTable), 0, new ModelResourceLocation(ERMBase.modid + ":" + "railsCraftingTable", "inventory"));

            //New Rails//
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.enderPearlDiamondRail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlDiamondRail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.enderPearlDiamondMonorail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlDiamondMonorail", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ERMBase.enderPearlDiamondTriplerail), 0, new ModelResourceLocation(ERMBase.modid + ":" + "enderPearlDiamondTriplerail", "inventory"));

        }

        @Override
        public void init(FMLInitializationEvent event) {
            super.init(event);

            ERMBase.registerRenders();
        }

        public static void registerRender(Block block) {

            //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

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
    