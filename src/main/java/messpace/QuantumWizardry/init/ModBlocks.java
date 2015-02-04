package messpace.QuantumWizardry.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import messpace.QuantumWizardry.blocks.BlockQuantumSapper;

public class ModBlocks {
	
	public static Block QuantamSapper = new BlockQuantumSapper(Material.iron).setBlockName("QuantamSapper").setBlockTextureName("quantamwizardry:QuantamSapper");
	
	public static void init() {
		GameRegistry.registerBlock(QuantamSapper, "QuantamSapper");
	}

}
