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

public class ItemSoulDeconstructor extends Item{
	public ItemSoulDeconstructor() {
		super();
	}
	
	@Override
	 public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		NetworkAliases alias = new NetworkAliases();
		double initialHealth = player.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
		if(networkManager.consumeEnergy(networkManager.maxEnergy()) == true) {
			if(initialHealth != 1d) {
				player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(initialHealth - 2.0d);
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.SoulPiece));
				alias.serverMessage("Part Of Your Soul Has Been Extracted!", player, world);
			}else{
				alias.serverMessage("You Don't Have Enough Soul Left!", player, world);
			}
		}else{
			alias.serverMessage("You Don't Have Enough Energy!", player, world);
		}
	 return stack;
	 }
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add("§c§oIt's Just Like Eating");
		list.add("§c§oSlices Of Pizza!");
	}
}
