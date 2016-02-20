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
	
	public void removeMoney(int plat, int gold, int silver, int copper) throws NotEnoughMoneyException
	{
		int originalCash = (this.plat*1000 + this.gold*100 + this.silver*10 + this.copper);
		int removedCash = (plat*1000 + gold*100 + silver*10 + copper);
		
		Money mon = new Money(plat, gold, silver, copper);
		
		if(originalCash > removedCash)
		{
			this.plat -= mon.getPlat();
			this.gold -= mon.getGold();
			this.silver -= mon.getSilver();
			this.copper -= mon.getCopper();
		}
		
		else
		{
			throw new NotEnoughMoneyException();
		}
	}
	
	private void convert()
	{
		silver += copper/10;
		copper %= 10;
		
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
		int originalCash = (this.plat*1000 + this.gold*100 + this.silver*10 + this.copper);
		int removedCash = (mon.getPlat()*1000 + mon.getGold()*100 + mon.getSilver()*10 + mon.getCopper());
		
		if(originalCash > removedCash)
			return 1;
		else if (originalCash == removedCash)
			return 0;
		else
			return -1;
	}
}