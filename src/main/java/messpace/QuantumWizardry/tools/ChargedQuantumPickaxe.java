
package messpace.QuantumWizardry.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ChargedQuantumPickaxe extends ItemPickaxe{
	public ChargedQuantumPickaxe(ToolMaterial material) {
		super(material);
	}
	
    public boolean hasEffect(ItemStack itemstack)
    {
            return true;
    }

}
