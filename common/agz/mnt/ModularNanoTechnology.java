package agz.mnt;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import agz.mnt.block.ModBlocks;
import agz.mnt.core.proxy.CommonProxy;
import agz.mnt.item.ModItems;
import agz.mnt.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ModularNanoTechnology {

	
	//Adds custom creative tab. Do: setCreativeTab(ModularNanoTechnology.MNTtab); to use.
	public static CreativeTabs MNTtab = new CreativeTabs("Modular Nano Technology") {
        public ItemStack getIconItemStack() {
                return new ItemStack(ModItems.MNTLogo, 1, 0);
        }
};
	


    @Instance("ModularNanoTechnology")
    public static ModularNanoTechnology instance;
    
    
    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
    	ModBlocks.init();
    	ModItems.init();
    }
    
    @Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
            
            //Sets Creativetab name
            LanguageRegistry.instance().addStringLocalization("itemGroup.Modular Nano Technology", "en_US", "Modular Nano Technology");
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}
