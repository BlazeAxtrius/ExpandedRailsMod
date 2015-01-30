package com.expanded.rails.mod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

//import com.expanded.rails.mod.blocks.RailsCraftingTable;
//import com.expanded.rails.mod.gui.GuiHandlerRailsCraftingTable;
import com.expanded.rails.mod.rails.AllRails;
//import com.expanded.rails.mod.rails.ArmedRail;
//import com.expanded.rails.mod.rails.ChainRail;
//import com.expanded.rails.mod.rails.DiamondNetherRail;
//import com.expanded.rails.mod.rails.DiamondObsidianRail;
//import com.expanded.rails.mod.rails.DiamondRail;
//import com.expanded.rails.mod.rails.EmeraldRail;
//import com.expanded.rails.mod.rails.EnderPearlRail;
//import com.expanded.rails.mod.rails.GlowstoneRail;
//import com.expanded.rails.mod.rails.IceRail;
//import com.expanded.rails.mod.rails.LapisRail;
//import com.expanded.rails.mod.rails.MonorailArmed;
//import com.expanded.rails.mod.rails.MonorailChain;
//import com.expanded.rails.mod.rails.MonorailDiamond;
//import com.expanded.rails.mod.rails.MonorailEmerald;
//import com.expanded.rails.mod.rails.MonorailEnderPearl;
//import com.expanded.rails.mod.rails.MonorailGlowing;
//import com.expanded.rails.mod.rails.MonorailIce;
//import com.expanded.rails.mod.rails.MonorailLapis;
//import com.expanded.rails.mod.rails.MonorailObsidian;
//import com.expanded.rails.mod.rails.MonorailPowered;
//import com.expanded.rails.mod.rails.ObsidianRail;
//import com.expanded.rails.mod.rails.TriplerailArmed;
//import com.expanded.rails.mod.rails.TriplerailChain;
//import com.expanded.rails.mod.rails.TriplerailDiamond;
//import com.expanded.rails.mod.rails.TriplerailEmerald;
//import com.expanded.rails.mod.rails.TriplerailEnderPearl;
//import com.expanded.rails.mod.rails.TriplerailGlowing;
//import com.expanded.rails.mod.rails.TriplerailIce;
//import com.expanded.rails.mod.rails.TriplerailLapis;
//import com.expanded.rails.mod.rails.TriplerailPowered;
//import expanded.rails.mod.entity.TileEntityRailBrake;
//import expanded.rails.mod.entity.TileEntityRailBrakeEntity;

@Mod(modid = "ExpandedRailsMod", name = "Expanded Rails Mod", version = "1.5.1")
public class ERMBase
{
	
	public static final String modid = "ExpandedRailsMod";
	
    // The instance of your mod that Forge uses.
    @Instance("ExpandedRailsMod")
    public static ERMBase instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "com.expanded.rails.mod.client.ClientProxy", serverSide = "com.expanded.rails.mod.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs tabNormalRails = new CreativeTabs(modid+"tabNormalRails") {
        public ItemStack getIconItemStack() {
                return new ItemStack(ERMBase.diamondRail, 1, 0);
        }

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
};
    public static CreativeTabs tabMonoRails = new CreativeTabs(modid+"tabMonoRails") {
        public ItemStack getIconItemStack() {
                return new ItemStack(ERMBase.monorailDiamond, 1, 0);
        }

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
};
	public static CreativeTabs tabTripleRails = new CreativeTabs(modid+"tabTripleRails") {
    public ItemStack getIconItemStack() {
            return new ItemStack(ERMBase.triplerailDiamond, 1, 0);
    }

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
};
    
    public static final int guiIDWorkSurface = 1;

    public static boolean configFlag;

    public static Block obsidianRail, diamondRail, lapisRail, iceRail, glowstoneRail, diamondNetherRail, diamondObsidianRail, brickRail, emeraldRail, netherStarRail, whiteWoolRail, orangeWoolRail, magentaWoolRail, lightblueWoolRail, yellowWoolRail, limeWoolRail, pinkWoolRail, grayWoolRail, lightgrayWoolRail, cyanWoolRail, purpleWoolRail, blueWoolRail, brownWoolRail, greenWoolRail, redWoolRail, blackWoolRail, enderPearlRail, chainRail, railsCraftingTable, armedRail, monorailDiamond, monorailGlowing, monorailGrayOrange, monorailNether, monorailObsidian, monorailRedGreen, monorailYellowBlue, monorailEmerald, monorailLapis, monorailGold, monorailPowered, monorailIce, monorailChain, monorailArmed, monorailEnderPearl;
    public static Block monorailWhite, monorailOrange, monorailMagenta, monorailLightblue, monorailYellow, monorailLime, monorailPink, monorailGray, monorailLightgray, monorailCyan, monorailPurple, monorailBlue, monorailBrown, monorailGreen, monorailRed, monorailBlack, railBrake;
    public static Block triplerailWhite, triplerailOrange, triplerailMagenta, triplerailLightblue, triplerailYellow, triplerailLime, triplerailPink, triplerailGray, triplerailLightgray, triplerailCyan, triplerailPurple, triplerailBlue, triplerailBrown, triplerailGreen, triplerailRed, triplerailBlack;
    public static Block triplerailDiamond, triplerailGlowing, triplerailGrayOrange, triplerailNether, triplerailObsidian, triplerailRedGreen, triplerailYellowBlue, triplerailEmerald, triplerailLapis, triplerailPowered, triplerailIce, triplerailChain, triplerailArmed, triplerailEnderPearl;
    public static Item minecartWhite, minecartOrange, minecartMagenta, minecartLightblue, minecartYellow, minecartLime, minecartPink, minecartGray, minecartLightgray, minecartCyan, minecartPurple, minecartBlue, minecartBrown, minecartGreen, minecartRed, minecartBlack;
    public static Item emeraldBar, diamondBar, obsidianBar, lapisBar, explosiveBar, ironNail, goldNail, diamondNail, emeraldNail, obsidianNail, netherrackNail, woolenNail, netherIngot, railIronBase, railDiamondBase, railObsidianBase, railNetherrackBase, railEmeraldBase, railLapisBase, railGoldBase, railArmedBase, railChainBase, railIceBase, railEnderPearlBase, obsidianChunk;
    //private GuiHandlerRailsCraftingTable guiHandlerRailsCraftingTable = new GuiHandlerRailsCraftingTable();

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        //Custom Blocks//
        //obsidianRail = new ObsidianRail(3001).setUnlocalizedName("obsidianRail");
        //diamondRail = new DiamondRail(3002).setUnlocalizedName("diamondRail");
        //lapisRail = new LapisRail(3003).setUnlocalizedName("lapisRail");
        //iceRail = new IceRail(3004).setUnlocalizedName("iceRail");
        //glowstoneRail = new GlowstoneRail(3005).setUnlocalizedName("glowstoneRail");
        //diamondNetherRail = new DiamondNetherRail(3006).setUnlocalizedName("diamondNetherRail");
        //diamondObsidianRail = new DiamondObsidianRail(3007).setUnlocalizedName("diamondObsidianRail");
        brickRail = new AllRails(3008).setUnlocalizedName("brickRail");//setBlockTextureName("expandedrails:BrickRail");
        //emeraldRail = new EmeraldRail(3009).setUnlocalizedName("emeraldRail");
        netherStarRail = new AllRails(3010).setUnlocalizedName("netherStarRail");//setBlockTextureName("expandedrails:NetherStarRail");
        //enderPearlRail = new EnderPearlRail(3011).setUnlocalizedName("enderPearlRail");
        //chainRail = new ChainRail(3012).setUnlocalizedName("chainRail");
        //armedRail = new ArmedRail(3013).setUnlocalizedName("armedRail");
        //railsCraftingTable = new RailsCraftingTable(2901).setUnlocalizedName("railsCraftingTable");
        //railBrake = new TileEntityRailBrake(railBrakeID, Material.rock).setUnlocalizedName("railBrake");
        //monorailDiamond = new MonorailDiamond(3128).setUnlocalizedName("monorailDiamond");
        //monorailGlowing = new MonorailGlowing(3130).setUnlocalizedName("monorailGlowing");
        monorailGrayOrange = new AllRails(3136).setUnlocalizedName("monorailGrayOrange");//setBlockTextureName("expandedrails:GrayOrangeMonorail");
        //monorailNether = new AllRails(3131).setUnlocalizedName("monorailNether");//setBlockTextureName("expandedrails:NetherMonorail");
        //monorailObsidian = new MonorailObsidian(3129).setUnlocalizedName("monorailObsidian");
        monorailRedGreen = new AllRails(3134).setUnlocalizedName("monorailRedGreen");//setBlockTextureName("expandedrails:RedGreenMonorail");
        monorailYellowBlue = new AllRails(3135).setUnlocalizedName("monorailYellowBlue");//setBlockTextureName("expandedrails:YellowBlueMonorail");
        //monorailEmerald = new MonorailEmerald(3132).setUnlocalizedName("monorailEmerald");
        //monorailLapis = new MonorailLapis(3133).setUnlocalizedName("monorailLapis");
        monorailGold = new AllRails(3137).setUnlocalizedName("monorailGold");//setBlockTextureName("expandedrails:GoldMonorail");
        //monorailPowered = new MonorailPowered(3138).setUnlocalizedName("monorailPowered");
        //monorailIce = new MonorailIce(3139).setUnlocalizedName("monorailIce");
        //monorailChain = new MonorailChain(3140).setUnlocalizedName("monorailChain");
        //monorailArmed = new MonorailArmed(3141).setUnlocalizedName("monorailArmed");
        //monorailEnderPearl = new MonorailEnderPearl(3142).setUnlocalizedName("monorailEnderPearl");
        //Triplerail//
        //triplerailDiamond = new TriplerailDiamond(3185).setUnlocalizedName("triplerailDiamond");//setBlockTextureName("expandedrails:DiamondTriplerail");
        //triplerailGlowing = new TriplerailGlowing(3186).setUnlocalizedName("triplerailGlowing");//setBlockTextureName("expandedrails:GlowTriplerail");
        triplerailNether = new AllRails(3187).setUnlocalizedName("triplerailNether");//setBlockTextureName("expandedrails:NetherTriplerail");
        triplerailObsidian = new AllRails(3188).setUnlocalizedName("triplerailObsidian");//setBlockTextureName("expandedrails:ObsidianTriplerail");
        //triplerailEmerald = new TriplerailEmerald(3189).setUnlocalizedName("triplerailEmerald");//setBlockTextureName("expandedrails:EmeraldTriplerail");
        //triplerailLapis = new TriplerailLapis(3190).setUnlocalizedName("triplerailLapis");//setBlockTextureName("expandedrails:LapisTriplerail");
        //triplerailPowered = new TriplerailPowered(3191).setUnlocalizedName("triplerailPowered");//setBlockTextureName("expandedrails:TriplerailPowered");
        //triplerailIce = new TriplerailIce(3192).setUnlocalizedName("triplerailIce");//setBlockTextureName("expandedrails:IceTriplerail");
        //triplerailChain = new TriplerailChain(3193).setUnlocalizedName("triplerailChain");//setBlockTextureName("expandedrails:ChainTriplerail");
        //triplerailArmed = new TriplerailArmed(3194).setUnlocalizedName("triplerailArmed");//setBlockTextureName("expandedrails:ArmedTriplerail");
        //triplerailEnderPearl = new TriplerailEnderPearl(3195).setUnlocalizedName("triplerailEnderPearl");//setBlockTextureName("expandedrails:EnderPearlTriplerail");
        //Wool Rails//
        whiteWoolRail = new AllRails(3081).setUnlocalizedName("whiteWoolRail");//setBlockTextureName("expandedrails:WhiteWoolRail");
        orangeWoolRail = new AllRails(3082).setUnlocalizedName("orangeWoolRail");//setBlockTextureName("expandedrails:OrangeWoolRail");
        magentaWoolRail = new AllRails(3083).setUnlocalizedName("magentaWoolRail");//setBlockTextureName("expandedrails:MagentaWoolRail");
        lightblueWoolRail = new AllRails(3084).setUnlocalizedName("lightblueWoolRail");//setBlockTextureName("expandedrails:LightBlueWoolRail");
        yellowWoolRail = new AllRails(3085).setUnlocalizedName("yellowWoolRail");//setBlockTextureName("expandedrails:YellowWoolRail");
        limeWoolRail = new AllRails(3086).setUnlocalizedName("limeWoolRail");//setBlockTextureName("expandedrails:LimeWoolRail");
        pinkWoolRail = new AllRails(3087).setUnlocalizedName("pinkWoolRail");//setBlockTextureName("expandedrails:PinkWoolRail");
        grayWoolRail = new AllRails(3088).setUnlocalizedName("grayWoolRail");//setBlockTextureName("expandedrails:GrayWoolRail");
        lightgrayWoolRail = new AllRails(3089).setUnlocalizedName("lightgrayWoolRail");//setBlockTextureName("expandedrails:LightGrayWoolRail");
        cyanWoolRail = new AllRails(3090).setUnlocalizedName("cyanWoolRail");//setBlockTextureName("expandedrails:CyanWoolRail");
        purpleWoolRail = new AllRails(3091).setUnlocalizedName("purpleWoolRail");//setBlockTextureName("expandedrails:PurpleWoolRail");
        blueWoolRail = new AllRails(3092).setUnlocalizedName("blueWoolRail");//setBlockTextureName("expandedrails:BlueWoolRail");
        brownWoolRail = new AllRails(3093).setUnlocalizedName("brownWoolRail");//setBlockTextureName("expandedrails:BrownWoolRail");
        greenWoolRail = new AllRails(3094).setUnlocalizedName("greenWoolRail");//setBlockTextureName("expandedrails:GreenWoolRail");
        redWoolRail = new AllRails(3095).setUnlocalizedName("redWoolRail");//setBlockTextureName("expandedrails:RedWoolRail");
        blackWoolRail = new AllRails(3096).setUnlocalizedName("blackWoolRail");//setBlockTextureName("expandedrails:BlackWoolRail");
        //Wool Monorails//
        monorailWhite = new AllRails(3169).setUnlocalizedName("monorailWhite");//setBlockTextureName("expandedrails:MonorailWhite");
        monorailOrange = new AllRails(3170).setUnlocalizedName("monorailOrange");//setBlockTextureName("expandedrails:MonorailOrange");
        monorailMagenta = new AllRails(3171).setUnlocalizedName("monorailMagenta");//setBlockTextureName("expandedrails:MonorailMagenta");
        monorailLightblue = new AllRails(3172).setUnlocalizedName("monorailLightblue");//setBlockTextureName("expandedrails:MonorailLightBlue");
        monorailYellow = new AllRails(3173).setUnlocalizedName("monorailYellow");//setBlockTextureName("expandedrails:MonorailYellow");
        monorailLime = new AllRails(3174).setUnlocalizedName("monorailLime");//setBlockTextureName("expandedrails:MonorailLime");
        monorailPink = new AllRails(3175).setUnlocalizedName("monorailPink");//setBlockTextureName("expandedrails:MonorailPink");
        monorailGray = new AllRails(3176).setUnlocalizedName("monorailGray");//setBlockTextureName("expandedrails:MonorailGray");
        monorailLightgray = new AllRails(3177).setUnlocalizedName("monorailLightgray");//setBlockTextureName("expandedrails:MonorailLightGray");
        monorailCyan = new AllRails(3178).setUnlocalizedName("monorailCyan");//setBlockTextureName("expandedrails:MonorailCyan");
        monorailPurple = new AllRails(3179).setUnlocalizedName("monorailPurple");//setBlockTextureName("expandedrails:MonorailPurple");
        monorailBlue = new AllRails(3180).setUnlocalizedName("monorailBlue");//setBlockTextureName("expandedrails:MonorailBlue");
        monorailBrown = new AllRails(3181).setUnlocalizedName("monorailBrown");//setBlockTextureName("expandedrails:MonorailBrown");
        monorailGreen = new AllRails(3182).setUnlocalizedName("monorailGreen");//setBlockTextureName("expandedrails:MonorailGreen");
        monorailRed = new AllRails(3183).setUnlocalizedName("monorailRed");//setBlockTextureName("expandedrails:MonorailRed");
        monorailBlack = new AllRails(3184).setUnlocalizedName("monorailBlack");//setBlockTextureName("expandedrails:MonorailBlack");
        //Wool Triplerails//
        triplerailWhite = new AllRails(3196).setUnlocalizedName("triplerailWhite");//setBlockTextureName("expandedrails:TriplerailWhite");
        triplerailOrange = new AllRails(3197).setUnlocalizedName("triplerailOrange");//setBlockTextureName("expandedrails:TriplerailOrange");
        triplerailMagenta = new AllRails(3198).setUnlocalizedName("triplerailMagenta");//setBlockTextureName("expandedrails:TriplerailMagenta");
        triplerailLightblue = new AllRails(3199).setUnlocalizedName("triplerailLightblue");//setBlockTextureName("expandedrails:TriplerailLightBlue");
        triplerailYellow = new AllRails(3200).setUnlocalizedName("triplerailYellow");//setBlockTextureName("expandedrails:TriplerailYellow");
        triplerailLime = new AllRails(3201).setUnlocalizedName("triplerailLime");//setBlockTextureName("expandedrails:TriplerailLime");
        triplerailPink = new AllRails(3202).setUnlocalizedName("triplerailPink");//setBlockTextureName("expandedrails:TriplerailPink");
        triplerailGray = new AllRails(3203).setUnlocalizedName("triplerailGray");//setBlockTextureName("expandedrails:TriplerailGray");
        triplerailLightgray = new AllRails(3204).setUnlocalizedName("triplerailLightgray");//setBlockTextureName("expandedrails:TriplerailLightGray");
        triplerailCyan = new AllRails(3205).setUnlocalizedName("triplerailCyan");//setBlockTextureName("expandedrails:TriplerailCyan");
        triplerailPurple = new AllRails(3206).setUnlocalizedName("triplerailPurple");//setBlockTextureName("expandedrails:TriplerailPurple");
        triplerailBlue = new AllRails(3207).setUnlocalizedName("triplerailBlue");//setBlockTextureName("expandedrails:TriplerailBlue");
        triplerailBrown = new AllRails(3208).setUnlocalizedName("triplerailBrown");//setBlockTextureName("expandedrails:TriplerailBrown");
        triplerailGreen = new AllRails(3209).setUnlocalizedName("triplerailGreen");//setBlockTextureName("expandedrails:TriplerailGreen");
        triplerailRed = new AllRails(3210).setUnlocalizedName("triplerailRed");//setBlockTextureName("expandedrails:TriplerailRed");
        triplerailBlack = new AllRails(3211).setUnlocalizedName("triplerailBlack");//setBlockTextureName("expandedrails:TriplerailBlack");
        //Custom Items//
        emeraldBar = new ExpandedItem(8001).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("emeraldBar");//setTextureName("expandedrails:EmeraldBar");
        diamondBar = new ExpandedItem(8000).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("diamondBar");//setTextureName("expandedrails:DiamondBar");
        obsidianBar = new ExpandedItem(8002).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianBar");//setTextureName("expandedrails:ObsidianBar");
        lapisBar = new ExpandedItem(8003).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("lapisBar");//setTextureName("expandedrails:LapisBar");
        explosiveBar = new ExpandedItem(8004).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("explosiveBar");//setTextureName("expandedrails:ExplosiveBar");
        ironNail = new ExpandedItem(8024).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("ironNail");//setTextureName("expandedrails:Nail_Iron");
        goldNail = new ExpandedItem(8025).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("goldNail");//setTextureName("expandedrails:Nail_Gold");
        diamondNail = new ExpandedItem(8026).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("diamondNail");//setTextureName("expandedrails:Nail_Diamond");
        emeraldNail = new ExpandedItem(8027).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("emeraldNail");//setTextureName("expandedrails:Nail_Emerald");
        obsidianNail = new ExpandedItem(8028).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianNail");//setTextureName("expandedrails:Nail_Obsidian");
        netherrackNail = new ExpandedItem(8029).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("netherrackNail");//setTextureName("expandedrails:Nail_Nether");
        woolenNail = new ExpandedItem(8031).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("woolenNail");//setTextureName("expandedrails:Nail_Woolen");
        netherIngot = new ExpandedItem(8051).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("netherIngot");//setTextureName("expandedrails:Nether_Ingot");
        railIronBase = new ExpandedItem(8062).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railIronBase");//setTextureName("expandedrails:Rail_Iron_Base");
        railDiamondBase = new ExpandedItem(8063).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railDiamondBase");//setTextureName("expandedrails:Rail_Diamond_Base");
        railObsidianBase = new ExpandedItem(8064).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railObsidianBase");//setTextureName("expandedrails:Rail_Obsidian_Base");
        railNetherrackBase = new ExpandedItem(8065).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railNetherrackBase");//setTextureName("expandedrails:Rail_Nether_Base");
        railEmeraldBase = new ExpandedItem(8066).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railEmeraldBase");//setTextureName("expandedrails:Rail_Emerald_Base");
        railLapisBase = new ExpandedItem(8067).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railLapisBase");//setTextureName("expandedrails:Rail_Lapis_Base");
        railGoldBase = new ExpandedItem(8068).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railGoldBase");//setTextureName("expandedrails:Rail_Gold_Base");
        railArmedBase = new ExpandedItem(8069).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railArmedBase");//setTextureName("expandedrails:Rail_Armed_Base");
        railChainBase = new ExpandedItem(8070).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railChainBase");//setTextureName("expandedrails:Rail_Chain_Base");
        railIceBase = new ExpandedItem(8071).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railIceBase");//setTextureName("expandedrails:Rail_Ice_Base");
        railEnderPearlBase = new ExpandedItem(8072).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railEnderPearlBase");//setTextureName("expandedrails:Rail_EnderPearl_Base");
        obsidianChunk = new ExpandedItem(7999).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianChunk");//setTextureName("expandedrails:ObsidianChunk");
        //minecartWhite = new ExpandedItem(minecartWhiteID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartWhite");//setTextureName("expandedrails:MinecartWhite");
        //minecartOrange = new ExpandedItem(minecartOrangeID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartOrange");//setTextureName("expandedrails:MinecartOrange");
        //minecartMagenta = new ExpandedItem(minecartMagentaID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartMagenta");//setTextureName("expandedrails:MinecartMagenta");
        //minecartLightblue = new ExpandedItem(minecartLightblueID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLightblue");//setTextureName("expandedrails:MinecartLightblue");
        //minecartYellow = new ExpandedItem(minecartYellowID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartYellow");//setTextureName("expandedrails:MinecartYellow");
        //minecartLime = new ExpandedItem(minecartLimeID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLime");//setTextureName("expandedrails:MinecartLime");
        //minecartPink = new ExpandedItem(minecartPinkID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartPink");//setTextureName("expandedrails:MinecartPink");
        //minecartGray = new ExpandedItem(minecartGrayID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartGray");//setTextureName("expandedrails:MinecartGray");
        //minecartLightgray = new ExpandedItem(minecartLightgrayID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLightgray");//setTextureName("expandedrails:MinecartLightgray");
        //minecartCyan = new ExpandedItem(minecartCyanID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartCyan");//setTextureName("expandedrails:MinecartCyan");
        //minecartPurple = new ExpandedItem(minecartPurpleID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartPurple");//setTextureName("expandedrails:MinecartPurple");
        //minecartBlue = new ExpandedItem(minecartBlueID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBlue");//setTextureName("expandedrails:MinecartBlue");
        //minecartBrown = new ExpandedItem(minecartBrownID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBrown");//setTextureName("expandedrails:MinecartBrown");
        //minecartGreen = new ExpandedItem(minecartGreenID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartGreen");//setTextureName("expandedrails:MinecartGreen");
        //minecartRed = new ExpandedItem(minecartRedID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartRed");//setTextureName("expandedrails:MinecartRed");
        //minecartBlack = new ExpandedItem(minecartBlackID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBlack");//setTextureName("expandedrails:MinecartBlack");
        //Block Registering//
        //LanguageRegistry.addName(obsidianRail, "Obsidian Rail");
        //MinecraftForge.setBlockHarvestLevel(obsidianRail, "pickaxe", 0);
        //GameRegistry.registerBlock(obsidianRail, "obsidianRail");
        //LanguageRegistry.addName(lapisRail, "Lapis Lazuli Rail");
        //MinecraftForge.setBlockHarvestLevel(lapisRail, "pickaxe", 0);
        //GameRegistry.registerBlock(lapisRail, "lapisRail");
        //LanguageRegistry.addName(diamondRail, "Diamond Rail");
        //MinecraftForge.setBlockHarvestLevel(diamondRail, "pickaxe", 0);
        //GameRegistry.registerBlock(diamondRail, "diamondRail");
        //LanguageRegistry.addName(diamondNetherRail, "Diamond-Nether Rail");
        //MinecraftForge.setBlockHarvestLevel(diamondNetherRail, "pickaxe", 0);
        //GameRegistry.registerBlock(diamondNetherRail, "diamondNetherRail");
        //LanguageRegistry.addName(diamondObsidianRail, "Diamond-Obsidian Rail");
        //MinecraftForge.setBlockHarvestLevel(diamondObsidianRail, "pickaxe", 0);
        //GameRegistry.registerBlock(diamondObsidianRail, "diamondoORail");
        //LanguageRegistry.addName(iceRail, "Ice Rail");
        //MinecraftForge.setBlockHarvestLevel(iceRail, "pickaxe", 0);
        //GameRegistry.registerBlock(iceRail, "iceRail");
        //LanguageRegistry.addName(glowstoneRail, "Glowing Rail");
        //MinecraftForge.setBlockHarvestLevel(glowstoneRail, "pickaxe", 0);
        //GameRegistry.registerBlock(glowstoneRail, "glowstoneRail");
        //LanguageRegistry.addName(whiteWoolRail, "White Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(whiteWoolRail, "pickaxe", 2);
        GameRegistry.registerBlock(whiteWoolRail, "whiteWoolRail");
        LanguageRegistry.addName(orangeWoolRail, "Orange Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(orangeWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(orangeWoolRail, "orangeWoolRail");
        LanguageRegistry.addName(magentaWoolRail, "Magenta Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(magentaWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(magentaWoolRail, "magentaWoolRail");
        LanguageRegistry.addName(lightblueWoolRail, "LightBlue Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(lightblueWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(lightblueWoolRail, "lightblueWoolRail");
        LanguageRegistry.addName(yellowWoolRail, "Yellow Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(yellowWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(yellowWoolRail, "yellowWoolRail");
        LanguageRegistry.addName(limeWoolRail, "Lime Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(limeWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(limeWoolRail, "limeWoolRail");
        LanguageRegistry.addName(pinkWoolRail, "Pink Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(pinkWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(pinkWoolRail, "pinkWoolRail");
        LanguageRegistry.addName(grayWoolRail, "Gray Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(grayWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(grayWoolRail, "grayWoolRail");
        LanguageRegistry.addName(lightgrayWoolRail, "LightGray Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(lightgrayWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(lightgrayWoolRail, "lightgrayWoolRail");
        LanguageRegistry.addName(cyanWoolRail, "Cyan Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(cyanWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(cyanWoolRail, "cyanWoolRail");
        LanguageRegistry.addName(purpleWoolRail, "Purple Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(purpleWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(purpleWoolRail, "purpleWoolRail");
        LanguageRegistry.addName(blueWoolRail, "Blue Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(blueWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(blueWoolRail, "blueWoolRail");
        LanguageRegistry.addName(brownWoolRail, "Brown Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(brownWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(brownWoolRail, "brownWoolRail");
        LanguageRegistry.addName(greenWoolRail, "Green Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(greenWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(greenWoolRail, "greenWoolRail");
        LanguageRegistry.addName(redWoolRail, "Red Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(redWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(redWoolRail, "redWoolRail");
        LanguageRegistry.addName(blackWoolRail, "Black Wool Rail");
        //MinecraftForge.setBlockHarvestLevel(blackWoolRail, "pickaxe", 0);
        GameRegistry.registerBlock(blackWoolRail, "blackWoolRail");
        LanguageRegistry.addName(brickRail, "Brick Rail");
        //MinecraftForge.setBlockHarvestLevel(brickRail, "pickaxe", 0);
        GameRegistry.registerBlock(brickRail, "brickRail");
        LanguageRegistry.addName(netherStarRail, "NetherStar Rail");
        //MinecraftForge.setBlockHarvestLevel(netherStarRail, "pickaxe", 0);
        GameRegistry.registerBlock(netherStarRail, "netherStarRail");
        //LanguageRegistry.addName(emeraldRail, "Emerald Rail");
        //MinecraftForge.setBlockHarvestLevel(emeraldRail, "pickaxe", 0);
        //GameRegistry.registerBlock(emeraldRail, "emeraldRail");
        //LanguageRegistry.addName(enderPearlRail, "EnderPearl Rail");
        //MinecraftForge.setBlockHarvestLevel(enderPearlRail, "pickaxe", 0);
        //GameRegistry.registerBlock(enderPearlRail, "enderPearlRail");
        //LanguageRegistry.addName(chainRail, "Chain Rail");
        //MinecraftForge.setBlockHarvestLevel(chainRail, "pickaxe", 0);
        //GameRegistry.registerBlock(chainRail, "chainRail");
        //LanguageRegistry.addName(armedRail, "Armed Rail");
        //MinecraftForge.setBlockHarvestLevel(armedRail, "pickaxe", 0);
        //GameRegistry.registerBlock(armedRail, "armedRail");
        //Monorail//
        //LanguageRegistry.addName(monorailDiamond, "Diamond Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailDiamond, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailDiamond, "monorailDiamond");
        //LanguageRegistry.addName(monorailGlowing, "Glowing Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailGlowing, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailGlowing, "monorailGlowing");
        LanguageRegistry.addName(monorailGrayOrange, "Gray-Orange Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailGrayOrange, "pickaxe", 0);
        GameRegistry.registerBlock(monorailGrayOrange, "monorailGrayOrange");
        //LanguageRegistry.addName(monorailNether, "Nether Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailNether, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailNether, "monorailNether");
        //LanguageRegistry.addName(monorailObsidian, "Obsidian Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailObsidian, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailObsidian, "monorailObsidian");
        LanguageRegistry.addName(monorailRedGreen, "Red-Green Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailRedGreen, "pickaxe", 0);
        GameRegistry.registerBlock(monorailRedGreen, "monorailRedGreen");
        LanguageRegistry.addName(monorailYellowBlue, "Yellow-Blue Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailYellowBlue, "pickaxe", 0);
        GameRegistry.registerBlock(monorailYellowBlue, "monorailYellowBlue");
        //LanguageRegistry.addName(monorailEmerald, "Emerald Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailEmerald, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailEmerald, "monorailEmerald");
        //LanguageRegistry.addName(monorailLapis, "Lapis Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailLapis, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailLapis, "monorailLapis");
        LanguageRegistry.addName(monorailGold, "Gold Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailGold, "pickaxe", 0);
        GameRegistry.registerBlock(monorailGold, "monorailGold");
        //LanguageRegistry.addName(monorailPowered, "Powered Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailPowered, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailPowered, "monorailPowered");
        //LanguageRegistry.addName(monorailIce, "Ice Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailIce, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailIce, "monorailIce");
        //LanguageRegistry.addName(monorailChain, "Chain Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailChain, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailChain, "monorailChain");
        //LanguageRegistry.addName(monorailArmed, "Armed Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailArmed, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailArmed, "monorailArmed");
        //LanguageRegistry.addName(monorailEnderPearl, "Ender Pearl Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailEnderPearl, "pickaxe", 0);
        //GameRegistry.registerBlock(monorailEnderPearl, "monorailEnderPearl");
        //Mono Wool Rails//
        LanguageRegistry.addName(monorailWhite, "White Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailWhite, "pickaxe", 0);
        GameRegistry.registerBlock(monorailWhite, "monorailWhite");
        LanguageRegistry.addName(monorailOrange, "Orange Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailOrange, "pickaxe", 0);
        GameRegistry.registerBlock(monorailOrange, "monorailOrange");
        LanguageRegistry.addName(monorailMagenta, "Magenta Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailMagenta, "pickaxe", 0);
        GameRegistry.registerBlock(monorailMagenta, "monorailMagenta");
        LanguageRegistry.addName(monorailLightblue, "LightBlue Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailLightblue, "pickaxe", 0);
        GameRegistry.registerBlock(monorailLightblue, "monorailLightblue");
        LanguageRegistry.addName(monorailYellow, "Yellow Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailYellow, "pickaxe", 0);
        GameRegistry.registerBlock(monorailYellow, "monorailYellow");
        LanguageRegistry.addName(monorailLime, "Lime Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailLime, "pickaxe", 0);
        GameRegistry.registerBlock(monorailLime, "monorailLime");
        LanguageRegistry.addName(monorailPink, "Pink Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailPink, "pickaxe", 0);
        GameRegistry.registerBlock(monorailPink, "monorailPink");
        LanguageRegistry.addName(monorailGray, "Gray Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailGray, "pickaxe", 0);
        GameRegistry.registerBlock(monorailGray, "monorailGray");
        LanguageRegistry.addName(monorailLightgray, "LightGray Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailLightgray, "pickaxe", 0);
        GameRegistry.registerBlock(monorailLightgray, "monorailLightgray");
        LanguageRegistry.addName(monorailCyan, "Cyan Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailCyan, "pickaxe", 0);
        GameRegistry.registerBlock(monorailCyan, "monorailCyan");
        LanguageRegistry.addName(monorailPurple, "Purple Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailPurple, "pickaxe", 0);
        GameRegistry.registerBlock(monorailPurple, "monorailPurple");
        LanguageRegistry.addName(monorailBlue, "Blue Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailBlue, "pickaxe", 0);
        GameRegistry.registerBlock(monorailBlue, "monorailBlue");
        LanguageRegistry.addName(monorailBrown, "Brown Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailBrown, "pickaxe", 0);
        GameRegistry.registerBlock(monorailBrown, "monorailBrown");
        LanguageRegistry.addName(monorailGreen, "Green Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailGreen, "pickaxe", 0);
        GameRegistry.registerBlock(monorailGreen, "monorailGreen");
        LanguageRegistry.addName(monorailRed, "Red Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailRed, "pickaxe", 0);
        GameRegistry.registerBlock(monorailRed, "monorailRed");
        LanguageRegistry.addName(monorailBlack, "Black Monorail");
        //MinecraftForge.setBlockHarvestLevel(monorailBlack, "pickaxe", 0);
        GameRegistry.registerBlock(monorailBlack, "monorailBlack");
        //Triplerail//
        //LanguageRegistry.addName(triplerailDiamond, "Diamond Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailDiamond, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailDiamond, "triplerailDiamond");
        //LanguageRegistry.addName(triplerailGlowing, "Glowing Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailGlowing, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailGlowing, "triplerailGlowing");
        LanguageRegistry.addName(triplerailNether, "Nether Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailNether, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailNether, "triplerailNether");
        LanguageRegistry.addName(triplerailObsidian, "Obsidian Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailObsidian, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailObsidian, "triplerailObsidian");
        //LanguageRegistry.addName(triplerailEmerald, "Emerald Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailEmerald, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailEmerald, "triplerailEmerald");
        //LanguageRegistry.addName(triplerailLapis, "Lapis Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailLapis, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailLapis, "triplerailLapis");
        //LanguageRegistry.addName(triplerailPowered, "Powered Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailPowered, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailPowered, "triplerailPowered");
        //LanguageRegistry.addName(triplerailIce, "Ice Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailIce, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailIce, "triplerailIce");
        //LanguageRegistry.addName(triplerailChain, "Chain Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailChain, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailChain, "triplerailChain");
        //LanguageRegistry.addName(triplerailArmed, "Armed Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailArmed, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailArmed, "triplerailArmed");
        //LanguageRegistry.addName(triplerailEnderPearl, "Ender Pearl Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailEnderPearl, "pickaxe", 0);
        //GameRegistry.registerBlock(triplerailEnderPearl, "triplerailEnderPearl");
        //Triple Wool Rails//
        LanguageRegistry.addName(triplerailWhite, "White Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailWhite, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailWhite, "triplerailWhite");
        LanguageRegistry.addName(triplerailOrange, "Orange Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailOrange, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailOrange, "triplerailOrange");
        LanguageRegistry.addName(triplerailMagenta, "Magenta Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailMagenta, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailMagenta, "triplerailMagenta");
        LanguageRegistry.addName(triplerailLightblue, "LightBlue Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailLightblue, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailLightblue, "triplerailLightblue");
        LanguageRegistry.addName(triplerailYellow, "Yellow Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailYellow, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailYellow, "triplerailYellow");
        LanguageRegistry.addName(triplerailLime, "Lime Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailLime, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailLime, "triplerailLime");
        LanguageRegistry.addName(triplerailPink, "Pink Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailPink, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailPink, "triplerailPink");
        LanguageRegistry.addName(triplerailGray, "Gray Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailGray, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailGray, "triplerailGray");
        LanguageRegistry.addName(triplerailLightgray, "LightGray Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailLightgray, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailLightgray, "triplerailLightgray");
        LanguageRegistry.addName(triplerailCyan, "Cyan Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailCyan, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailCyan, "triplerailCyan");
        LanguageRegistry.addName(triplerailPurple, "Purple Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailPurple, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailPurple, "triplerailPurple");
        LanguageRegistry.addName(triplerailBlue, "Blue Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailBlue, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailBlue, "triplerailBlue");
        LanguageRegistry.addName(triplerailBrown, "Brown Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailBrown, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailBrown, "triplerailBrown");
        LanguageRegistry.addName(triplerailGreen, "Green Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailGreen, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailGreen, "triplerailGreen");
        LanguageRegistry.addName(triplerailRed, "Red Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailRed, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailRed, "triplerailRed");
        LanguageRegistry.addName(triplerailBlack, "Black Triplerail");
        //MinecraftForge.setBlockHarvestLevel(triplerailBlack, "pickaxe", 0);
        GameRegistry.registerBlock(triplerailBlack, "triplerailBlack");
        
        //LanguageRegistry.addName(railsCraftingTable, "Rails Crafting Table");
        //GameRegistry.registerBlock(railsCraftingTable, "railsCraftingTable");
        
        //LanguageRegistry.addName(railBrake, "Rail Brake");
        //GameRegistry.registerBlock(railBrake, "railBrake");
        
        
        
        //NetworkRegistry.INSTANCE.registerGuiHandler(this, guiHandlerRailsCraftingTable);
        
        
        
        //Item Registering//
        LanguageRegistry.addName(obsidianBar, "Obsidian Bar");
        GameRegistry.registerItem(obsidianBar, "obsidianBar");
        LanguageRegistry.addName(emeraldBar, "Emerald Bar");
        GameRegistry.registerItem(emeraldBar, "emeraldBar");
        LanguageRegistry.addName(diamondBar, "Diamond Bar");
        GameRegistry.registerItem(diamondBar, "diamondBar");
        LanguageRegistry.addName(lapisBar, "Lapis Lazuli Bar");
        GameRegistry.registerItem(lapisBar, "lapisBar");
        LanguageRegistry.addName(explosiveBar, "Explosive Bar");
        GameRegistry.registerItem(explosiveBar, "explosiveBar");
        LanguageRegistry.addName(ironNail, "Iron Nail");
        GameRegistry.registerItem(ironNail, "ironNail");
        LanguageRegistry.addName(goldNail, "Gold Nail");
        GameRegistry.registerItem(goldNail, "goldNail");
        LanguageRegistry.addName(diamondNail, "Diamond Nail");
        GameRegistry.registerItem(diamondNail, "diamondNail");
        LanguageRegistry.addName(emeraldNail, "Emerald Nail");
        GameRegistry.registerItem(emeraldNail, "emeraldNail");
        LanguageRegistry.addName(obsidianNail, "Obsidian Nail");
        GameRegistry.registerItem(obsidianNail, "obsidianNail");
        LanguageRegistry.addName(netherrackNail, "Netherrack Nail");
        GameRegistry.registerItem(netherrackNail, "netherrackNail");
        LanguageRegistry.addName(woolenNail, "Woolen Nail");
        GameRegistry.registerItem(woolenNail, "woolenNail");
        LanguageRegistry.addName(netherIngot, "Netherrack Ingot");
        GameRegistry.registerItem(netherIngot, "netherIngot");
        LanguageRegistry.addName(railIronBase, "Iron Rail Base");
        GameRegistry.registerItem(railIronBase, "railIronBase");
        LanguageRegistry.addName(railDiamondBase, "Diamond Rail Base");
        GameRegistry.registerItem(railDiamondBase, "railDiamondBase");
        LanguageRegistry.addName(railObsidianBase, "Obsidian Rail Base");
        GameRegistry.registerItem(railObsidianBase, "railObsidianBase");
        LanguageRegistry.addName(railNetherrackBase, "Nether Rail Base");
        GameRegistry.registerItem(railNetherrackBase, "railNetherrackBase");
        LanguageRegistry.addName(railEmeraldBase, "Emerald Rail Base");
        GameRegistry.registerItem(railEmeraldBase, "railEmeraldBase");
        LanguageRegistry.addName(railLapisBase, "Lapis Lazuli Rail Base");
        GameRegistry.registerItem(railLapisBase, "railLapisBase");
        LanguageRegistry.addName(railGoldBase, "Golden Rail Base");
        GameRegistry.registerItem(railGoldBase, "railGoldBase");
        LanguageRegistry.addName(railChainBase, "Chain Rail Base");
        GameRegistry.registerItem(railChainBase, "railChainBase");
        LanguageRegistry.addName(railArmedBase, "Armed Rail Base");
        GameRegistry.registerItem(railArmedBase, "railArmedBase");
        LanguageRegistry.addName(railIceBase, "Ice Rail Base");
        GameRegistry.registerItem(railIceBase, "railIceBase");
        LanguageRegistry.addName(railEnderPearlBase, "Ender Pearl Rail Base");
        GameRegistry.registerItem(railEnderPearlBase, "railEnderPearlBase");
        LanguageRegistry.addName(obsidianChunk, "Obsidian Chunk");
        GameRegistry.registerItem(obsidianChunk, "obsidianChunk");
        //LanguageRegistry.addName(minecartWhite, "Minecart White");
        //GameRegistry.registerItem(minecartWhite, "minecartWhite");
        //LanguageRegistry.addName(minecartOrange, "Minecart Orange");
        //GameRegistry.registerItem(minecartOrange, "minecartOrange");
        //LanguageRegistry.addName(minecartMagenta, "Minecart Magenta");
        //GameRegistry.registerItem(minecartMagenta, "minecartMagenta");
        //LanguageRegistry.addName(minecartLightblue, "Minecart Lightblue");
        //GameRegistry.registerItem(minecartLightblue, "minecartLightblue");
        //LanguageRegistry.addName(minecartYellow, "Minecart Yellow");
        //GameRegistry.registerItem(minecartYellow, "minecartYellow");
        //LanguageRegistry.addName(minecartLime, "Minecart Lime");
        //GameRegistry.registerItem(minecartLime, "minecartLime");
        //LanguageRegistry.addName(minecartPink, "Minecart Pink");
        //GameRegistry.registerItem(minecartPink, "minecartPink");
        //LanguageRegistry.addName(minecartGray, "Minecart Gray");
        //GameRegistry.registerItem(minecartGray, "minecartGray");
        //LanguageRegistry.addName(minecartLightgray, "Minecart Lightgray");
        //GameRegistry.registerItem(minecartLightgray, "minecartLightgray");
        //LanguageRegistry.addName(minecartCyan, "Minecart Cyan");
        //GameRegistry.registerItem(minecartCyan, "minecartCyan");
        //LanguageRegistry.addName(minecartPurple, "Minecart Purple");
        //GameRegistry.registerItem(minecartPurple, "minecartPurple");
        //LanguageRegistry.addName(minecartBlue, "Minecart Blue");
        //GameRegistry.registerItem(minecartBlue, "minecartBlue");
        //LanguageRegistry.addName(minecartBrown, "Minecart Brown");
        //GameRegistry.registerItem(minecartBrown, "minecartBrown");
        //LanguageRegistry.addName(minecartGreen, "Minecart Green");
        //GameRegistry.registerItem(minecartGreen, "minecartGreen");
        //LanguageRegistry.addName(minecartRed, "Minecart Red");
        //GameRegistry.registerItem(minecartRed, "minecartRed");
        //LanguageRegistry.addName(minecartBlack, "Minecart Black");
        //GameRegistry.registerItem(minecartBlack, "minecartBlack");
        
        //Tile Entity Registering//
        
        //GameRegistry.registerPlayerTracker(new PlayerJoin());
        
        //Recipe Registering//
        
        //Block Recipes//
        GameRegistry.addRecipe(new ItemStack(whiteWoolRail, 16), "x x", "xyx", "x x", 'x', Stacks.ironIngotStack, 'y', Stacks.whiteclothStack);
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
        GameRegistry.addRecipe(new ItemStack(railsCraftingTable, 1), "xyx", "zzz", "aba", 'x', Stacks.ironIngotStack, 'y', Stacks.railStack, 'z', Stacks.greenclothStack, 'a', Stacks.ironNailStack, 'b', Stacks.workbenchStack);
        //Item Recipes//
        GameRegistry.addRecipe(new ItemStack(obsidianBar, 8), "  x", " x ", "x  ", 'x', Stacks.obsidianChunkStack);
        GameRegistry.addRecipe(new ItemStack(diamondBar, 8), "  x", " x ", "x  ", 'x', Stacks.diamondStack);
        GameRegistry.addRecipe(new ItemStack(emeraldBar, 8), "  x", " x ", "x  ", 'x', Stacks.emeraldStack);
        GameRegistry.addRecipe(new ItemStack(lapisBar, 8), "  x", " x ", "x  ", 'x', Stacks.lapisStack);
        GameRegistry.addRecipe(new ItemStack(explosiveBar, 8), "  x", " y ", "x  ", 'x', Stacks.quartzStack, 'y', Stacks.gunpowderStack);
        GameRegistry.addRecipe(new ItemStack(netherIngot, 1), "x ", " x", 'x', Stacks.netherrackStack);
        GameRegistry.addRecipe(new ItemStack(ironNail, 4), " x", "y ", 'x', Stacks.ironIngotStack, 'y', Stacks.stoneStack);
        GameRegistry.addRecipe(new ItemStack(goldNail, 4), " x", "y ", 'x', Stacks.goldIngotStack, 'y', Stacks.stoneStack);
        GameRegistry.addRecipe(new ItemStack(diamondNail, 8), " x", "y ", 'x', Stacks.diamondStack, 'y', Stacks.stoneStack);
        GameRegistry.addRecipe(new ItemStack(emeraldNail, 8), " x", "y ", 'x', Stacks.emeraldStack, 'y', Stacks.stoneStack);
        GameRegistry.addRecipe(new ItemStack(obsidianNail, 4), " x", "y ", 'x', Stacks.obsidianChunkStack, 'y', Stacks.stoneStack);
        GameRegistry.addRecipe(new ItemStack(netherrackNail, 4), " x", "y ", 'x', Stacks.netherIngotStack, 'y', Stacks.stoneStack);
        GameRegistry.addRecipe(new ItemStack(woolenNail, 4), " x", "y ", 'x', Stacks.whiteclothStack, 'y', Stacks.stoneStack);
        GameRegistry.addRecipe(new ItemStack(railIronBase, 4), "x", "x", "x", 'x', Stacks.ironIngotStack);
        GameRegistry.addRecipe(new ItemStack(railDiamondBase, 4), "x", "x", "x", 'x', Stacks.diamondBarStack);
        GameRegistry.addRecipe(new ItemStack(railObsidianBase, 4), "x", "x", "x", 'x', Stacks.obsidianBarStack);
        GameRegistry.addRecipe(new ItemStack(railNetherrackBase, 4), "x", "x", "x", 'x', Stacks.netherIngotStack);
        GameRegistry.addRecipe(new ItemStack(railEmeraldBase, 4), "x", "x", "x", 'x', Stacks.emeraldBarStack);
        GameRegistry.addRecipe(new ItemStack(railLapisBase, 4), "x", "x", "x", 'x', Stacks.lapisBarStack);
        GameRegistry.addRecipe(new ItemStack(railGoldBase, 4), "x", "x", "x", 'x', Stacks.goldIngotStack);
        GameRegistry.addRecipe(new ItemStack(railArmedBase, 8), "x", "x", "x", 'x', Stacks.explosiveBarStack);
        GameRegistry.addRecipe(new ItemStack(railChainBase, 4), "x", "y", "x", 'x', Stacks.ironIngotStack, 'y', Stacks.obsidianChunkStack);
        GameRegistry.addRecipe(new ItemStack(railIceBase, 4), "x", "x", "x", 'x', Stacks.iceStack);
        GameRegistry.addRecipe(new ItemStack(railEnderPearlBase, 8), "x", "x", "x", 'x', Stacks.enderPearlStack);
        GameRegistry.addRecipe(new ItemStack(Blocks.ice, 16), " x ", "xyx", " x ", 'x', Stacks.snowStack, 'y', Stacks.waterBucketStack);
        GameRegistry.addShapelessRecipe(new ItemStack(obsidianChunk, 4), Stacks.obsidianStack, Stacks.cobblestoneStack);
        //Tabs
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabNormalRails", "en_US", "Normal Rails");
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
        //diamondRail.setCreativeTab(this.tabNormalRails);
        //emeraldRail.setCreativeTab(this.tabNormalRails);
        //obsidianRail.setCreativeTab(this.tabNormalRails);
        //lapisRail.setCreativeTab(this.tabNormalRails);
        //glowstoneRail.setCreativeTab(this.tabNormalRails);
        //enderPearlRail.setCreativeTab(this.tabNormalRails);
        //armedRail.setCreativeTab(this.tabNormalRails);
        //chainRail.setCreativeTab(this.tabNormalRails);
        //iceRail.setCreativeTab(this.tabNormalRails);
        //diamondNetherRail.setCreativeTab(this.tabNormalRails);
        //diamondObsidianRail.setCreativeTab(this.tabNormalRails);
        brickRail.setCreativeTab(this.tabNormalRails);
        netherStarRail.setCreativeTab(this.tabNormalRails);
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabMonoRails", "en_US", "Mono Rails");
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
        //monorailDiamond.setCreativeTab(this.tabMonoRails);
        //monorailEmerald.setCreativeTab(this.tabMonoRails);
        //monorailObsidian.setCreativeTab(this.tabMonoRails);
        //monorailLapis.setCreativeTab(this.tabMonoRails);
        //monorailGlowing.setCreativeTab(this.tabMonoRails);
        //monorailEnderPearl.setCreativeTab(this.tabMonoRails);
        //monorailArmed.setCreativeTab(this.tabMonoRails);
        //monorailChain.setCreativeTab(this.tabMonoRails);
        //monorailIce.setCreativeTab(this.tabMonoRails);
        //monorailPowered.setCreativeTab(this.tabMonoRails);
        monorailGold.setCreativeTab(this.tabMonoRails);
        //monorailNether.setCreativeTab(this.tabMonoRails);
        monorailRedGreen.setCreativeTab(this.tabMonoRails);
        monorailYellowBlue.setCreativeTab(this.tabMonoRails);
        monorailGrayOrange.setCreativeTab(this.tabMonoRails);
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabTripleRails", "en_US", "Triple Rails");
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
        //triplerailDiamond.setCreativeTab(this.tabTripleRails);
        //triplerailEmerald.setCreativeTab(this.tabTripleRails);
        //triplerailObsidian.setCreativeTab(this.tabTripleRails);
        //triplerailLapis.setCreativeTab(this.tabTripleRails);
        //triplerailGlowing.setCreativeTab(this.tabTripleRails);
        //triplerailEnderPearl.setCreativeTab(this.tabTripleRails);
        //triplerailArmed.setCreativeTab(this.tabTripleRails);
        //triplerailChain.setCreativeTab(this.tabTripleRails);
        //triplerailIce.setCreativeTab(this.tabTripleRails);
        //triplerailPowered.setCreativeTab(this.tabTripleRails);
        triplerailNether.setCreativeTab(this.tabTripleRails);
        proxy.registerRenderers();
//GameRegistry.registerTileEntity(TileEntityRailBrakeEntity.class, "railBrake");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}