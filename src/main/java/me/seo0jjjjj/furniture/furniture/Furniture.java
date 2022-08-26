package me.seo0jjjjj.furniture.furniture;

import org.bukkit.plugin.java.JavaPlugin;

public final class Furniture extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //get Config
        getCommand("가구").setExecutor(new CommandManager(this));
        getServer().getPluginManager().registerEvents(new EventManager(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
