package messpace.QuantumWizardry.items;

import java.util.List;

import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoulReconstructor extends Item{
	public ItemSoulReconstructor() {
		super();
	}
	
	@Override
	 public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		NetworkAliases alias = new NetworkAliases();
		double initialHealth = player.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
		if(networkManager.consumeEnergy(networkManager.maxEnergy())){
			if(initialHealth != 20.0d) {
				player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0d);
				alias.serverMessage("Your Soul Has Been Re-Created!", player, world);
			}else{
				alias.serverMessage("Your Soul Is Already Whole!", player, world);
			}
		}else{
			alias.serverMessage("You Don't Have Enough Energy!", player, world);
		}
		return stack;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add("§6§oSometimes You Have To");
		list.add("§6§oRemake The Puzzle Pieces.");
	}
}
