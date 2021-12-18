package com.novemberlc.godtype;

import java.util.Objects;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CompassMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

@SuppressWarnings("unused")
public final class GodType extends JavaPlugin implements Listener {
	FileConfiguration config = this.getConfig();
	public static Plugin plugin;

	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

	public void onEnable() {
		config.addDefault("color", "dark_red");
		config.addDefault("name", "GOD");
		config.addDefault("bold", true);
		config.addDefault("chatTypeColon", false);
		config.options().copyDefaults(true);
		saveConfig();

		Bukkit.getPluginManager().registerEvents(this, (Plugin) this);
		plugin = (Plugin) this;
		getCommand("gt").setExecutor((CommandExecutor) this);
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		
		
		if (sender.hasPermission("godtyper")) {

			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "/gt <message>");
				return false;
			}

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < args.length; i++) {
				builder.append(args[i] + " ");
			}

			String message = builder.toString();


			
			if (config.getBoolean("chatTypeColon")) {
				String tellraw = "tellraw @a [\"\",{\"text\":\"" + config.getString("name") + "\",\"bold\":" + String.valueOf(config.getBoolean("bold")) + ",\"color\":\"" + config.getString("color") + "\"},{\"text\":\": \"},{\"text\":\"" + message + "\"}]";
				Bukkit.dispatchCommand(console, tellraw);
			} else {
				String tellraw = "tellraw @a [\"\",{\"text\":\"<\"},{\"text\":\"" + config.getString("name") + "\",\"bold\":" + String.valueOf(config.getBoolean("bold")) + ",\"color\":\"" + config.getString("color") + "\"},{\"text\":\"> \"},{\"text\":\"" + message + "\"}]";
				Bukkit.dispatchCommand(console, tellraw);
			}
			

		}
		return true;
	}

	public void onDisable() {
	}
}
