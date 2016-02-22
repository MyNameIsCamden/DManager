package party.imata.dnd;

/*
 *- String name

  + getters/setters
  + toString
 */

public class Character
{
	private String name;
	
	public Character()
	{
		
	}
	
	public Character(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName()
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "This character's name is " + name;
	}
}
