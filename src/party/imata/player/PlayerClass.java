package party.imata.player;

// Is this void now with class defs?

public class PlayerClass
{
	private String name;
	private String alignment;
	private int hitDie;
	private String[] classSkills;
	private String[] classFeatures;
	private int baseSkillPoints;
	private int addSkillPoints;
	
	public PlayerClass(String name, String alignment, int hitDie)
	{
		this.name = name;
		this.alignment = alignment;
		this.hitDie = hitDie;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAlignment()
	{
		return alignment;
	}
	public void setAlignment(String alignment)
	{
		this.alignment = alignment;
	}
	public int getHitDie()
	{
		return hitDie;
	}
	public void setHitDie(int hitDie)
	{
		this.hitDie = hitDie;
	}
	public String[] getClassSkills()
	{
		return classSkills;
	}
	public void setClassSkills(String[] classSkills)
	{
		this.classSkills = classSkills;
	}
	public String[] getClassFeatures()
	{
		return classFeatures;
	}
	public void setClassFeatures(String[] classFeatures)
	{
		this.classFeatures = classFeatures;
	}
	public int getBaseSkillPoints()
	{
		return baseSkillPoints;
	}
	public void setBaseSkillPoints(int baseSkillPoints)
	{
		this.baseSkillPoints = baseSkillPoints;
	}
	public int getAddSkillPoints()
	{
		return addSkillPoints;
	}
	public void setAddSkillPoints(int addSkillPoints)
	{
		this.addSkillPoints = addSkillPoints;
	}
	
	public String toString()
	{
		return ("Class Name: " + getName() + "\n" + "Class Alignment: " + getAlignment() + "\n" + "Hit Die = d" + getHitDie());
	}
}
