package me.Sr4B.teams;

import me.Sr4B.teams.errorHandler.ErrorLogger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Teams extends JavaPlugin{
	
	@Override
	public void onEnable()
	{
		ErrorLogger.register(this, "Teams", "me.Sr4B.teams", "09707");
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	
	
	public boolean onCommand(Command cmd, CommandSender Sender, String cmdlabel, String[] args)
	{
		//Check the command, then the sender's permissions, then the args! 
		if(cmdlabel.equalsIgnoreCase("teams")&&Sender.isOp()&&args.length == 2)
		{
			try{
			Player[] players = Sender.getServer().getOnlinePlayers();
			PlayersSort pm = new PlayersSort(players,Integer.parseInt(args[1]), Integer.parseInt(args[2]));
			pm.sortPlayers();
			}
			catch(Exception e)
			{
				Sender.sendMessage("usage : /teams <Teams number> <Players per team>");
			}
		}
		
		return false;
	}
}
