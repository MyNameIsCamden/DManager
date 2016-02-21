package party.imata.dnd;

public class Weapon extends Item
{
	private String damage;
	private String damageType;
	private String size;
	private int critRange;
	private int critValue;
	private String weaponType;
	private int range;
	
	public Weapon()
	{
		super();
	}
	
	public Weapon(String name, String description, double weight, Money cost, String damage,
			String damageType, String size, int critRange, int critValue, String weaponType, int range)
	{
		super(name, description, weight, cost);
		this.damage = damage;
		this.damageType = damageType;
		this.size = size;
		this.critRange = critRange;
		this.critValue = critValue;
		this.weaponType = weaponType;
		this.range = range;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	public String getDamageType() {
		return damageType;
	}

	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCritRange() {
		return critRange;
	}

	public void setCritRange(int critRange) {
		this.critRange = critRange;
	}

	public int getCritValue() {
		return critValue;
	}

	public void setCritValue(int critValue) {
		this.critValue = critValue;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public String toString()
	{
		return (super.toString() + "\n" + damage + " damage\n" + size + " size\n" +
				critRange + " crits for " + critValue + "x damage\n" + "Range of " +
				range + " feet");
	}
}
