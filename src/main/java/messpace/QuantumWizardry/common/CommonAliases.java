package messpace.QuantumWizardry.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class CommonAliases {
	
	public static void clientChatMessage(String message, EntityPlayer player, World world) {
		if(world.isRemote) {
			player.addChatMessage(new ChatComponentTranslation(message));
		}
	}

}
