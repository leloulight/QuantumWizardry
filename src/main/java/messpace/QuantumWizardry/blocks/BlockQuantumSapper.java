package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import messpace.QuantumWizardry.tileentity.TileEntityQuantumSapper;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class BlockQuantumSapper extends BlockContainer{

	public BlockQuantumSapper(Material blockMaterial) {
		super(blockMaterial);
		//TODO Make creative tab to put this in. :)
	}

	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntityQuantumSapper teqs = new TileEntityQuantumSapper();
		if(!world.isRemote) {
			PlayerNetworkManager networkManager = new PlayerNetworkManager(player);
			networkManager.addEnergy(10);
		}
		if(world.isRemote) {
			player.addChatMessage(new ChatComponentTranslation("10 Quantum Energy Sapped!"));
		}
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		return new TileEntityQuantumSapper();
	}

}
