package party.imata.dnd;

import java.util.ArrayList;

/*
  - int[] abilityScores
  - int[] abilityModifiers
  - InventoryManager inventory
  - Class class
  - Race race
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
	private String race;
	private int featNumber;
	private int bonusFeats;
	private int level;
	private int exp;
	private int neededExp;
	private int baseSpeed;
	private int initiative;
	private int currentHp;
	private int hitDie;
	private int maxHp;
	private int ac;
	private int touchAc;
	private int flatfootedAc;
	private ArrayList<Skill> skills;
	private ArrayList<Feat> feats;
	
	public PlayerCharacter()
	{
		super();
	}
	
	public PlayerCharacter(String name, int[] abilityScores, PlayerClass playerClass, int level, int maxHp)
	{
		super(name);
		this.abilityScores = abilityScores;
		this.playerClass = playerClass;
		this.level = level;
		this.maxHp = maxHp;
		
		buildCharacter();
	}
	
	public PlayerCharacter(String name, int[] abilityScores, PlayerClass playerClass, int level, int maxHp, InventoryManager inventory)
	{
		super(name);
		this.abilityScores = abilityScores;
		this.playerClass = playerClass;
		this.level = level;
		this.maxHp = maxHp;
		this.inventory = inventory;
		buildCharacter();
	}
	
	private void buildCharacter()
	{
		for(int i = 0; i < abilityScores.length; i++)
		{
			abilityModifiers[i] = (abilityScores[i]/2) - 5;
		}
		
		if(level == 1)
		{
			neededExp = 1000;
			featNumber = startingFeats();
			hitDie = 1;
		}
		else
		{
			neededExp = expForLevelUp(level);
			hitDie = level;
		}
		
	}
	
	public void addExp(int exp)
	{
		if(exp >= 0)
		{
			this.exp += exp;
			if (this.exp > neededExp)
			{
				levelUp();
				if (exp > neededExp)
				{
					exp = neededExp - 1;
				}
			}
		}
		else
		{
			System.out.println("You've entered a negative amount of exp, try again.");
		}
	}
	
	private int startingFeats()
	{
		int numberOfFeats = 1;
		
		if(race.equals("Human"))
		{
			numberOfFeats++;
		}
		
		if(playerClass.equals("Fighter"))
		{
			bonusFeats++;
		}
				
		return numberOfFeats;
	}
	
	private void levelUp()
	{
		level++;
		neededExp = expForLevelUp(level);
		
		if (level % 3 == 0 && level % 4 == 0)
		{
			System.out.println("You've gained a new feat and can now increase one of your"
					+ "ability scores by one.");
		}
		
		else if (level % 3 == 0)
		{
			System.out.println("You've gained a new feat. Please select the feat you would like.");
		}
		
		else if (level % 4 == 0)
		{
			System.out.println("You can now increase one of your ability scores by one. Please select "
					+ "which one.");
		}
		
	}
	
	private int expForLevelUp(int level)
	{
		return level * (level - 1) * 500;
	}
	
	public void addFeat(Feat feat)
	{
		if(featNumber + bonusFeats > feats.size())
		{
			int regularFeats = 0;
			int otherFeats = 0;
			for (int i = 0; i < feats.size(); i++)
			{
				if (!feats.get(i).getBonusFighter() || !feats.get(i).getBonusMonk())
				{
					regularFeats++;
				}
				else
				{
					otherFeats++;
				}
			}
			
			if(otherFeats == bonusFeats)
			{
				if (!feat.meetsPrereq())
				{
					System.out.println("That feat will not work, try again.");
				}
				else
				{
					feats.add(feat);
				}
			}
			
		}
		
		else
		{
			System.out.println("You can not add any more feats.");
		}
	}
	
}
