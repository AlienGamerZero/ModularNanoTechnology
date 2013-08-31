package agz.mnt.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import agz.mnt.lib.ItemID;
import agz.mnt.lib.Strings;

public class ModItem {

	public static Item ItemMNTLogo;
	
	public static void init(){
		
		
		ItemMNTLogo = new ItemMNTLogo(ItemID.Item_MNTLogo_ID);
		
		//Sets in-game name for the items.
		LanguageRegistry.addName(ItemMNTLogo, Strings.ITEM_MNTLOGO_GAME_NAME);
		
		
	}
	
}
