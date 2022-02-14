package me.akatenx.redclient.event;

import me.akatenx.redclient.RedClient;
import me.akatenx.redclient.features.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class PlayerTickEvent {
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent e) {
        if (e.phase != TickEvent.Phase.START)
            return;
        if (e.player != Minecraft.getMinecraft().player)
            return;
        for (Module m : RedClient.module.modules) {
            if (m.istoggled)
                m.onUpdate();
        }
    }
}