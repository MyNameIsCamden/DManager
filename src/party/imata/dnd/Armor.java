package party.imata.dnd;
/*
+ Armor
- int acBonus
- int maxDexBonus
- int acPenalty
- int arcaneSpellFailure
- int speed
- String type
*/

public class Armor extends Item
{
	private int acBonus;
	private int maxDexBonus;
	private int acPenalty;
	private int arcaneSpellFailure;
	private int speed;
	private String type;
	
	public Armor()
	{
		super();
	}
	
	public Armor(String name, String description, double weight, Money cost, int acBonus,
			int maxDexBonus, int acPenalty, int arcaneSpellFailure, int speed, String type)
	{
		super(name, description, weight, cost);
		this.acBonus = acBonus;
		this.maxDexBonus = maxDexBonus;
		this.acPenalty = acPenalty;
		this.arcaneSpellFailure = arcaneSpellFailure;
		this.speed = speed;
		this.type = type;
	}

	public int getAcBonus() {
		return acBonus;
	}

	public void setAcBonus(int acBonus) {
		this.acBonus = acBonus;
	}

	public int getMaxDexBonus() {
		return maxDexBonus;
	}

	public void setMaxDexBonus(int maxDexBonus) {
		this.maxDexBonus = maxDexBonus;
	}

	public int getAcPenalty() {
		return acPenalty;
	}

	public void setAcPenalty(int acPenalty) {
		this.acPenalty = acPenalty;
	}

	public int getArcaneSpellFailure() {
		return arcaneSpellFailure;
	}

	public void setArcaneSpellFailure(int arcaneSpellFailure) {
		this.arcaneSpellFailure = arcaneSpellFailure;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAC Bonus: " + acBonus + "\nMax Dex Bonus: " + maxDexBonus
				+ "\nAC Penalty: " + acPenalty + "\nArcane Spell Failure Chance: "
				+ arcaneSpellFailure + "%\nSpeed of " + speed + " feet\nArmor type: " + type;
	}
	
	
}
