package com.expanded.rails.mod;

import com.expanded.rails.mod.blocks.BlockNileWorkbench;
import com.expanded.rails.mod.normalrails.*;
import com.expanded.rails.mod.rails.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.expanded.rails.mod.client.ClientProxy.registerRender;

//import com.expanded.rails.mod.blocks.RailsCraftingTable;
//import com.expanded.rails.mod.gui.TileEntityRailsCraftingTable;
//import com.expanded.rails.mod.gui.GuiHandlerRailsCraftingTable;
//import com.expanded.rails.mod.rails.MonorailPowered;
//import com.expanded.rails.mod.rails.TriplerailPowered;
//import expanded.rails.mod.entity.TileEntityRailBrake;
//import expanded.rails.mod.entity.TileEntityRailBrakeEntity;

@Mod(modid = "expandedrailsmod", name = "Expanded Rails Mod", version = "1.6.3")
public class ERMBase
{
	
        public static final String modid = "expandedrailsmod";
	
        // The instance of your mod that Forge uses.
        @Instance("ExpandedRailsMod")
        public static ERMBase instance;

        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide = "com.expanded.rails.mod.client.ClientProxy", serverSide = "com.expanded.rails.mod.CommonProxy")
        public static CommonProxy proxy;

        private static final CreativeTabs tabNormalRails = new CreativeTabs("NormalRails") {

                @Override
                public Item getTabIconItem() {
                        // TODO Auto-generated method stub
                        return Item.getItemFromBlock(obsidianRail);
                }
        };
        private static final CreativeTabs tabMonoRails = new CreativeTabs("MonoRails") {

                @Override
                public Item getTabIconItem() {
                        // TODO Auto-generated method stub
                        return Item.getItemFromBlock(monorailObsidian);
                }
        };
        private static final CreativeTabs tabTripleRails = new CreativeTabs("TripleRails") {

                @Override
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
        //public TileEntityNileWorkbench guiHandlerRailsCraftingTable = new TileEntityNileWorkbench();

        public static void registerRenders() {
                registerRender(whiteWoolRail);
                registerRender(purpleWoolRail);
                registerRender(monorailPowered);
        }

        public static void register() {
                registerBlock(whiteWoolRail);
                registerBlock(orangeWoolRail);
                registerBlock(magentaWoolRail);
                registerBlock(lightblueWoolRail);
                registerBlock(yellowWoolRail);
                registerBlock(limeWoolRail);
                registerBlock(pinkWoolRail);
                registerBlock(grayWoolRail);
                registerBlock(lightgrayWoolRail);
                registerBlock(cyanWoolRail);
                registerBlock(purpleWoolRail);
                registerBlock(blueWoolRail);
                registerBlock(brownWoolRail);
                registerBlock(greenWoolRail);
                registerBlock(redWoolRail);
                registerBlock(blackWoolRail);

                registerBlock(armedRail);
                registerBlock(diamondRail);
                registerBlock(emeraldRail);
                registerBlock(enderPearlRail);
                registerBlock(glowstoneRail);
                registerBlock(obsidianRail);
                registerBlock(brickRail);
                registerBlock(iceRail);
                registerBlock(chainRail);
                registerBlock(lapisRail);
                registerBlock(diamondNetherRail);
                registerBlock(diamondObsidianRail);
                registerBlock(netherStarRail);
                //Mono Wool Rails//
                registerBlock(monorailWhite);
                registerBlock(monorailOrange);
                registerBlock(monorailMagenta);
                registerBlock(monorailLightblue);
                registerBlock(monorailYellow);
                registerBlock(monorailLime);
                registerBlock(monorailPink);
                registerBlock(monorailGray);
                registerBlock(monorailLightgray);
                registerBlock(monorailCyan);
                registerBlock(monorailPurple);
                registerBlock(monorailBlue);
                registerBlock(monorailBrown);
                registerBlock(monorailGreen);
                registerBlock(monorailRed);
                registerBlock(monorailBlack);
                //Monorail//
                registerBlock(monorailArmed);
                registerBlock(monorailDiamond);
                registerBlock(monorailEmerald);
                registerBlock(monorailEnderPearl);
                registerBlock(monorailGlowing);
                registerBlock(monorailObsidian);
                registerBlock(monorailPowered);
                registerBlock(monorailIce);
                registerBlock(monorailChain);
                registerBlock(monorailLapis);
                registerBlock(monorailNether);
                registerBlock(monorailGrayOrange);
                registerBlock(monorailRedGreen);
                registerBlock(monorailYellowBlue);
                registerBlock(monorailGold);
                //Triple Wool Rails//
                registerBlock(triplerailWhite);
                registerBlock(triplerailOrange);
                registerBlock(triplerailMagenta);
                registerBlock(triplerailLightblue);
                registerBlock(triplerailYellow);
                registerBlock(triplerailLime);
                registerBlock(triplerailPink);
                registerBlock(triplerailGray);
                registerBlock(triplerailLightgray);
                registerBlock(triplerailCyan);
                registerBlock(triplerailPurple);
                registerBlock(triplerailBlue);
                registerBlock(triplerailBrown);
                registerBlock(triplerailGreen);
                registerBlock(triplerailRed);
                registerBlock(triplerailBlack);
                //Triplerail//
                registerBlock(triplerailArmed);
                registerBlock(triplerailDiamond);
                registerBlock(triplerailEmerald);
                registerBlock(triplerailEnderPearl);
                registerBlock(triplerailGlowing);
                registerBlock(triplerailObsidian);
                //registerBlock(triplerailPowered);
                registerBlock(triplerailIce);
                registerBlock(triplerailChain);
                registerBlock(triplerailLapis);
                registerBlock(triplerailNether);
                //New Rails//
                registerBlock(enderPearlDiamondRail);
                registerBlock(enderPearlDiamondMonorail);
                registerBlock(enderPearlDiamondTriplerail);

                registerBlock(railsCraftingTable);
        }

        public static void registerBlock(Block block) {
                GameRegistry.register(block);
                ItemBlock item = new ItemBlock(block);
                item.setRegistryName(block.getRegistryName());
                GameRegistry.register(item);
        }

                //GameRegistry.registerBlock(railBrake, "railBrake");


                //NetworkRegistry.INSTANCE.registerGuiHandler(this, guiHandlerRailsCraftingTable);
                //GameRegistry.registerTileEntity(TileEntityNileWorkbench.class,"expandedrailsmod.TileEntityRailsCraftingTable");


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

        @EventHandler
        public static void init()
        {
                //Custom Blocks//
                //Wool Rails//
                whiteWoolRail = new WhiteWoolRail(3081).setUnlocalizedName("whiteWoolRail").setRegistryName("WhiteWoolRail");
                orangeWoolRail = new OrangeWoolRail(3082).setUnlocalizedName("orangeWoolRail").setRegistryName("OrangeWoolRail");
                magentaWoolRail = new MagentaWoolRail(3083).setUnlocalizedName("magentaWoolRail").setRegistryName("MagentaWoolRail");
                lightblueWoolRail = new LightBlueWoolRail(3084).setUnlocalizedName("lightblueWoolRail").setRegistryName("LightBlueWoolRail");
                yellowWoolRail = new YellowWoolRail(3085).setUnlocalizedName("yellowWoolRail").setRegistryName("YellowWoolRail");
                limeWoolRail = new LimeWoolRail(3086).setUnlocalizedName("limeWoolRail").setRegistryName("LimeWoolRail");
                pinkWoolRail = new PinkWoolRail(3087).setUnlocalizedName("pinkWoolRail").setRegistryName("PinkWoolRail");
                grayWoolRail = new GrayWoolRail(3088).setUnlocalizedName("grayWoolRail").setRegistryName("GrayWoolRail");
                lightgrayWoolRail = new LightGrayWoolRail(3089).setUnlocalizedName("lightgrayWoolRail").setRegistryName("LightGrayWoolRail");
                cyanWoolRail = new CyanWoolRail(3090).setUnlocalizedName("cyanWoolRail").setRegistryName("CyanWoolRail");
                purpleWoolRail = new PurpleWoolRail(3091).setUnlocalizedName("purpleWoolRail").setRegistryName("PurpleWoolRail");
                blueWoolRail = new BlueWoolRail(3092).setUnlocalizedName("blueWoolRail").setRegistryName("BlueWoolRail");
                brownWoolRail = new BrownWoolRail(3093).setUnlocalizedName("brownWoolRail").setRegistryName("BrownWoolRail");
                greenWoolRail = new GreenWoolRail(3094).setUnlocalizedName("greenWoolRail").setRegistryName("GreenWoolRail");
                redWoolRail = new RedWoolRail(3095).setUnlocalizedName("redWoolRail").setRegistryName("RedWoolRail");
                blackWoolRail = new BlackWoolRail(3096).setUnlocalizedName("blackWoolRail").setRegistryName("BlackWoolRail");
                //Normalrail//
                armedRail = new ArmedRail(3013).setUnlocalizedName("armedRail").setRegistryName("ArmedRail");
                diamondRail = new DiamondRail(3002).setUnlocalizedName("diamondRail").setRegistryName("DiamondRail");
                emeraldRail = new EmeraldRail(3009).setUnlocalizedName("emeraldRail").setRegistryName("EmeraldRail");
                enderPearlRail = new EnderPearlRail(3011).setUnlocalizedName("enderPearlRail").setRegistryName("EnderPearlRail");
                glowstoneRail = new GlowstoneRail(3005).setUnlocalizedName("glowstoneRail").setRegistryName("GlowstoneRail");
                obsidianRail = new ObsidianRail(3001).setUnlocalizedName("obsidianRail").setRegistryName("ObsidianRail");
                brickRail = new BrickRail(3008).setUnlocalizedName("brickRail").setRegistryName("BrickRail");
                iceRail = new IceRail(3004).setUnlocalizedName("iceRail").setRegistryName("IceRail");
                chainRail = new ChainRail(3012).setUnlocalizedName("chainRail").setRegistryName("ChainRail");
                lapisRail = new LapisRail(3003).setUnlocalizedName("lapisRail").setRegistryName("LapisRail");
                diamondNetherRail = new DiamondNetherRail(3006).setUnlocalizedName("diamondNetherRail").setRegistryName("DiamondNetherRail");
                diamondObsidianRail = new DiamondObsidianRail(3007).setUnlocalizedName("diamondObsidianRail").setRegistryName("DiamondObsidianRail");
                netherStarRail = new NetherStarRail(3010).setUnlocalizedName("netherStarRail").setRegistryName("DetherStarRail");
                railsCraftingTable = new BlockNileWorkbench().setUnlocalizedName("railsCraftingTable").setRegistryName("DailCraftingTableRail");
//railsCraftingTable = new RailsCraftingTable(2901).setUnlocalizedName("railsCraftingTable");
//railBrake = new TileEntityRailBrake(railBrakeID, Material.rock).setUnlocalizedName("railBrake");
                //Wool Monorails//
                monorailWhite = new MonorailWhite(3169).setUnlocalizedName("monorailWhite").setRegistryName("MonorailWhite");
                monorailOrange = new MonorailOrange(3170).setUnlocalizedName("monorailOrange").setRegistryName("MonorailOrange");
                monorailMagenta = new MonorailMagenta(3171).setUnlocalizedName("monorailMagenta").setRegistryName("MonorailMagenta");
                monorailLightblue = new MonorailLightblue(3172).setUnlocalizedName("monorailLightblue").setRegistryName("MonorailLightBlue");
                monorailYellow = new MonorailYellow(3173).setUnlocalizedName("monorailYellow").setRegistryName("MonorailYellow");
                monorailLime = new MonorailLime(3174).setUnlocalizedName("monorailLime").setRegistryName("MonorailLime");
                monorailPink = new MonorailPink(3175).setUnlocalizedName("monorailPink").setRegistryName("MonorailPink");
                monorailGray = new MonorailGray(3176).setUnlocalizedName("monorailGray").setRegistryName("MonorailGray");
                monorailLightgray = new MonorailLightgray(3177).setUnlocalizedName("monorailLightgray").setRegistryName("MonorailLightGray");
                monorailCyan = new MonorailCyan(3178).setUnlocalizedName("monorailCyan").setRegistryName("MonorailCyan");
                monorailPurple = new MonorailPurple(3179).setUnlocalizedName("monorailPurple").setRegistryName("MonorailPurple");
                monorailBlue = new MonorailBlue(3180).setUnlocalizedName("monorailBlue").setRegistryName("MonorailBlue");
                monorailBrown = new MonorailBrown(3181).setUnlocalizedName("monorailBrown").setRegistryName("MonorailBrown");
                monorailGreen = new MonorailGreen(3182).setUnlocalizedName("monorailGreen").setRegistryName("MonorailGreen");
                monorailRed = new MonorailRed(3183).setUnlocalizedName("monorailRed").setRegistryName("MonorailRed");
                monorailBlack = new MonorailBlack(3184).setUnlocalizedName("monorailBlack").setRegistryName("MonorailBlack");
                //Monorail//
                monorailArmed = new MonorailArmed(3141).setUnlocalizedName("monorailArmed").setRegistryName("MonorailArmed");
                monorailDiamond = new MonorailDiamond(3128).setUnlocalizedName("monorailDiamond").setRegistryName("MonorailDiamond");
                monorailEmerald = new MonorailEmerald(3132).setUnlocalizedName("monorailEmerald").setRegistryName("MonorailEmerald");
                monorailEnderPearl = new MonorailEnderPearl(3142).setUnlocalizedName("monorailEnderPearl").setRegistryName("MonorailEnderPearl");
                monorailGlowing = new MonorailGlowing(3130).setUnlocalizedName("monorailGlowing").setRegistryName("MonorailGlowing");
                monorailObsidian = new MonorailObsidian(3129).setUnlocalizedName("monorailObsidian").setRegistryName("MonorailObsidian");
                monorailPowered = new MonorailPowered(3138).setUnlocalizedName("monorailPowered").setRegistryName("MonorailPowered");
                monorailIce = new MonorailIce(3139).setUnlocalizedName("monorailIce").setRegistryName("MonorailIce");
                monorailChain = new MonorailChain(3140).setUnlocalizedName("monorailChain").setRegistryName("MonorailChain");
                monorailLapis = new MonorailLapis(3133).setUnlocalizedName("monorailLapis").setRegistryName("MonorailLapis");
                monorailNether = new MonorailNether(3131).setUnlocalizedName("monorailNether").setRegistryName("MonorailNether");
                monorailGrayOrange = new MonorailGrayOrange(3136).setUnlocalizedName("monorailGrayOrange").setRegistryName("MonorailGrayOrange");
                monorailRedGreen = new MonorailRedGreen(3134).setUnlocalizedName("monorailRedGreen").setRegistryName("MonorailRedGreen");
                monorailYellowBlue = new MonorailYellowBlue(3135).setUnlocalizedName("monorailYellowBlue").setRegistryName("MonorailYellowBlue");
                monorailGold = new MonorailGold(3137).setUnlocalizedName("monorailGold").setRegistryName("MonorailGold");
                //Wool Triplerails//
                triplerailWhite = new TriplerailWhite(3196).setUnlocalizedName("triplerailWhite").setRegistryName("TriplerailWhite");
                triplerailOrange = new TriplerailOrange(3197).setUnlocalizedName("triplerailOrange").setRegistryName("TriplerailOrange");
                triplerailMagenta = new TriplerailMagenta(3198).setUnlocalizedName("triplerailMagenta").setRegistryName("TriplerailMagenta");
                triplerailLightblue = new TriplerailLightblue(3199).setUnlocalizedName("triplerailLightblue").setRegistryName("TriplerailLightBlue");
                triplerailYellow = new TriplerailYellow(3200).setUnlocalizedName("triplerailYellow").setRegistryName("TriplerailYellow");
                triplerailLime = new TriplerailLime(3201).setUnlocalizedName("triplerailLime").setRegistryName("TriplerailLime");
                triplerailPink = new TriplerailPink(3202).setUnlocalizedName("triplerailPink").setRegistryName("TriplerailPink");
                triplerailGray = new TriplerailGray(3203).setUnlocalizedName("triplerailGray").setRegistryName("TriplerailGray");
                triplerailLightgray = new TriplerailLightgray(3204).setUnlocalizedName("triplerailLightgray").setRegistryName("TriplerailLightGray");
                triplerailCyan = new TriplerailCyan(3205).setUnlocalizedName("triplerailCyan").setRegistryName("TriplerailCyan");
                triplerailPurple = new TriplerailPurple(3206).setUnlocalizedName("triplerailPurple").setRegistryName("TriplerailPurple");
                triplerailBlue = new TriplerailBlue(3207).setUnlocalizedName("triplerailBlue").setRegistryName("TriplerailBlue");
                triplerailBrown = new TriplerailBrown(3208).setUnlocalizedName("triplerailBrown").setRegistryName("TriplerailBrown");
                triplerailGreen = new TriplerailGreen(3209).setUnlocalizedName("triplerailGreen").setRegistryName("TriplerailGreen");
                triplerailRed = new TriplerailRed(3210).setUnlocalizedName("triplerailRed").setRegistryName("TriplerailRed");
                triplerailBlack = new TriplerailBlack(3211).setUnlocalizedName("triplerailBlack").setRegistryName("TriplerailBlack");
                //Triplerail//
                triplerailArmed = new TriplerailArmed(3194).setUnlocalizedName("triplerailArmed").setRegistryName("TriplerailArmed");
                triplerailDiamond = new TriplerailDiamond(3185).setUnlocalizedName("triplerailDiamond").setRegistryName("TriplerailDiamond");
                triplerailEmerald = new TriplerailEmerald(3189).setUnlocalizedName("triplerailEmerald").setRegistryName("TriplerailEmerald");
                triplerailEnderPearl = new TriplerailEnderPearl(3195).setUnlocalizedName("triplerailEnderPearl").setRegistryName("TriplerailEnderPearl");
                triplerailGlowing = new TriplerailGlowing(3186).setUnlocalizedName("triplerailGlowing").setRegistryName("TriplerailGlowing");
                triplerailObsidian = new TriplerailObsidian(3188).setUnlocalizedName("triplerailObsidian").setRegistryName("TriplerailObsidian");
                //triplerailPowered = new TriplerailPowered(3191).setUnlocalizedName("triplerailPowered");
                triplerailIce = new TriplerailIce(3192).setUnlocalizedName("triplerailIce").setRegistryName("TriplerailIce");
                triplerailChain = new TriplerailChain(3193).setUnlocalizedName("triplerailChain").setRegistryName("TriplerailChain");
                triplerailLapis = new TriplerailLapis(3190).setUnlocalizedName("triplerailLapis").setRegistryName("TriplerailLapis");
                triplerailNether = new TriplerailNether(3187).setUnlocalizedName("triplerailNether").setRegistryName("TriplerailNether");
                //New Rails//
                enderPearlDiamondRail = new EnderPearlDiamondRail(3188).setUnlocalizedName("enderPearlDiamondRail").setRegistryName("enderPearlDiamondRail");
                enderPearlDiamondMonorail = new MonorailEnderPearlDiamond(3189).setUnlocalizedName("enderPearlDiamondMonorail").setRegistryName("enderPearlDiamondMonorail");
                enderPearlDiamondTriplerail = new TriplerailEnderPearlDiamond(3190).setUnlocalizedName("enderPearlDiamondTriplerail").setRegistryName("enderPearlDiamondTriplerail");
        
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
                whiteWoolRail.setCreativeTab(tabNormalRails);
                orangeWoolRail.setCreativeTab(tabNormalRails);
                magentaWoolRail.setCreativeTab(tabNormalRails);
                lightblueWoolRail.setCreativeTab(tabNormalRails);
                yellowWoolRail.setCreativeTab(tabNormalRails);
                limeWoolRail.setCreativeTab(tabNormalRails);
                pinkWoolRail.setCreativeTab(tabNormalRails);
                grayWoolRail.setCreativeTab(tabNormalRails);
                lightgrayWoolRail.setCreativeTab(tabNormalRails);
                cyanWoolRail.setCreativeTab(tabNormalRails);
                purpleWoolRail.setCreativeTab(tabNormalRails);
                blueWoolRail.setCreativeTab(tabNormalRails);
                brownWoolRail.setCreativeTab(tabNormalRails);
                greenWoolRail.setCreativeTab(tabNormalRails);
                redWoolRail.setCreativeTab(tabNormalRails);
                blackWoolRail.setCreativeTab(tabNormalRails);
                diamondRail.setCreativeTab(tabNormalRails);
                emeraldRail.setCreativeTab(tabNormalRails);
                obsidianRail.setCreativeTab(tabNormalRails);
                lapisRail.setCreativeTab(tabNormalRails);
                glowstoneRail.setCreativeTab(tabNormalRails);
                enderPearlRail.setCreativeTab(tabNormalRails);
                //New Rails
                enderPearlDiamondRail.setCreativeTab(tabNormalRails);
                //Old Rails
                armedRail.setCreativeTab(tabNormalRails);
                chainRail.setCreativeTab(tabNormalRails);
                iceRail.setCreativeTab(tabNormalRails);
                diamondNetherRail.setCreativeTab(tabNormalRails);
                diamondObsidianRail.setCreativeTab(tabNormalRails);
                brickRail.setCreativeTab(tabNormalRails);
                netherStarRail.setCreativeTab(tabNormalRails);
                //Monorails//
                monorailWhite.setCreativeTab(tabMonoRails);
                monorailOrange.setCreativeTab(tabMonoRails);
                monorailMagenta.setCreativeTab(tabMonoRails);
                monorailLightblue.setCreativeTab(tabMonoRails);
                monorailYellow.setCreativeTab(tabMonoRails);
                monorailLime.setCreativeTab(tabMonoRails);
                monorailPink.setCreativeTab(tabMonoRails);
                monorailGray.setCreativeTab(tabMonoRails);
                monorailLightgray.setCreativeTab(tabMonoRails);
                monorailCyan.setCreativeTab(tabMonoRails);
                monorailPurple.setCreativeTab(tabMonoRails);
                monorailBlue.setCreativeTab(tabMonoRails);
                monorailBrown.setCreativeTab(tabMonoRails);
                monorailGreen.setCreativeTab(tabMonoRails);
                monorailRed.setCreativeTab(tabMonoRails);
                monorailBlack.setCreativeTab(tabMonoRails);
                monorailDiamond.setCreativeTab(tabMonoRails);
                monorailEmerald.setCreativeTab(tabMonoRails);
                monorailObsidian.setCreativeTab(tabMonoRails);
                monorailLapis.setCreativeTab(tabMonoRails);
                monorailGlowing.setCreativeTab(tabMonoRails);
                monorailEnderPearl.setCreativeTab(tabMonoRails);
                //New Rails
                enderPearlDiamondMonorail.setCreativeTab(tabMonoRails);
                //Old Rails
                monorailArmed.setCreativeTab(tabMonoRails);
                monorailChain.setCreativeTab(tabMonoRails);
                monorailIce.setCreativeTab(tabMonoRails);
                monorailPowered.setCreativeTab(tabMonoRails);
                monorailGold.setCreativeTab(tabMonoRails);
                monorailNether.setCreativeTab(tabMonoRails);
                monorailRedGreen.setCreativeTab(tabMonoRails);
                monorailYellowBlue.setCreativeTab(tabMonoRails);
                monorailGrayOrange.setCreativeTab(tabMonoRails);
                //Triplerails//
                triplerailWhite.setCreativeTab(tabTripleRails);
                triplerailOrange.setCreativeTab(tabTripleRails);
                triplerailMagenta.setCreativeTab(tabTripleRails);
                triplerailLightblue.setCreativeTab(tabTripleRails);
                triplerailYellow.setCreativeTab(tabTripleRails);
                triplerailLime.setCreativeTab(tabTripleRails);
                triplerailPink.setCreativeTab(tabTripleRails);
                triplerailGray.setCreativeTab(tabTripleRails);
                triplerailLightgray.setCreativeTab(tabTripleRails);
                triplerailCyan.setCreativeTab(tabTripleRails);
                triplerailPurple.setCreativeTab(tabTripleRails);
                triplerailBlue.setCreativeTab(tabTripleRails);
                triplerailBrown.setCreativeTab(tabTripleRails);
                triplerailGreen.setCreativeTab(tabTripleRails);
                triplerailRed.setCreativeTab(tabTripleRails);
                triplerailBlack.setCreativeTab(tabTripleRails);
                triplerailDiamond.setCreativeTab(tabTripleRails);
                triplerailEmerald.setCreativeTab(tabTripleRails);
                triplerailObsidian.setCreativeTab(tabTripleRails);
                triplerailLapis.setCreativeTab(tabTripleRails);
                triplerailGlowing.setCreativeTab(tabTripleRails);
                triplerailEnderPearl.setCreativeTab(tabTripleRails);
                //New Rails
                enderPearlDiamondTriplerail.setCreativeTab(tabTripleRails);
                //Old Rails
                triplerailArmed.setCreativeTab(tabTripleRails);
                triplerailChain.setCreativeTab(tabTripleRails);
                triplerailIce.setCreativeTab(tabTripleRails);
                //triplerailPowered.setCreativeTab(tabTripleRails);
                triplerailNether.setCreativeTab(tabTripleRails);
//GameRegistry.registerTileEntity(TileEntityRailBrakeEntity.class, "railBrake");
//GameRegistry.registerBlock(whiteWoolRail = new AllRails(3081), "whiteWoolRail");
        }

        @EventHandler
        public void postInit(FMLPostInitializationEvent event)
        {
                proxy.postInit(event);
        }
    
        @EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
                NetworkRegistry.INSTANCE.registerGuiHandler(ERMBase.modid, proxy);
                proxy.preInit(event);
        }

}