package fr.naty.spawn;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player) sender;
            Location spawn = new Location(player.getWorld(), -551.500, 91, -967.500, 0.4f, -2.9f); //replace the coordinates with your spawn location :)
            player.sendMessage("Spawn tp succesfull");
            player.teleport(spawn);
        }

        return false;

    }
}
   
