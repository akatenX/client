package me.akatenx.redclient.features.module.movement;

import me.akatenx.redclient.features.module.Category;
import me.akatenx.redclient.features.module.Module;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", Category.MOVEMENT, Keyboard.KEY_U);
    }

    @Override
    public void onUpdate() {
        if (Minecraft.getMinecraft().player.moveForward > 0) {
            Minecraft.getMinecraft().player.setSprinting(true);
        }
    }
}