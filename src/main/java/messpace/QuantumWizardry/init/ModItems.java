package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.items.ItemQuantumHealthCreator;
import messpace.QuantumWizardry.items.ItemQuantumReader;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item QuantumReader = new ItemQuantumReader().setUnlocalizedName("QuantamReader").setTextureName("quantumwizardry:QuantumReader");
	public static Item QuantumHealthCreator = new ItemQuantumHealthCreator().setUnlocalizedName("QuantumHealthCreator").setTextureName("quantumwizardry:QuantumHealthCreator");
	
	public static void init() {
		GameRegistry.registerItem(QuantumReader, "QuantumReader");
		GameRegistry.registerItem(QuantumHealthCreator, "QuantumHealthCreator");
	}

}
