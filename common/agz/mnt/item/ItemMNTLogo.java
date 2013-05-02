package agz.mnt.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import agz.mnt.lib.Reference;
import agz.mnt.lib.Strings;
import agz.mnt.lib.Textures;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMNTLogo extends Item{

	public ItemMNTLogo(int id) {
		super(id);	
		this.setUnlocalizedName(Strings.MNTLogo_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + Textures.TEXTURE_MNT_LOGO);
	}
}
