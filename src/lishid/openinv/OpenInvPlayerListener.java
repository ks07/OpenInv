package lishid.openinv;


import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class OpenInvPlayerListener extends PlayerListener{
	OpenInv plugin;
	public OpenInvPlayerListener(OpenInv scrap) {
		plugin = scrap;
	}

	@Override
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		OpenInv.ReplaceInv((CraftPlayer) event.getPlayer());
	}

	@Override
	public void onPlayerRespawn(PlayerRespawnEvent event)
	{
		OpenInv.ReplaceInv((CraftPlayer) event.getPlayer());
	}
}
