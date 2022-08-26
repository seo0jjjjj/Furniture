package me.seo0jjjjj.furniture.furniture;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUI {
    public static void showFurniture(Player player){
        Inventory gui = Bukkit.createInventory(player,9, ChatColor.AQUA + "가구 목록 :");

        ItemStack tnt = new ItemStack(Material.TNT);
        ItemStack[] menu_item = {tnt,tnt,tnt};

        gui.setContents(menu_item);
        player.openInventory(gui);


    }
}
