package messpace.QuantumWizardry.awakened;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.biome.BiomeGenBeach;

public class AwakenedBeachOverride extends BiomeGenBeach{

	public AwakenedBeachOverride(int p_i1969_1_) {
		super(p_i1969_1_);
		// TODO Auto-generated constructor stub
	}
	
	//Below is the proposed change to code in order to detect whether the world is in the awakened state.
	//Will implement if working, when Quantum Wizard is implemented, and when all override classes are written.
	/*public static setPurpleSkies(NBTTagCompound nbt) {
		boolean isAwakened = nbt.getString("isAwakened");
		if(isAwakened == true) {
			System.out.println("World is in awakened state, skies will be purple.");
			@SideOnly(Side.CLIENT)
			public int getSkyColorByTemp(float par1) {
				return 0XE64CE6;
			}
		}else{
			System.out.println("World is not in awakened state, skies will be as normal.");
		}
	}*/
	
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1) {
		return 0xE64CE6;
	}

}
