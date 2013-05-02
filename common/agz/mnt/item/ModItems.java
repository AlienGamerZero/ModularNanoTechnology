package agz.mnt.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import agz.mnt.lib.ItemID;
import agz.mnt.lib.Strings;
import agz.mnt.lib.Textures;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
	
	
	public static Item NanoManipulationDevice;
	public static Item MNTLogo;
	public ItemStack ItemMNTLogo = new ItemStack(MNTLogo, 1);
	
	public static void init(){
		
		NanoManipulationDevice = new ItemNanoManipulationDevice(ItemID.ID_NANOMANIPULATIONDEVICE_DEFAULT);
		
		
		
		LanguageRegistry.addName(NanoManipulationDevice, Textures.TEXTURE_ITEM_NANOMANIPULATIONDEVICE);
		
		
		

		//For creative tab
		MNTLogo = new ItemMNTLogo(ItemID.ID_MNTLogo);
		LanguageRegistry.addName(MNTLogo, Strings.MNTLogo_NAME);
	}
	
	
}
