package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockCompressedQuantumEnergy extends Block{
	
	public BlockCompressedQuantumEnergy(Material material) {
		super(material);
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		if(player.isSneaking()) {
			PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
			networkManager.addEnergy(50);
		}else{
			if(!player.isSneaking()) {
				player.setPosition(x, y+100, z);
			}
		}
		return true;
	}

}
