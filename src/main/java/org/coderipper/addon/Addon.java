package org.coderipper.addon;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;

import org.coderipper.addon.modules.GrimDisabler;
import org.slf4j.Logger;


public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("coderipper");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        Modules.get().add(new GrimDisabler());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "org.coderipper.addon";
    }
}
