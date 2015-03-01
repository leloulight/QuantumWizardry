package messpace.QuantumWizardry.items;

import java.util.List;

import messpace.QuantumWizardry.init.ModItems;
import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoulPiece extends Item{
	
	public ItemSoulPiece() {
		super();
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
			PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
			NetworkAliases alias = new NetworkAliases();
			double initialHealth = player.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
			if(player.isSneaking() == true) {
				if(initialHealth != 20.0d) {
					player.inventory.consumeInventoryItem(ModItems.SoulPiece);
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(initialHealth + 2.0d);
					alias.serverMessage("Soul Piece Has Been Restored To You!", player, world);
				}else{
					alias.serverMessage("Your Soul Is Already Complete!", player, world);
				}
			}else{
				player.inventory.consumeInventoryItem(ModItems.SoulPiece);
				networkManager.changeMaxEnergy(500);
				alias.serverMessage("Your Network Capacity Has Been Increased!", player, world);
			}
			
			
		return itemstack;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add("§5§oOoh!");
		list.add("§5§oMagical!");
	}

}
