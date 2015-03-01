package messpace.QuantumWizardry.network;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;


public class PlayerNetworkManager implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "PlayerNetworkManager";

	private final EntityPlayer player;

	private int currentEnergy, maxEnergy;
	
	private double soulGone;

	public PlayerNetworkManager(EntityPlayer player)
	{
		this.player = player;
		this.currentEnergy = 0;
		this.maxEnergy = 500;
		this.soulGone = 4d;
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
		properties.setDouble("PlayerSoul", this.soulGone);
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound)
	{
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.currentEnergy = properties.getInteger("CurrentEnergy");
		this.maxEnergy = properties.getInteger("MaxEnergy");
		this.soulGone = properties.getDouble("PlayerSoul");
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
		int getCurrentEnergy = this.currentEnergy;
		currentEnergy = getCurrentEnergy + amount;
	}
	
	public int getEnergy() {
		System.out.println("Getting energy: "+this.currentEnergy+"/"+this.maxEnergy);
		return this.currentEnergy;
	}

	public int maxEnergy() {
		return this.maxEnergy;
	}
	
	public void changeMaxEnergy(int amount) {
		this.maxEnergy = this.maxEnergy + amount;
	}

	public void replenishEnergy()
	{
		this.currentEnergy = this.maxEnergy;
	}
}