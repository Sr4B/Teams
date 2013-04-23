package me.Sr4B.teams;

import org.bukkit.entity.Player;

public class PlayersSort {
	
	//define the basic Variables
	Player players[];
	String teams;
	String playersPerTeam;

	public PlayersSort(Player[] players, String teams, String playersPerTeam)
	{
		this.players = players;
		this.teams = teams;
		this.playersPerTeam = playersPerTeam;
	}
	
	//Simple algorithm, to sort the players into thier teams, there will be <playersPerTeam> in every team . 
}
