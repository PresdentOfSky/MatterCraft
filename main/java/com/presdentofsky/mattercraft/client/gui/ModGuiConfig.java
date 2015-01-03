package com.presdentofsky.mattercraft.client.gui;

import com.presdentofsky.mattercraft.handler.ConfigurationHendler;
import com.presdentofsky.mattercraft.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHendler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID, false, false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHendler.configuration.toString()));
    }
}
