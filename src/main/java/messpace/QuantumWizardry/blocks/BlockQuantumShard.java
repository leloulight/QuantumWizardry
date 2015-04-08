package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.init.ModBlocks;
import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockQuantumShard extends Block{
	
	public BlockQuantumShard(Material material) {
		super(material);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		NetworkAliases alias = new NetworkAliases();
		if(world.getBlock(x, y+1, z) == Blocks.diamond_block && world.getBlock(x+1, y, z) == Blocks.iron_block && world.getBlock(x-1, y, z) == Blocks.iron_block && world.getBlock(x, y, z+1) == Blocks.gold_block && world.getBlock(x, y, z-1) == Blocks.gold_block) {
			world.setBlock(x, y+1, z, Blocks.air);
			world.setBlock(x+1, y, z, Blocks.air);
			world.setBlock(x-1, y, z, Blocks.air);
			world.setBlock(x, y, z+1, Blocks.air);
			world.setBlock(x, y, z-1, Blocks.air);
			alias.serverMessage("§5§oYou get a mysterious sense of life inside the block...", player, world);
			networkManager.addEnergy(5);
			world.setBlock(x, y, z, ModBlocks.AwakenedShardBlock);
		}
		
		return true;
	}

}
