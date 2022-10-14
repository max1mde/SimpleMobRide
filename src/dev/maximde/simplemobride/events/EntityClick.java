package dev.maximde.simplemobride.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class EntityClick implements Listener {
	
	/**
	 * If player clicked an entity -> player is riding the entity
	 * @param e 
	 */
	@EventHandler
	public void onInteract(PlayerInteractEntityEvent e) {
		Player p = e.getPlayer();
		Entity en = e.getRightClicked();
		if(!(en instanceof ArmorStand) && !(en instanceof Player)) {
		  en.setPassenger(p);
		}
	}
	
	/**
	 * MaximDe 2022.
	 * 
	 * LINKS:
	 * https://github.com/JavaDevMC
	 * https://www.spigotmc.org/members/maximde.1620695/
	 */
}
