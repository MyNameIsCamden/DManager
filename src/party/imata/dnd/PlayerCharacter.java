package party.imata.dnd;

import java.util.ArrayList;

/*
  - int[] abilityScores
  - int[] abilityModifiers
  - InventoryManager inventory
  - Class class
  - int level
  - int exp
  - int neededExp
  - int baseSpeed
  - int intitiative
  - int currentHp
  - int maxHp
  - int ac
  - int touchAc
  - int flatfootedAc
  - Skills[] skills
  - Feat[] feats
  
  + getters/setters
  + toString
 */

public class PlayerCharacter extends Character
{
	private int[] abilityScores;
	private int[] abilityModifiers;
	private InventoryManager inventory;
	private PlayerClass playerClass;
	private int level;
	private int exp;
	private int neededExp;
	private int baseSpeed;
	private int initiative;
	private int currentHp;
	private int maxHp;
	private int ac;
	private int touchAc;
	private int flatfootedAc;
	private ArrayList<Skill> skills;
	private ArrayList<Feat> feats;
	
	public PlayerCharacter()
	{
		
	}
	
	public PlayerCharacter(int[] abilityScores, PlayerClass playerClass, int level, int maxHp)
	{
		this.abilityScores = abilityScores;
		this.playerClass = playerClass;
		this.level = level;
		this.maxHp = maxHp;
	}
	
	public PlayerCharacter(int[] abilityScores, PlayerClass playerClass, int level, int maxHp, InventoryManager inventory)
	{
		this.abilityScores = abilityScores;
		this.playerClass = playerClass;
		this.level = level;
		this.maxHp = maxHp;
		this.inventory = inventory;
	}
	
	private void buildCharacter()
	{
		for(int i = 0; i < abilityScores.length; i++)
		{
			abilityModifiers[i] = (abilityScores[i]/2) - 5;
		}
	}
}
