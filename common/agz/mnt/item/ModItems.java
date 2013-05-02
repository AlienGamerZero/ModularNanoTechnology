package agz.mnt.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import agz.mnt.lib.ItemID;
import agz.mnt.lib.Textures;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
	
	
	public static Item NanoManipulationDevice;
	public static Item ItemMNTLogo;
	public static final ItemStack ItemTabMNTLogo = new ItemStack(ItemMNTLogo, 1);
	
	public static void init(){
		
		NanoManipulationDevice = new ItemNanoManipulationDevice(ItemID.ID_NANOMANIPULATIONDEVICE_DEFAULT);
		
		LanguageRegistry.addName(NanoManipulationDevice, Textures.TEXTURE_ITEM_NANOMANIPULATIONDEVICE);
		
		
		

	
		
		

		
		
		//Creative Tab Logo Item
		//MNTLogo = new ItemMNTLogo(ItemID.ID_MNTLogo);
		ItemMNTLogo = new ItemMNTLogo(ItemID.ID_MNTLogo);
		LanguageRegistry.addName(ItemMNTLogo, Textures.TEXTURE_ITEM_NANOMANIPULATIONDEVICE);
	}
	
	
}
