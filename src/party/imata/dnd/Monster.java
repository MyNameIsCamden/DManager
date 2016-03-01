package party.imata.dnd;

public class Monster
{
	private String name;
	private String family;
	private int health;
	private int ac;
	private int initiative;
	
	public Monster(String name, String family, int health, int ac, int initiative)
	{
		super();
		this.name = name;
		this.family = family;
		this.health = health;
		this.ac = ac;
		this.initiative = initiative;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getFamily()
	{
		return family;
	}
	public void setFamily(String family)
	{
		this.family = family;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health)
	{
		this.health = health;
	}
	public int getAc()
	{
		return ac;
	}
	public void setAc(int ac)
	{
		this.ac = ac;
	}
	public int getInitiative()
	{
		return initiative;
	}
	public void setInitiative(int initiative)
	{
		this.initiative = initiative;
	}

}
