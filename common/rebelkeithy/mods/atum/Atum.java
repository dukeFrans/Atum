package rebelkeithy.mods.atum;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityList;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import rebelkeithy.mods.atum.artifacts.IsisEmbrace;
import rebelkeithy.mods.atum.artifacts.ItemAkersToil;
import rebelkeithy.mods.atum.artifacts.ItemAnhursMight;
import rebelkeithy.mods.atum.artifacts.ItemAtensFury;
import rebelkeithy.mods.atum.artifacts.ItemGebsBlessing;
import rebelkeithy.mods.atum.artifacts.ItemHedetetsSting;
import rebelkeithy.mods.atum.artifacts.ItemHorusFlight;
import rebelkeithy.mods.atum.artifacts.ItemHorusSoaring;
import rebelkeithy.mods.atum.artifacts.ItemMaatsBalance;
import rebelkeithy.mods.atum.artifacts.ItemMnevisHorns;
import rebelkeithy.mods.atum.artifacts.ItemMonthusBlast;
import rebelkeithy.mods.atum.artifacts.ItemMonthusStrike;
import rebelkeithy.mods.atum.artifacts.ItemNeithsAudacity;
import rebelkeithy.mods.atum.artifacts.ItemNusFlux;
import rebelkeithy.mods.atum.artifacts.ItemNutsAgility;
import rebelkeithy.mods.atum.artifacts.ItemOsirisWill;
import rebelkeithy.mods.atum.artifacts.ItemPtahsDecadence;
import rebelkeithy.mods.atum.artifacts.ItemPtahsDestruction;
import rebelkeithy.mods.atum.artifacts.ItemRasGlory;
import rebelkeithy.mods.atum.artifacts.ItemSekhmetsWrath;
import rebelkeithy.mods.atum.artifacts.ItemShusBreath;
import rebelkeithy.mods.atum.artifacts.ItemSoteksRage;
import rebelkeithy.mods.atum.artifacts.ItemSpear;
import rebelkeithy.mods.atum.artifacts.arrow.EntityArrowExplosive;
import rebelkeithy.mods.atum.artifacts.arrow.EntityArrowVelocity;
import rebelkeithy.mods.atum.blocks.AtumStone;
import rebelkeithy.mods.atum.blocks.BlockArrowTrap;
import rebelkeithy.mods.atum.blocks.BlockAtumGlass;
import rebelkeithy.mods.atum.blocks.BlockAtumLeaves;
import rebelkeithy.mods.atum.blocks.BlockAtumLog;
import rebelkeithy.mods.atum.blocks.BlockAtumPane;
import rebelkeithy.mods.atum.blocks.BlockAtumPortal;
import rebelkeithy.mods.atum.blocks.BlockAtumSand;
import rebelkeithy.mods.atum.blocks.BlockAtumSapling;
import rebelkeithy.mods.atum.blocks.BlockAtumSlab;
import rebelkeithy.mods.atum.blocks.BlockAtumStairs;
import rebelkeithy.mods.atum.blocks.BlockAtumStone;
import rebelkeithy.mods.atum.blocks.BlockAtumWall;
import rebelkeithy.mods.atum.blocks.BlockDate;
import rebelkeithy.mods.atum.blocks.BlockFertileSoil;
import rebelkeithy.mods.atum.blocks.BlockFertileSoilTilled;
import rebelkeithy.mods.atum.blocks.BlockFlax;
import rebelkeithy.mods.atum.blocks.BlockPapyrus;
import rebelkeithy.mods.atum.blocks.BlockSandLayered;
import rebelkeithy.mods.atum.blocks.BlockShrub;
import rebelkeithy.mods.atum.blocks.ItemBlockAtumWall;
import rebelkeithy.mods.atum.blocks.ItemPapyrusPlant;
import rebelkeithy.mods.atum.blocks.ItemSandLayered;
import rebelkeithy.mods.atum.blocks.TileEntityArrowTrap;
import rebelkeithy.mods.atum.blocks.ores.BlockAtumOre;
import rebelkeithy.mods.atum.blocks.ores.BlockAtumRedstone;
import rebelkeithy.mods.atum.cursedchest.BlockChestSpawner;
import rebelkeithy.mods.atum.cursedchest.PharaohChest;
import rebelkeithy.mods.atum.cursedchest.TileEntityChestSpawner;
import rebelkeithy.mods.atum.cursedchest.TileEntityPharaohChest;
import rebelkeithy.mods.atum.entities.EntityBanditArcher;
import rebelkeithy.mods.atum.entities.EntityBanditWarlord;
import rebelkeithy.mods.atum.entities.EntityBanditWarrior;
import rebelkeithy.mods.atum.entities.EntityDesertWolf;
import rebelkeithy.mods.atum.entities.EntityDustySkeleton;
import rebelkeithy.mods.atum.entities.EntityGhost;
import rebelkeithy.mods.atum.entities.EntityMummy;
import rebelkeithy.mods.atum.entities.EntityPharaoh;
import rebelkeithy.mods.atum.entities.EntityStoneSoldier;
import rebelkeithy.mods.atum.entities.projectiles.EntityFireSpearCombined;
import rebelkeithy.mods.atum.entities.projectiles.EntityFireSpearSeperated;
import rebelkeithy.mods.atum.furnace.BlockLimeStoneFurnace;
import rebelkeithy.mods.atum.furnace.TileEntityLimestoneFurnace;
import rebelkeithy.mods.atum.items.ItemAtumBow;
import rebelkeithy.mods.atum.items.ItemLoot;
import rebelkeithy.mods.atum.items.ItemScepter;
import rebelkeithy.mods.atum.items.ItemScimitar;
import rebelkeithy.mods.atum.items.ItemStoneSoldierSword;
import rebelkeithy.mods.atum.items.ItemTexturedArmor;
import rebelkeithy.mods.atum.tools.LimestoneAxe;
import rebelkeithy.mods.atum.tools.LimestoneHoe;
import rebelkeithy.mods.atum.tools.LimestonePickaxe;
import rebelkeithy.mods.atum.tools.LimestoneShovel;
import rebelkeithy.mods.atum.tools.LimestoneSword;
import rebelkeithy.mods.atum.world.AtumWorldProvider;
import rebelkeithy.mods.atum.world.biome.BiomeGenAtumDesert;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// Start of post-modjam branch

@Mod(modid="Atum", name="Atum", version="0.0.0.1")
@NetworkMod(channels = {"Atum"}, clientSideRequired = true, serverSideRequired = false)
public class Atum 
{
	@Instance(value="Atum")
	public static Atum instance;
	
	@SidedProxy(clientSide = "rebelkeithy.mods.atum.ClientProxy", serverSide = "rebelkeithy.mods.atum.CommonProxy")
	public static CommonProxy proxy;
	
	public static AtumTab tabs = new AtumTab("Atum");
	
	public static BlockAtumPortal portal;
	public static Block cursedChest;
	public static Block atumSand;
	public static Block atumStone;
	public static Block atumCobble;
	public static Block atumLargeBrick;
	public static Block atumSmallBrick;
	public static Block atumCarvedBrick;
	public static BlockAtumSlab atumSlabs;
	public static BlockAtumSlab atumDoubleSlab;
	public static Block atumSmoothStairs;
	public static Block atumCobbleStairs;
	public static Block atumLargeStoneStairs;
	public static Block atumSmallStoneStairs;
	public static Block atumSandLayered;
	public static Block atumCrackedLargeBrick;
	public static Block atumWall;
	public static Block atumCrystalGlass;
	public static Block atumFramedGlass;
	public static Block atumPalmSapling;
	public static Block atumDateBlock;
	
	public static Block atumShrub;
	public static Block atumWeed;
	public static Block atumPapyrus;
	public static Block atumFlax;
	
	public static BlockFertileSoil atumFertileSoil;
	public static Block atumFertileSoilTilled;
	public static Block atumLog;
	public static Block atumLeaves;
	public static Block atumPlanks;
	public static Block thinCrystalGlass;
	public static Block thinFramedGlass;
	
	public static Block atumTrapArrow;
	public static Block atumPharaohChest;
	
	public static Block atumRedstoneOre;
	public static Block atumCoalOre;
	public static Block atumIronOre;
	public static Block atumGoldOre;
	public static Block atumLapisOre;
	public static Block atumDiamondOre;
	
	public static Item itemScarab;
	public static Item itemScimitar;
	public static Item itemScepter;
	public static Item itemStoneSoldierSword;
	public static Item itemBow;
	public static Item itemLoot;
	
	public static Item ptahsPick;
	public static Item soteksRage;
	public static Item osirisWill;
	public static Item akersToil;
	public static Item gebsBlessing;
	public static Item atensFury;
	public static Item rasGlory;
	public static Item sekhmetsWrath;
	public static Item nutsAgility;
	public static Item horusFlight;
	public static Item monthusStrike;
	public static Item anhursMight;
	public static Item hedetetsSting;
	public static Item horusSoaring;
	public static Item shusBreath;
	public static Item ptahsDestruction;
	public static Item monthusBlast;
	public static Item nusFlux;
	public static Item mnevisHorns;
	public static Item isisEmbrace;
	public static Item maatsBalance;
	
	public static Item limestoneShovel;
	public static Item limestonePickaxe;
	public static Item limestoneAxe;
	public static Item limestoneSword;
	public static Item limestoneHoe;
	
	public static Item mummyHelmet;
	public static Item mummyChest;
	public static Item mummyLegs;
	public static Item mummyBoots;
	
	public static Item wandererHelmet;
	public static Item wandererChest;
	public static Item wandererLegs;
	public static Item wandererBoots;
	
	public static Item desertHelmet;
	public static Item desertChest;
	public static Item desertLegs;
	public static Item desertBoots;
	
	public static Item itemPapyrusPlant;
	public static Item itemEctoplasm;
	public static Item itemStoneChunk;
	public static Item itemClothScrap;
	public static Item itemScroll;
	public static Item itemPelt;
	public static Item itemDate;
	public static Item itemLinen;
	public static Item itemFlax;
	public static Item itemFlaxSeeds;
	
	public static int dimensionID = 17;
	
	public static BiomeGenBase atumDesert;

	public static Block furnaceIdle;
	public static Block furnaceBurning;
	
	public static Item neithsAudacity;
	
	public static Item spear;

	public static Potion stun;

	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigAtum.initConfig();
		
		portal = new BlockAtumPortal(ConfigAtum.portalBlockID);
		cursedChest = new BlockChestSpawner(ConfigAtum.cursedChestID).setUnlocalizedName("AtumCursedChest").setHardness(4.0F).setCreativeTab(tabs);
		atumPharaohChest = new PharaohChest(ConfigAtum.pharaohChestID).setUnlocalizedName("AtumPharaohChest").setHardness(4.0F).setCreativeTab(tabs);
		atumSand = new BlockAtumSand(ConfigAtum.sandID).setUnlocalizedName("Atum:AtumSand").setStepSound(Block.soundSandFootstep).setHardness(0.5F).setCreativeTab(tabs);
		atumStone = new AtumStone(ConfigAtum.stoneID).setUnlocalizedName("Atum:AtumStone").setHardness(1.5F).setCreativeTab(tabs);
		atumCobble = new Block(ConfigAtum.cobbleID, Material.rock).setUnlocalizedName("Atum:AtumCobble").setHardness(2.0F).setCreativeTab(tabs);
		atumCrackedLargeBrick = new Block(ConfigAtum.crackedLargeBrickID, Material.rock).setUnlocalizedName("Atum:AtumCrackedLargeBrick").setHardness(2.0F).setCreativeTab(tabs);
		atumLargeBrick = new BlockAtumStone(ConfigAtum.largeBrickID, Material.rock).setUnlocalizedName("Atum:AtumBrickLarge").setHardness(2.0F).setCreativeTab(tabs);
		atumSmallBrick = new BlockAtumStone(ConfigAtum.smallBrickID, Material.rock).setUnlocalizedName("Atum:AtumBrickSmall").setHardness(2.0F).setCreativeTab(tabs);
		atumCarvedBrick = new BlockAtumStone(ConfigAtum.carvedBrickID, Material.rock).setUnlocalizedName("Atum:AtumBrickCarved").setHardness(2.0F).setCreativeTab(tabs);
		atumSlabs = (BlockAtumSlab) new BlockAtumSlab(ConfigAtum.slabID, false, Material.rock).setUnlocalizedName("Atum:AtumSlab").setHardness(2.0F).setCreativeTab(tabs);
		atumDoubleSlab = (BlockAtumSlab) new BlockAtumSlab(ConfigAtum.doubleSlabID, true, Material.rock).setUnlocalizedName("Atum:AtumDoubleSlab").setHardness(2.0F);
		atumSmoothStairs = (new BlockAtumStairs(ConfigAtum.smoothStairsID, atumStone, 0)).setUnlocalizedName("Atum:SmoothStair").setCreativeTab(tabs);
		atumCobbleStairs = (new BlockAtumStairs(ConfigAtum.cobbleStairsID, atumCobble, 0)).setUnlocalizedName("Atum:CobbleStair").setCreativeTab(tabs);
		atumLargeStoneStairs = (new BlockAtumStairs(ConfigAtum.largeStoneStairsID, atumLargeBrick, 0)).setUnlocalizedName("Atum:LargeStoneStair").setCreativeTab(tabs);
		atumSmallStoneStairs = (new BlockAtumStairs(ConfigAtum.smallStoneStairsID, atumSmallBrick, 0)).setUnlocalizedName("Atum:SmallStoneStair").setCreativeTab(tabs);
		atumShrub = (new BlockShrub(ConfigAtum.shrubID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Atum:Shrub").setCreativeTab(tabs);
		atumWeed = (new BlockShrub(ConfigAtum.weedID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Atum:Weed").setCreativeTab(tabs);
		atumPapyrus = (new BlockPapyrus(ConfigAtum.papyrusBlockID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Atum:AtumPapyrus");
		atumWall = (new BlockAtumWall(ConfigAtum.wallID, atumStone)).setUnlocalizedName("Atum:AtumStoneWall").setHardness(0.3F).setCreativeTab(tabs);
		atumCrystalGlass = (new BlockAtumGlass(ConfigAtum.crystalGlassID, "Atum:AtumCrystalGlass", Material.glass, false)).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("Atum:AtumCrystalGlass").setHardness(0.3F).setCreativeTab(tabs);
		atumFramedGlass = (new BlockAtumGlass(ConfigAtum.framedGlassID, "Atum:AtumFramedGlass", Material.glass, false)).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("Atum:AtumFramedGlass").setCreativeTab(tabs);
		atumPalmSapling = (new BlockAtumSapling(ConfigAtum.palmSaplingID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Atum:AtumPalmSapling").setCreativeTab(tabs);
		atumDateBlock = (new BlockDate(ConfigAtum.blockDateID, Material.plants)).setHardness(0.0F).setUnlocalizedName("Atum:AtumDate");
		atumFlax = (new BlockFlax(ConfigAtum.flaxBlockID)).setUnlocalizedName("Atum:FlaxBlock").setCreativeTab(tabs);

	    thinCrystalGlass = (new BlockAtumPane(ConfigAtum.thinCrystalGlassID, "Atum:AtumCrystalGlass", "thinglass_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("thinCrystalGlass").setCreativeTab(tabs);
	    thinFramedGlass = (new BlockAtumPane(ConfigAtum.thinFramedGlassID, "Atum:AtumFramedGlass", "Atum:thinglass_top", Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("thinFramedGlass").setCreativeTab(tabs);
		
	    atumSandLayered = (new BlockSandLayered(ConfigAtum.sandLayeredID)).setHardness(0.1F).setStepSound(Block.soundSnowFootstep).setUnlocalizedName("SandLayered").setLightOpacity(0).setCreativeTab(tabs);
	    
	    atumFertileSoil = (BlockFertileSoil) new BlockFertileSoil(ConfigAtum.fertileSoilID).setUnlocalizedName("Atum:FertileSoil").setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabs);
		atumFertileSoilTilled = new BlockFertileSoilTilled(ConfigAtum.fertileSoilTillID).setUnlocalizedName("Atum:FertileSoilTilled").setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabs);
	    atumLog = new BlockAtumLog(ConfigAtum.logID).setUnlocalizedName("AtumLogs").setHardness(2F).setStepSound(Block.soundWoodFootstep).setCreativeTab(tabs);
		atumLeaves = new BlockAtumLeaves(ConfigAtum.leavesID).setUnlocalizedName("AtumLeaves").setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("AtumLeaves").setCreativeTab(tabs);
	    atumPlanks = (new Block(ConfigAtum.plankID, Material.wood)).setUnlocalizedName("AtumPlanks").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("Atum:Planks").setCreativeTab(tabs);
		
		atumTrapArrow = new BlockArrowTrap(ConfigAtum.trapArrowID).setUnlocalizedName("FireTrap").setHardness(0.2F).setCreativeTab(tabs);
	    furnaceIdle = (new BlockLimeStoneFurnace(ConfigAtum.furnaceIdleID, false)).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("limestonefurnaceidle").setCreativeTab(tabs);
	    furnaceBurning = (new BlockLimeStoneFurnace(ConfigAtum.furnaceBurningID, true)).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setLightValue(0.875F).setUnlocalizedName("limestonefurnaceactive");
		
	    atumRedstoneOre = new BlockAtumRedstone(ConfigAtum.redstoneOreID).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Atum:AtumRedstone").setCreativeTab(tabs);
	    atumGoldOre = (new BlockAtumOre(ConfigAtum.goldOreID)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Atum:AtumGold").setCreativeTab(tabs);
	    atumIronOre = (new BlockAtumOre(ConfigAtum.ironOreID)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Atum:AtumIron").setCreativeTab(tabs);
	    atumCoalOre = (new BlockAtumOre(ConfigAtum.coalOreID)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Atum:AtumCoal").setCreativeTab(tabs);
	    atumLapisOre = (new BlockAtumOre(ConfigAtum.lapisOreID)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Atum:AtumLapis").setCreativeTab(tabs);
	    atumDiamondOre = (new BlockAtumOre(ConfigAtum.diamondOreID)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Atum:AtumDiamond").setCreativeTab(tabs);
		
		ForgeHooks.canToolHarvestBlock(atumSand, 0, new ItemStack(Item.shovelIron));
		MinecraftForge.setBlockHarvestLevel(atumSand, "shovel", 0);
		
		
		LanguageRegistry.addName(atumStone, "Limestone");
		LanguageRegistry.addName(atumSand, "Limestone sand");
		LanguageRegistry.addName(atumCobble, "Cracked Limestone");
		
		//EntityRegistry.registerModEntity(EntityMummy.class, "AtumMummy", ConfigAtum.mummyID, this, 16, 20, true);
		
		ArrayList<BiomeGenBase> biomeList = new ArrayList<BiomeGenBase>();
		for(int i = 0; i < BiomeGenBase.biomeList.length; i++)
		{
			if(BiomeGenBase.biomeList[i] != null && BiomeGenBase.biomeList[i].biomeID != ConfigAtum.biomeAtumDesertID)
			{
				biomeList.add(BiomeGenBase.biomeList[i]);
			}
		}
		
		int entityID;
		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityMummy.class, "AtumMummy", entityID);
		EntityList.addMapping(EntityMummy.class, "AtumMummy", entityID, 0x515838, 0x868F6B);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityBanditWarrior.class, "AtumBanditWarrior", entityID);
		EntityList.addMapping(EntityBanditWarrior.class, "AtumBanditWarrior", entityID, 0xC2C2C2, 0x040F85);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityBanditArcher.class, "AtumBanditArcher", entityID);
		EntityList.addMapping(EntityBanditArcher.class, "AtumBanditArcher", entityID, 0xC2C2C2, 0x7E0C0C);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityPharaoh.class, "AtumPharaoh", entityID);
		EntityList.addMapping(EntityPharaoh.class, "AtumPharaoh", entityID, 0xD4BC37, 0x3A4BE0);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityDustySkeleton.class, "AtumDustySkeleton", entityID);
		EntityList.addMapping(EntityDustySkeleton.class, "AtumDustySkeleton", entityID, 0xB59C7D, 0x6F5C43);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityGhost.class, "AtumDesertGhost", entityID);
		EntityList.addMapping(EntityGhost.class, "AtumDesertGhost", entityID, 0xE7DBC8, 0xAD9467);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityStoneSoldier.class, "AtumStoneSoldier", entityID);
		EntityList.addMapping(EntityStoneSoldier.class, "AtumStoneSoldier", entityID, 0x918354, 0x695D37);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityDesertWolf.class, "AtumDesertWolf", entityID);
		EntityList.addMapping(EntityDesertWolf.class, "AtumDesertWolf", entityID, 0x918354, 0x695D37);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityBanditWarlord.class, "AtumBanditWarlord", entityID);
		EntityList.addMapping(EntityBanditWarlord.class, "AtumBanditWarlord", entityID, 0x918354, 0x695D37);

		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntityFireSpearCombined.class, "FireSpearCombined", entityID, this, 64, 1, true);
		entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerModEntity(EntityFireSpearSeperated.class, "FireSpearSeperated", entityID, this, 64, 1, true);
		
		EntityRegistry.registerModEntity(EntityArrowVelocity.class, "ArrowVeloctiy", 0, this, 64, 1, true);
		EntityRegistry.registerModEntity(EntityArrowExplosive.class, "ArrowExplosive", 0, this, 64, 1, true);
		
		LanguageRegistry.instance().addStringLocalization("entity.AtumMummy.name", "Mummy");
		LanguageRegistry.instance().addStringLocalization("entity.AtumBanditWarrior.name", "Brigand");
		LanguageRegistry.instance().addStringLocalization("entity.AtumBanditArcher.name", "Nomad");
		LanguageRegistry.instance().addStringLocalization("entity.AtumPharaoh.name", "Pharaoh");
		LanguageRegistry.instance().addStringLocalization("entity.AtumDustySkeleton.name", "Forsaken");
		LanguageRegistry.instance().addStringLocalization("entity.AtumDesertGhost.name", "Wraith");
		LanguageRegistry.instance().addStringLocalization("entity.AtumStoneSoldier.name", "Tombguard");
		LanguageRegistry.instance().addStringLocalization("entity.AtumDesertWolf.name", "Desert Wolf");
		LanguageRegistry.instance().addStringLocalization("entity.AtumBanditWarlord.name", "Warlord");
		
		//EntityList.addMapping(EntityBandit.class, "AtumBanditArcher", ConfigAtum.banditArcherID, 0xC2C2C2, 0x070C0C);
		
		GameRegistry.registerBlock(atumSand, "AtumSand");
		GameRegistry.registerBlock(atumStone, "AtumStone");
		GameRegistry.registerBlock(atumCobble, "AtumCobble");
		GameRegistry.registerBlock(atumLargeBrick, "AtumBrickLarge");
		GameRegistry.registerBlock(atumSmallBrick, "AtumBrickSmall");
		GameRegistry.registerBlock(atumCarvedBrick, "AtumBrickCarved");
		GameRegistry.registerBlock(atumCrackedLargeBrick, "AtumCrackedLargeBrick");
		GameRegistry.registerBlock(atumSlabs, "AtumSlabs");
		GameRegistry.registerBlock(atumSmoothStairs, "AtumSmoothStairs");
		GameRegistry.registerBlock(atumCobbleStairs, "AtumCobbleStairs");
		GameRegistry.registerBlock(atumLargeStoneStairs, "AtumLargeStoneStairs");
		GameRegistry.registerBlock(atumSmallStoneStairs, "AtumSmallStoneStairs");
		GameRegistry.registerBlock(atumShrub, "AtumShrub");
		GameRegistry.registerBlock(atumLog, "AtumLog");
		GameRegistry.registerBlock(atumLeaves, "AtumLeaves");
		GameRegistry.registerBlock(atumPlanks, "AtumPlanks");
		GameRegistry.registerBlock(atumWeed, "AtumWeed");
		GameRegistry.registerBlock(atumTrapArrow, "AtumArmorTrap");
		GameRegistry.registerBlock(cursedChest, "BlockCursedChest");
		GameRegistry.registerBlock(atumPharaohChest, "BlockPharaohChest");
		GameRegistry.registerBlock(atumSandLayered, ItemSandLayered.class, "BlockSandLayered");
		GameRegistry.registerBlock(furnaceIdle, "limestonefurnaceidle");
		GameRegistry.registerBlock(furnaceBurning, "limestonefurnaceburning");
		GameRegistry.registerBlock(atumRedstoneOre, "atumRedstoneOre");
		GameRegistry.registerBlock(atumCoalOre, "atumCoalOre");
		GameRegistry.registerBlock(atumIronOre, "atumIronOre");
		GameRegistry.registerBlock(atumGoldOre, "atumGoldOre");
		GameRegistry.registerBlock(atumLapisOre, "atumLapisOre");
		GameRegistry.registerBlock(atumDiamondOre, "atumDiamondOre");
		GameRegistry.registerBlock(atumPapyrus, "atumPapyrusBlock");
		GameRegistry.registerBlock(atumWall, ItemBlockAtumWall.class, "AtumWalls");
		GameRegistry.registerBlock(atumCrystalGlass, "AtumCrystalGlass");
		GameRegistry.registerBlock(atumFramedGlass, "AtumFramedGlass");
		GameRegistry.registerBlock(atumPalmSapling, "AtumPalmSapling");
		GameRegistry.registerBlock(atumDateBlock, "AtumDateBlock");
		GameRegistry.registerBlock(atumFlax, "Flax");
		GameRegistry.registerBlock(atumFertileSoil, "FertileSoil");
		GameRegistry.registerBlock(atumFertileSoilTilled, "FertileSoilTilled");
		GameRegistry.registerBlock(thinCrystalGlass, "ThinCrystalGlass");
		GameRegistry.registerBlock(thinFramedGlass, "ThinFramedGlass");
		
		GameRegistry.registerTileEntity(TileEntityChestSpawner.class, "CursedChest");
		GameRegistry.registerTileEntity(TileEntityPharaohChest.class, "PharaohChest");
		GameRegistry.registerTileEntity(TileEntityArrowTrap.class, "ArrowTrap");
		GameRegistry.registerTileEntity(TileEntityLimestoneFurnace.class, "LimestoneFurnace");
		
		Item.itemsList[ConfigAtum.slabID] = (new ItemSlab(atumSlabs.blockID - 256, atumSlabs, atumDoubleSlab, false)).setUnlocalizedName("woodSlab").setCreativeTab(tabs);
        Item.itemsList[atumDoubleSlab.blockID] = (new ItemSlab(atumDoubleSlab.blockID - 256, atumSlabs, atumDoubleSlab, true)).setUnlocalizedName("woodSlab");
        
		
		itemScarab = new ItemPortalSpawner(ConfigAtum.portalSpawnerID).setUnlocalizedName("Atum:Scarab").setCreativeTab(tabs);
		atumDesert = (new BiomeGenAtumDesert(ConfigAtum.biomeAtumDesertID)).setColor(16421912).setBiomeName("AtumDesert").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.1F, 0.2F);
		itemLoot = new ItemLoot(ConfigAtum.lootID).setCreativeTab(tabs);
		itemDate = (new ItemFood(ConfigAtum.itemDateID, 5, 1.5F, false)).setUnlocalizedName("Atum:Date").setCreativeTab(tabs);
		
		itemScimitar = (new ItemScimitar(ConfigAtum.scimitarID, EnumToolMaterial.IRON)).setUnlocalizedName("Atum:Scimitar").setCreativeTab(tabs);
		itemBow = (new ItemAtumBow(ConfigAtum.bowID)).setUnlocalizedName("Atum:Bow").setCreativeTab(tabs);
		itemStoneSoldierSword = new ItemStoneSoldierSword(ConfigAtum.stoneSwordID, EnumToolMaterial.IRON).setUnlocalizedName("Atum:StoneSoldierSword").setCreativeTab(tabs);
		itemScepter = new ItemScepter(ConfigAtum.scepterID, EnumToolMaterial.GOLD).setUnlocalizedName("Atum:Scepter").setCreativeTab(tabs);
		
		ptahsPick = new ItemPtahsDecadence(ConfigAtum.ptahsPickID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:PtahsDecadence").setCreativeTab(tabs);
		soteksRage = new ItemSoteksRage(ConfigAtum.soteksRageID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:SoteksRage").setCreativeTab(tabs);
		osirisWill = new ItemOsirisWill(ConfigAtum.osirisWillID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:OsirisWill").setCreativeTab(tabs);
		akersToil = new ItemAkersToil(ConfigAtum.akersToilID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:AkersToil").setCreativeTab(tabs);
		gebsBlessing = new ItemGebsBlessing(ConfigAtum.gebsBlessingID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:GebsBlessing").setCreativeTab(tabs);
		atensFury = new ItemAtensFury(ConfigAtum.atensFuryID).setUnlocalizedName("Atum:AtensFury").setCreativeTab(tabs);
		rasGlory = new ItemRasGlory(ConfigAtum.rasGloryID, EnumArmorMaterial.DIAMOND, 0, 0).setTextureFile("EgyptianArmor_1").setUnlocalizedName("Atum:RasGlory").setCreativeTab(tabs);
		sekhmetsWrath = new ItemSekhmetsWrath(ConfigAtum.sekhmetsWrathID, EnumArmorMaterial.DIAMOND, 1, 1).setTextureFile("EgyptianArmor_1").setUnlocalizedName("Atum:SekhmetsWrath").setCreativeTab(tabs);
		nutsAgility = new ItemNutsAgility(ConfigAtum.nutsAgilityID, EnumArmorMaterial.DIAMOND, 2, 2).setTextureFile("EgyptianArmor_2").setUnlocalizedName("Atum:NutsAgility").setCreativeTab(tabs);
		horusFlight = new ItemHorusFlight(ConfigAtum.horusFlightID, EnumArmorMaterial.DIAMOND, 3, 3).setTextureFile("EgyptianArmor_1").setUnlocalizedName("Atum:HorusFlight").setCreativeTab(tabs);
		monthusStrike = new ItemMonthusStrike(ConfigAtum.monthusStrikeID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:MonthusStrike").setCreativeTab(tabs);
		anhursMight = new ItemAnhursMight(ConfigAtum.anhursMightID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:AnhursMight").setCreativeTab(tabs);
		hedetetsSting = new ItemHedetetsSting(ConfigAtum.hedetetsStingID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:HedetetsSting").setCreativeTab(tabs);
		horusSoaring = new ItemHorusSoaring(ConfigAtum.horusSoaringID).setUnlocalizedName("Atum:HorusSoaring").setCreativeTab(tabs);
		shusBreath = new ItemShusBreath(ConfigAtum.shusBreathID).setUnlocalizedName("Atum:ShusBreath").setCreativeTab(tabs);
		ptahsDestruction = new ItemPtahsDestruction(ConfigAtum.ptahsDestructionID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:PtahsDestruction").setCreativeTab(tabs);
		monthusBlast = new ItemMonthusBlast(ConfigAtum.monthusBlastID).setUnlocalizedName("Atum:MonthusBlast").setCreativeTab(tabs);
		nusFlux = new ItemNusFlux(ConfigAtum.nusFluxID, EnumToolMaterial.EMERALD).setUnlocalizedName("Atum:NusFlux").setCreativeTab(tabs);
		mnevisHorns = new ItemMnevisHorns(ConfigAtum.mnevisHornsID, EnumArmorMaterial.DIAMOND, 0, 0).setTextureFile("RubyArtifactArmor_1").setUnlocalizedName("Atum:MnevisHorns").setCreativeTab(tabs);
		isisEmbrace = new IsisEmbrace(ConfigAtum.isisEmbraceID, EnumArmorMaterial.DIAMOND, 1, 1).setTextureFile("RubyArtifactArmor_1").setUnlocalizedName("Atum:IsisEmbrace").setCreativeTab(tabs);
		maatsBalance = new ItemMaatsBalance(ConfigAtum.maatsBalanceID, EnumArmorMaterial.DIAMOND, 2, 2).setTextureFile("RubyArtifactArmor_2").setUnlocalizedName("Atum:MaatsBalance").setCreativeTab(tabs);
		
		limestoneShovel = new LimestoneShovel(ConfigAtum.limestoneShovelID, EnumToolMaterial.STONE).setUnlocalizedName("Atum:LimestoneShovel").setCreativeTab(tabs);
		limestonePickaxe = new LimestonePickaxe(ConfigAtum.limestonePickaxeID, EnumToolMaterial.STONE).setUnlocalizedName("Atum:LimestonePickaxe").setCreativeTab(tabs);
		limestoneAxe = new LimestoneAxe(ConfigAtum.limestoneAxeID, EnumToolMaterial.STONE).setUnlocalizedName("Atum:LimestoneAxe").setCreativeTab(tabs);
		limestoneSword = new LimestoneSword(ConfigAtum.limestoneSwordID, EnumToolMaterial.STONE).setUnlocalizedName("Atum:LimestoneSword").setCreativeTab(tabs);
		limestoneHoe = new LimestoneHoe(ConfigAtum.limestoneHoeID, EnumToolMaterial.STONE).setUnlocalizedName("Atum:LimestoneHoe").setCreativeTab(tabs);
		
		EnumArmorMaterial mummyEnum = EnumHelper.addArmorMaterial("Mummy", 5, new int[] {1, 3, 2, 1}, 15);
	    mummyHelmet = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.mummyHelmetID, mummyEnum, 0, 0)).setRepairItem(ConfigAtum.clothScrapID+256).setTextureFile("MummyArmor_1").setUnlocalizedName("Atum:MummyHelmet").setCreativeTab(tabs);
	    mummyChest = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.mummyChestID, mummyEnum, 0, 1)).setRepairItem(ConfigAtum.clothScrapID+256).setTextureFile("MummyArmor_1").setUnlocalizedName("Atum:MummyChest").setCreativeTab(tabs);
	    mummyLegs = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.mummyLegsID, mummyEnum, 0, 2)).setRepairItem(ConfigAtum.clothScrapID+256).setTextureFile("MummyArmor_2").setUnlocalizedName("Atum:MummyLegs").setCreativeTab(tabs);
	    mummyBoots = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.mummyBootsID, mummyEnum, 0, 3)).setRepairItem(ConfigAtum.clothScrapID+256).setTextureFile("MummyArmor_1").setUnlocalizedName("Atum:MummyBoots").setCreativeTab(tabs);

		EnumArmorMaterial wandererEnum = EnumHelper.addArmorMaterial("Wanderer", 10, new int[] {2, 3, 3, 2}, 15);
	    wandererHelmet = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.wandererHelmetID, wandererEnum, 0, 0)).setRepairItem(ConfigAtum.linenID+256).setTextureFile("WandererArmor_1").setUnlocalizedName("Atum:WandererHelmet").setCreativeTab(tabs);
	    wandererChest = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.wandererChestID, wandererEnum, 0, 1)).setRepairItem(ConfigAtum.linenID+256).setTextureFile("WandererArmor_1").setUnlocalizedName("Atum:WandererChest").setCreativeTab(tabs);
	    wandererLegs = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.wandererLegsID, wandererEnum, 0, 2)).setRepairItem(ConfigAtum.linenID+256).setTextureFile("WandererArmor_2").setUnlocalizedName("Atum:WandererLegs").setCreativeTab(tabs);
	    wandererBoots = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.wandererBootsID, wandererEnum, 0, 3)).setRepairItem(ConfigAtum.linenID+256).setTextureFile("WandererArmor_1").setUnlocalizedName("Atum:WandererBoots").setCreativeTab(tabs);

		EnumArmorMaterial desertEnum = EnumHelper.addArmorMaterial("Desert", 20, new int[] {3, 6, 5, 3}, 15);
	    desertHelmet = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.desertHelmetID, desertEnum, 0, 0)).setRepairItem(Item.ingotIron.itemID).setTextureFile("DesertArmor_1").setUnlocalizedName("Atum:DesertHelmet").setCreativeTab(tabs);
	    desertChest = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.desertChestID, desertEnum, 0, 1)).setRepairItem(Item.ingotIron.itemID).setTextureFile("DesertArmor_1").setUnlocalizedName("Atum:DesertChest").setCreativeTab(tabs);
	    desertLegs = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.desertLegsID, desertEnum, 0, 2)).setRepairItem(Item.ingotIron.itemID).setTextureFile("DesertArmor_2").setUnlocalizedName("Atum:DesertLegs").setCreativeTab(tabs);
	    desertBoots = (ItemTexturedArmor)(new ItemTexturedArmor(ConfigAtum.desertBootsID, desertEnum, 0, 3)).setRepairItem(Item.ingotIron.itemID).setTextureFile("DesertArmor_1").setUnlocalizedName("Atum:DesertBoots").setCreativeTab(tabs);
	    
		itemPapyrusPlant = new ItemPapyrusPlant(ConfigAtum.itemPapyrusPlantID, atumPapyrus).setUnlocalizedName("Atum:PapyrusPlantItem").setCreativeTab(tabs);
		itemEctoplasm = new Item(ConfigAtum.ectoplasmID).setUnlocalizedName("Atum:Ectoplasm").setCreativeTab(tabs);
		itemStoneChunk = new Item(ConfigAtum.stoneChunkID).setUnlocalizedName("Atum:StoneChunk").setCreativeTab(tabs);
		itemClothScrap = new Item(ConfigAtum.clothScrapID).setUnlocalizedName("Atum:ClothScrap").setCreativeTab(tabs);
		itemScroll = new Item(ConfigAtum.scrollID).setUnlocalizedName("Atum:Scroll").setCreativeTab(tabs);
		itemPelt = new Item(ConfigAtum.peltID).setUnlocalizedName("Atum:WolfPelt").setCreativeTab(tabs);
		itemLinen = new Item(ConfigAtum.linenID).setUnlocalizedName("Atum:Linen").setCreativeTab(tabs);
		itemFlax = new Item(ConfigAtum.itemFlaxID).setUnlocalizedName("Atum:FlaxItem").setCreativeTab(tabs);
		itemFlaxSeeds = new ItemSeeds(ConfigAtum.itemFlaxSeedsID, atumFlax.blockID, Block.tilledField.blockID).setUnlocalizedName("Atum:FlaxSeeds").setCreativeTab(tabs);
		
		neithsAudacity = new ItemNeithsAudacity(ConfigAtum.neithsAudacityID).setUnlocalizedName("Atum:NeithsAudacity").setCreativeTab(tabs);
	
		spear = new ItemSpear(ConfigAtum.spearID).setUnlocalizedName("Atum:FireSpear").setCreativeTab(tabs);
		
		MinecraftForge.setToolClass(akersToil, "shovel", 4);
		MinecraftForge.setToolClass(limestoneShovel, "shovel", 1);
		MinecraftForge.setToolClass(limestoneAxe, "axe", 1);
		MinecraftForge.setToolClass(limestonePickaxe, "pickaxe", 1);
		MinecraftForge.setToolClass(ptahsDestruction, "pickaxe", 3);
		
		MinecraftForge.setBlockHarvestLevel(atumCoalOre, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(atumIronOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(atumGoldOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(atumLapisOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(atumDiamondOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(atumRedstoneOre, "pickaxe", 2);

		proxy.registerModelRenderers();
		proxy.registerTickHandlers();
		proxy.preloadImages();
		proxy.registerParticles();
		MinecraftForge.EVENT_BUS.register(new BonemealEventListener());
		MinecraftForge.EVENT_BUS.register(new FallDamageListener());
		MinecraftForge.EVENT_BUS.register(new UseHoeEventListener());
		//MinecraftForge.EVENT_BUS.register(new MobSpawnController());
		NetworkRegistry.instance().registerGuiHandler(this, new AtumGuiHandler());
	}
	
	@Init
	public void init(FMLInitializationEvent event)
	{
		DimensionManager.registerProviderType(Atum.dimensionID, AtumWorldProvider.class, true);
		DimensionManager.registerDimension(Atum.dimensionID , Atum.dimensionID);

		stun = new PotionStun(21, true, 8171462).setPotionName("potion.stun").setIconIndex(0, 0);
		
		addNames();
		
		addRecipes();
		addShapelessRecipes();
		addOreDictionaryEntries();
		addSmeltingRecipes();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public void addRecipes()
	{	
	    // Brick recipes
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(atumLargeBrick, 4), "XX", "XX", 'X', atumStone));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(atumSmallBrick, 4), "XX", "XX", 'X', atumCobble));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(atumCarvedBrick, 1), atumStone));
		
		// Stair recipes
		GameRegistry.addRecipe(new ItemStack(atumSmoothStairs, 6), "X  ", "XX ", "XXX", 'X', atumStone);
		GameRegistry.addRecipe(new ItemStack(atumCobbleStairs, 6), "X  ", "XX ", "XXX", 'X', atumCobble);
		GameRegistry.addRecipe(new ItemStack(atumLargeStoneStairs, 6), "X  ", "XX ", "XXX", 'X', atumLargeBrick);
		GameRegistry.addRecipe(new ItemStack(atumSmallStoneStairs, 6), "X  ", "XX ", "XXX", 'X', atumSmallBrick);
		
		// Slab recipes
		GameRegistry.addRecipe(new ItemStack(atumSlabs, 6, 0), "XXX", 'X', atumStone);
		GameRegistry.addRecipe(new ItemStack(atumSlabs, 6, 1), "XXX", 'X', atumCobble);
		GameRegistry.addRecipe(new ItemStack(atumSlabs, 6, 2), "XXX", 'X', atumLargeBrick);
		GameRegistry.addRecipe(new ItemStack(atumSlabs, 6, 3), "XXX", 'X', atumSmallBrick);
		
		// Wall recipes
		GameRegistry.addRecipe(new ItemStack(atumWall, 6, 0), "XXX", "XXX", 'X', atumStone);
        GameRegistry.addRecipe(new ItemStack(atumWall, 6, 1), "XXX", "XXX", 'X', atumCobble);
        GameRegistry.addRecipe(new ItemStack(atumWall, 6, 2), "XXX", "XXX", 'X', atumLargeBrick);
        GameRegistry.addRecipe(new ItemStack(atumWall, 6, 3), "XXX", "XXX", 'X', atumSmallBrick);
        
        // Crystal glass to framed glass
        GameRegistry.addRecipe(new ItemStack(atumFramedGlass), " X ", "XSX", " X ", 'X', Item.stick, 'S', atumCrystalGlass);
        
        // Cracked large bricks recipe
		GameRegistry.addRecipe(new ItemStack(atumCrackedLargeBrick, 4), "XX", "XX", 'X', itemStoneChunk);
		
		// Xp bottle recipe
		GameRegistry.addRecipe(new ItemStack(Item.expBottle), " X ", "XBX", " X ", 'X', itemEctoplasm, 'B', Item.potion);

		// Limestone tool recipes
		GameRegistry.addRecipe(new ItemStack(limestoneSword), "L", "L", "S", 'L', atumStone, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(limestoneShovel), "L", "S", "S", 'L', atumStone, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(limestonePickaxe), "LLL", " S ", " S ", 'L', atumStone, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(limestoneAxe), "LL", "LS", " S", 'L', atumStone, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(limestoneHoe), "LL", " S", " S", 'L', atumStone, 'S', Item.stick);
		
		// Mummy armor recipes
		GameRegistry.addRecipe(new ItemStack(mummyHelmet), "XXX", "X X", 'X', itemClothScrap);
		GameRegistry.addRecipe(new ItemStack(mummyChest), "X X", "XXX", "XXX", 'X', itemClothScrap);
		GameRegistry.addRecipe(new ItemStack(mummyLegs), "XXX", "X X", "X X", 'X', itemClothScrap);
		GameRegistry.addRecipe(new ItemStack(mummyBoots), "X X", "X X", 'X', itemClothScrap);
		
		// Wanderer's armor recipes
		GameRegistry.addRecipe(new ItemStack(wandererHelmet), "XXX", "X X", 'X', itemLinen);
		GameRegistry.addRecipe(new ItemStack(wandererChest), "X X", "XXX", "XXX", 'X', itemLinen);
		GameRegistry.addRecipe(new ItemStack(wandererLegs), "XXX", "X X", "X X", 'X', itemLinen);
		GameRegistry.addRecipe(new ItemStack(wandererBoots), "X X", "X X", 'X', itemLinen);
		
		// Linen from flax
		GameRegistry.addRecipe(new ItemStack(itemLinen), "XXX", 'X', itemFlax);
		
		// Bottles out of Crystal glass
		GameRegistry.addRecipe(new ItemStack(Item.glassBottle, 3), "X X", " X ", 'X', atumCrystalGlass);
		
		// Thin Glass
		GameRegistry.addRecipe(new ItemStack(thinCrystalGlass, 16), "XXX", "XXX", 'X', atumCrystalGlass);
		GameRegistry.addRecipe(new ItemStack(thinFramedGlass, 16), "XXX", "XXX", 'X', atumFramedGlass);
		
		// Scroll from papyrus
		GameRegistry.addRecipe(new ItemStack(itemScroll), "XXX", "SXS", "XXX", 'X', Atum.itemPapyrusPlant, 'S', Item.stick);
		
		// Scarab recipe
		GameRegistry.addRecipe(new ItemStack(itemScarab), " G ", "GDG", " G ", 'G', Item.ingotGold, 'D', Item.diamond);
		
		// Furnace recipe
		GameRegistry.addRecipe(new ItemStack(furnaceIdle), "XXX", "X X", "XXX", 'X', atumCobble);
	}
	
	public void addSmeltingRecipes()
	{
	    // Ore smelting recipes
	    FurnaceRecipes.smelting().addSmelting(atumIronOre.blockID, 0, new ItemStack(Item.ingotIron), 0.7F);
        FurnaceRecipes.smelting().addSmelting(atumCoalOre.blockID, new ItemStack(Item.coal), 0.1F);
        FurnaceRecipes.smelting().addSmelting(atumRedstoneOre.blockID, new ItemStack(Item.redstone), 0.7F);
        FurnaceRecipes.smelting().addSmelting(atumLapisOre.blockID, new ItemStack(Item.dyePowder, 1, 4), 0.2F);
        FurnaceRecipes.smelting().addSmelting(atumGoldOre.blockID, new ItemStack(Item.ingotGold), 1.0F);
        FurnaceRecipes.smelting().addSmelting(atumDiamondOre.blockID, new ItemStack(Item.diamond), 1.0F);
        
        // Palm log to charcoal
        FurnaceRecipes.smelting().addSmelting(atumLog.blockID, new ItemStack(Item.coal, 1, 1), 0.15F);
        
        // Atum cobble to Atum stone
        FurnaceRecipes.smelting().addSmelting(atumCobble.blockID, new ItemStack(atumStone), 0.1F);
        
        // Atum sand to crystal glass
        FurnaceRecipes.smelting().addSmelting(atumSand.blockID, new ItemStack(atumCrystalGlass), 0.1F);
	}
	
	public void addOreDictionaryEntries()
	{
	    // Palm log to "logWood"
	    OreDictionary.registerOre("logWood", atumLog);
	    
	    // Palm planks to "plankWood"
	    OreDictionary.registerOre("plankWood", atumPlanks);
	}
	
	public void addShapelessRecipes()
	{
	    // Palm planks from Palm logs
	    GameRegistry.addShapelessRecipe(new ItemStack(atumPlanks, 4), atumLog);
	    
	    // Desert armor from iron armor
	    GameRegistry.addShapelessRecipe(new ItemStack(desertHelmet), wandererHelmet, Item.helmetIron);
        GameRegistry.addShapelessRecipe(new ItemStack(desertChest), wandererChest, Item.plateIron);
        GameRegistry.addShapelessRecipe(new ItemStack(desertLegs), wandererLegs, Item.legsIron);
        GameRegistry.addShapelessRecipe(new ItemStack(desertBoots), wandererBoots, Item.bootsIron);
        
        // Atum (Strange) sand to normal vanilla sand
        GameRegistry.addShapelessRecipe(new ItemStack(Block.sand), atumSand);
        
        // Linen cloth to string
        GameRegistry.addShapelessRecipe(new ItemStack(Item.silk, 3), itemFlax);
	}
	
	public void addNames()
	{
		LanguageRegistry.addName(atumSand, "Strange Sand");
		LanguageRegistry.addName(atumStone, "Limestone");
		LanguageRegistry.addName(atumCobble, "Cracked Limestone");
		LanguageRegistry.addName(atumLargeBrick, "Large Limestone Bricks");
		LanguageRegistry.addName(atumSmallBrick, "Small Limestone Bricks");
		LanguageRegistry.addName(atumCarvedBrick, "Carved Limestone");		
		LanguageRegistry.addName(atumCrackedLargeBrick, "Cracked Large Limestone Bricks");		
		LanguageRegistry.addName(atumSmoothStairs, "Limestone Stairs");
		LanguageRegistry.addName(atumCobbleStairs, "Cracked Limestone Stairs");
		LanguageRegistry.addName(atumLargeStoneStairs, "Large Limestone Brick Stairs");
		LanguageRegistry.addName(atumSmallStoneStairs, "Small Limestone Brick Stairs");
		LanguageRegistry.addName(atumShrub, "Desert Shrub");
		LanguageRegistry.addName(atumLog, "Palm Log");
		LanguageRegistry.addName(atumPlanks, "Palm Planks");
		LanguageRegistry.addName(atumLeaves, "Palm Leaves");
		LanguageRegistry.addName(atumWeed, "Desert Shrub");
		LanguageRegistry.addName(atumTrapArrow, "Fire Trap");
		LanguageRegistry.addName(cursedChest, "Cursed Chest");
		LanguageRegistry.addName(atumPharaohChest, "Pharaoh's Chest");
		LanguageRegistry.addName(atumSandLayered, "Strange Sand");
		LanguageRegistry.addName(furnaceIdle, "Limestone Furnace");
		LanguageRegistry.addName(atumRedstoneOre, "Redstone Ore");
		LanguageRegistry.addName(atumCoalOre, "Coal Ore");
		LanguageRegistry.addName(atumIronOre, "Iron Ore");
		LanguageRegistry.addName(atumGoldOre, "Gold Ore");
		LanguageRegistry.addName(atumLapisOre, "Lapis Ore");
		LanguageRegistry.addName(atumDiamondOre, "Diamond Ore");
		LanguageRegistry.addName(new ItemStack(atumSlabs, 6, 0), "Limestone Slabs");
		LanguageRegistry.addName(new ItemStack(atumSlabs, 6, 1), "Cracked Limestone Slabs");
		LanguageRegistry.addName(new ItemStack(atumSlabs, 6, 2), "Large Limestone Brick Slabs");
		LanguageRegistry.addName(new ItemStack(atumSlabs, 6, 3), "Small Limestone Brick Slabs");
		LanguageRegistry.addName(atumPapyrus, "Papyrus");
		LanguageRegistry.addName(new ItemStack(atumWall, 6, 0), "Limestone Wall");
        LanguageRegistry.addName(new ItemStack(atumWall, 6, 1), "Cracked Limestone Wall");
        LanguageRegistry.addName(new ItemStack(atumWall, 6, 2), "Large Limestone Brick Wall");
        LanguageRegistry.addName(new ItemStack(atumWall, 6, 3), "Small Limestone Brick Wall");
        LanguageRegistry.addName(atumCrystalGlass, "Crystal Glass");
        LanguageRegistry.addName(atumFramedGlass, "Framed Crystal Glass");
        LanguageRegistry.addName(atumPalmSapling, "Palm Sapling");
        LanguageRegistry.addName(atumDateBlock, "Date Block");
        LanguageRegistry.addName(atumFertileSoil, "Fertile Soil");
        LanguageRegistry.addName(atumFertileSoilTilled, "Fertile Soil Tilled");
        LanguageRegistry.addName(thinCrystalGlass, "Crystal Glass Panes");
        LanguageRegistry.addName(thinFramedGlass, "Framed Crystal Glass Panes");
		
		LanguageRegistry.addName(itemScarab, "Golden Scarab");
		LanguageRegistry.addName(itemScimitar, "Scimitar");
		LanguageRegistry.addName(itemBow, "Shortbow");
		LanguageRegistry.addName(itemStoneSoldierSword, "Ancient Stone Sword");
		LanguageRegistry.addName(itemEctoplasm, "Ectoplasm");
		LanguageRegistry.addName(itemStoneChunk, "Limestone Chunk");
		LanguageRegistry.addName(itemClothScrap, "Cloth Scrap");
		LanguageRegistry.addName(itemScepter, "Royal Scepter");
		LanguageRegistry.addName(itemPapyrusPlant, "Papyrus");
		
		LanguageRegistry.addName(ptahsPick, "Ptah's Decadence");
		LanguageRegistry.addName(soteksRage, "Sotek's Rage");
		LanguageRegistry.addName(osirisWill, "Osiris's Will");
		LanguageRegistry.addName(akersToil, "Aker's Toil");
		LanguageRegistry.addName(gebsBlessing, "Geb's Blessing");
		LanguageRegistry.addName(atensFury, "Aten's Fury");
		LanguageRegistry.addName(rasGlory, "Ra's Glory");
		LanguageRegistry.addName(sekhmetsWrath, "Sekhmet's Wrath");
		LanguageRegistry.addName(nutsAgility, "Nut's Agility");
		LanguageRegistry.addName(horusFlight, "Horus's Flight");
		LanguageRegistry.addName(monthusStrike, "Monthu's Strike");
		LanguageRegistry.addName(anhursMight, "Anhur's Might");
		LanguageRegistry.addName(hedetetsSting, "Hetetet's Sting");
		LanguageRegistry.addName(horusSoaring, "Horus's Soaring");
		LanguageRegistry.addName(shusBreath, "Shu's Breath");
		LanguageRegistry.addName(ptahsDestruction, "Ptah's Destruction");
		LanguageRegistry.addName(monthusBlast, "Monthu's Blast");
		LanguageRegistry.addName(nusFlux, "Nu's Flux");
		LanguageRegistry.addName(mnevisHorns, "Mnevis's Horns");
		LanguageRegistry.addName(isisEmbrace, "Isis's Embrace");
		LanguageRegistry.addName(maatsBalance, "Ma'at's Balance");
		
		LanguageRegistry.addName(limestoneShovel, "Limestone Shovel");
		LanguageRegistry.addName(limestonePickaxe, "Limestone Pickaxe");
		LanguageRegistry.addName(limestoneAxe, "Limestone Axe");
		LanguageRegistry.addName(limestoneSword, "Limestone Sword");
		LanguageRegistry.addName(limestoneHoe, "Limestone Hoe");
		
		LanguageRegistry.addName(mummyHelmet, "Head Wrap");
		LanguageRegistry.addName(mummyChest, "Chest Wrap");
		LanguageRegistry.addName(mummyLegs, "Leg Wrap");
		LanguageRegistry.addName(mummyBoots, "Feet Wrap");
		
		LanguageRegistry.addName(wandererHelmet, "Wanderer Head");
		LanguageRegistry.addName(wandererChest, "Wanderer Chest");
		LanguageRegistry.addName(wandererLegs, "Wanderer Legs");
		LanguageRegistry.addName(wandererBoots, "Wanderer Sandels");
		
		LanguageRegistry.addName(desertHelmet, "Desert Head");
		LanguageRegistry.addName(desertChest, "Desert Chest");
		LanguageRegistry.addName(desertLegs, "Desert Legs");
		LanguageRegistry.addName(desertBoots, "Desert Sandels");
		
		LanguageRegistry.addName(neithsAudacity, "Neith's Audacity");
		LanguageRegistry.addName(itemScroll, "Scroll");
		LanguageRegistry.addName(itemPelt, "Wolf Pelt");
		LanguageRegistry.addName(itemLinen, "Linen");
		LanguageRegistry.addName(itemFlax, "Flax");
		LanguageRegistry.addName(itemFlaxSeeds, "Flax Seeds");
		LanguageRegistry.addName(itemDate, "Date");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Atum", "Atum");
	}
}
