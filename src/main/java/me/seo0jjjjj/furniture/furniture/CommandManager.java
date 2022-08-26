package me.seo0jjjjj.furniture.furniture;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandManager implements CommandExecutor {

    private final Furniture plugin;

    public CommandManager(Furniture plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        Player player ;

        // 가구
        if(sender instanceof Player && args.length==0)
        {
            player = (Player) sender;
            GUI.showFurniture(player);
        }
    return false;
    }

}