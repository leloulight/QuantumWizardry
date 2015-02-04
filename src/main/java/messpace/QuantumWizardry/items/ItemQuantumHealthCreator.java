package messpace.QuantumWizardry.items;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ItemQuantumHealthCreator extends Item{
	
	public ItemQuantumHealthCreator() {
		super();
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		float currentHealth = player.getHealth();
		
		if(networkManager.consumeEnergy(10)) {
			System.out.println("[MANA ITEM] Player Had Enough Mana, Do Something Awesome!");
			if(currentHealth < 20.0F) {
				float newHealth = currentHealth + 2;
				player.setHealth(newHealth);
			}else{
				if(!world.isRemote) {
					player.addChatMessage(new ChatComponentTranslation("You already have maximum health!"));
				}
			}
		}else{
			System.out.println("[MANA ITEM] Player Didn't Have Enough Mana. Sadface!");
			if(!world.isRemote) {
				player.addChatMessage(new ChatComponentTranslation("You don't have enough energy!"));
			}
		}
		
		/*if(currentHealth < 20.0F) {
			if(networkManager.checkEnoughEnergy(10) == true) {
				networkManager.consumeEnergy(10);
				float newHealth = currentHealth + 2.0F;
				player.setHealth(newHealth);
			}else{
				if(!world.isRemote) {
					player.addChatMessage(new ChatComponentTranslation("You don't have enough energy!"));
				}
			}
		}else{
			if(!world.isRemote) {
				player.addChatMessage(new ChatComponentTranslation("You are already at maximum health!"));
			}
		}*/
		
		
		return itemstack;
	}

}
