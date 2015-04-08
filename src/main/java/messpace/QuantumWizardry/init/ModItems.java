package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.common.QuantumWizardry;
import messpace.QuantumWizardry.items.FoodQuantumBread;
import messpace.QuantumWizardry.items.ItemEnhancedFlotationDevice;
import messpace.QuantumWizardry.items.ItemFlotationDevice;
import messpace.QuantumWizardry.items.ItemQuantumHealthCreator;
import messpace.QuantumWizardry.items.ItemQuantumReader;
import messpace.QuantumWizardry.items.ItemSoulDeconstructor;
import messpace.QuantumWizardry.items.ItemSoulPiece;
import messpace.QuantumWizardry.items.ItemSoulReconstructor;
import messpace.QuantumWizardry.items.QuantumShard;
import messpace.QuantumWizardry.tools.ChargedQuantumAxe;
import messpace.QuantumWizardry.tools.ChargedQuantumHoe;
import messpace.QuantumWizardry.tools.ChargedQuantumPickaxe;
import messpace.QuantumWizardry.tools.ChargedQuantumShovel;
import messpace.QuantumWizardry.tools.ChargedQuantumSword;
import messpace.QuantumWizardry.tools.QuantumAxe;
import messpace.QuantumWizardry.tools.QuantumHoe;
import messpace.QuantumWizardry.tools.QuantumPickaxe;
import messpace.QuantumWizardry.tools.QuantumShovel;
import messpace.QuantumWizardry.tools.QuantumSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ArmorMaterial FlightPack = EnumHelper.addArmorMaterial("NonArmoredFlightPack", 33, new int[]{0, 0, 0, 0}, 30);
	public static ToolMaterial QuantumTools = EnumHelper.addToolMaterial("QuantumTools", 2, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial ChargedQuantumTools = EnumHelper.addToolMaterial("ChargedQuantumTools", 3, 2000, 15.0F, 5.0F, 50);
	
	public static Item QuantumReader = new ItemQuantumReader().setUnlocalizedName("QuantumReader").setTextureName("quantumwizardry:QuantumReader").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumHealthCreator = new ItemQuantumHealthCreator().setUnlocalizedName("QuantumHealthCreator").setTextureName("quantumwizardry:QuantumHealthCreator").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumWizardsFlotationDevice = new ItemFlotationDevice().setUnlocalizedName("QuantumWizardsFlotationDevice").setTextureName("quantumwizardry:FlotationDevice").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumWizardsEnhancedFlotationDevice = new ItemEnhancedFlotationDevice().setUnlocalizedName("QuantumWizardsEnhancedFlotationDevice").setTextureName("quantumwizardry:FlotationDevice").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item SoulPiece = new ItemSoulPiece().setUnlocalizedName("SoulPiece").setTextureName("quantumwizardry:SoulPiece").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item SoulDeconstructor = new ItemSoulDeconstructor().setUnlocalizedName("SoulDeconstructor").setTextureName("quantumwizardry:SoulDeconstructor").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item SoulReconstructor = new ItemSoulReconstructor().setUnlocalizedName("SoulReconstructor").setTextureName("quantumwizardry:SoulReconstructor").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumShard = new QuantumShard().setUnlocalizedName("QuantumShard").setTextureName("quantumwizardry:QuantumShard").setCreativeTab(QuantumWizardry.tabQuantum);
	//Quantum Tools
	public static Item QuantumSword = new QuantumSword(QuantumTools).setUnlocalizedName("QuantumSword").setTextureName("quantumwizardry:QuantumSword").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumShovel = new QuantumShovel(QuantumTools).setUnlocalizedName("QuantumShovel").setTextureName("quantumwizardry:QuantumShovel").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumPickaxe = new QuantumPickaxe(QuantumTools).setUnlocalizedName("QuantumPickaxe").setTextureName("quantumwizardry:QuantumPickaxe").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumHoe = new QuantumHoe(QuantumTools).setUnlocalizedName("QuantumHoe").setTextureName("quantumwizardry:QuantumHoe").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumAxe = new QuantumAxe(QuantumTools).setUnlocalizedName("QuantumAxe").setTextureName("quantumwizardry:QuantumAxe").setCreativeTab(QuantumWizardry.tabQuantum);
	//Charged Quantum Tools
	public static Item ChargedQuantumSword = new ChargedQuantumSword(ChargedQuantumTools).setUnlocalizedName("ChargedQuantumSword").setTextureName("quantumwizardry:QuantumSword").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item ChargedQuantumShovel = new ChargedQuantumShovel(ChargedQuantumTools).setUnlocalizedName("ChargedQuantumShovel").setTextureName("quantumwizardry:QuantumShovel").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item ChargedQuantumPickaxe = new ChargedQuantumPickaxe(ChargedQuantumTools).setUnlocalizedName("ChargedQuantumPickaxe").setTextureName("quantumwizardry:QuantumPickaxe").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item ChargedQuantumHoe = new ChargedQuantumHoe(ChargedQuantumTools).setUnlocalizedName("ChargedQuantumHoe").setTextureName("quantumwizardry:QuantumHoe").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item ChargedQuantumAxe = new ChargedQuantumAxe(ChargedQuantumTools).setUnlocalizedName("ChargedQuantumAxe").setTextureName("quantumwizardry:QuantumAxe").setCreativeTab(QuantumWizardry.tabQuantum);
	//Food
	public static Item QuantumBread = new FoodQuantumBread(2, 1.0F, false).setUnlocalizedName("QuantumBread").setTextureName("quantumwizardry:QuantumBread").setCreativeTab(QuantumWizardry.tabQuantum);



	
	public static void init() {
		GameRegistry.registerItem(QuantumReader, "QuantumReader");
		GameRegistry.registerItem(QuantumHealthCreator, "QuantumHealthCreator");
		GameRegistry.registerItem(QuantumWizardsFlotationDevice, "QuantumWizardsFlotationDevice");
		GameRegistry.registerItem(QuantumWizardsEnhancedFlotationDevice, "QuantumWizardsEnhancedFlotationDevice");
		GameRegistry.registerItem(SoulPiece, "SoulPiece");
		GameRegistry.registerItem(SoulDeconstructor, "SoulDeconstructor");
		GameRegistry.registerItem(SoulReconstructor, "SoulReconstructor");
		GameRegistry.registerItem(QuantumShard, "QuantumShard");
		GameRegistry.registerItem(QuantumSword, "QuantumSword");
		GameRegistry.registerItem(QuantumShovel, "QuantumShovel");
		GameRegistry.registerItem(QuantumPickaxe, "QuantumPickaxe");
		GameRegistry.registerItem(QuantumHoe, "QuantumHoe");
		GameRegistry.registerItem(QuantumAxe, "QuantumAxe");
		GameRegistry.registerItem(ChargedQuantumSword, "ChargedQuantumSword");
		GameRegistry.registerItem(ChargedQuantumShovel, "ChargedQuantumShovel");
		GameRegistry.registerItem(ChargedQuantumPickaxe, "ChargedQuantumPickaxe");
		GameRegistry.registerItem(ChargedQuantumHoe, "ChargedQuantumHoe");
		GameRegistry.registerItem(ChargedQuantumAxe, "ChargedQuantumAxe");
		GameRegistry.registerItem(QuantumBread, "QuantumBread");
	}

}
