package messpace.QuantumWizardry.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void init() {
		//Items
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumReader),
				"XGX", "XYX", "XRX", 'X', Items.iron_ingot, 'G', Items.gold_ingot, 'Y', Blocks.glass_pane, 'R', Items.redstone);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumHealthCreator),
				"XSX", "IEI", "IGI", 'X', Items.string, 'S', ModItems.QuantumShard, 'I', Items.iron_ingot, 'E', Items.sugar, 'G', Items.gold_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumWizardsFlotationDevice),
				"XSX", "IEI", "III", 'X', Items.feather, 'S', ModItems.QuantumShard, 'I', Items.iron_ingot, 'E', Items.ender_pearl);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumWizardsEnhancedFlotationDevice),
				"XSX", "IEI", "III", 'X', Items.feather, 'S', ModItems.QuantumShard, 'I', Items.iron_ingot, 'E', Items.ender_eye);
		
		/*Soul piece doesn't need a crafting recipe.*/
		
		GameRegistry.addRecipe(new ItemStack(ModItems.SoulDeconstructor),
				"IIS", "GIG", "FII", 'I', Items.iron_ingot, 'S', ModItems.QuantumShard, 'G', Blocks.glass, 'F', Items.flint);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.SoulReconstructor),
				"IIS", "LIG", "IIF", 'I', Items.iron_ingot, 'S', ModItems.QuantumShard, 'G', Blocks.glass, 'L', Items.gold_ingot, 'F', Items.flint);
		
		/*Quantum Shard doesn't need a crafting recipe.*/
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumSword),
				" X ", " X ", " Y ", 'X', ModItems.QuantumShard, 'Y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumShovel),
				" X ", " Y ", " Y ", 'X', ModItems.QuantumShard, 'Y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumPickaxe),
				"XXX", " Y ", " Y ", 'X', ModItems.QuantumShard, 'Y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumHoe),
				"XX ", " Y ", " Y ", 'X', ModItems.QuantumShard, 'Y', Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumAxe),
				"XX ", "XY ", " Y ", 'X', ModItems.QuantumShard, 'Y', Items.stick);
		
		/*Charged sword, shovel, pickaxe, hoe, and axe don't need recipes.*/
		
		GameRegistry.addRecipe(new ItemStack(ModItems.QuantumBread),
				"SGS", "PBP", "SGS", 'S', Items.sugar, 'G', Items.glowstone_dust, 'P', Items.ender_pearl, 'B', Items.bread);
		
		/*Quantum wands don't need recipes.*/
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.QuantumSapper),
				" D ", " L ", "III", 'D', Items.diamond, 'L', Items.flint, 'I', Blocks.iron_block);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.QuantumExchanger),
				"WDW", "W W", "W W", 'W', Blocks.planks, 'D', Items.diamond);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GeothermalGenerator),
				"BIB", "IBI", "BGB", 'B', Items.netherbrick, 'I', Items.iron_ingot, 'G', Blocks.glass_pane);
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.QuantumShardBlock),
				"SSS", "SSS", "SSS", 'S', ModItems.QuantumShard);
		
		/*Awakened shard block doesn't need a recipe.*/
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.QuantumFabricator),
				"III", "ICI", "III", 'I', Items.iron_ingot, 'C', Blocks.crafting_table);
		
		/*Compressed energy block doesn't need a recipe.*/
	}
	
}
