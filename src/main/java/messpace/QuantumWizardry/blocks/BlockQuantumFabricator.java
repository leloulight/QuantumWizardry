package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.init.ModBlocks;
import messpace.QuantumWizardry.init.ModItems;
import messpace.QuantumWizardry.network.NetworkAliases;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class BlockQuantumFabricator extends Block{
	
	public BlockQuantumFabricator(Material material) {
		super(material);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		NBTTagCompound nbt = new NBTTagCompound();
		boolean getWorldLevel = nbt.getBoolean("isWorldAwakened");
		mainQuantumWand(world, player, x, y, z);
		transmissionQuantumWand(world, player, x, y, z);
		return true;
	}
	
	public void mainQuantumWand(World world, EntityPlayer player, int x, int y, int z) {
		if(checkMainQuantumWand1(world, player, x, y, z) == true) {
			EntityItem normalWandEntity = new EntityItem(world, x+2, y+2, z, new ItemStack(ModItems.QuantumWand));
			world.setBlockToAir(x+1, y, z-1);
			world.setBlockToAir(x+2, y, z);
			world.setBlockToAir(x+3, y, z+1);
			if(!world.isRemote){ world.spawnEntityInWorld(normalWandEntity); }
			player.playSound("minecraft:random.fizz", 1, 1);
		}else{
			if(checkMainQuantumWand2(world, player, x, y, z) == true) {
				EntityItem normalWandEntity = new EntityItem(world, x-2, y+2, z, new ItemStack(ModItems.QuantumWand));
				world.setBlockToAir(x-1, y, z+1);
				world.setBlockToAir(x-2, y, z);
				world.setBlockToAir(x-3, y, z-1);
				if(!world.isRemote){ world.spawnEntityInWorld(normalWandEntity); }
				player.playSound("minecraft:random.fizz", 1, 1);
			}else{
				if(checkMainQuantumWand3(world, player, x, y, z) == true) {
					EntityItem normalWandEntity = new EntityItem(world, x, y, z+2, new ItemStack(ModItems.QuantumWand));
					world.setBlockToAir(x+1, y, z+1);
					world.setBlockToAir(x, y, z+2);
					world.setBlockToAir(x-1, y, z+3);
					if(!world.isRemote){ world.spawnEntityInWorld(normalWandEntity); }
					player.playSound("minecraft:random.fizz", 1, 1);
				}else{
					if(checkMainQuantumWand4(world, player, x, y, z) == true) {
						EntityItem normalWandEntity = new EntityItem(world, x, y, z-2, new ItemStack(ModItems.QuantumWand));
						world.setBlockToAir(x-1, y, z-1);
						world.setBlockToAir(x, y, z-2);
						world.setBlockToAir(x+1, y, z-3);
						if(!world.isRemote){ world.spawnEntityInWorld(normalWandEntity); }
						player.playSound("minecraft:random.fizz", 1, 1);
					}
				}
			}
		}
	}
	
	public void transmissionQuantumWand(World world, EntityPlayer player, int x, int y, int z) {
		if(checkTransmissionQuantumWand1(world, player, x, y, z) == true) {
			EntityItem transmissionWandEntity = new EntityItem(world, x+2, y+2, z, new ItemStack(ModItems.QuantumWandOfEnergeticTransmission));
			world.setBlockToAir(x+1, y, z-1);
			world.setBlockToAir(x+2, y, z);
			world.setBlockToAir(x+3, y, z+1);
			if(!world.isRemote){ world.spawnEntityInWorld(transmissionWandEntity); }
			player.playSound("minecraft:random.fizz", 1, 1);
		}else{
			if(checkTransmissionQuantumWand2(world, player, x, y, z) == true) {
				EntityItem transmissionWandEntity = new EntityItem(world, x-2, y+2, z, new ItemStack(ModItems.QuantumWandOfEnergeticTransmission));
				world.setBlockToAir(x-1, y, z+1);
				world.setBlockToAir(x-2, y, z);
				world.setBlockToAir(x-3, y, z-1);
				if(!world.isRemote){ world.spawnEntityInWorld(transmissionWandEntity); }
				player.playSound("minecraft:random.fizz", 1, 1);
			}else{
				if(checkTransmissionQuantumWand3(world, player, x, y, z) == true) {
					EntityItem transmissionWandEntity = new EntityItem(world, x, y, z+2, new ItemStack(ModItems.QuantumWandOfEnergeticTransmission));
					world.setBlockToAir(x+1, y, z+1);
					world.setBlockToAir(x, y, z+2);
					world.setBlockToAir(x-1, y, z+3);
					if(!world.isRemote){ world.spawnEntityInWorld(transmissionWandEntity); }
					player.playSound("minecraft:random.fizz", 1, 1);
				}else{
					if(checkTransmissionQuantumWand4(world, player, x, y, z) == true) {
						EntityItem transmissionWandEntity = new EntityItem(world, x, y, z-2, new ItemStack(ModItems.QuantumWandOfEnergeticTransmission));
						world.setBlockToAir(x-1, y, z-1);
						world.setBlockToAir(x, y, z-2);
						world.setBlockToAir(x+1, y, z-3);
						if(!world.isRemote){ world.spawnEntityInWorld(transmissionWandEntity); }
						player.playSound("minecraft:random.fizz", 1 , 1);
					}
				}
			}
		}
	}
	//East
	public boolean checkMainQuantumWand1(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x+1, y, z-1) == ModBlocks.QuantumShardBlock && world.getBlock(x+2, y, z) == Blocks.iron_block && world.getBlock(x+3, y, z+1) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
		
	}
	//West
	public boolean checkMainQuantumWand2(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x-1, y, z+1) == ModBlocks.QuantumShardBlock && world.getBlock(x-2, y, z) == Blocks.iron_block && world.getBlock(x-3, y, z-1) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
	}
	//South
	public boolean checkMainQuantumWand3(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x+1, y, z+1) == ModBlocks.QuantumShardBlock && world.getBlock(x, y, z+2) == Blocks.iron_block && world.getBlock(x-1, y, z+3) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
	}
	//North
	public boolean checkMainQuantumWand4(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x-1, y, z-1) == ModBlocks.QuantumShardBlock && world.getBlock(x, y, z-2) == Blocks.iron_block && world.getBlock(x+1, y, z-3) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
	}
	
	//East
	public boolean checkTransmissionQuantumWand1(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x+1, y, z-1) == ModBlocks.QuantumShardBlock && world.getBlock(x+2, y, z) == Blocks.gold_block && world.getBlock(x+3, y, z+1) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
	}
	
	//West
	public boolean checkTransmissionQuantumWand2(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x-1, y, z+1) == ModBlocks.QuantumShardBlock && world.getBlock(x-2, y, z) == Blocks.gold_block && world.getBlock(x-3, y, z-1) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
	}
	
	//South
	public boolean checkTransmissionQuantumWand3(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x+1, y, z+1) == ModBlocks.QuantumShardBlock && world.getBlock(x, y, z+2) == Blocks.gold_block && world.getBlock(x-1, y, z+3) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
	}
	
	//North
	public boolean checkTransmissionQuantumWand4(World world, EntityPlayer player, int x, int y, int z) {
		if(world.getBlock(x-1, y, z-1) == ModBlocks.QuantumShardBlock && world.getBlock(x, y, z-2) == Blocks.gold_block && world.getBlock(x+1, y, z-3) == ModBlocks.QuantumShardBlock) {
			return true;
		}else{
			return false;
		}
	}

}
