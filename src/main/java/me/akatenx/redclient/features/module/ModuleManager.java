package me.akatenx.redclient.features.module;

import me.akatenx.redclient.features.module.movement.Sprint;

import java.util.ArrayList;

public class ModuleManager {
    public ArrayList<Module> modules = new ArrayList<>();

    public ModuleManager() {
        modules.add(new MyFirstModule());
        modules.add(new Sprint());
    }
}