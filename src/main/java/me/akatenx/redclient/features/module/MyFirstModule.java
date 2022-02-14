package me.akatenx.redclient.features.module;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class MyFirstModule extends Module {
    public MyFirstModule() {
        super("MyFirstModule", Category.CLIENT, Keyboard.KEY_I);
    }

    @Override
    public void onEnable() {

        Minecraft.getMinecraft().player.sendChatMessage("enabled!!");
    }

    @Override
    public void onDisable() {

        Minecraft.getMinecraft().player.sendChatMessage("disabled!!");
    }
}