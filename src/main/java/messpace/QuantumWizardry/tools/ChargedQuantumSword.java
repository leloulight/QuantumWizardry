package messpace.QuantumWizardry.tools;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ChargedQuantumSword extends ItemSword{
	public ChargedQuantumSword(ToolMaterial material) {
		super(material);
	}
	
    public boolean hasEffect(ItemStack itemstack)
    {
            return true;
    }

}
