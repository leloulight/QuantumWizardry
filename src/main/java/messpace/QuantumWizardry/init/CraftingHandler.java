package messpace.QuantumWizardry.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public CraftingHandler() {
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumReader),
		"XGX", "XYX", "XRX", 'X', Items.iron_ingot, 'G', Items.gold_ingot, 'Y', Blocks.glass_pane, 'R', Items.redstone);
	}
	
}
