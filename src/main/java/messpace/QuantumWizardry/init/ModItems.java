package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.items.ItemQuantumGuide;
import messpace.QuantumWizardry.items.ItemQuantumReader;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item QuantumReader = new ItemQuantumReader().setUnlocalizedName("QuantamReader").setTextureName("quantumwizardry:QuantamReader");
	public static Item QuantumGuide = new ItemQuantumGuide().setUnlocalizedName("QuantumGuide").setTextureName("quantumwizardry:QuantumGuide");
	
	public static void init() {
		GameRegistry.registerItem(QuantumReader, "QuantumReader");
		GameRegistry.registerItem(QuantumGuide, "QuantumGuide");
	}

}
