package me.akatenx.redclient.features.module.command.commands;

import me.akatenx.redclient.RedClient;
import me.akatenx.redclient.features.module.Module;
import me.akatenx.redclient.features.module.command.Command;
import org.lwjgl.input.Keyboard;

public class Bind extends Command {
    public Bind() {
        super("Bind");
    }

    @Override
    public void onCommand() {
        try {
            for (Module m : RedClient.module.modules) {
                if (m.name.toLowerCase().equals(getArg(1).toLowerCase())) {
                    m.keybind = Keyboard.getKeyIndex(getArg(2).toUpperCase());
                    sendMessage(m.name + " was bound to " + Keyboard.getKeyName(m.keybind));
                    return;
                }
            }
            sendMessage("no such module");
        } catch (Exception ex) {
            sendMessage("error");
        }
    }
}