package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.blocks.BlockAwakenedShard;
import messpace.QuantumWizardry.blocks.BlockCompressedQuantumEnergy;
import messpace.QuantumWizardry.blocks.BlockGeothermalGenerator;
import messpace.QuantumWizardry.blocks.BlockQuantumExchanger;
import messpace.QuantumWizardry.blocks.BlockQuantumFabricator;
import messpace.QuantumWizardry.blocks.BlockQuantumSapper;
import messpace.QuantumWizardry.blocks.BlockQuantumShard;
import messpace.QuantumWizardry.common.QuantumWizardry;
import messpace.QuantumWizardry.tileentity.TileEntityQuantumExchanger;
import messpace.QuantumWizardry.tileentity.TileEntityQuantumSapper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block QuantumSapper = new BlockQuantumSapper(Material.iron).setBlockName("QuantumSapper").setBlockTextureName("quantumwizardry:QuantumSapperIcon").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Block QuantumExchanger = new BlockQuantumExchanger(Material.iron).setBlockName("QuantumExchanger").setBlockTextureName("quantumwizardry:QuantumExchangerIcon").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Block GeothermalGenerator = new BlockGeothermalGenerator(Material.iron).setBlockName("GeothermalGenerator").setBlockTextureName("quantumwizardry:GeothermalGenerator").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Block QuantumShardBlock = new BlockQuantumShard(Material.rock).setBlockName("QuantumShardBlock").setBlockTextureName("quantumwizardry:QuantumShardBlock").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Block AwakenedShardBlock = new BlockAwakenedShard(Material.iron).setBlockName("AwakenedShardBlock").setBlockTextureName("quantumwizardry:AwakenedShardBlock").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Block QuantumFabricator = new BlockQuantumFabricator(Material.iron).setBlockName("QuantumFabricator").setBlockTextureName("quantumwizardry:QuantumFabricator").setCreativeTab(QuantumWizardry.tabQuantum);
	public static Block CompressedQuantumEnergy = new BlockCompressedQuantumEnergy(Material.cactus).setBlockName("CompressedQuantumEnergy").setBlockTextureName("quantumwizardry:QuantumShardBlock").setCreativeTab(QuantumWizardry.tabQuantum);	
	public static void init() {
		GameRegistry.registerBlock(QuantumSapper, "QuantumSapper");
		GameRegistry.registerBlock(QuantumExchanger, "QuantumExchanger");
		GameRegistry.registerBlock(GeothermalGenerator, "GeothermalGenerator");
		GameRegistry.registerBlock(QuantumShardBlock, "QuantumShardBlock");
		GameRegistry.registerBlock(AwakenedShardBlock, "AwakenedShardBlock");
		GameRegistry.registerBlock(QuantumFabricator, "QuantumFabricator");
		GameRegistry.registerBlock(CompressedQuantumEnergy, "CompressedQuantumEnergy");
		//Tile Entities
		GameRegistry.registerTileEntity(TileEntityQuantumExchanger.class, "TileEntityQuantumExchanger");
		GameRegistry.registerTileEntity(TileEntityQuantumSapper.class, "TileEntityQuantumSapper");
	}

}
