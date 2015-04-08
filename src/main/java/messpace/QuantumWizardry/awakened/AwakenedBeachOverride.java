package messpace.QuantumWizardry.awakened;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.biome.BiomeGenBeach;

public class AwakenedBeachOverride extends BiomeGenBeach{

	public AwakenedBeachOverride(int p_i1969_1_) {
		super(p_i1969_1_);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1) {
		return 0xE64CE6;
	}

}
