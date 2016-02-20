package party.imata.dnd;

public class Money
{
	private int plat;
	private int gold;
	private int silver;
	private int copper;
	
	public Money()
	{
		
	}
	
	public Money(int plat, int gold, int silver, int copper)
	{
		this.plat = plat;
		this.gold = gold;
		this.silver = silver;
		this.copper = copper;
		
		convert();
	}

	public void addMoney(int plat, int gold, int silver, int copper)
	{
		this.plat += plat;
		this.gold += gold;
		this.silver += silver;
		this.copper += copper;
		
		convert();
	}
	
	public void removeMoney(int plat, int gold, int silver, int copper)
	{
		int originalCash = (this.plat*1000 + this.gold*100 + this.silver*10 + this.copper);
		int removedCash = (plat*1000 + gold*100 + silver*10 + copper);
		
		if()
			this.plat -= plat;
			this.gold -= gold;
			this.silver -= silver;
			this.copper -= copper;
	}
	
	private void convert()
	{
		if(copper >=0)
		{
			silver += copper/10;
			copper %= 10;
		}
		else
		{
			
		}
		
		gold += silver/10;
		silver %= 10;
		
		plat += gold/10;
		gold %= 10;
	}
	
	public int getPlat() {
		return plat;
	}

	public void setPlat(int plat) {
		this.plat = plat;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getCopper() {
		return copper;
	}

	public void setCopper(int copper) {
		this.copper = copper;
	}
	
	public String toString()
	{
		return (plat + "pp " + gold + "gp " + silver + "sp " + copper +"cp");
	}
	
	public int compareTo(Money mon)
	{
		if()
	}
	
	public boolean isMore(int plat, int gold, int silver, int copper)
	{
		
	}
}