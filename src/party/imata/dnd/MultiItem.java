package party.imata.dnd;

public class MultiItem extends Item

{
	private int count;
	private int itemPerPound;
	
	public MultiItem()
	{
		super();
	}
	
	public MultiItem(String name, String description, double weight, Money cost, int count, int itemPerPound)
	{
		super(name, description, weight, cost);
		this.count = count;
		this.itemPerPound = itemPerPound;
	}
	
	public void increment()
	{
		count++;
	}
	
	public void increment(int amount)
	{
		count += amount;
	}
	
	public void decrement()
	{
		if (count < 1)
			System.err.println("You don't have enough " + super.getName() + " to do that.");
		else
		{
			count--;
			weightFix();
		}
	}
	
	public void decrement(int amount)
	{

		if (count < amount)
			System.err.println("You don't have enough " + super.getName() + " to do that.");
		else
		{
			count -= amount;
			weightFix();
		}
	}
	
	private void weightFix()
	{
		super.setWeight(count/itemPerPound);
	}
	
	public String toString()
	{
		return (super.toString() + "\n" + count);
	}
}
