package messpace.QuantumWizardry.items;

import messpace.QuantumWizardry.init.ModBlocks;
import messpace.QuantumWizardry.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemQuantumWand extends Item{
	
	public ItemQuantumWand() {
		super();
	}
	
	public boolean onDroppedByPlayer(ItemStack stack, EntityPlayer player) {
		player.inventory.consumeInventoryItem(ModItems.QuantumWand);
		player.inventory.addItemStackToInventory(new ItemStack(ModBlocks.QuantumShardBlock, 2));
		player.inventory.addItemStackToInventory(new ItemStack(Blocks.iron_block, 1));
		return true;
	}

}
