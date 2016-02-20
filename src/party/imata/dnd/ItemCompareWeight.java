package party.imata.dnd;

import java.util.Comparator;

public class ItemCompareWeight implements Comparator<Item>
{

	@Override
	public int compare(Item o1, Item o2)
	{
		double weight1 = o1.getWeight();
		double weight2 = o2.getWeight();
		
		if(weight1 > weight2)
			return 1;
		else if(weight1 < weight2)
			return -1;
		else
			return(o1.getName().compareTo(o2.getName()));
	}

}
