package agz.mnt;

import net.minecraft.creativetab.CreativeTabs;
import agz.mnt.block.ModBlock;
import agz.mnt.creativetab.CreativeTabMNT;
import agz.mnt.lib.ModInfo;
import agz.mnt.item.ModItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ModularNanoTechnology {
	
	
	public static CreativeTabs tabMNT = new CreativeTabMNT(ModInfo.MOD_NAME);
	
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		ModBlock.init();
		ModItem.init();
	}
	
}
