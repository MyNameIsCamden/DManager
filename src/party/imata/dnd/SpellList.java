package party.imata.dnd;

/*
  + SpellList
  - PlayerClass playerClass
  - int[] spellsPerDay
  - int[] spellsKnown
  
  + castSpell
  + longRest
  + getters/setters
  + toString
*/

public class SpellList
{
	private PlayerClass playerClass;
	private int[] spellsPerDay;
	private int[] spellsKnown;
	
	public void castSpell()
	{
	}
	
	public void longRest()
	{
	}

	public PlayerClass getPlayerClass()
	{
		return playerClass;
	}

	public void setPlayerClass(PlayerClass playerClass)
	{
		this.playerClass = playerClass;
	}

	public int[] getSpellsPerDay()
	{
		return spellsPerDay;
	}

	public void setSpellsPerDay(int[] spellsPerDay)
	{
		this.spellsPerDay = spellsPerDay;
	}

	public int[] getSpellsKnown()
	{
		return spellsKnown;
	}

	public void setSpellsKnown(int[] spellsKnown)
	{
		this.spellsKnown = spellsKnown;
	}
	
}
