package messpace.QuantumWizardry.common;

import igwmod.gui.GuiWiki;
import igwmod.gui.tabs.BaseWikiTab;
import messpace.QuantumWizardry.init.ModItems;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;

public class IGWTab extends BaseWikiTab{
	
	public IGWTab() {
		pageEntries.add("welcome");
		pageEntries.add("reader");
	}
	
	@Override
	public String getName() {
		return "Quantum Wizardry";
	}
	
	@Override
	public ItemStack renderTabIcon(GuiWiki gui) {
		return new ItemStack(ModItems.QuantumReader);
	}

	@Override
	protected String getPageName(String pageEntry) {
		return I18n.format("igwtab.entry." + pageEntry);
	}

	@Override
	protected String getPageLocation(String pageEntry) {
		return "igwtab/" + pageEntry;
	}

}
