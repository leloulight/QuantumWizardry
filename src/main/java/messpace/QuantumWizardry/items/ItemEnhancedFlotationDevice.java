package messpace.QuantumWizardry.items;

import java.util.List;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ItemEnhancedFlotationDevice extends Item{
	
	public ItemEnhancedFlotationDevice() {
		super();
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		if(player.isSneaking() == false) {
			if(player.capabilities.allowFlying == false) {
				if(networkManager.consumeEnergy(15) == true) {
					player.capabilities.allowFlying = true;
				}else{
					if(world.isRemote) {
						player.addChatMessage(new ChatComponentTranslation("You don't have enough energy!"));
					}
				}
			}else{
				player.capabilities.setFlySpeed(0.05F);
				player.capabilities.allowFlying = false;
				player.capabilities.isFlying = false;
			}
		}else{
			if(player.capabilities.allowFlying == true) {
				if(networkManager.consumeEnergy(5) == true) {
					if(player.capabilities.getFlySpeed() == 0.05F) {
						player.capabilities.setFlySpeed(0.1F);
						if(world.isRemote) {
							player.addChatMessage(new ChatComponentTranslation("Flight Speed Doubled"));
						}
					}else{
						if(player.capabilities.getFlySpeed() == 0.1F) {
							player.capabilities.setFlySpeed(0.15F);
							if(world.isRemote) {
								player.addChatMessage(new ChatComponentTranslation("Flight Speed Tripled"));
							}
						}else{
							player.capabilities.setFlySpeed(0.05F);
							
							if(world.isRemote) {
								player.addChatMessage(new ChatComponentTranslation("Flight Speed Reset"));
							}
						}

					}
				}else{
					if(world.isRemote) {
						player.addChatMessage(new ChatComponentTranslation("You don't have enough energy to change speeds!"));
					}
				}
			}else{
				if(world.isRemote) {
					player.addChatMessage(new ChatComponentTranslation("You aren't in flight mode!"));
				}
			}
		}
		return itemstack;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add("§b§oIt's Just Like The Real Deal,");
		list.add("§b§oBut With An Extra Dose Of Caffine!");
	}

}
