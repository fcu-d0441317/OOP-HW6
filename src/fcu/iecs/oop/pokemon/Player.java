package fcu.iecs.oop.pokemon;

public class Player 
{
	private String playerName ;
	private Pokemon[] pokemons ;
	private int level = 1 ;
	
	public String get_PlayerName() 
	{
		return playerName ;
	}
	public void set_PlayerName(String playerName) 
	{
		this.playerName = playerName ;
	}
	public Pokemon[] get_Pokemons() 
	{
		return pokemons ;
	}
	public void set_Pokemons(Pokemon[] pokemons) 
	{
		this.pokemons = pokemons ;
	}
	public int get_Level() 
	{
		return level ;
	}
	public void set_Level(int level) 
	{
		this.level = level ;
	}
	
	public Player(String playerName)
	{
		this.playerName=playerName;
	}

}