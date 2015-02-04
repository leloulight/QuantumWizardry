package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class BlockQuantumSapper extends Block{

	public BlockQuantumSapper(Material blockMaterial) {
		super(blockMaterial);
		//TODO Make creative tab to put this in. :)
	}

	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
			PlayerNetworkManager networkManager = new PlayerNetworkManager(player);
			networkManager.replenishEnergy();
			
		if(!world.isRemote) {
			player.addChatMessage(new ChatComponentTranslation("10 Quantum Energy Sapped!"));
		}
		return true;
	}
}
