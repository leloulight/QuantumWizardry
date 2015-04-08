package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockQuantumSapper extends Block{

	public BlockQuantumSapper(Material blockMaterial) {
		super(blockMaterial);
		//TODO Make creative tab to put this in. :)
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
			PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
			NetworkAliases alias = new NetworkAliases();
			int currentEnergy = networkManager.getEnergy();
			if(currentEnergy <= networkManager.maxEnergy()) {
				if((world.getBlock(x, y+1, z) == Blocks.iron_block) == true) {
					world.setBlock(x, y+1, z, Blocks.air);
					networkManager.addEnergy(10);
					alias.serverMessage("10 Quantum Energy Sapped!", player, world);
				}else{
					alias.serverMessage("There Is No Iron To Sap From!", player, world);
				}
			}else{
				alias.serverMessage("You already have maxiumum energy!", player, world);
			}

		return true;
	}
}
