package me.Sr4B.teams;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PlayersSort {
	
	//define the basic Variables for the constructor. 
	Player players[];
	int teams;
	int playersPerTeam;

	//some Variables to use in every object
	String teamsNames[] = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta", "Iota", "Kappa", "Lambda", "Mu"}; // 12 for now
	HashMap<String, String> log = new HashMap<String, String>();
	
	public PlayersSort(Player[] players, int teams, int playersPerTeam)
	{
		this.players = players;
		this.teams = teams;
		this.playersPerTeam = playersPerTeam;
		for(int i = 0;i < players.length; i++)
		{
			log.put(players[i].getName(), "false");
		}
	}
	
	//a method to check if the chosen player is already in a team, false if not .
	public boolean alreadyInTeam(Player player)
	{
		if(log.get(player.getName()).startsWith("t"))
			return true;
		return false;
	}
	
	//an algorithm to sort the players into their teams, there will be <playersPerTeam> in every team , returting false in case of any problem.
	public boolean sortPlayers()
	{
		//12 Teams limit 
		if(this.teams > 12)
			return false;
		for(int i = 0; i < this.teams; i++)
		{
			Team team = new Team(ChatColor.values()[i], teamsNames[i], i);
			for(int q = 0; q < this.playersPerTeam; q++)
			{
				boolean done = false;
				while(done == false)
				{
				Random random = new Random();
				int x = random.nextInt(players.length);
				Player player = players[x];
				if(alreadyInTeam(player))
					break;
				done = true;
				team.addPlayer(player);
				log.put(player.getName(), "true");
				player.sendMessage(Strings.TEAM_JOIN_MESSAGE);
				}
			}
		}
		
		return false;
	}
}
