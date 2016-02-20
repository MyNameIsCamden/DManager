package party.imata.dnd;

public class Main {

	public static void main(String[] args)
	{
		Money muns = new Money(0,1,2,3);
		Money money = new Money(5, -3, 4, 0);
		Money testyBit = new Money(100, 35, 56, 100);
		
		muns.addMoney(0, 2, 3, 1);
		System.out.println(muns);
		
		try
		{
			muns.removeMoney(-3, 2, 1, 0);
			System.out.println(muns + " muns");
		}
		catch (NotEnoughMoneyException neme)
		{
			System.err.println(neme);
		}
		
		try
		{
			muns.removeMoney(0, 0, 0, 6);
			System.out.println("Your muns: " +muns);
		}
		catch (NotEnoughMoneyException neme)
		{
			System.err.println(neme);
		}
		
		try
		{
			testyBit.removeMoney(0, 0, 1, 6);
			System.out.println("After subtracting: " +testyBit);
			testyBit.convert();
			System.out.println("After converting: " + testyBit);
		}
		catch (NotEnoughMoneyException neme)
		{
			System.err.println(neme);
		}
		
		

	}

}