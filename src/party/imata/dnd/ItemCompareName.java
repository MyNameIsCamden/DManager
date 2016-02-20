package party.imata.dnd;

import java.util.Comparator;

public class ItemCompareName implements Comparator<Item>
{

	@Override
	public int compare(Item o1, Item o2)
	{
		String name1 = o1.getName();
		String name2 = o2.getName();
	
		if(name1.equals(name2))
		{
			ItemCompareWeight icw = new ItemCompareWeight();
			return icw.compare(o1, o2);
		}
		
		else
			return name1.compareTo(name2);
	}

}