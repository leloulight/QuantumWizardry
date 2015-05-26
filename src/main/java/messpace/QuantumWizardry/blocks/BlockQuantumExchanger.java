package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.init.ModItems;
import messpace.QuantumWizardry.network.NetworkAliases;
import messpace.QuantumWizardry.network.PlayerNetworkManager;
import messpace.QuantumWizardry.tileentity.TileEntityQuantumExchanger;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockQuantumExchanger extends BlockContainer{
	
	public BlockQuantumExchanger(Material blockMaterial) {
		super(blockMaterial);
	}
	
	@Override
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
		PlayerNetworkManager networkManager = PlayerNetworkManager.get(player);
		NetworkAliases alias = new NetworkAliases();
		
		
		if(player.inventory.hasItem(Items.diamond)) {
			if(networkManager.consumeEnergy(50) == true) {
				player.inventory.consumeInventoryItem(Items.diamond);
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.QuantumShard));
				player.playSound("minecraft:random.levelup", 1.0F, 1.0F);
				alias.serverMessage("1 Diamond has been exchanged for 1 Quantum Shard.", player, world);
			}else{
				alias.serverMessage("You Don't Have Enough Energy!", player, world);
			}
		}else{
			if(player.inventory.hasItem(ModItems.QuantumAxe)) {
				if(networkManager.consumeEnergy(50) == true) {
					player.inventory.consumeInventoryItem(ModItems.QuantumAxe);
					player.inventory.addItemStackToInventory(new ItemStack(ModItems.ChargedQuantumAxe));
					player.playSound("minecraft:random.levelup", 1.0F, 1.0F);
					alias.serverMessage("Quantum Axe Charged.", player, world);
				}else{
					alias.serverMessage("You Don't Have Enough Energy!", player, world);
				}
			}else{
				if(player.inventory.hasItem(ModItems.QuantumHoe)) {
					if(networkManager.consumeEnergy(50) == true) {
						player.inventory.consumeInventoryItem(ModItems.QuantumHoe);
						player.inventory.addItemStackToInventory(new ItemStack(ModItems.ChargedQuantumHoe));
						player.playSound("minecraft:random.levelup", 1.0F, 1.0F);
						alias.serverMessage("Quantum Hoe Charged.", player, world);
					}else{
						alias.serverMessage("You Don't Have Enough Energy!", player, world);
					}
				}else{
					if(player.inventory.hasItem(ModItems.QuantumPickaxe)) {
						if(networkManager.consumeEnergy(50) == true) {
							player.inventory.consumeInventoryItem(ModItems.QuantumPickaxe);
							player.inventory.addItemStackToInventory(new ItemStack(ModItems.ChargedQuantumPickaxe));
							player.playSound("minecraft:random.levelup", 1.0F, 1.0F);
							alias.serverMessage("Quantum Pickaxe Charged.", player, world);
						}else{
							alias.serverMessage("You Don't Have Enough Energy!", player, world);
						}
					}else{
						if(player.inventory.hasItem(ModItems.QuantumShovel)) {
							if(networkManager.consumeEnergy(50) == true) {
								player.inventory.consumeInventoryItem(ModItems.QuantumShovel);
								player.inventory.addItemStackToInventory(new ItemStack(ModItems.ChargedQuantumShovel));
								player.playSound("minecraft:random.levelup", 1.0F, 1.0F);
								alias.serverMessage("Quantum Shovel Charged", player, world);
							}else{
								alias.serverMessage("You Don't Have Enough Energy!", player, world);
							}
						}else{
							if(player.inventory.hasItem(ModItems.QuantumSword)) {
								if(networkManager.consumeEnergy(50) == true) {
									player.inventory.consumeInventoryItem(ModItems.QuantumSword);
									player.inventory.addItemStackToInventory(new ItemStack(ModItems.ChargedQuantumSword));
									player.playSound("minecraft:random.levelup", 1.0F, 1.0F);
									alias.serverMessage("Quantum Sword Charged.", player, world);
								}else{
									alias.serverMessage("You Don't Have Enough Energy!", player, world);
								}
							}else{
								alias.serverMessage("No Valid Exchanger Item Found.", player, world);
							}
						}
					}
				}
			}
		}
		return true;
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		return new TileEntityQuantumExchanger();
	}
	

}
