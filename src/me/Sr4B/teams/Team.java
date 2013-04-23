package me.Sr4B.teams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.entity.Player;


public class Team {

	//Defining the basic varibles, refilled by the constructor;
	final Color color;
	final String name;
	final String id;
	final String capacity;
	Player[] players;
	
	public Team (Color color, String name, String id, String capacity,  Player[] players)
	{
		this.color = color;
		this.name = name;
		this.id = id;
		this.capacity = capacity;
		this.players = players;
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
