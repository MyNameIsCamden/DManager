package party.imata.dnd;

/*
 *- String name

  + getters/setters
  + toString
 */

public class Character
{
	private String name;
	private String race;
	private String eyeColor;
	private String hairColor;
	private String alignment;
	private double height;
	private int weight;
	private int age;
	private char size;
	private int healthPoints;
	
	
	public Character()
	{
		
	}
	
	public Character(String name)
	{
		this.name = name;
	}
	
	public Character(String name, String race, String eyeColor, String hairColor, String alignment, double height,
			int weight, int age, char size, int healthPoints)
	{
		super();
		this.name = name;
		this.race = race;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.alignment = alignment;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.size = size;
		this.healthPoints = healthPoints;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getRace()
	{
		return race;
	}

	public void setRace(String race)
	{
		this.race = race;
	}

	public String getEyeColor()
	{
		return eyeColor;
	}

	public void setEyeColor(String eyeColor)
	{
		this.eyeColor = eyeColor;
	}

	public String getHairColor()
	{
		return hairColor;
	}

	public void setHairColor(String hairColor)
	{
		this.hairColor = hairColor;
	}

	public String getAlignment()
	{
		return alignment;
	}

	public void setAlignment(String alignment)
	{
		this.alignment = alignment;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public char getSize()
	{
		return size;
	}

	public void setSize(char size)
	{
		this.size = size;
	}

	public int getHealthPoints()
	{
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	
	public void addHealthPoints(int healthPoints)
	{
		this.healthPoints =+ healthPoints;
	}
	
	public void removeHealthPoints(int healthPoints)
	{
		this.healthPoints =- healthPoints;
	}

	public String toString()
	{
		return "This character's name is " + name;
	}
}
