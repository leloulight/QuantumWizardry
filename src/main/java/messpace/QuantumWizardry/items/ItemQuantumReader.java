package messpace.QuantumWizardry.items;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ItemQuantumReader extends Item {
	
		public ItemQuantumReader() {
			super();
		}

		@Override
		public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
			
			
				PlayerNetworkManager props = PlayerNetworkManager.get(player);
				
				int currentEnergy = props.getEnergy();
				
				if(world.isRemote) {
					player.addChatMessage(new ChatComponentTranslation("Current Quantum Energy Detected:" + currentEnergy));
				}
			
			return itemstack;
		}
}