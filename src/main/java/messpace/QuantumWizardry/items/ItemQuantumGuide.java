package messpace.QuantumWizardry.items;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;

public class ItemQuantumGuide extends Item{
	
	public ItemQuantumGuide() {
		ItemStack tomeStack = new ItemStack(Items.written_book);
		NBTTagList bookPages = new NBTTagList();
		bookPages.appendTag(new NBTTagString("This Is Some Sample Text"));
		bookPages.appendTag(new NBTTagString("This is Some More Text"));
		tomeStack.setTagInfo("pages", bookPages);
		tomeStack.setTagInfo("author", new NBTTagString("MESSpace"));
		tomeStack.setTagInfo("title", new NBTTagString("Quantum Guide"));
	}
	
	

}
