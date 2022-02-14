package me.akatenx.redclient.event;

import me.akatenx.redclient.RedClient;
import me.akatenx.redclient.features.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class PlayerKeyInputEvent {
    @SubscribeEvent
    public void toggle(InputEvent.KeyInputEvent e) {
        if (Minecraft.getMinecraft().player == null || Minecraft.getMinecraft().world ==null)
            return;
        if (Keyboard.isCreated() && Keyboard.getEventKeyState()) {
            int key = Keyboard.getEventKey();
            for (Module m : RedClient.module.modules) {
                if (m.keybind == key) {
                    m.toggle();
                    return;
                }
            }
        }
    }
}