package messpace.QuantumWizardry.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ChargedQuantumShovel extends ItemSpade{
	public ChargedQuantumShovel(ToolMaterial material){
		super(material);
	}
	
    public boolean hasEffect(ItemStack itemstack)
    {
            return true;
    }

}
