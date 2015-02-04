package messpace.QuantumWizardry.common;

import messpace.QuantumWizardry.tileentity.TileEntityQuantumSapper;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		GameRegistry.registerTileEntity(TileEntityQuantumSapper.class, "TileEntityQuantamSapper");
	}
	
	public void init(FMLInitializationEvent e) {

	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}

}
