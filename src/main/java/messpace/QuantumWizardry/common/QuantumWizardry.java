package messpace.QuantumWizardry.common;

import messpace.QuantumWizardry.creativetab.QuantumTab;
import messpace.QuantumWizardry.init.BiomeChanger;
import messpace.QuantumWizardry.init.ModBlocks;
import messpace.QuantumWizardry.init.ModItems;
import messpace.QuantumWizardry.init.ModMobs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "quantumwizardy", name = "Quantum Wizardry", version = "0.1")

public class QuantumWizardry {
	
	@Instance("QuantumWizardry")
	public static QuantumWizardry instance;
	
	@SidedProxy(clientSide="messpace.QuantumWizardry.common.ClientProxy", serverSide="messpace.QuantumWizardry.common.ServerProxy")
	public static CommonProxy proxy;
	public static ClientProxy clproxy;
	
	public boolean isGravityOffline = false;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		//FMLInterModComms.sendMessage("IGWMod", "messpace.QuantumWizardry.common.IGWHandler", "init");
		ModMobs.init();
		this.proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
		ModBlocks.init();
		ModItems.init();
		BiomeChanger.init();
		MinecraftForge.EVENT_BUS.register(new messpace.QuantumWizardry.init.EventHandler());
		}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
	
	public static CreativeTabs tabQuantum = new QuantumTab(CreativeTabs.getNextID(), "tabQuantum");

}
