package party.imata.dnd;

/*
 * - String name
  - String keyAbility
  - Boolean[] classSkill
  - int ranks
  - int skillMod
  - int miscMod
  - int maxRank
  
  + getters/setters
  + incrementRank
  + toString
 */

public class Skill
{
	
	private String name;
	private String keyAbility;
	private boolean[] classSkill;
	private int ranks;
	private int skillMod;
	private int miscMod;
	private int maxRank;
	
	public Skill()
	{
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getKeyAbility()
	{
		return keyAbility;
	}

	public void setKeyAbility(String keyAbility)
	{
		this.keyAbility = keyAbility;
	}

	public boolean[] getClassSkill()
	{
		return classSkill;
	}

	public void setClassSkill(boolean[] classSkill)
	{
		this.classSkill = classSkill;
	}

	public int getRanks()
	{
		return ranks;
	}

	public void setRanks(int ranks)
	{
		this.ranks = ranks;
	}

	public int getSkillMod()
	{
		return skillMod;
	}

	public void setSkillMod(int skillMod)
	{
		this.skillMod = skillMod;
	}

	public int getMiscMod()
	{
		return miscMod;
	}

	public void setMiscMod(int miscMod)
	{
		this.miscMod = miscMod;
	}

	public int getMaxRank()
	{
		return maxRank;
	}

	public void setMaxRank(int maxRank)
	{
		this.maxRank = maxRank;
	}
	
}
