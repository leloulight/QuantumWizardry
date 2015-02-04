package messpace.QuantumWizardry.common;

import net.minecraftforge.common.MinecraftForge;
import messpace.QuantumWizardry.init.ModBlocks;
import messpace.QuantumWizardry.init.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "quantumwizardy", name = "Quantum Wizardry", version = "0.1")

public class QuantumWizardry {
	
	@Instance("QuantumWizardry")
	public static QuantumWizardry instance;
	
	@SidedProxy(clientSide="messpace.QuantumWizardry.common.ClientProxy", serverSide="messpace.QuantumWizardry.common.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.init();
		ModItems.init();
		this.proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
		MinecraftForge.EVENT_BUS.register(new messpace.QuantumWizardry.init.EventHandler());
		}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}

}
