package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.common.QuantumWizardry;
import messpace.QuantumWizardry.items.ItemEnhancedFlotationDevice;
import messpace.QuantumWizardry.items.ItemFlotationDevice;
import messpace.QuantumWizardry.items.ItemQuantumHealthCreator;
import messpace.QuantumWizardry.items.ItemQuantumReader;
import messpace.QuantumWizardry.items.ItemSoulDeconstructor;
import messpace.QuantumWizardry.items.ItemSoulPiece;
import messpace.QuantumWizardry.items.ItemSoulReconstructor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ArmorMaterial FlightPack = EnumHelper.addArmorMaterial("NonArmoredFlightPack", 33, new int[]{0, 0, 0, 0}, 30);
	
	public static Item QuantumReader = new ItemQuantumReader().setUnlocalizedName("QuantumReader").setTextureName("quantumwizardry:QuantumReader").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumHealthCreator = new ItemQuantumHealthCreator().setUnlocalizedName("QuantumHealthCreator").setTextureName("quantumwizardry:QuantumHealthCreator").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumWizardsFlotationDevice = new ItemFlotationDevice().setUnlocalizedName("QuantumWizardsFlotationDevice").setTextureName("quantumwizardry:FlotationDevice").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item QuantumWizardsEnhancedFlotationDevice = new ItemEnhancedFlotationDevice().setUnlocalizedName("QuantumWizardsEnhancedFlotationDevice").setTextureName("quantumwizardry:FlotationDevice").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item SoulPiece = new ItemSoulPiece().setUnlocalizedName("SoulPiece").setTextureName("quantumwizardry:SoulPiece").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item SoulDeconstructor = new ItemSoulDeconstructor().setUnlocalizedName("SoulDeconstructor").setTextureName("quantumwizardry:SoulDeconstructor").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Item SoulReconstructor = new ItemSoulReconstructor().setUnlocalizedName("SoulReconstructor").setTextureName("quantumwizardry:SoulReconstructor").setCreativeTab(QuantumWizardry.tabQuantum);
	
	
	public static void init() {
		GameRegistry.registerItem(QuantumReader, "QuantumReader");
		GameRegistry.registerItem(QuantumHealthCreator, "QuantumHealthCreator");
		GameRegistry.registerItem(QuantumWizardsFlotationDevice, "QuantumWizardsFlotationDevice");
		GameRegistry.registerItem(QuantumWizardsEnhancedFlotationDevice, "QuantumWizardsEnhancedFlotationDevice");
		GameRegistry.registerItem(SoulPiece, "SoulPiece");
		GameRegistry.registerItem(SoulDeconstructor, "SoulDeconstructor");
		GameRegistry.registerItem(SoulReconstructor, "SoulReconstructor");
	}

}
