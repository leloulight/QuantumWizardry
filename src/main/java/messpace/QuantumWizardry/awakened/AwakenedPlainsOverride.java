package messpace.QuantumWizardry.awakened;

import net.minecraft.world.biome.BiomeGenPlains;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AwakenedPlainsOverride extends BiomeGenPlains{

	public AwakenedPlainsOverride(int p_i1986_1_) {
		super(p_i1986_1_);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1) {
		return 0xE64CE6;
	}

}
