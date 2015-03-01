package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.network.PlayerNetworkManager;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {
	private boolean isOnGround;
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && PlayerNetworkManager.get((EntityPlayer) event.entity) == null)
			PlayerNetworkManager.register((EntityPlayer) event.entity);
	}
		
 }
