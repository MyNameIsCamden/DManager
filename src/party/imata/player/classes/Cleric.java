package party.imata.player.classes;

import party.imata.player.PlayerClass;

public class Cleric extends PlayerClass
{
	private int intMod; //how do we get this here from the character?
	private int baseSkillPoints = (2 + intMod) * 4;
	private int levelSkill = (2 + intMod);
	
	public Cleric()
	{
		super();
	}
}
