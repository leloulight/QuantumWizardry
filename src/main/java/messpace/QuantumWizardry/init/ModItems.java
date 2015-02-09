package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.items.ItemEnhancedFlotationDevice;
import messpace.QuantumWizardry.items.ItemFlotationDevice;
import messpace.QuantumWizardry.items.ItemQuantumHealthCreator;
import messpace.QuantumWizardry.items.ItemQuantumReader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ArmorMaterial FlightPack = EnumHelper.addArmorMaterial("NonArmoredFlightPack", 33, new int[]{0, 0, 0, 0}, 30);
	
	public static Item QuantumReader = new ItemQuantumReader().setUnlocalizedName("QuantumReader").setTextureName("quantumwizardry:QuantumReader");
	public static Item QuantumHealthCreator = new ItemQuantumHealthCreator().setUnlocalizedName("QuantumHealthCreator").setTextureName("quantumwizardry:QuantumHealthCreator");
	public static Item QuantumWizardsFlotationDevice = new ItemFlotationDevice().setUnlocalizedName("QuantumWizardsFlotationDevice").setTextureName("quantumwizardry:FlotationDevice");
	public static Item QuantumWizardsEnhancedFlotationDevice = new ItemEnhancedFlotationDevice().setUnlocalizedName("QuantumWizardsEnhancedFlotationDevice").setTextureName("quantumwizardry:EnhancedFlotationDevice");
	
	public static void init() {
		GameRegistry.registerItem(QuantumReader, "QuantumReader");
		GameRegistry.registerItem(QuantumHealthCreator, "QuantumHealthCreator");
		GameRegistry.registerItem(QuantumWizardsFlotationDevice, "QuantumWizardsFlotationDevice");
		GameRegistry.registerItem(QuantumWizardsEnhancedFlotationDevice, "QuantumWizardsEnhancedFlotationDevice");
	}

}
