package agz.mnt.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import agz.mnt.lib.ItemID;
import agz.mnt.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
	
	
	public static Item NanoManipulationDevice;
	public static Item MNTLogo;
	public ItemStack ItemMNTLogo = new ItemStack(MNTLogo, 1);
	
	public static void init(){
		
		NanoManipulationDevice = new ItemNanoManipulationDevice(ItemID.ID_NANOMANIPULATIONDEVICE_DEFAULT, 0, null, null);
		
		
		
		LanguageRegistry.addName(NanoManipulationDevice, Strings.NANOMANIPULATIONDEVICE_NAME);
		
		
		

		//For creative tab
		MNTLogo = new ItemMNTLogo(ItemID.ID_MNTLogo);
		LanguageRegistry.addName(MNTLogo, Strings.MNTLogo_NAME);
	}
	
	
}
