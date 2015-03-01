package messpace.QuantumWizardry.items;

import java.util.List;

import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemQuantumReader extends Item {
	
		public ItemQuantumReader() {
			super();
		}

		@Override
		public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
				PlayerNetworkManager props = PlayerNetworkManager.get(player);
				NetworkAliases alias = new NetworkAliases();
				int currentEnergy = props.getEnergy();
				alias.serverMessage("Current Quantum Energy Detected: " + currentEnergy, player, world);
			return itemstack;
		}
		
		@Override
		public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
			list.add("§a§oReads The Amount Of");
			list.add("§a§oEnergy In Your Network.");
		}
}