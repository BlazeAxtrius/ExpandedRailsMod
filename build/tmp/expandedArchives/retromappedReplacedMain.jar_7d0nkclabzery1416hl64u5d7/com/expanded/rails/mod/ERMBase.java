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
                public Item func_78016_d() {
                        // TODO Auto-generated method stub
                        return Item.func_150898_a(obsidianRail);
                }
        };
        private static final CreativeTabs tabMonoRails = new CreativeTabs("MonoRails") {

                @Override
                public Item func_78016_d() {
                        // TODO Auto-generated method stub
                        return Item.func_150898_a(monorailObsidian);
                }
        };
        private static final CreativeTabs tabTripleRails = new CreativeTabs("TripleRails") {

                @Override
                public Item func_78016_d() {
                        // TODO Auto-generated method stub
                        return Item.func_150898_a(triplerailObsidian);
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
                whiteWoolRail = new WhiteWoolRail(3081).func_149663_c("whiteWoolRail").setRegistryName("WhiteWoolRail");
                orangeWoolRail = new OrangeWoolRail(3082).func_149663_c("orangeWoolRail").setRegistryName("OrangeWoolRail");
                magentaWoolRail = new MagentaWoolRail(3083).func_149663_c("magentaWoolRail").setRegistryName("MagentaWoolRail");
                lightblueWoolRail = new LightBlueWoolRail(3084).func_149663_c("lightblueWoolRail").setRegistryName("LightBlueWoolRail");
                yellowWoolRail = new YellowWoolRail(3085).func_149663_c("yellowWoolRail").setRegistryName("YellowWoolRail");
                limeWoolRail = new LimeWoolRail(3086).func_149663_c("limeWoolRail").setRegistryName("LimeWoolRail");
                pinkWoolRail = new PinkWoolRail(3087).func_149663_c("pinkWoolRail").setRegistryName("PinkWoolRail");
                grayWoolRail = new GrayWoolRail(3088).func_149663_c("grayWoolRail").setRegistryName("GrayWoolRail");
                lightgrayWoolRail = new LightGrayWoolRail(3089).func_149663_c("lightgrayWoolRail").setRegistryName("LightGrayWoolRail");
                cyanWoolRail = new CyanWoolRail(3090).func_149663_c("cyanWoolRail").setRegistryName("CyanWoolRail");
                purpleWoolRail = new PurpleWoolRail(3091).func_149663_c("purpleWoolRail").setRegistryName("PurpleWoolRail");
                blueWoolRail = new BlueWoolRail(3092).func_149663_c("blueWoolRail").setRegistryName("BlueWoolRail");
                brownWoolRail = new BrownWoolRail(3093).func_149663_c("brownWoolRail").setRegistryName("BrownWoolRail");
                greenWoolRail = new GreenWoolRail(3094).func_149663_c("greenWoolRail").setRegistryName("GreenWoolRail");
                redWoolRail = new RedWoolRail(3095).func_149663_c("redWoolRail").setRegistryName("RedWoolRail");
                blackWoolRail = new BlackWoolRail(3096).func_149663_c("blackWoolRail").setRegistryName("BlackWoolRail");
                //Normalrail//
                armedRail = new ArmedRail(3013).func_149663_c("armedRail").setRegistryName("ArmedRail");
                diamondRail = new DiamondRail(3002).func_149663_c("diamondRail").setRegistryName("DiamondRail");
                emeraldRail = new EmeraldRail(3009).func_149663_c("emeraldRail").setRegistryName("EmeraldRail");
                enderPearlRail = new EnderPearlRail(3011).func_149663_c("enderPearlRail").setRegistryName("EnderPearlRail");
                glowstoneRail = new GlowstoneRail(3005).func_149663_c("glowstoneRail").setRegistryName("GlowstoneRail");
                obsidianRail = new ObsidianRail(3001).func_149663_c("obsidianRail").setRegistryName("ObsidianRail");
                brickRail = new BrickRail(3008).func_149663_c("brickRail").setRegistryName("BrickRail");
                iceRail = new IceRail(3004).func_149663_c("iceRail").setRegistryName("IceRail");
                chainRail = new ChainRail(3012).func_149663_c("chainRail").setRegistryName("ChainRail");
                lapisRail = new LapisRail(3003).func_149663_c("lapisRail").setRegistryName("LapisRail");
                diamondNetherRail = new DiamondNetherRail(3006).func_149663_c("diamondNetherRail").setRegistryName("DiamondNetherRail");
                diamondObsidianRail = new DiamondObsidianRail(3007).func_149663_c("diamondObsidianRail").setRegistryName("DiamondObsidianRail");
                netherStarRail = new NetherStarRail(3010).func_149663_c("netherStarRail").setRegistryName("DetherStarRail");
                railsCraftingTable = new BlockNileWorkbench().func_149663_c("railsCraftingTable").setRegistryName("DailCraftingTableRail");
//railsCraftingTable = new RailsCraftingTable(2901).setUnlocalizedName("railsCraftingTable");
//railBrake = new TileEntityRailBrake(railBrakeID, Material.rock).setUnlocalizedName("railBrake");
                //Wool Monorails//
                monorailWhite = new MonorailWhite(3169).func_149663_c("monorailWhite").setRegistryName("MonorailWhite");
                monorailOrange = new MonorailOrange(3170).func_149663_c("monorailOrange").setRegistryName("MonorailOrange");
                monorailMagenta = new MonorailMagenta(3171).func_149663_c("monorailMagenta").setRegistryName("MonorailMagenta");
                monorailLightblue = new MonorailLightblue(3172).func_149663_c("monorailLightblue").setRegistryName("MonorailLightBlue");
                monorailYellow = new MonorailYellow(3173).func_149663_c("monorailYellow").setRegistryName("MonorailYellow");
                monorailLime = new MonorailLime(3174).func_149663_c("monorailLime").setRegistryName("MonorailLime");
                monorailPink = new MonorailPink(3175).func_149663_c("monorailPink").setRegistryName("MonorailPink");
                monorailGray = new MonorailGray(3176).func_149663_c("monorailGray").setRegistryName("MonorailGray");
                monorailLightgray = new MonorailLightgray(3177).func_149663_c("monorailLightgray").setRegistryName("MonorailLightGray");
                monorailCyan = new MonorailCyan(3178).func_149663_c("monorailCyan").setRegistryName("MonorailCyan");
                monorailPurple = new MonorailPurple(3179).func_149663_c("monorailPurple").setRegistryName("MonorailPurple");
                monorailBlue = new MonorailBlue(3180).func_149663_c("monorailBlue").setRegistryName("MonorailBlue");
                monorailBrown = new MonorailBrown(3181).func_149663_c("monorailBrown").setRegistryName("MonorailBrown");
                monorailGreen = new MonorailGreen(3182).func_149663_c("monorailGreen").setRegistryName("MonorailGreen");
                monorailRed = new MonorailRed(3183).func_149663_c("monorailRed").setRegistryName("MonorailRed");
                monorailBlack = new MonorailBlack(3184).func_149663_c("monorailBlack").setRegistryName("MonorailBlack");
                //Monorail//
                monorailArmed = new MonorailArmed(3141).func_149663_c("monorailArmed").setRegistryName("MonorailArmed");
                monorailDiamond = new MonorailDiamond(3128).func_149663_c("monorailDiamond").setRegistryName("MonorailDiamond");
                monorailEmerald = new MonorailEmerald(3132).func_149663_c("monorailEmerald").setRegistryName("MonorailEmerald");
                monorailEnderPearl = new MonorailEnderPearl(3142).func_149663_c("monorailEnderPearl").setRegistryName("MonorailEnderPearl");
                monorailGlowing = new MonorailGlowing(3130).func_149663_c("monorailGlowing").setRegistryName("MonorailGlowing");
                monorailObsidian = new MonorailObsidian(3129).func_149663_c("monorailObsidian").setRegistryName("MonorailObsidian");
                monorailPowered = new MonorailPowered(3138).func_149663_c("monorailPowered").setRegistryName("MonorailPowered");
                monorailIce = new MonorailIce(3139).func_149663_c("monorailIce").setRegistryName("MonorailIce");
                monorailChain = new MonorailChain(3140).func_149663_c("monorailChain").setRegistryName("MonorailChain");
                monorailLapis = new MonorailLapis(3133).func_149663_c("monorailLapis").setRegistryName("MonorailLapis");
                monorailNether = new MonorailNether(3131).func_149663_c("monorailNether").setRegistryName("MonorailNether");
                monorailGrayOrange = new MonorailGrayOrange(3136).func_149663_c("monorailGrayOrange").setRegistryName("MonorailGrayOrange");
                monorailRedGreen = new MonorailRedGreen(3134).func_149663_c("monorailRedGreen").setRegistryName("MonorailRedGreen");
                monorailYellowBlue = new MonorailYellowBlue(3135).func_149663_c("monorailYellowBlue").setRegistryName("MonorailYellowBlue");
                monorailGold = new MonorailGold(3137).func_149663_c("monorailGold").setRegistryName("MonorailGold");
                //Wool Triplerails//
                triplerailWhite = new TriplerailWhite(3196).func_149663_c("triplerailWhite").setRegistryName("TriplerailWhite");
                triplerailOrange = new TriplerailOrange(3197).func_149663_c("triplerailOrange").setRegistryName("TriplerailOrange");
                triplerailMagenta = new TriplerailMagenta(3198).func_149663_c("triplerailMagenta").setRegistryName("TriplerailMagenta");
                triplerailLightblue = new TriplerailLightblue(3199).func_149663_c("triplerailLightblue").setRegistryName("TriplerailLightBlue");
                triplerailYellow = new TriplerailYellow(3200).func_149663_c("triplerailYellow").setRegistryName("TriplerailYellow");
                triplerailLime = new TriplerailLime(3201).func_149663_c("triplerailLime").setRegistryName("TriplerailLime");
                triplerailPink = new TriplerailPink(3202).func_149663_c("triplerailPink").setRegistryName("TriplerailPink");
                triplerailGray = new TriplerailGray(3203).func_149663_c("triplerailGray").setRegistryName("TriplerailGray");
                triplerailLightgray = new TriplerailLightgray(3204).func_149663_c("triplerailLightgray").setRegistryName("TriplerailLightGray");
                triplerailCyan = new TriplerailCyan(3205).func_149663_c("triplerailCyan").setRegistryName("TriplerailCyan");
                triplerailPurple = new TriplerailPurple(3206).func_149663_c("triplerailPurple").setRegistryName("TriplerailPurple");
                triplerailBlue = new TriplerailBlue(3207).func_149663_c("triplerailBlue").setRegistryName("TriplerailBlue");
                triplerailBrown = new TriplerailBrown(3208).func_149663_c("triplerailBrown").setRegistryName("TriplerailBrown");
                triplerailGreen = new TriplerailGreen(3209).func_149663_c("triplerailGreen").setRegistryName("TriplerailGreen");
                triplerailRed = new TriplerailRed(3210).func_149663_c("triplerailRed").setRegistryName("TriplerailRed");
                triplerailBlack = new TriplerailBlack(3211).func_149663_c("triplerailBlack").setRegistryName("TriplerailBlack");
                //Triplerail//
                triplerailArmed = new TriplerailArmed(3194).func_149663_c("triplerailArmed").setRegistryName("TriplerailArmed");
                triplerailDiamond = new TriplerailDiamond(3185).func_149663_c("triplerailDiamond").setRegistryName("TriplerailDiamond");
                triplerailEmerald = new TriplerailEmerald(3189).func_149663_c("triplerailEmerald").setRegistryName("TriplerailEmerald");
                triplerailEnderPearl = new TriplerailEnderPearl(3195).func_149663_c("triplerailEnderPearl").setRegistryName("TriplerailEnderPearl");
                triplerailGlowing = new TriplerailGlowing(3186).func_149663_c("triplerailGlowing").setRegistryName("TriplerailGlowing");
                triplerailObsidian = new TriplerailObsidian(3188).func_149663_c("triplerailObsidian").setRegistryName("TriplerailObsidian");
                //triplerailPowered = new TriplerailPowered(3191).setUnlocalizedName("triplerailPowered");
                triplerailIce = new TriplerailIce(3192).func_149663_c("triplerailIce").setRegistryName("TriplerailIce");
                triplerailChain = new TriplerailChain(3193).func_149663_c("triplerailChain").setRegistryName("TriplerailChain");
                triplerailLapis = new TriplerailLapis(3190).func_149663_c("triplerailLapis").setRegistryName("TriplerailLapis");
                triplerailNether = new TriplerailNether(3187).func_149663_c("triplerailNether").setRegistryName("TriplerailNether");
                //New Rails//
                enderPearlDiamondRail = new EnderPearlDiamondRail(3188).func_149663_c("enderPearlDiamondRail").setRegistryName("enderPearlDiamondRail");
                enderPearlDiamondMonorail = new MonorailEnderPearlDiamond(3189).func_149663_c("enderPearlDiamondMonorail").setRegistryName("enderPearlDiamondMonorail");
                enderPearlDiamondTriplerail = new TriplerailEnderPearlDiamond(3190).func_149663_c("enderPearlDiamondTriplerail").setRegistryName("enderPearlDiamondTriplerail");
        
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
                whiteWoolRail.func_149647_a(tabNormalRails);
                orangeWoolRail.func_149647_a(tabNormalRails);
                magentaWoolRail.func_149647_a(tabNormalRails);
                lightblueWoolRail.func_149647_a(tabNormalRails);
                yellowWoolRail.func_149647_a(tabNormalRails);
                limeWoolRail.func_149647_a(tabNormalRails);
                pinkWoolRail.func_149647_a(tabNormalRails);
                grayWoolRail.func_149647_a(tabNormalRails);
                lightgrayWoolRail.func_149647_a(tabNormalRails);
                cyanWoolRail.func_149647_a(tabNormalRails);
                purpleWoolRail.func_149647_a(tabNormalRails);
                blueWoolRail.func_149647_a(tabNormalRails);
                brownWoolRail.func_149647_a(tabNormalRails);
                greenWoolRail.func_149647_a(tabNormalRails);
                redWoolRail.func_149647_a(tabNormalRails);
                blackWoolRail.func_149647_a(tabNormalRails);
                diamondRail.func_149647_a(tabNormalRails);
                emeraldRail.func_149647_a(tabNormalRails);
                obsidianRail.func_149647_a(tabNormalRails);
                lapisRail.func_149647_a(tabNormalRails);
                glowstoneRail.func_149647_a(tabNormalRails);
                enderPearlRail.func_149647_a(tabNormalRails);
                //New Rails
                enderPearlDiamondRail.func_149647_a(tabNormalRails);
                //Old Rails
                armedRail.func_149647_a(tabNormalRails);
                chainRail.func_149647_a(tabNormalRails);
                iceRail.func_149647_a(tabNormalRails);
                diamondNetherRail.func_149647_a(tabNormalRails);
                diamondObsidianRail.func_149647_a(tabNormalRails);
                brickRail.func_149647_a(tabNormalRails);
                netherStarRail.func_149647_a(tabNormalRails);
                //Monorails//
                monorailWhite.func_149647_a(tabMonoRails);
                monorailOrange.func_149647_a(tabMonoRails);
                monorailMagenta.func_149647_a(tabMonoRails);
                monorailLightblue.func_149647_a(tabMonoRails);
                monorailYellow.func_149647_a(tabMonoRails);
                monorailLime.func_149647_a(tabMonoRails);
                monorailPink.func_149647_a(tabMonoRails);
                monorailGray.func_149647_a(tabMonoRails);
                monorailLightgray.func_149647_a(tabMonoRails);
                monorailCyan.func_149647_a(tabMonoRails);
                monorailPurple.func_149647_a(tabMonoRails);
                monorailBlue.func_149647_a(tabMonoRails);
                monorailBrown.func_149647_a(tabMonoRails);
                monorailGreen.func_149647_a(tabMonoRails);
                monorailRed.func_149647_a(tabMonoRails);
                monorailBlack.func_149647_a(tabMonoRails);
                monorailDiamond.func_149647_a(tabMonoRails);
                monorailEmerald.func_149647_a(tabMonoRails);
                monorailObsidian.func_149647_a(tabMonoRails);
                monorailLapis.func_149647_a(tabMonoRails);
                monorailGlowing.func_149647_a(tabMonoRails);
                monorailEnderPearl.func_149647_a(tabMonoRails);
                //New Rails
                enderPearlDiamondMonorail.func_149647_a(tabMonoRails);
                //Old Rails
                monorailArmed.func_149647_a(tabMonoRails);
                monorailChain.func_149647_a(tabMonoRails);
                monorailIce.func_149647_a(tabMonoRails);
                monorailPowered.func_149647_a(tabMonoRails);
                monorailGold.func_149647_a(tabMonoRails);
                monorailNether.func_149647_a(tabMonoRails);
                monorailRedGreen.func_149647_a(tabMonoRails);
                monorailYellowBlue.func_149647_a(tabMonoRails);
                monorailGrayOrange.func_149647_a(tabMonoRails);
                //Triplerails//
                triplerailWhite.func_149647_a(tabTripleRails);
                triplerailOrange.func_149647_a(tabTripleRails);
                triplerailMagenta.func_149647_a(tabTripleRails);
                triplerailLightblue.func_149647_a(tabTripleRails);
                triplerailYellow.func_149647_a(tabTripleRails);
                triplerailLime.func_149647_a(tabTripleRails);
                triplerailPink.func_149647_a(tabTripleRails);
                triplerailGray.func_149647_a(tabTripleRails);
                triplerailLightgray.func_149647_a(tabTripleRails);
                triplerailCyan.func_149647_a(tabTripleRails);
                triplerailPurple.func_149647_a(tabTripleRails);
                triplerailBlue.func_149647_a(tabTripleRails);
                triplerailBrown.func_149647_a(tabTripleRails);
                triplerailGreen.func_149647_a(tabTripleRails);
                triplerailRed.func_149647_a(tabTripleRails);
                triplerailBlack.func_149647_a(tabTripleRails);
                triplerailDiamond.func_149647_a(tabTripleRails);
                triplerailEmerald.func_149647_a(tabTripleRails);
                triplerailObsidian.func_149647_a(tabTripleRails);
                triplerailLapis.func_149647_a(tabTripleRails);
                triplerailGlowing.func_149647_a(tabTripleRails);
                triplerailEnderPearl.func_149647_a(tabTripleRails);
                //New Rails
                enderPearlDiamondTriplerail.func_149647_a(tabTripleRails);
                //Old Rails
                triplerailArmed.func_149647_a(tabTripleRails);
                triplerailChain.func_149647_a(tabTripleRails);
                triplerailIce.func_149647_a(tabTripleRails);
                //triplerailPowered.setCreativeTab(tabTripleRails);
                triplerailNether.func_149647_a(tabTripleRails);
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
