package fcu.iecs.oop.pokemon;

public class Pokemon 
{
	private String name;
	private PokemonType type;
	private int cp;
	
	public int get_Cp() {
		return cp;
	}
	public void set_Cp(int cp) {
		this.cp = cp;
	}
	public String get_Name() {
		return name;
	}
	public PokemonType get_Type() {
		return type;
	}
	
	public Pokemon(String name,PokemonType type,int cp)
	{
		this.name=name;
		this.type=type;
		this.cp=cp;
	}
	

}