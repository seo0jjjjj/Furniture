package me.seo0jjjjj.furniture.furniture;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

public class EventManager implements Listener {
    @EventHandler
    public void Inventory(InventoryClickEvent e){
        InventoryView v = e.getView();
        boolean test = v.getTitle().equals("§b가구 목록 :");
        e.setCancelled(true);
    }

}
