package messpace.QuantumWizardry.items;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FoodQuantumBread extends ItemFood{

	public FoodQuantumBread(int health, float saturation, boolean isWolfFood) {
		super(health, saturation, isWolfFood);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		networkManager.addEnergy(100);
	}

}
