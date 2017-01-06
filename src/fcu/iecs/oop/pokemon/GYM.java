package fcu.iecs.oop.pokemon;

public class GYM 
{
	public static Player fight(Player...players)
	{
		int win1 = 0 ;
		int win2 = 0 ;
		int i;
		for(i=0;i<=2;i++)
		{
			Pokemon[] pokemons1=players[0].get_Pokemons();
			Pokemon[] pokemons2=players[1].get_Pokemons();
			if(pokemons1[i].get_Type()==PokemonType.FIRE && pokemons2[i].get_Type()==PokemonType.GRASS)
			{
				win1++;
			}
			else if(pokemons1[i].get_Type()==PokemonType.GRASS && pokemons2[i].get_Type()==PokemonType.WATER)
			{
				win1++;
			}
			else if(pokemons1[i].get_Type()==PokemonType.WATER && pokemons2[i].get_Type()==PokemonType.FIRE)
			{
				win1++;
			}
			else if(pokemons1[i].get_Type()==PokemonType.FIRE && pokemons2[i].get_Type()==PokemonType.WATER)
			{
				win2++;
			}
			else if(pokemons1[i].get_Type()==PokemonType.GRASS && pokemons2[i].get_Type()==PokemonType.FIRE)
			{
				win2++;
			}
			else if(pokemons1[i].get_Type()==PokemonType.WATER && pokemons2[i].get_Type()==PokemonType.GRASS)
			{
				win2++;
			}
			else if(pokemons1[i].get_Type()==pokemons2[i].get_Type() && pokemons1[i].get_Cp()!=pokemons2[i].get_Cp())
			{
				if(pokemons1[i].get_Cp() > pokemons2[i].get_Cp())
				{
					win1++;
				}
				else if(pokemons1[i].get_Cp() < pokemons2[i].get_Cp())
				{
					win2++;
				}
			}
			else if(pokemons1[i].get_Type()==pokemons2[i].get_Type() && pokemons1[i].get_Cp()==pokemons2[i].get_Cp())
			{
				if((int)(Math.random()*10)<6)
				{
					win1++;
				}
				else
				{
					win2++;
				}
			}
		}
		if(win1==2)
		{
			players[0].set_Level(players[0].get_Level()+1);
			System.out.println("Winner is [" + players[0].get_PlayerName() + "], and his/her level becomes [" + players[0].get_Level() + "]");
			return players[0];
		}
		else
		{
			players[1].set_Level(players[1].get_Level()+1);
			System.out.println("Winner is [" + players[1].get_PlayerName() + "], and his/her level becomes [" + players[1].get_Level() + "]");
			return players[1];
		}
		
		
	}

}