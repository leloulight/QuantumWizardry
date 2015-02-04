package messpace.QuantumWizardry.network;

import ibxm.Player;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.annotation.ElementType;

import messpace.QuantumWizardry.common.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class PlayerNetworkManager implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "PlayerNetworkManager";

	private final EntityPlayer player;

	private int currentEnergy, maxEnergy;

	public PlayerNetworkManager(EntityPlayer player)
	{
		this.player = player;
		this.currentEnergy = 0;
		this.maxEnergy = 50;
	}

	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(PlayerNetworkManager.EXT_PROP_NAME, new PlayerNetworkManager(player));
	}

	public static final PlayerNetworkManager get(EntityPlayer player)
	{
		return (PlayerNetworkManager) player.getExtendedProperties(EXT_PROP_NAME);
	}

	@Override
	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = new NBTTagCompound();
		properties.setInteger("CurrentEnergy", this.currentEnergy);
		properties.setInteger("MaxEnergy", this.maxEnergy);
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.currentEnergy = properties.getInteger("CurrentMana");
		this.maxEnergy = properties.getInteger("MaxMana");
		System.out.println("[TUT PROPS] Mana from NBT: " + this.currentEnergy + "/" + this.maxEnergy);
	}
	
	@Override
	public void init(Entity entity, World world)
	{
	}
	
	public boolean consumeEnergy(int amount)
	{
		boolean sufficient = amount <= this.currentEnergy;
		this.currentEnergy -= (amount < this.currentEnergy ? amount : this.currentEnergy);
		return sufficient;
	}
	
	public void addEnergy(int amount) {
		this.currentEnergy = this.currentEnergy + amount;
	}
	
	public int getEnergy() {
		return this.currentEnergy;
	}

	public void replenishEnergy()
	{
		this.currentEnergy = this.maxEnergy;
	}
}