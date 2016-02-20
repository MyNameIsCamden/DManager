package party.imata.dnd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/*
 * + InventoryManager
  - double totalWeight
  - ArrayList<Item> inventory
  
  + getters/setters
  + addItem
  + removeItem
  + useItem
  + toString
 */

public class InventoryManager
{
	private Money wallet = new Money();
	private ArrayList<Item> inventory = new ArrayList<Item>();
	private double weight = 0;
	
	public InventoryManager()
	{
		
	}
	
	public void sortByName()
	{
		Collections.sort(inventory, new ItemCompareName());
	}
	
	public void sortByWeight()
	{
		Collections.sort(inventory, new ItemCompareWeight());
	}
	
	public void addItem(Item item)
	{
		inventory.add(item);
		weight += item.getWeight();
	}
	
	public void removeItem(Item item)
	{
		inventory.remove(item);
	}
	
	public void useItem(Item item)
	{
		
	}
}
