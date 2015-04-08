package messpace.QuantumWizardry.blocks;

import messpace.QuantumWizardry.init.BiomeChanger;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockAwakenedShard extends Block{
	
	public BlockAwakenedShard(Material material) {
		super(material);
		}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p1, float p2, float p4) {
		
		return true;
	}
	/*Add here mob spawning mechanics and multiblock checker.*/

}
