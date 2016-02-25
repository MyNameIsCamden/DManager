package party.imata.dnd;
/*
+ Spell
- String name
- String description
- String components
- int levelNeeded
*/

public class Spell
{
	private String name;
	private String description;
	private String components;
	private char classToCast;
	private int levelToCast;
	private int castTime; //in standard actions
	//private Duration duration; //how do you do duration? minuets hours and rounds?
	private char baseRange; //EX: T: Touch, M: Medium, C: Close
	private String SavingThrow;
	private boolean spellResistance;
	
	public double getRange(char base, int ftLevel)
	{
		int retRange = 0;
		switch (base) 
		{
		case 'T':
			break;
		case 'C':
			retRange = 25 + (ftLevel / 2) * 5;
			break;
		case 'M':
			retRange = 100 + (ftLevel * 10);
			break;
		case 'L':
			retRange = 400 + (ftLevel * 40);
			break;
		}
		return retRange;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getComponents()
	{
		return components;
	}

	public void setComponents(String components)
	{
		this.components = components;
	}

	public char getClassToCast()
	{
		return classToCast;
	}

	public void setClassToCast(char classToCast)
	{
		this.classToCast = classToCast;
	}

	public int getLevelToCast()
	{
		return levelToCast;
	}

	public void setLevelToCast(int levelToCast)
	{
		this.levelToCast = levelToCast;
	}

	public int getCastTime()
	{
		return castTime;
	}

	public void setCastTime(int castTime)
	{
		this.castTime = castTime;
	}

	public char getBaseRange()
	{
		return baseRange;
	}

	public void setBaseRange(char baseRange)
	{
		this.baseRange = baseRange;
	}

	public String getSavingThrow()
	{
		return SavingThrow;
	}

	public void setSavingThrow(String savingThrow)
	{
		SavingThrow = savingThrow;
	}

	public boolean isSpellResistance()
	{
		return spellResistance;
	}

	public void setSpellResistance(boolean spellResistance)
	{
		this.spellResistance = spellResistance;
	}
	
}
