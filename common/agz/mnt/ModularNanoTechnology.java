package agz.mnt;

import agz.mnt.block.ModBlocks;
import agz.mnt.core.proxy.CommonProxy;
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

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ModularNanoTechnology {

	// The instance of your mod that Forge uses.
    @Instance("ModularNanoTechnology")
    public static ModularNanoTechnology instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
    	ModBlocks.init();
    }
    
    @Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}
