package fr.villomega.royalitypvp.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class listeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();

        p.getInventory().clear();
        p.chat("/spawn");

        ItemStack teleportItem = new ItemStack(Material.ENDER_PEARL, 1);
        ItemMeta tpItemMeta = teleportItem.getItemMeta();

        ItemStack classeChoice = new ItemStack(Material.BOOK, 1);
        ItemMeta cChoiceMeta = classeChoice.getItemMeta();

        ItemStack shop = new ItemStack(Material.CHEST, 1);
        ItemMeta shopMeta = shop.getItemMeta();

        tpItemMeta.setDisplayName("§6§lPoint de spawn");
        tpItemMeta.setLore(Arrays.asList("§a• Cet item sert à se téléporter", "§a  à un point de spawn.","§9• Clique sur le bloc de ton choix"));
        tpItemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
        tpItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        cChoiceMeta.setDisplayName("§a§lChoisis ta classe");
        shopMeta.setDisplayName("§9§lShop");

        teleportItem.setItemMeta(tpItemMeta);
        classeChoice.setItemMeta(cChoiceMeta);
        shop.setItemMeta(shopMeta);

        p.getInventory().setItem(1, classeChoice);
        p.getInventory().setItem(4, teleportItem);
        p.getInventory().setItem(7, shop);
    }

}
