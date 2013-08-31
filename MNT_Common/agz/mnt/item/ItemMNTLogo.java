package agz.mnt.item;

import agz.mnt.ModularNanoTechnology;
import agz.mnt.lib.ModInfo;
import agz.mnt.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMNTLogo extends Item{

	public ItemMNTLogo(int id){
		super(id);
		this.setUnlocalizedName(Strings.ITEM_MNTLOGO_NAME);
		maxStackSize = 1;
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(String.format("%s:%s", ModInfo.MOD_ID, this.getUnwrappedUnlocalizedName(this.getUnlocalizedName()) ));
	}
	
	protected String getUnwrappedUnlocalizedName(String name){
		return name.substring(name.indexOf(".")+1);
	}
}
