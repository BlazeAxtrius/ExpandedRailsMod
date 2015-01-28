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
import net.minecraftforge.fml.relauncher.Side;

import com.expanded.rails.mod.blocks.RailsCraftingTable;
import com.expanded.rails.mod.gui.GuiHandlerRailsCraftingTable;
import com.expanded.rails.mod.items.MinecartWhite;
import com.expanded.rails.mod.rails.AllRails;
import com.expanded.rails.mod.rails.ArmedRail;
import com.expanded.rails.mod.rails.ChainRail;
import com.expanded.rails.mod.rails.DiamondNetherRail;
import com.expanded.rails.mod.rails.DiamondObsidianRail;
import com.expanded.rails.mod.rails.DiamondRail;
import com.expanded.rails.mod.rails.EmeraldRail;
import com.expanded.rails.mod.rails.EnderPearlRail;
import com.expanded.rails.mod.rails.GlowstoneRail;
import com.expanded.rails.mod.rails.IceRail;
import com.expanded.rails.mod.rails.LapisRail;
import com.expanded.rails.mod.rails.MonorailArmed;
import com.expanded.rails.mod.rails.MonorailChain;
import com.expanded.rails.mod.rails.MonorailDiamond;
import com.expanded.rails.mod.rails.MonorailEmerald;
import com.expanded.rails.mod.rails.MonorailEnderPearl;
import com.expanded.rails.mod.rails.MonorailGlowing;
import com.expanded.rails.mod.rails.MonorailIce;
import com.expanded.rails.mod.rails.MonorailLapis;
import com.expanded.rails.mod.rails.MonorailObsidian;
import com.expanded.rails.mod.rails.MonorailPowered;
import com.expanded.rails.mod.rails.ObsidianRail;
import com.expanded.rails.mod.rails.TriplerailArmed;
import com.expanded.rails.mod.rails.TriplerailChain;
import com.expanded.rails.mod.rails.TriplerailDiamond;
import com.expanded.rails.mod.rails.TriplerailEmerald;
import com.expanded.rails.mod.rails.TriplerailEnderPearl;
import com.expanded.rails.mod.rails.TriplerailGlowing;
import com.expanded.rails.mod.rails.TriplerailIce;
import com.expanded.rails.mod.rails.TriplerailLapis;
import com.expanded.rails.mod.rails.TriplerailPowered;
//import expanded.rails.mod.entity.TileEntityRailBrake;
//import expanded.rails.mod.entity.TileEntityRailBrakeEntity;



@Mod(modid = "ExpandedRailsMod", name = "Expanded Rails Mod", version = "1.4.3")
public class ERMBase
{
	
	public static final String modid = "ExpandedRailsMod";
	
    // The instance of your mod that Forge uses.
    @Instance("ExpandedRailsMod")
    public static ERMBase instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "com.expanded.rails.mod.client.ClientProxy", serverSide = "com.expanded.rails.mod.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabNormalRails = new CreativeTabs("tabNormalRails") {
        public ItemStack getIconItemStack() {
                return new ItemStack(ERMBase.diamondRail, 1, 0);
        }

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
};
    public static CreativeTabs tabMonoRails = new CreativeTabs("tabMonoRails") {
        public ItemStack getIconItemStack() {
                return new ItemStack(ERMBase.monorailDiamond, 1, 0);
        }

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return null;
		}
};
	public static CreativeTabs tabTripleRails = new CreativeTabs("tabTripleRails") {
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
    private GuiHandlerRailsCraftingTable guiHandlerRailsCraftingTable = new GuiHandlerRailsCraftingTable();

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        //Custom Blocks//
        // DrCyano: I updated the ObsidianRail block. Apply the same changes to all other blocks and items
    	obsidianRail = registerBlock(new ObsidianRail(),"obsidianRail");
    	if(event.getSide() == Side.CLIENT){
    		// this part would normally be in the client proxy
    		// though I'd probably put it in the registerBlock(...) method
    		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    				.register(net.minecraft.item.Item.getItemFromBlock(obsidianRail), 0, 
    				new ModelResourceLocation(modid+":"+"obsidianRail", "inventory"));
    	}
		
    	
        diamondRail = new DiamondRail(3002).setBlockName("diamondRail");
        lapisRail = new LapisRail(3003).setBlockName("lapisRail");
        iceRail = new IceRail(3004).setBlockName("iceRail");
        glowstoneRail = new GlowstoneRail(3005).setBlockName("glowstoneRail");
        diamondNetherRail = new DiamondNetherRail(3006).setBlockName("diamondNetherRail");
        diamondObsidianRail = new DiamondObsidianRail(3007).setBlockName("diamondObsidianRail");
        brickRail = new AllRails(3008).setBlockName("brickRail").setBlockTextureName("expandedrails:BrickRail");
        emeraldRail = new EmeraldRail(3009).setBlockName("emeraldRail");
        netherStarRail = new AllRails(3010).setBlockName("netherStarRail").setBlockTextureName("expandedrails:NetherStarRail");
        enderPearlRail = new EnderPearlRail(3011).setBlockName("enderPearlRail");
        chainRail = new ChainRail(3012).setBlockName("chainRail");
        armedRail = new ArmedRail(3013).setBlockName("armedRail");
        railsCraftingTable = new RailsCraftingTable(2901).setBlockName("railsCraftingTable");
        //railBrake = new TileEntityRailBrake(railBrakeID, Material.rock).setBlockName("railBrake");
        monorailDiamond = new MonorailDiamond(3128).setBlockName("monorailDiamond");
        monorailGlowing = new MonorailGlowing(3130).setBlockName("monorailGlowing");
        monorailGrayOrange = new AllRails(3136).setBlockName("monorailGrayOrange").setBlockTextureName("expandedrails:GrayOrangeMonorail");
        monorailNether = new AllRails(3131).setBlockName("monorailNether").setBlockTextureName("expandedrails:NetherMonorail");
        monorailObsidian = new MonorailObsidian(3129).setBlockName("monorailObsidian");
        monorailRedGreen = new AllRails(3134).setBlockName("monorailRedGreen").setBlockTextureName("expandedrails:RedGreenMonorail");
        monorailYellowBlue = new AllRails(3135).setBlockName("monorailYellowBlue").setBlockTextureName("expandedrails:YellowBlueMonorail");
        monorailEmerald = new MonorailEmerald(3132).setBlockName("monorailEmerald");
        monorailLapis = new MonorailLapis(3133).setBlockName("monorailLapis");
        monorailGold = new AllRails(3137).setBlockName("monorailGold").setBlockTextureName("expandedrails:GoldMonorail");
        monorailPowered = new MonorailPowered(3138).setBlockName("monorailPowered");
        monorailIce = new MonorailIce(3139).setBlockName("monorailIce");
        monorailChain = new MonorailChain(3140).setBlockName("monorailChain");
        monorailArmed = new MonorailArmed(3141).setBlockName("monorailArmed");
        monorailEnderPearl = new MonorailEnderPearl(3142).setBlockName("monorailEnderPearl");
        //Triplerail//
        triplerailDiamond = new TriplerailDiamond(3185).setBlockName("triplerailDiamond").setBlockTextureName("expandedrails:DiamondTriplerail");
        triplerailGlowing = new TriplerailGlowing(3186).setBlockName("triplerailGlowing").setBlockTextureName("expandedrails:GlowTriplerail");
        triplerailNether = new AllRails(3187).setBlockName("triplerailNether").setBlockTextureName("expandedrails:NetherTriplerail");
        triplerailObsidian = new AllRails(3188).setBlockName("triplerailObsidian").setBlockTextureName("expandedrails:ObsidianTriplerail");
        triplerailEmerald = new TriplerailEmerald(3189).setBlockName("triplerailEmerald").setBlockTextureName("expandedrails:EmeraldTriplerail");
        triplerailLapis = new TriplerailLapis(3190).setBlockName("triplerailLapis").setBlockTextureName("expandedrails:LapisTriplerail");
        triplerailPowered = new TriplerailPowered(3191).setBlockName("triplerailPowered").setBlockTextureName("expandedrails:TriplerailPowered");
        triplerailIce = new TriplerailIce(3192).setBlockName("triplerailIce").setBlockTextureName("expandedrails:IceTriplerail");
        triplerailChain = new TriplerailChain(3193).setBlockName("triplerailChain").setBlockTextureName("expandedrails:ChainTriplerail");
        triplerailArmed = new TriplerailArmed(3194).setBlockName("triplerailArmed").setBlockTextureName("expandedrails:ArmedTriplerail");
        triplerailEnderPearl = new TriplerailEnderPearl(3195).setBlockName("triplerailEnderPearl").setBlockTextureName("expandedrails:EnderPearlTriplerail");
        //Wool Rails//
        whiteWoolRail = new AllRails(3081).setBlockName("whiteWoolRail").setBlockTextureName("expandedrails:WhiteWoolRail");
        orangeWoolRail = new AllRails(3082).setBlockName("orangeWoolRail").setBlockTextureName("expandedrails:OrangeWoolRail");
        magentaWoolRail = new AllRails(3083).setBlockName("magentaWoolRail").setBlockTextureName("expandedrails:MagentaWoolRail");
        lightblueWoolRail = new AllRails(3084).setBlockName("lightblueWoolRail").setBlockTextureName("expandedrails:LightBlueWoolRail");
        yellowWoolRail = new AllRails(3085).setBlockName("yellowWoolRail").setBlockTextureName("expandedrails:YellowWoolRail");
        limeWoolRail = new AllRails(3086).setBlockName("limeWoolRail").setBlockTextureName("expandedrails:LimeWoolRail");
        pinkWoolRail = new AllRails(3087).setBlockName("pinkWoolRail").setBlockTextureName("expandedrails:PinkWoolRail");
        grayWoolRail = new AllRails(3088).setBlockName("grayWoolRail").setBlockTextureName("expandedrails:GrayWoolRail");
        lightgrayWoolRail = new AllRails(3089).setBlockName("lightgrayWoolRail").setBlockTextureName("expandedrails:LightGrayWoolRail");
        cyanWoolRail = new AllRails(3090).setBlockName("cyanWoolRail").setBlockTextureName("expandedrails:CyanWoolRail");
        purpleWoolRail = new AllRails(3091).setBlockName("purpleWoolRail").setBlockTextureName("expandedrails:PurpleWoolRail");
        blueWoolRail = new AllRails(3092).setBlockName("blueWoolRail").setBlockTextureName("expandedrails:BlueWoolRail");
        brownWoolRail = new AllRails(3093).setBlockName("brownWoolRail").setBlockTextureName("expandedrails:BrownWoolRail");
        greenWoolRail = new AllRails(3094).setBlockName("greenWoolRail").setBlockTextureName("expandedrails:GreenWoolRail");
        redWoolRail = new AllRails(3095).setBlockName("redWoolRail").setBlockTextureName("expandedrails:RedWoolRail");
        blackWoolRail = new AllRails(3096).setBlockName("blackWoolRail").setBlockTextureName("expandedrails:BlackWoolRail");
        //Wool Monorails//
        monorailWhite = new AllRails(3169).setBlockName("monorailWhite").setBlockTextureName("expandedrails:MonorailWhite");
        monorailOrange = new AllRails(3170).setBlockName("monorailOrange").setBlockTextureName("expandedrails:MonorailOrange");
        monorailMagenta = new AllRails(3171).setBlockName("monorailMagenta").setBlockTextureName("expandedrails:MonorailMagenta");
        monorailLightblue = new AllRails(3172).setBlockName("monorailLightblue").setBlockTextureName("expandedrails:MonorailLightBlue");
        monorailYellow = new AllRails(3173).setBlockName("monorailYellow").setBlockTextureName("expandedrails:MonorailYellow");
        monorailLime = new AllRails(3174).setBlockName("monorailLime").setBlockTextureName("expandedrails:MonorailLime");
        monorailPink = new AllRails(3175).setBlockName("monorailPink").setBlockTextureName("expandedrails:MonorailPink");
        monorailGray = new AllRails(3176).setBlockName("monorailGray").setBlockTextureName("expandedrails:MonorailGray");
        monorailLightgray = new AllRails(3177).setBlockName("monorailLightgray").setBlockTextureName("expandedrails:MonorailLightGray");
        monorailCyan = new AllRails(3178).setBlockName("monorailCyan").setBlockTextureName("expandedrails:MonorailCyan");
        monorailPurple = new AllRails(3179).setBlockName("monorailPurple").setBlockTextureName("expandedrails:MonorailPurple");
        monorailBlue = new AllRails(3180).setBlockName("monorailBlue").setBlockTextureName("expandedrails:MonorailBlue");
        monorailBrown = new AllRails(3181).setBlockName("monorailBrown").setBlockTextureName("expandedrails:MonorailBrown");
        monorailGreen = new AllRails(3182).setBlockName("monorailGreen").setBlockTextureName("expandedrails:MonorailGreen");
        monorailRed = new AllRails(3183).setBlockName("monorailRed").setBlockTextureName("expandedrails:MonorailRed");
        monorailBlack = new AllRails(3184).setBlockName("monorailBlack").setBlockTextureName("expandedrails:MonorailBlack");
        //Wool Triplerails//
        triplerailWhite = new AllRails(3196).setBlockName("triplerailWhite").setBlockTextureName("expandedrails:TriplerailWhite");
        triplerailOrange = new AllRails(3197).setBlockName("triplerailOrange").setBlockTextureName("expandedrails:TriplerailOrange");
        triplerailMagenta = new AllRails(3198).setBlockName("triplerailMagenta").setBlockTextureName("expandedrails:TriplerailMagenta");
        triplerailLightblue = new AllRails(3199).setBlockName("triplerailLightblue").setBlockTextureName("expandedrails:TriplerailLightBlue");
        triplerailYellow = new AllRails(3200).setBlockName("triplerailYellow").setBlockTextureName("expandedrails:TriplerailYellow");
        triplerailLime = new AllRails(3201).setBlockName("triplerailLime").setBlockTextureName("expandedrails:TriplerailLime");
        triplerailPink = new AllRails(3202).setBlockName("triplerailPink").setBlockTextureName("expandedrails:TriplerailPink");
        triplerailGray = new AllRails(3203).setBlockName("triplerailGray").setBlockTextureName("expandedrails:TriplerailGray");
        triplerailLightgray = new AllRails(3204).setBlockName("triplerailLightgray").setBlockTextureName("expandedrails:TriplerailLightGray");
        triplerailCyan = new AllRails(3205).setBlockName("triplerailCyan").setBlockTextureName("expandedrails:TriplerailCyan");
        triplerailPurple = new AllRails(3206).setBlockName("triplerailPurple").setBlockTextureName("expandedrails:TriplerailPurple");
        triplerailBlue = new AllRails(3207).setBlockName("triplerailBlue").setBlockTextureName("expandedrails:TriplerailBlue");
        triplerailBrown = new AllRails(3208).setBlockName("triplerailBrown").setBlockTextureName("expandedrails:TriplerailBrown");
        triplerailGreen = new AllRails(3209).setBlockName("triplerailGreen").setBlockTextureName("expandedrails:TriplerailGreen");
        triplerailRed = new AllRails(3210).setBlockName("triplerailRed").setBlockTextureName("expandedrails:TriplerailRed");
        triplerailBlack = new AllRails(3211).setBlockName("triplerailBlack").setBlockTextureName("expandedrails:TriplerailBlack");
        //Custom Items//
        emeraldBar = new ExpandedItem(8001).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("emeraldBar").setTextureName("expandedrails:EmeraldBar");
        diamondBar = new ExpandedItem(8000).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("diamondBar").setTextureName("expandedrails:DiamondBar");
        obsidianBar = new ExpandedItem(8002).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianBar").setTextureName("expandedrails:ObsidianBar");
        lapisBar = new ExpandedItem(8003).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("lapisBar").setTextureName("expandedrails:LapisBar");
        explosiveBar = new ExpandedItem(8004).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("explosiveBar").setTextureName("expandedrails:ExplosiveBar");
        ironNail = new ExpandedItem(8024).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("ironNail").setTextureName("expandedrails:Nail_Iron");
        goldNail = new ExpandedItem(8025).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("goldNail").setTextureName("expandedrails:Nail_Gold");
        diamondNail = new ExpandedItem(8026).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("diamondNail").setTextureName("expandedrails:Nail_Diamond");
        emeraldNail = new ExpandedItem(8027).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("emeraldNail").setTextureName("expandedrails:Nail_Emerald");
        obsidianNail = new ExpandedItem(8028).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianNail").setTextureName("expandedrails:Nail_Obsidian");
        netherrackNail = new ExpandedItem(8029).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("netherrackNail").setTextureName("expandedrails:Nail_Nether");
        woolenNail = new ExpandedItem(8031).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("woolenNail").setTextureName("expandedrails:Nail_Woolen");
        netherIngot = new ExpandedItem(8051).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("netherIngot").setTextureName("expandedrails:Nether_Ingot");
        railIronBase = new ExpandedItem(8062).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railIronBase").setTextureName("expandedrails:Rail_Iron_Base");
        railDiamondBase = new ExpandedItem(8063).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railDiamondBase").setTextureName("expandedrails:Rail_Diamond_Base");
        railObsidianBase = new ExpandedItem(8064).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railObsidianBase").setTextureName("expandedrails:Rail_Obsidian_Base");
        railNetherrackBase = new ExpandedItem(8065).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railNetherrackBase").setTextureName("expandedrails:Rail_Nether_Base");
        railEmeraldBase = new ExpandedItem(8066).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railEmeraldBase").setTextureName("expandedrails:Rail_Emerald_Base");
        railLapisBase = new ExpandedItem(8067).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railLapisBase").setTextureName("expandedrails:Rail_Lapis_Base");
        railGoldBase = new ExpandedItem(8068).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railGoldBase").setTextureName("expandedrails:Rail_Gold_Base");
        railArmedBase = new ExpandedItem(8069).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railArmedBase").setTextureName("expandedrails:Rail_Armed_Base");
        railChainBase = new ExpandedItem(8070).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railChainBase").setTextureName("expandedrails:Rail_Chain_Base");
        railIceBase = new ExpandedItem(8071).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railIceBase").setTextureName("expandedrails:Rail_Ice_Base");
        railEnderPearlBase = new ExpandedItem(8072).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("railEnderPearlBase").setTextureName("expandedrails:Rail_EnderPearl_Base");
        obsidianChunk = new ExpandedItem(7999).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("obsidianChunk").setTextureName("expandedrails:ObsidianChunk");
        minecartWhite = new MinecartWhite(8073).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartWhite").setTextureName("expandedrails:minecart_white");
        //minecartOrange = new ExpandedItem(minecartOrangeID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartOrange").setTextureName("expandedrails:MinecartOrange");
        //minecartMagenta = new ExpandedItem(minecartMagentaID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartMagenta").setTextureName("expandedrails:MinecartMagenta");
        //minecartLightblue = new ExpandedItem(minecartLightblueID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLightblue").setTextureName("expandedrails:MinecartLightblue");
        //minecartYellow = new ExpandedItem(minecartYellowID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartYellow").setTextureName("expandedrails:MinecartYellow");
        //minecartLime = new ExpandedItem(minecartLimeID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLime").setTextureName("expandedrails:MinecartLime");
        //minecartPink = new ExpandedItem(minecartPinkID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartPink").setTextureName("expandedrails:MinecartPink");
        //minecartGray = new ExpandedItem(minecartGrayID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartGray").setTextureName("expandedrails:MinecartGray");
        //minecartLightgray = new ExpandedItem(minecartLightgrayID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartLightgray").setTextureName("expandedrails:MinecartLightgray");
        //minecartCyan = new ExpandedItem(minecartCyanID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartCyan").setTextureName("expandedrails:MinecartCyan");
        //minecartPurple = new ExpandedItem(minecartPurpleID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartPurple").setTextureName("expandedrails:MinecartPurple");
        //minecartBlue = new ExpandedItem(minecartBlueID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBlue").setTextureName("expandedrails:MinecartBlue");
        //minecartBrown = new ExpandedItem(minecartBrownID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBrown").setTextureName("expandedrails:MinecartBrown");
        //minecartGreen = new ExpandedItem(minecartGreenID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartGreen").setTextureName("expandedrails:MinecartGreen");
        //minecartRed = new ExpandedItem(minecartRedID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartRed").setTextureName("expandedrails:MinecartRed");
        //minecartBlack = new ExpandedItem(minecartBlackID).setCreativeTab(CreativeTabs.tabTransport).setUnlocalizedName("minecartBlack").setTextureName("expandedrails:MinecartBlack");
        //Block Registering//
        
        NetworkRegistry.INSTANCE.registerGuiHandler(this, guiHandlerRailsCraftingTable);
        
        GameRegistry.registerItem(obsidianBar, "obsidianBar");
        if(event.getSide() == Side.CLIENT) {
        	// register renderer for an item. this is usually in the client proxy
        	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
					.register(obsidianBar, 0, 
					new ModelResourceLocation(modid+":"+"obsidianBar", "inventory"));
        }
        
        GameRegistry.registerItem(emeraldBar, "emeraldBar");
        GameRegistry.registerItem(diamondBar, "diamondBar");
        GameRegistry.registerItem(lapisBar, "lapisBar");
        GameRegistry.registerItem(explosiveBar, "explosiveBar");
        GameRegistry.registerItem(ironNail, "ironNail");
        GameRegistry.registerItem(goldNail, "goldNail");
        GameRegistry.registerItem(diamondNail, "diamondNail");
        GameRegistry.registerItem(emeraldNail, "emeraldNail");;
        GameRegistry.registerItem(obsidianNail, "obsidianNail");
        GameRegistry.registerItem(netherrackNail, "netherrackNail");
        GameRegistry.registerItem(woolenNail, "woolenNail");
        GameRegistry.registerItem(netherIngot, "netherIngot");
        GameRegistry.registerItem(railIronBase, "railIronBase");
        GameRegistry.registerItem(railDiamondBase, "railDiamondBase");
        GameRegistry.registerItem(railObsidianBase, "railObsidianBase");
        GameRegistry.registerItem(railNetherrackBase, "railNetherrackBase");
        GameRegistry.registerItem(railEmeraldBase, "railEmeraldBase");
        GameRegistry.registerItem(railLapisBase, "railLapisBase");
        GameRegistry.registerItem(railGoldBase, "railGoldBase");
        GameRegistry.registerItem(railChainBase, "railChainBase");
        GameRegistry.registerItem(railArmedBase, "railArmedBase");
        GameRegistry.registerItem(railIceBase, "railIceBase"););
        GameRegistry.registerItem(railEnderPearlBase, "railEnderPearlBase");
        GameRegistry.registerItem(obsidianChunk, "obsidianChunk");
        GameRegistry.registerItem(minecartWhite, "minecartWhite");
        
        
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
        armedRail.setCreativeTab(this.tabNormalRails);
        chainRail.setCreativeTab(this.tabNormalRails);
        iceRail.setCreativeTab(this.tabNormalRails);
        diamondNetherRail.setCreativeTab(this.tabNormalRails);
        diamondObsidianRail.setCreativeTab(this.tabNormalRails);
        brickRail.setCreativeTab(this.tabNormalRails);
        netherStarRail.setCreativeTab(this.tabNormalRails);
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
        monorailArmed.setCreativeTab(this.tabMonoRails);
        monorailChain.setCreativeTab(this.tabMonoRails);
        monorailIce.setCreativeTab(this.tabMonoRails);
        monorailPowered.setCreativeTab(this.tabMonoRails);
        monorailGold.setCreativeTab(this.tabMonoRails);
        monorailNether.setCreativeTab(this.tabMonoRails);
        monorailRedGreen.setCreativeTab(this.tabMonoRails);
        monorailYellowBlue.setCreativeTab(this.tabMonoRails);
        monorailGrayOrange.setCreativeTab(this.tabMonoRails);
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
        triplerailArmed.setCreativeTab(this.tabTripleRails);
        triplerailChain.setCreativeTab(this.tabTripleRails);
        triplerailIce.setCreativeTab(this.tabTripleRails);
        triplerailPowered.setCreativeTab(this.tabTripleRails);
        triplerailNether.setCreativeTab(this.tabTripleRails);
        proxy.registerRenderers();
//GameRegistry.registerTileEntity(TileEntityRailBrakeEntity.class, "railBrake");
    }
    
    private static Block registerBlock(Block b, String assetName){
    	GameRegistry.registerBlock(b, assetName);
    	return b;
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}