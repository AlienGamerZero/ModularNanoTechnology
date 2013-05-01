package agz.mnt.item;

import agz.mnt.lib.Reference;
import agz.mnt.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemNanoManipulationDevice extends Item {

	public ItemNanoManipulationDevice(int id) {
		super(id);
		this.setUnlocalizedName(Strings.NANOMANIPULATIONDEVICE_NAME);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName());
	}
		
}
