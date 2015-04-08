package messpace.QuantumWizardry.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ChargedQuantumAxe extends ItemAxe{
	public ChargedQuantumAxe(ToolMaterial material) {
		super(material);
	}
    
	public boolean hasEffect(ItemStack itemstack)
    {
            return true;
    }

}
