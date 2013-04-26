package me.Sr4B.teams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


public class Team {

	//Defining the basic varibles, refilled by the constructor;
	final ChatColor color;
	final String name;
	final int id;
	//final String capacity;
	Player[] players;
	//the default constructor , used mostly for importing team from the database
	public Team (ChatColor color, String name, int id, Player[] players)
	{
		this.color = color;
		this.name = name;
		this.id = id;
		//this.capacity = capacity;
		this.players = players;
	}
	//Another constructor for Players sorting.
	public Team (ChatColor color, String name, int id)
	{
		this.color = color;
		this.name = name;
		this.id = id;
		//this.capacity = capacity;
	}
	
	// re turning the "player" Team;
	public Team getTeam(Player player)
	{
		
		return this;
	}
	//adding a player to "this" Team, true if everything is ok, false if else
	public boolean addPlayer(Player player)
	{
		players[players.length+1] = player;
		player.setDisplayName(this.color + "["+this.name+"]" +" "+ player.getName());
		player.chat("i'm in " + color + this.name + ChatColor.WHITE + " Team");
		return false;
	}
	//removing a player from "this" Team, true if everything is ok, false if else
	public boolean removePlayer(Player player)
	{
		List<Player> list = new ArrayList<Player>(Arrays.asList(players));
		list.remove(player);
		players = list.toArray(players);
		return false;
	}
	//writing the Team to the database, doesn't need any parameter
	public boolean writeToDatabase()
	{
		return false;
	}
	
}
