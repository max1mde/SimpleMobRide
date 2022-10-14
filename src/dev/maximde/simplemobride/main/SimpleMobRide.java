package dev.maximde.simplemobride.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import dev.maximde.simplemobride.events.EntityClick;

public class SimpleMobRide extends JavaPlugin {
	
	/**
	 * Method is called on plugin start
	 */
	@Override
	public void onEnable() {
		registerEvents();
    	getServer().getConsoleSender().sendMessage("§5==>> Simple Mob Ride <<==");
    	getServer().getConsoleSender().sendMessage("§5=========================");
    	getServer().getConsoleSender().sendMessage("§5==Plugin by MaximDe======");
    	getServer().getConsoleSender().sendMessage("§bhttps://discord.gg/gbqF32Qsv2");
    	getServer().getConsoleSender().sendMessage("§bhttps://www.spigotmc.org/members/maximde.1620695/");
    	getServer().getConsoleSender().sendMessage("§5=========================");
	}
	
	/**
	 * Register all events
	 */
	private void registerEvents() {
		Bukkit.getPluginManager().registerEvents(new EntityClick(), this);
	}

	/**
	 * MaximDe 2022.
	 * 
	 * LINKS:
	 * https://github.com/JavaDevMC
	 * https://www.spigotmc.org/members/maximde.1620695/
	 */
}



