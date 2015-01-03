package com.presdentofsky.mattercraft;

import com.presdentofsky.mattercraft.handler.ConfigurationHendler;
import com.presdentofsky.mattercraft.init.ModItems;
import com.presdentofsky.mattercraft.proxy.IProxy;
import com.presdentofsky.mattercraft.reference.Reference;
import com.presdentofsky.mattercraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MatterCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static MatterCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHendler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHendler());
        ModItems.init();
        LogHelper.info("Pre Initilazation complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initilazation complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initilazation complete!");
    }
}
