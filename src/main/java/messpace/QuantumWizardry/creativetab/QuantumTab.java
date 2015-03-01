package messpace.QuantumWizardry.creativetab;

import messpace.QuantumWizardry.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class QuantumTab extends CreativeTabs {
	public QuantumTab(int id, String unlocalizedname) {
		super(id, unlocalizedname);
	}
	
	public Item getTabIconItem() {
		return ModItems.QuantumReader;
	}

}
