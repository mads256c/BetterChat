package com.mads256c.betterchat;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import java.io.PrintStream;

public class ClientProxy
        extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        super.preInit(e);
    }

    public void init(FMLInitializationEvent e)
    {
        super.init(e);
    }

    public void postInit(FMLPostInitializationEvent e)
    {
        super.postInit(e);
        BetterChat.bLog.info("BetterChat has loaded client-side.");
    }
}
