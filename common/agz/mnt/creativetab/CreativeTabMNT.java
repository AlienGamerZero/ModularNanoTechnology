package agz.mnt.creativetab;

import agz.mnt.item.ModItems;
import agz.mnt.lib.ItemID;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMNT extends CreativeTabs{

	public CreativeTabMNT()
	{
		super("MNTtab");
		LanguageRegistry.instance().addStringLocalization("itemGroup.MNTtab", "Modular Nano Technology");
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return ModItems.ItemTabMNTLogo;
	}
}

