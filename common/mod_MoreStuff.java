package ninjapancakes87.morestuff.common;

<<<<<<< HEAD
import net.minecraft.src.Block;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
=======
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
>>>>>>> New and Improved!
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "modid", name = "More Stuff", version = "Alpha 0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_MoreStuff {

	@Instance("modid")
	public static mod_MoreStuff instance;
	
	@SidedProxy(clientSide="ninjapancakes87.morestuff.client.morestuffClientProxy", serverSide="ninjapancakes87.morestuff.common.MoreStuffCommonProxy")
	public static MoreStuffCommonProxy proxy;
	
	public static Block ZirconOre;
	public static Block CorundumOre;
	public static Block RedstoneBlock;
	public static Block ComponetSeperator;
	
	public static Item Ruby;
	public static Item Sapphire;
	public static Item Corundum;
	public static Item Zircon;
	public static Item RawZircon;
	public static Item Razor;
	public static Item CorundumDust;
	public static Item RedCorundumDust;
	public static Item BlueCorundumDust;
	public static Item GelatinBlob;
	public static Item Plastic;
	
	public static int ZirconBlockID;
	public static int CorundumBlockID;
<<<<<<< HEAD
=======
	public static int RedstoneBlockID;
	public static int ComponetSeperatorID;
>>>>>>> New and Improved!
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) 
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

		config.load();

		ZirconBlockID = config.getBlock("ZirconOre", 538).getInt();
		CorundumBlockID = config.getBlock("CorundumOre", 539).getInt();
<<<<<<< HEAD
=======
		RedstoneBlockID = config.getBlock("RedstoneBlock", 540).getInt();
		ComponetSeperatorID = config.getBlock("ComponetSeperator", 541).getInt();
>>>>>>> New and Improved!
			
		config.save();
	}

	@Init
	public void init(FMLInitializationEvent event) 
	{

		InitBlocksAndItems();
		
		InitLanguageRegistry();
		
		InitEverythingElse();
		
		InitRecipes();
			
		proxy.registerRenderThings();
				
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) 
	{

	}
	private void InitBlocksAndItems(){
		ZirconOre = (new BlockZO(ZirconBlockID, 1)).setBlockName("ZO");
		CorundumOre = (new BlockCO(CorundumBlockID, 0)).setBlockName("CO");
<<<<<<< HEAD
=======
		RedstoneBlock = (new BlockRB(RedstoneBlockID, 16)).setBlockName("RB");
		ComponetSeperator = (new BlockCS(ComponetSeperatorID, 17)).setBlockName("CS");
>>>>>>> New and Improved!
		
		Ruby = (new ItemDefault(900)).setIconIndex(0).setItemName("UnreadableRuby");
		Sapphire = (new ItemDefault(901)).setIconIndex(1).setItemName("UnreadableSapphire");
		Corundum = (new ItemDefault(902)).setIconIndex(2).setItemName("UnreadableCorundum");
		Zircon = (new ItemDefault(903)).setIconIndex(4).setItemName("UnreadableZircon");
		RawZircon = (new ItemDefault(904)).setIconIndex(3).setItemName("UnreadableRawness");
		Razor = (new ItemRazor(905)).setIconIndex(5).setItemName("UnreadableRazor");
		CorundumDust = (new ItemDefault(906)).setIconIndex(6).setItemName("UnreadableCorundumDust");
		RedCorundumDust = (new ItemDefault(907)).setIconIndex(7).setItemName("UnreadableRedCorundumDust");
		BlueCorundumDust = (new ItemDefault(908)).setIconIndex(8).setItemName("UnreadableBlueCorundumDust");
		GelatinBlob = (new ItemDefault(909)).setIconIndex(9).setItemName("UnreadableGelatinBlob");
		Plastic = (new ItemDefault(910)).setIconIndex(10).setItemName("Plastic");
	}
	private void InitLanguageRegistry(){
		LanguageRegistry.addName(ZirconOre, "Zircon Ore");
		LanguageRegistry.addName(CorundumOre, "Corundum Ore");
		LanguageRegistry.addName(RedstoneBlock, "Redstone Block");
		LanguageRegistry.addName(ComponetSeperator, "Componet Seperator");
		
		LanguageRegistry.addName(Ruby, "Ruby");
		LanguageRegistry.addName(Sapphire, "Sapphire");
		LanguageRegistry.addName(Corundum, "Corundum");
		LanguageRegistry.addName(Zircon, "Zircon");
		LanguageRegistry.addName(RawZircon, "Raw Zircon");
		LanguageRegistry.addName(Razor, "Razor");
		LanguageRegistry.addName(CorundumDust, "Corundum Dust");
		LanguageRegistry.addName(RedCorundumDust, "Red Corundum Dust");
		LanguageRegistry.addName(BlueCorundumDust, "Blue Corundum Dust");
		LanguageRegistry.addName(GelatinBlob, "Gelatin");
		LanguageRegistry.addName(Plastic, "Plastic");
	}
	private void InitRecipes(){
		 GameRegistry.addSmelting(CorundumOre.blockID, new ItemStack(Corundum), 1F);
		 GameRegistry.addSmelting(RawZircon.itemID, new ItemStack(Zircon), 0.5F);
		 GameRegistry.addSmelting(GelatinBlob.itemID, new ItemStack(Plastic), 0.1F);
		 GameRegistry.addSmelting(RedCorundumDust.itemID, new ItemStack(Ruby), 1F);
		 GameRegistry.addSmelting(BlueCorundumDust.itemID, new ItemStack(Sapphire), 1F);
		 
		 GameRegistry.addRecipe(new ItemStack(Razor), " x ", "yzy", "yzy", 'x', Zircon, 'y', Plastic, 'z', Item.redstone);
		 GameRegistry.addRecipe(new ItemStack(GelatinBlob), "xzx", "xyx", "xzx", 'x', Block.sapling, 'y', Item.ingotIron, 'z', Item.seeds);
		 GameRegistry.addRecipe(new ItemStack(RedstoneBlock), "xxx", "xxx", "xxx", 'x', Item.redstone);
		 
		 GameRegistry.addShapelessRecipe(new ItemStack(CorundumDust, 4), Razor, Corundum);
		 GameRegistry.addShapelessRecipe(new ItemStack(RedCorundumDust, 1), CorundumDust, Item.redstone);
		 GameRegistry.addShapelessRecipe(new ItemStack(BlueCorundumDust, 1), CorundumDust, Item.dyePowder);
		 GameRegistry.addShapelessRecipe(new ItemStack(ComponetSeperator, 1), Block.dirt);
		 }	
	private void InitEverythingElse(){
		MinecraftForge.setBlockHarvestLevel(ZirconOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(CorundumOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(RedstoneBlock, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(ComponetSeperator, "pickaxe", 2);
		
		GameRegistry.registerBlock(ZirconOre);
		GameRegistry.registerBlock(CorundumOre);
		GameRegistry.registerBlock(RedstoneBlock);
		GameRegistry.registerBlock(ComponetSeperator);
		
		DungeonHooks.addDungeonLoot(new ItemStack(Corundum), 100, 1, 3);
		
		GameRegistry.registerWorldGenerator(new WorldgeneratorOres());
	}
	
}
