package messpace.QuantumWizardry.common;

import messpace.QuantumWizardry.render.QuantumExchangerRenderer;
import messpace.QuantumWizardry.tileentity.TileEntityQuantumExchanger;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		this.registerRenderers();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
	public void registerHandlers() {
		FMLInterModComms.sendMessage("IGWMod", "messpace.QuantumWizardry.common.IGWHandler", "init");
	}
	
	public void registerRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityQuantumExchanger.class, new QuantumExchangerRenderer());
	}

}
