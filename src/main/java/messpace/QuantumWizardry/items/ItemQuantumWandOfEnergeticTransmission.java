package messpace.QuantumWizardry.items;

import messpace.QuantumWizardry.init.ModBlocks;
import messpace.QuantumWizardry.init.ModItems;
import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemQuantumWandOfEnergeticTransmission extends Item{
	
	public ItemQuantumWandOfEnergeticTransmission() {
		super();
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		NetworkAliases alias = new NetworkAliases();
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		if(networkManager.consumeEnergy(50)) {
			player.inventory.addItemStackToInventory(new ItemStack(ModBlocks.CompressedQuantumEnergy));
		}else {
			alias.serverMessage("You don't have enough energy!", player, world);
		}
		return stack;
	}
	
	@Override
	public boolean onDroppedByPlayer(ItemStack stack, EntityPlayer player) {
		player.inventory.consumeInventoryItem(ModItems.QuantumWandOfEnergeticTransmission);
		player.inventory.addItemStackToInventory(new ItemStack(ModBlocks.QuantumShardBlock, 2));
		player.inventory.addItemStackToInventory(new ItemStack(Blocks.gold_block, 1));
		return true;
	}

}
