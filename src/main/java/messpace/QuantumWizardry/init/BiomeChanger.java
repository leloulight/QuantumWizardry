package messpace.QuantumWizardry.init;

import messpace.QuantumWizardry.awakened.AwakenedBeachOverride;
import messpace.QuantumWizardry.awakened.AwakenedPlainsOverride;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeChanger {
	
	public static void init(){
		Height shore;
		shore = new Height(0.0F, 0.025F);
		
		BiomeGenBase coldBeach = new AwakenedBeachOverride(26).setColor(16445632).setBiomeName("Cold Beach").setTemperatureRainfall(0.05F, 0.3F).setHeight(shore).setEnableSnow();
		BiomeGenBase plains = new AwakenedPlainsOverride(1).setColor(9286496).setBiomeName("Plains");
	}
	
	public static void changeSkyColors() {
		AwakenedPlainsOverride plains = new AwakenedPlainsOverride(1);
		plains.getSkyColorByTemp(1.0F);
	}

}
