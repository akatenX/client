package me.akatenx.redclient.features.module.command;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;

public class Command {
    public String name;
    public String commandInput;

    public Command(String name) {
        super();
        this.name = name;
    }

    public void onCommand() { }

    public String getArg(int i) {
        return commandInput.split(" ")[i];
    }

    public static void sendMessage(String content) {
        Minecraft.getMinecraft().player.sendMessage(new TextComponentString( ChatFormatting.GRAY + "Red >> " + content));
    }
}
