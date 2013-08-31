package agz.mnt.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import agz.mnt.item.ModItem;
import agz.mnt.lib.ItemID;
import agz.mnt.lib.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMNT extends CreativeTabs{

	
	public CreativeTabMNT(String tabLabel){
		super(tabLabel);
	}
	
	//@Override
	//@SideOnly(Side.CLIENT)
	//public int getTabIconItemIndex() {
	//	return ItemID.Item_MNTLogo_ID;
	//}
	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ModItem.ItemMNTLogo);
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return ModInfo.MOD_NAME;
	}
}
