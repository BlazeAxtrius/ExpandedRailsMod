package com.expanded.rails.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

import com.expanded.rails.mod.blocks.BlockNileWorkbench;
import com.expanded.rails.mod.normalrails.*;
//import com.expanded.rails.mod.blocks.RailsCraftingTable;
//import com.expanded.rails.mod.gui.TileEntityRailsCraftingTable;
//import com.expanded.rails.mod.gui.GuiHandlerRailsCraftingTable;
import com.expanded.rails.mod.gui.TileEntityNileWorkbench;
import com.expanded.rails.mod.rails.AllRails;
import com.expanded.rails.mod.rails.ArmedRail;
import com.expanded.rails.mod.rails.ChainRail;
import com.expanded.rails.mod.rails.DiamondRail;
import com.expanded.rails.mod.rails.EmeraldRail;
import com.expanded.rails.mod.rails.EnderPearlDiamondRail;
import com.expanded.rails.mod.rails.EnderPearlRail;
import com.expanded.rails.mod.rails.GlowstoneRail;
import com.expanded.rails.mod.rails.IceRail;
import com.expanded.rails.mod.rails.LapisRail;
import com.expanded.rails.mod.rails.MonorailArmed;
import com.expanded.rails.mod.rails.MonorailChain;
import com.expanded.rails.mod.rails.MonorailDiamond;
import com.expanded.rails.mod.rails.MonorailEmerald;
import com.expanded.rails.mod.rails.MonorailEnderPearl;
import com.expanded.rails.mod.rails.MonorailEnderPearlDiamond;
import com.expanded.rails.mod.rails.MonorailGlowing;
import com.expanded.rails.mod.rails.MonorailIce;
import com.expanded.rails.mod.rails.MonorailLapis;
//import com.expanded.rails.mod.rails.MonorailPowered;
import com.expanded.rails.mod.rails.TriplerailArmed;
import com.expanded.rails.mod.rails.TriplerailChain;
import com.expanded.rails.mod.rails.TriplerailDiamond;
import com.expanded.rails.mod.rails.TriplerailEmerald;
import com.expanded.rails.mod.rails.TriplerailEnderPearl;
import com.expanded.rails.mod.rails.TriplerailEnderPearlDiamond;
import com.expanded.rails.mod.rails.TriplerailGlowing;
import com.expanded.rails.mod.rails.TriplerailIce;
import com.expanded.rails.mod.rails.TriplerailLapis;
//import com.expanded.rails.mod.rails.TriplerailPowered;
//import expanded.rails.mod.entity.TileEntityRailBrake;
//import expanded.rails.mod.entity.TileEntityRailBrakeEntity;

@Mod(modid = "expandedrailsmod", name = "Expanded Rails Mod", version = "1.6.3")
public class ERMBase
{
	
	public static final String modid = "ExpandedRailsMod";
	
    // The instance of your mod that Forge uses.
    @Instance("ExpandedRailsMod")
    public static ERMBase instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "com.expanded.rails.mod.client.ClientProxy", serverSide = "com.expanded.rails.mod.CommonProxy")
    public static CommonProxy proxy;
    
    public static final CreativeTabs tabNormalRails = new CreativeTabs("NormalRails") {

		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Item.getItemFromBlock(obsidianRail);
		}
};
    public static CreativeTabs tabMonoRails = new CreativeTabs("MonoRails") {

		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Item.getItemFromBlock(monorailObsidian);
		}
};
	public static CreativeTabs tabTripleRails = new CreativeTabs("TripleRails") {

	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(triplerailObsidian);
	}
};
    
    public static final int guiIDWorkSurface = 1;

    public static boolean configFlag;

    public static Block monorailWhite, monorailOrange, monorailMagenta, monorailLightblue, monorailYellow, monorailLime, monorailPink, monorailGray, monorailLightgray, monorailCyan, monorailPurple, monorailBlue, monorailBrown, monorailGreen, monorailRed, monorailBlack, railBrake;
    public static Block obsidianRail, diamondRail, lapisRail, iceRail, glowstoneRail, diamondNetherRail, diamondObsidianRail, brickRail, emeraldRail, netherStarRail, whiteWoolRail, orangeWoolRail, magentaWoolRail, lightblueWoolRail, yellowWoolRail, limeWoolRail, pinkWoolRail, grayWoolRail, lightgrayWoolRail, cyanWoolRail, purpleWoolRail, blueWoolRail, brownWoolRail, greenWoolRail, redWoolRail, blackWoolRail, enderPearlRail, chainRail, railsCraftingTable, armedRail, monorailDiamond, monorailGlowing, monorailGrayOrange, monorailNether, monorailObsidian, monorailRedGreen, monorailYellowBlue, monorailEmerald, monorailLapis, monorailGold, monorailPowered, monorailIce, monorailChain, monorailArmed, monorailEnderPearl;
    public static Block triplerailWhite, triplerailOrange, triplerailMagenta, triplerailLightblue, triplerailYellow, triplerailLime, triplerailPink, triplerailGray, triplerailLightgray, triplerailCyan, triplerailPurple, triplerailBlue, triplerailBrown, triplerailGreen, triplerailRed, triplerailBlack;
    public static Block triplerailDiamond, triplerailGlowing, triplerailGrayOrange, triplerailNether, triplerailObsidian, triplerailRedGreen, triplerailYellowBlue, triplerailEmerald, triplerailLapis, triplerailPowered, triplerailIce, triplerailChain, triplerailArmed, triplerailEnderPearl;
    public static Item minecartWhite, minecartOrange, minecartMagenta, minecartLightblue, minecartYellow, minecartLime, minecartPink, minecartGray, minecartLightgray, minecartCyan, minecartPurple, minecartBlue, minecartBrown, minecartGreen, minecartRed, minecartBlack;
    public static Item emeraldBar, diamondBar, obsidianBar, lapisBar, explosiveBar, ironNail, goldNail, diamondNail, emeraldNail, obsidianNail, netherrackNail, woolenNail, netherIngot, railIronBase, railDiamondBase, railObsidianBase, railNetherrackBase, railEmeraldBase, railLapisBase, railGoldBase, railArmedBase, railChainBase, railIceBase, railEnderPearlBase, obsidianChunk;
    public static Block enderPearlDiamondRail, enderPearlDiamondMonorail, enderPearlDiamondTriplerail;
    //public GuiHandlerRailsCraftingTable guiHandlerRailsCraftingTable = new GuiHandlerRailsCraftingTable(); 
    public TileEntityNileWorkbench guiHandlerRailsCraftingTable = new TileEntityNileWorkbench();

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	//Custom Blocks//
    	//Wool Rails//
        whiteWoolRail = new AllRails(3081).setUnlocalizedName("whiteWoolRail");
        orangeWoolRail = new AllRails(3082).setUnlocalizedName("orangeWoolRail");
        magentaWoolRail = new AllRails(3083).setUnlocalizedName("magentaWoolRail");
        lightblueWoolRail = new AllRails(3084).setUnlocalizedName("lightblueWoolRail");
        yellowWoolRail = new AllRails(3085).setUnlocalizedName("yellowWoolRail");
        limeWoolRail = new AllRails(3086).setUnlocalizedName("limeWoolRail");
        pinkWoolRail = new AllRails(3087).setUnlocalizedName("pinkWoolRail");
        grayWoolRail = new AllRails(3088).setUnlocalizedName("grayWoolRail");
        lightgrayWoolRail = new AllRails(3089).setUnlocalizedName("lightgrayWoolRail");
        cyanWoolRail = new AllRails(3090).setUnlocalizedName("cyanWoolRail");
        purpleWoolRail = new AllRails(3091).setUnlocalizedName("purpleWoolRail");
        blueWoolRail = new AllRails(3092).setUnlocalizedName("blueWoolRail");
        brownWoolRail = new AllRails(3093).setUnlocalizedName("brownWoolRail");
        greenWoolRail = new AllRails(3094).setUnlocalizedName("greenWoolRail");
        redWoolRail = new AllRails(3095).setUnlocalizedName("redWoolRail");
        blackWoolRail = new AllRails(3096).setUnlocalizedName("blackWoolRail");
        //Normalrail//
        armedRail = new ArmedRail(3013).setUnlocalizedName("armedRail");
        diamondRail = new DiamondRail(3002).setUnlocalizedName("diamondRail");
        emeraldRail = new EmeraldRail(3009).setUnlocalizedName("emeraldRail");
        enderPearlRail = new EnderPearlRail(3011).setUnlocalizedName("enderPearlRail");
        glowstoneRail = new GlowstoneRail(3005).setUnlocalizedName("glowstoneRail");
        obsidianRail = new ObsidianRail(3001).setUnlocalizedName("obsidianRail");
        brickRail = new AllRails(3008).setUnlocalizedName("brickRail");
        iceRail = new IceRail(3004).setUnlocalizedName("iceRail");
        chainRail = new ChainRail(3012).setUnlocalizedName("chainRail");
        lapisRail = new LapisRail(3003).setUnlocalizedName("lapisRail");
        diamondNetherRail = new DiamondNetherRail(3006).setUnlocalizedName("diamondNetherRail");
        diamondObsidianRail = new DiamondObsidianRail(3007).setUnlocalizedName("diamondObsidianRail");
        netherStarRail = new AllRails(3010).setUnlocalizedName("netherStarRail");
railsCraftingTable = new BlockNileWorkbench().setUnlocalizedName("railsCraftingTable");
//railsCraftingTable = new RailsCraftingTable(2901).setUnlocalizedName("railsCraftingTable");
//railBrake = new TileEntityRailBrake(railBrakeID, Material.rock).setUnlocalizedName("railBrake");
        //Wool Monorails//
        monorailWhite = new AllRails(3169).setUnlocalizedName("monorailWhite");
        monorailOrange = new AllRails(3170).setUnlocalizedName("monorailOrange");
        monorailMagenta = new AllRails(3171).setUnlocalizedName("monorailMagenta");
        monorailLightblue = new AllRails(3172).setUnlocalizedName("monorailLightblue");
        monorailYellow = new AllRails(3173).setUnlocalizedName("monorailYellow");
        monorailLime = new AllRails(3174).setUnlocalizedName("monorailLime");
        monorailPink = new AllRails(3175).setUnlocalizedName("monorailPink");
        monorailGray = new AllRails(3176).setUnlocalizedName("monorailGray");
        monorailLightgray = new AllRails(3177).setUnlocalizedName("monorailLightgray");
        monorailCyan = new AllRails(3178).setUnlocalizedName("monorailCyan");
        monorailPurple = new AllRails(3179).setUnlocalizedName("monorailPurple");
        monorailBlue = new AllRails(3180).setUnlocalizedName("monorailBlue");
        monorailBrown = new AllRails(3181).setUnlocalizedName("monorailBrown");
        monorailGreen = new AllRails(3182).setUnlocalizedName("monorailGreen");
        monorailRed = new AllRails(3183).setUnlocalizedName("monorailRed");
        monorailBlack = new AllRails(3184).setUnlocalizedName("monorailBlack");
        //Monorail//
        monorailArmed = new MonorailArmed(3141).setUnlocalizedName("monorailArmed");
        monorailDiamond = new MonorailDiamond(3128).setUnlocalizedName("monorailDiamond");
        monorailEmerald = new MonorailEmerald(3132).setUnlocalizedName("monorailEmerald");
        monorailEnderPearl = new MonorailEnderPearl(3142).setUnlocalizedName("monorailEnderPearl");
        monorailGlowing = new MonorailGlowing(3130).setUnlocalizedName("monorailGlowing");
        monorailObsidian = new MonorailObsidian(3129).setUnlocalizedName("monorailObsidian");
        //monorailPowered = new MonorailPowered(3138).setUnlocalizedName("monorailPowered");
        monorailIce = new MonorailIce(3139).setUnlocalizedName("monorailIce");
        monorailChain = new MonorailChain(3140).setUnlocalizedName("monorailChain");
        monorailLapis = new MonorailLapis(3133).setUnlocalizedName("monorailLapis");
        monorailNether = new AllRails(3131).setUnlocalizedName("monorailNether");
        monorailGrayOrange = new AllRails(3136).setUnlocalizedName("monorailGrayOrange");
        monorailRedGreen = new AllRails(3134).setUnlocalizedName("monorailRedGreen");
        monorailYellowBlue = new AllRails(3135).setUnlocalizedName("monorailYellowBlue");
        monorailGold = new AllRails(3137).setUnlocalizedName("monorailGold");
        //Wool Triplerails//
        triplerailWhite = new AllRails(3196).setUnlocalizedName("triplerailWhite");
        triplerailOrange = new AllRails(3197).setUnlocalizedName("triplerailOrange");
        triplerailMagenta = new AllRails(3198).setUnlocalizedName("triplerailMagenta");
        triplerailLightblue = new AllRails(3199).setUnlocalizedName("triplerailLightblue");
        triplerailYellow = new AllRails(3200).setUnlocalizedName("triplerailYellow");
        triplerailLime = new AllRails(3201).setUnlocalizedName("triplerailLime");
        triplerailPink = new AllRails(3202).setUnlocalizedName("triplerailPink");
        triplerailGray = new AllRails(3203).setUnlocalizedName("triplerailGray");
        triplerailLightgray = new AllRails(3204).setUnlocalizedName("triplerailLightgray");
        triplerailCyan = new AllRails(3205).setUnlocalizedName("triplerailCyan");
        triplerailPurple = new AllRails(3206).setUnlocalizedName("triplerailPurple");
        triplerailBlue = new AllRails(3207).setUnlocalizedName("triplerailBlue");
        triplerailBrown = new AllRails(3208).setUnlocalizedName("triplerailBrown");
        triplerailGreen = new AllRails(3209).setUnlocalizedName("triplerailGreen");
        triplerailRed = new AllRails(3210).setUnlocalizedName("triplerailRed");
        triplerailBlack = new AllRails(3211).setUnlocalizedName("triplerailBlack");
        //Triplerail//
        triplerailArmed = new TriplerailArmed(3194).setUnlocalizedName("triplerailArmed");
        triplerailDiamond = new TriplerailDiamond(3185).setUnlocalizedName("triplerailDiamond");
        triplerailEmerald = new TriplerailEmerald(3189).setUnlocalizedName("triplerailEmerald");
        triplerailEnderPearl = new TriplerailEnderPearl(3195).setUnlocalizedName("triplerailEnderPearl");
        triplerailGlowing = new TriplerailGlowing(3186).setUnlocalizedName("triplerailGlowing");
        triplerailObsidian = new AllRails(3188).setUnlocalizedName("triplerailObsidian");
        //triplerailPowered = new TriplerailPowered(3191).setUnlocalizedName("triplerailPowered");
        triplerailIce = new TriplerailIce(3192).setUnlocalizedName("triplerailIce");
        triplerailChain = new TriplerailChain(3193).setUnlocalizedName("triplerailChain");
        triplerailLapis = new TriplerailLapis(3190).setUnlocalizedName("triplerailLapis");
        triplerailNether = new AllRails(3187).setUnlocalizedName("triplerailNether");
        //New Rails//
        enderPearlDiamondRail = new EnderPearlDiamondRail(3188).setUnlocalizedName("enderPearlDiamondRail");
        enderPearlDiamondMonorail = new MonorailEnderPearlDiamond(3189).setUnlocalizedName("enderPearlDiamondMonorail");
        enderPearlDiamondTriplerail = new TriplerailEnderPearlDiamond(3190).setUnlocalizedName("enderPearlDiamondTriplerail");
        
        //Custom Items//
        //emeraldBar = new ExpandedItem(8001).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("emeraldBar");
        //diamondBar = new ExpandedItem(8000).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("diamondBar");
        //obsidianBar = new ExpandedItem(8002).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianBar");
        //lapisBar = new ExpandedItem(8003).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("lapisBar");
        //explosiveBar = new ExpandedItem(8004).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("explosiveBar");
        //ironNail = new ExpandedItem(8024).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("ironNail");
        //goldNail = new ExpandedItem(8025).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("goldNail");
        //diamondNail = new ExpandedItem(8026).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("diamondNail");
        //emeraldNail = new ExpandedItem(8027).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("emeraldNail");
        //obsidianNail = new ExpandedItem(8028).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianNail");
        //netherrackNail = new ExpandedItem(8029).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("netherrackNail");
        //woolenNail = new ExpandedItem(8031).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("woolenNail");
        //netherIngot = new ExpandedItem(8051).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("netherIngot");
        //railIronBase = new ExpandedItem(8062).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railIronBase");
        //railDiamondBase = new ExpandedItem(8063).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railDiamondBase");
        //railObsidianBase = new ExpandedItem(8064).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railObsidianBase");
        //railNetherrackBase = new ExpandedItem(8065).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railNetherrackBase");
        //railEmeraldBase = new ExpandedItem(8066).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railEmeraldBase");
        //railLapisBase = new ExpandedItem(8067).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railLapisBase");
        //railGoldBase = new ExpandedItem(8068).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railGoldBase");
        //railArmedBase = new ExpandedItem(8069).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railArmedBase");
        //railChainBase = new ExpandedItem(8070).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railChainBase");
        //railIceBase = new ExpandedItem(8071).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railIceBase");
        //railEnderPearlBase = new ExpandedItem(8072).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railEnderPearlBase");
        //obsidianChunk = new ExpandedItem(7999).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianChunk");
        //minecartWhite = new ExpandedItem(minecartWhiteID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartWhite");
        //minecartOrange = new ExpandedItem(minecartOrangeID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartOrange");
        //minecartMagenta = new ExpandedItem(minecartMagentaID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartMagenta");
        //minecartLightblue = new ExpandedItem(minecartLightblueID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLightblue");
        //minecartYellow = new ExpandedItem(minecartYellowID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartYellow");
        //minecartLime = new ExpandedItem(minecartLimeID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLime");
        //minecartPink = new ExpandedItem(minecartPinkID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartPink");
        //minecartGray = new ExpandedItem(minecartGrayID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartGray");
        //minecartLightgray = new ExpandedItem(minecartLightgrayID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLightgray");
        //minecartCyan = new ExpandedItem(minecartCyanID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartCyan");
        //minecartPurple = new ExpandedItem(minecartPurpleID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartPurple");
        //minecartBlue = new ExpandedItem(minecartBlueID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBlue");
        //minecartBrown = new ExpandedItem(minecartBrownID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBrown");
        //minecartGreen = new ExpandedItem(minecartGreenID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartGreen");
        //minecartRed = new ExpandedItem(minecartRedID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartRed");
        //minecartBlack = new ExpandedItem(minecartBlackID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBlack");
        //Block Registering//
        GameRegistry.registerBlock(whiteWoolRail, "whiteWoolRail");
        GameRegistry.registerBlock(orangeWoolRail, "orangeWoolRail");
        GameRegistry.registerBlock(magentaWoolRail, "magentaWoolRail");
        GameRegistry.registerBlock(lightblueWoolRail, "lightblueWoolRail");
        GameRegistry.registerBlock(yellowWoolRail, "yellowWoolRail");
        GameRegistry.registerBlock(limeWoolRail, "limeWoolRail");
        GameRegistry.registerBlock(pinkWoolRail, "pinkWoolRail");
        GameRegistry.registerBlock(grayWoolRail, "grayWoolRail");
        GameRegistry.registerBlock(lightgrayWoolRail, "lightgrayWoolRail");
        GameRegistry.registerBlock(cyanWoolRail, "cyanWoolRail");
        GameRegistry.registerBlock(purpleWoolRail, "purpleWoolRail");
        GameRegistry.registerBlock(blueWoolRail, "blueWoolRail");
        GameRegistry.registerBlock(brownWoolRail, "brownWoolRail");
        GameRegistry.registerBlock(greenWoolRail, "greenWoolRail");
        GameRegistry.registerBlock(redWoolRail, "redWoolRail");
        GameRegistry.registerBlock(blackWoolRail, "blackWoolRail"); 
        
        GameRegistry.registerBlock(armedRail, "armedRail");
        GameRegistry.registerBlock(diamondRail, "diamondRail");
        GameRegistry.registerBlock(emeraldRail, "emeraldRail");
        GameRegistry.registerBlock(enderPearlRail, "enderPearlRail");
        GameRegistry.registerBlock(glowstoneRail, "glowstoneRail");
        GameRegistry.registerBlock(obsidianRail, "obsidianRail");
        GameRegistry.registerBlock(brickRail, "brickRail");
        GameRegistry.registerBlock(iceRail, "iceRail");
        GameRegistry.registerBlock(chainRail, "chainRail");
        GameRegistry.registerBlock(lapisRail, "lapisRail");
        GameRegistry.registerBlock(diamondNetherRail, "diamondNetherRail");
        GameRegistry.registerBlock(diamondObsidianRail, "diamondObsidianRail");
        GameRegistry.registerBlock(netherStarRail, "netherStarRail");
     	//Mono Wool Rails//
        GameRegistry.registerBlock(monorailWhite, "monorailWhite");
        GameRegistry.registerBlock(monorailOrange, "monorailOrange");
        GameRegistry.registerBlock(monorailMagenta, "monorailMagenta");
        GameRegistry.registerBlock(monorailLightblue, "monorailLightblue");
        GameRegistry.registerBlock(monorailYellow, "monorailYellow");
        GameRegistry.registerBlock(monorailLime, "monorailLime");
        GameRegistry.registerBlock(monorailPink, "monorailPink");
        GameRegistry.registerBlock(monorailGray, "monorailGray");
        GameRegistry.registerBlock(monorailLightgray, "monorailLightgray");
        GameRegistry.registerBlock(monorailCyan, "monorailCyan");
        GameRegistry.registerBlock(monorailPurple, "monorailPurple");
        GameRegistry.registerBlock(monorailBlue, "monorailBlue");
        GameRegistry.registerBlock(monorailBrown, "monorailBrown");
        GameRegistry.registerBlock(monorailGreen, "monorailGreen");
        GameRegistry.registerBlock(monorailRed, "monorailRed");
        GameRegistry.registerBlock(monorailBlack, "monorailBlack");
        //Monorail//
        GameRegistry.registerBlock(monorailArmed, "monorailArmed");
        GameRegistry.registerBlock(monorailDiamond, "monorailDiamond");
        GameRegistry.registerBlock(monorailEmerald, "monorailEmerald");
        GameRegistry.registerBlock(monorailEnderPearl, "monorailEnderPearl");
        GameRegistry.registerBlock(monorailGlowing, "monorailGlowing");
        GameRegistry.registerBlock(monorailObsidian, "monorailObsidian");
        //GameRegistry.registerBlock(monorailPowered, "monorailPowered");
        GameRegistry.registerBlock(monorailIce, "monorailIce");
        GameRegistry.registerBlock(monorailChain, "monorailChain");
        GameRegistry.registerBlock(monorailLapis, "monorailLapis");
        GameRegistry.registerBlock(monorailNether, "monorailNether");
        GameRegistry.registerBlock(monorailGrayOrange, "monorailGrayOrange");
        GameRegistry.registerBlock(monorailRedGreen, "monorailRedGreen");
        GameRegistry.registerBlock(monorailYellowBlue, "monorailYellowBlue");
        GameRegistry.registerBlock(monorailGold, "monorailGold");
        //Triple Wool Rails//
        GameRegistry.registerBlock(triplerailWhite, "triplerailWhite");
        GameRegistry.registerBlock(triplerailOrange, "triplerailOrange");
        GameRegistry.registerBlock(triplerailMagenta, "triplerailMagenta");
        GameRegistry.registerBlock(triplerailLightblue, "triplerailLightblue");
        GameRegistry.registerBlock(triplerailYellow, "triplerailYellow");
        GameRegistry.registerBlock(triplerailLime, "triplerailLime");
        GameRegistry.registerBlock(triplerailPink, "triplerailPink");
        GameRegistry.registerBlock(triplerailGray, "triplerailGray");
        GameRegistry.registerBlock(triplerailLightgray, "triplerailLightgray");
        GameRegistry.registerBlock(triplerailCyan, "triplerailCyan");
        GameRegistry.registerBlock(triplerailPurple, "triplerailPurple");
        GameRegistry.registerBlock(triplerailBlue, "triplerailBlue");
        GameRegistry.registerBlock(triplerailBrown, "triplerailBrown");
        GameRegistry.registerBlock(triplerailGreen, "triplerailGreen");
        GameRegistry.registerBlock(triplerailRed, "triplerailRed");
        GameRegistry.registerBlock(triplerailBlack, "triplerailBlack");
        //Triplerail//
        GameRegistry.registerBlock(triplerailArmed, "triplerailArmed");
        GameRegistry.registerBlock(triplerailDiamond, "triplerailDiamond");
        GameRegistry.registerBlock(triplerailEmerald, "triplerailEmerald");
        GameRegistry.registerBlock(triplerailEnderPearl, "triplerailEnderPearl");
        GameRegistry.registerBlock(triplerailGlowing, "triplerailGlowing");
        GameRegistry.registerBlock(triplerailObsidian, "triplerailObsidian");
        //GameRegistry.registerBlock(triplerailPowered, "triplerailPowered");
        GameRegistry.registerBlock(triplerailIce, "triplerailIce");
        GameRegistry.registerBlock(triplerailChain, "triplerailChain");
        GameRegistry.registerBlock(triplerailLapis, "triplerailLapis");
        GameRegistry.registerBlock(triplerailNether, "triplerailNether");
        //New Rails//
        GameRegistry.registerBlock(enderPearlDiamondRail, "enderPearlDiamondRail");
        GameRegistry.registerBlock(enderPearlDiamondMonorail, "enderPearlDiamondMonorail");
        GameRegistry.registerBlock(enderPearlDiamondTriplerail, "enderPearlDiamondTriplerail");
        
        GameRegistry.registerBlock(railsCraftingTable, "railsCraftingTable");
        
        //GameRegistry.registerBlock(railBrake, "railBrake");
        
        
        //NetworkRegistry.INSTANCE.registerGuiHandler(this, guiHandlerRailsCraftingTable);
        GameRegistry.registerTileEntity(TileEntityNileWorkbench.class,"expandedrailsmod.TileEntityRailsCraftingTable");
        
        
        //Item Registering// ADD NAMES IN LANG FILE
        //GameRegistry.registerItem(obsidianBar, "obsidianBar");
        //GameRegistry.registerItem(emeraldBar, "emeraldBar");
        //GameRegistry.registerItem(diamondBar, "diamondBar");
        //GameRegistry.registerItem(lapisBar, "lapisBar");
        //GameRegistry.registerItem(explosiveBar, "explosiveBar");
        //GameRegistry.registerItem(ironNail, "ironNail");
        //GameRegistry.registerItem(goldNail, "goldNail");
        //GameRegistry.registerItem(diamondNail, "diamondNail");
        //GameRegistry.registerItem(emeraldNail, "emeraldNail");
        //GameRegistry.registerItem(obsidianNail, "obsidianNail");
        //GameRegistry.registerItem(netherrackNail, "netherrackNail");
        //GameRegistry.registerItem(woolenNail, "woolenNail");
        //GameRegistry.registerItem(netherIngot, "netherIngot");
        //GameRegistry.registerItem(railIronBase, "railIronBase");
        //GameRegistry.registerItem(railDiamondBase, "railDiamondBase");
        //GameRegistry.registerItem(railObsidianBase, "railObsidianBase");
        //GameRegistry.registerItem(railNetherrackBase, "railNetherrackBase");
        //GameRegistry.registerItem(railEmeraldBase, "railEmeraldBase");
        //GameRegistry.registerItem(railLapisBase, "railLapisBase");
        //GameRegistry.registerItem(railGoldBase, "railGoldBase");
        //GameRegistry.registerItem(railChainBase, "railChainBase");
        //GameRegistry.registerItem(railArmedBase, "railArmedBase");
        //GameRegistry.registerItem(railIceBase, "railIceBase");
        //GameRegistry.registerItem(railEnderPearlBase, "railEnderPearlBase");
        //GameRegistry.registerItem(obsidianChunk, "obsidianChunk");
        
        
        //GameRegistry.registerItem(minecartWhite, "minecartWhite");
        //GameRegistry.registerItem(minecartOrange, "minecartOrange");
        //GameRegistry.registerItem(minecartMagenta, "minecartMagenta");
        //GameRegistry.registerItem(minecartLightblue, "minecartLightblue");
        //GameRegistry.registerItem(minecartYellow, "minecartYellow");
        //GameRegistry.registerItem(minecartLime, "minecartLime");
        //GameRegistry.registerItem(minecartPink, "minecartPink");
        //GameRegistry.registerItem(minecartGray, "minecartGray");
        //GameRegistry.registerItem(minecartLightgray, "minecartLightgray");
        //GameRegistry.registerItem(minecartCyan, "minecartCyan");
        //GameRegistry.registerItem(minecartPurple, "minecartPurple");
        //GameRegistry.registerItem(minecartBlue, "minecartBlue");
        //GameRegistry.registerItem(minecartBrown, "minecartBrown");
        //GameRegistry.registerItem(minecartGreen, "minecartGreen");
        //GameRegistry.registerItem(minecartRed, "minecartRed");
        //GameRegistry.registerItem(minecartBlack, "minecartBlack");
        
        //Tile Entity Registering//
        
        //GameRegistry.registerPlayerTracker(new PlayerJoin());
        
        this.proxy.init(event);
        
        //Recipe Registering//
        
        //Block Recipes//
        GameRegistry.addRecipe(new ItemStack(ERMBase.whiteWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.whiteclothStack);
        GameRegistry.addRecipe(new ItemStack(orangeWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.orangeclothStack);
        GameRegistry.addRecipe(new ItemStack(magentaWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.magentaclothStack);
        GameRegistry.addRecipe(new ItemStack(lightblueWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.lightblueclothStack);
        GameRegistry.addRecipe(new ItemStack(yellowWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.yellowclothStack);
        GameRegistry.addRecipe(new ItemStack(limeWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.limeclothStack);
        GameRegistry.addRecipe(new ItemStack(pinkWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.pinkclothStack);
        GameRegistry.addRecipe(new ItemStack(grayWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.grayclothStack);
        GameRegistry.addRecipe(new ItemStack(lightgrayWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.lightgrayclothStack);
        GameRegistry.addRecipe(new ItemStack(cyanWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.cyanclothStack);
        GameRegistry.addRecipe(new ItemStack(purpleWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.purpleclothStack);
        GameRegistry.addRecipe(new ItemStack(blueWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.blueclothStack);
        GameRegistry.addRecipe(new ItemStack(brownWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.brownclothStack);
        GameRegistry.addRecipe(new ItemStack(greenWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.greenclothStack);
        GameRegistry.addRecipe(new ItemStack(redWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.redclothStack);
        GameRegistry.addRecipe(new ItemStack(blackWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.blackclothStack);
        //GameRegistry.addRecipe(new ItemStack(railsCraftingTable, 1), "xyx", "zzz", "aba", 'x', Stacks.ironIngotStack, 'y', Stacks.railStack, 'z', Stacks.greenclothStack, 'a', Stacks.ironNailStack, 'b', Stacks.workbenchStack);
        //Item Recipes//
        //GameRegistry.addRecipe(new ItemStack(obsidianBar, 8), "  x", " x ", "x  ", 'x', Stacks.obsidianChunkStack);
        //GameRegistry.addRecipe(new ItemStack(diamondBar, 8), "  x", " x ", "x  ", 'x', Stacks.diamondStack);
        //GameRegistry.addRecipe(new ItemStack(emeraldBar, 8), "  x", " x ", "x  ", 'x', Stacks.emeraldStack);
        //GameRegistry.addRecipe(new ItemStack(lapisBar, 8), "  x", " x ", "x  ", 'x', Stacks.lapisStack);
        //GameRegistry.addRecipe(new ItemStack(explosiveBar, 8), "  x", " y ", "x  ", 'x', Stacks.quartzStack, 'y', Stacks.gunpowderStack);
        //GameRegistry.addRecipe(new ItemStack(netherIngot, 1), "x ", " x", 'x', Stacks.netherrackStack);
        //GameRegistry.addRecipe(new ItemStack(ironNail, 4), " x", "y ", 'x', Stacks.ironIngotStack, 'y', Stacks.stoneStack);
        //GameRegistry.addRecipe(new ItemStack(goldNail, 4), " x", "y ", 'x', Stacks.goldIngotStack, 'y', Stacks.stoneStack);
        //GameRegistry.addRecipe(new ItemStack(diamondNail, 8), " x", "y ", 'x', Stacks.diamondStack, 'y', Stacks.stoneStack);
        //GameRegistry.addRecipe(new ItemStack(emeraldNail, 8), " x", "y ", 'x', Stacks.emeraldStack, 'y', Stacks.stoneStack);
        //GameRegistry.addRecipe(new ItemStack(obsidianNail, 4), " x", "y ", 'x', Stacks.obsidianChunkStack, 'y', Stacks.stoneStack);
        //GameRegistry.addRecipe(new ItemStack(netherrackNail, 4), " x", "y ", 'x', Stacks.netherIngotStack, 'y', Stacks.stoneStack);
        //GameRegistry.addRecipe(new ItemStack(woolenNail, 4), " x", "y ", 'x', Stacks.whiteclothStack, 'y', Stacks.stoneStack);
        //GameRegistry.addRecipe(new ItemStack(railIronBase, 4), "x", "x", "x", 'x', Stacks.ironIngotStack);
        //GameRegistry.addRecipe(new ItemStack(railDiamondBase, 4), "x", "x", "x", 'x', Stacks.diamondBarStack);
        //GameRegistry.addRecipe(new ItemStack(railObsidianBase, 4), "x", "x", "x", 'x', Stacks.obsidianBarStack);
        //GameRegistry.addRecipe(new ItemStack(railNetherrackBase, 4), "x", "x", "x", 'x', Stacks.netherIngotStack);
        //GameRegistry.addRecipe(new ItemStack(railEmeraldBase, 4), "x", "x", "x", 'x', Stacks.emeraldBarStack);
        //GameRegistry.addRecipe(new ItemStack(railLapisBase, 4), "x", "x", "x", 'x', Stacks.lapisBarStack);
        //GameRegistry.addRecipe(new ItemStack(railGoldBase, 4), "x", "x", "x", 'x', Stacks.goldIngotStack);
        //GameRegistry.addRecipe(new ItemStack(railArmedBase, 8), "x", "x", "x", 'x', Stacks.explosiveBarStack);
        //GameRegistry.addRecipe(new ItemStack(railChainBase, 4), "x", "y", "x", 'x', Stacks.ironIngotStack, 'y', Stacks.obsidianChunkStack);
        //GameRegistry.addRecipe(new ItemStack(railIceBase, 4), "x", "x", "x", 'x', Stacks.iceStack);
        //GameRegistry.addRecipe(new ItemStack(railEnderPearlBase, 8), "x", "x", "x", 'x', Stacks.enderPearlStack);
        //GameRegistry.addRecipe(new ItemStack(Blocks.ice, 16), " x ", "xyx", " x ", 'x', Stacks.snowStack, 'y', Stacks.waterBucketStack);
        //GameRegistry.addShapelessRecipe(new ItemStack(obsidianChunk, 4), Stacks.obsidianStack, Stacks.cobblestoneStack);
        //Tabs
        //NormalRails//
        whiteWoolRail.setCreativeTab(this.tabNormalRails);
        orangeWoolRail.setCreativeTab(this.tabNormalRails);
        magentaWoolRail.setCreativeTab(this.tabNormalRails);
        lightblueWoolRail.setCreativeTab(this.tabNormalRails);
        yellowWoolRail.setCreativeTab(this.tabNormalRails);
        limeWoolRail.setCreativeTab(this.tabNormalRails);
        pinkWoolRail.setCreativeTab(this.tabNormalRails);
        grayWoolRail.setCreativeTab(this.tabNormalRails);
        lightgrayWoolRail.setCreativeTab(this.tabNormalRails);
        cyanWoolRail.setCreativeTab(this.tabNormalRails);
        purpleWoolRail.setCreativeTab(this.tabNormalRails);
        blueWoolRail.setCreativeTab(this.tabNormalRails);
        brownWoolRail.setCreativeTab(this.tabNormalRails);
        greenWoolRail.setCreativeTab(this.tabNormalRails);
        redWoolRail.setCreativeTab(this.tabNormalRails);
        blackWoolRail.setCreativeTab(this.tabNormalRails);
        diamondRail.setCreativeTab(this.tabNormalRails);
        emeraldRail.setCreativeTab(this.tabNormalRails);
        obsidianRail.setCreativeTab(this.tabNormalRails);
        lapisRail.setCreativeTab(this.tabNormalRails);
        glowstoneRail.setCreativeTab(this.tabNormalRails);
        enderPearlRail.setCreativeTab(this.tabNormalRails);
        //New Rails
        enderPearlDiamondRail.setCreativeTab(this.tabNormalRails);
        //Old Rails
        armedRail.setCreativeTab(this.tabNormalRails);
        chainRail.setCreativeTab(this.tabNormalRails);
        iceRail.setCreativeTab(this.tabNormalRails);
        diamondNetherRail.setCreativeTab(this.tabNormalRails);
        diamondObsidianRail.setCreativeTab(this.tabNormalRails);
        brickRail.setCreativeTab(this.tabNormalRails);
        netherStarRail.setCreativeTab(this.tabNormalRails);
        //Monorails//
        monorailWhite.setCreativeTab(this.tabMonoRails);
        monorailOrange.setCreativeTab(this.tabMonoRails);
        monorailMagenta.setCreativeTab(this.tabMonoRails);
        monorailLightblue.setCreativeTab(this.tabMonoRails);
        monorailYellow.setCreativeTab(this.tabMonoRails);
        monorailLime.setCreativeTab(this.tabMonoRails);
        monorailPink.setCreativeTab(this.tabMonoRails);
        monorailGray.setCreativeTab(this.tabMonoRails);
        monorailLightgray.setCreativeTab(this.tabMonoRails);
        monorailCyan.setCreativeTab(this.tabMonoRails);
        monorailPurple.setCreativeTab(this.tabMonoRails);
        monorailBlue.setCreativeTab(this.tabMonoRails);
        monorailBrown.setCreativeTab(this.tabMonoRails);
        monorailGreen.setCreativeTab(this.tabMonoRails);
        monorailRed.setCreativeTab(this.tabMonoRails);
        monorailBlack.setCreativeTab(this.tabMonoRails);
        monorailDiamond.setCreativeTab(this.tabMonoRails);
        monorailEmerald.setCreativeTab(this.tabMonoRails);
        monorailObsidian.setCreativeTab(this.tabMonoRails);
        monorailLapis.setCreativeTab(this.tabMonoRails);
        monorailGlowing.setCreativeTab(this.tabMonoRails);
        monorailEnderPearl.setCreativeTab(this.tabMonoRails);
        //New Rails
        enderPearlDiamondMonorail.setCreativeTab(this.tabMonoRails);
        //Old Rails
        monorailArmed.setCreativeTab(this.tabMonoRails);
        monorailChain.setCreativeTab(this.tabMonoRails);
        monorailIce.setCreativeTab(this.tabMonoRails);
        //monorailPowered.setCreativeTab(this.tabMonoRails);
        monorailGold.setCreativeTab(this.tabMonoRails);
        monorailNether.setCreativeTab(this.tabMonoRails);
        monorailRedGreen.setCreativeTab(this.tabMonoRails);
        monorailYellowBlue.setCreativeTab(this.tabMonoRails);
        monorailGrayOrange.setCreativeTab(this.tabMonoRails);
        //Triplerails//
        triplerailWhite.setCreativeTab(this.tabTripleRails);
        triplerailOrange.setCreativeTab(this.tabTripleRails);
        triplerailMagenta.setCreativeTab(this.tabTripleRails);
        triplerailLightblue.setCreativeTab(this.tabTripleRails);
        triplerailYellow.setCreativeTab(this.tabTripleRails);
        triplerailLime.setCreativeTab(this.tabTripleRails);
        triplerailPink.setCreativeTab(this.tabTripleRails);
        triplerailGray.setCreativeTab(this.tabTripleRails);
        triplerailLightgray.setCreativeTab(this.tabTripleRails);
        triplerailCyan.setCreativeTab(this.tabTripleRails);
        triplerailPurple.setCreativeTab(this.tabTripleRails);
        triplerailBlue.setCreativeTab(this.tabTripleRails);
        triplerailBrown.setCreativeTab(this.tabTripleRails);
        triplerailGreen.setCreativeTab(this.tabTripleRails);
        triplerailRed.setCreativeTab(this.tabTripleRails);
        triplerailBlack.setCreativeTab(this.tabTripleRails);
        triplerailDiamond.setCreativeTab(this.tabTripleRails);
        triplerailEmerald.setCreativeTab(this.tabTripleRails);
        triplerailObsidian.setCreativeTab(this.tabTripleRails);
        triplerailLapis.setCreativeTab(this.tabTripleRails);
        triplerailGlowing.setCreativeTab(this.tabTripleRails);
        triplerailEnderPearl.setCreativeTab(this.tabTripleRails);
        //New Rails
        enderPearlDiamondTriplerail.setCreativeTab(this.tabTripleRails);
        //Old Rails
        triplerailArmed.setCreativeTab(this.tabTripleRails);
        triplerailChain.setCreativeTab(this.tabTripleRails);
        triplerailIce.setCreativeTab(this.tabTripleRails);
        //triplerailPowered.setCreativeTab(this.tabTripleRails);
        triplerailNether.setCreativeTab(this.tabTripleRails);
//GameRegistry.registerTileEntity(TileEntityRailBrakeEntity.class, "railBrake");
//GameRegistry.registerBlock(whiteWoolRail = new AllRails(3081), "whiteWoolRail");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	this.proxy.postInit(event);
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	this.proxy.preInit(event);
    }
    
}