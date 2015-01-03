package com.presdentofsky.mattercraft.init;

import com.presdentofsky.mattercraft.item.ItemMTC;
import com.presdentofsky.mattercraft.item.ItemMatterIngot;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems
{
    public static final ItemMTC matteringot = new ItemMatterIngot();

    public static void init()
    {
        GameRegistry.registerItem(matteringot, "Matter ingot");
    }

}

