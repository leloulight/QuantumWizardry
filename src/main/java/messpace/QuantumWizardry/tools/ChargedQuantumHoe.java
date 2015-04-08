package messpace.QuantumWizardry.tools;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ChargedQuantumHoe extends ItemHoe{
	public ChargedQuantumHoe(ToolMaterial material) {
		super(material);
	}
	
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

}
