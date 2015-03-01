package messpace.QuantumWizardry.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class NetworkAliases {
	
	public NetworkAliases() {
		super();
	}
	
	public static void clientMessage(String message, EntityPlayer player, World world) {
		if(world.isRemote) {
			player.addChatMessage(new ChatComponentTranslation(message));
		}
	}
	
	public static void serverMessage(String message, EntityPlayer player, World world) {
		if(!world.isRemote) {
			player.addChatMessage(new ChatComponentTranslation(message));
		}
	}

}
