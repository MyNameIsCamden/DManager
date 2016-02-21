package party.imata.dnd;

import java.util.ArrayList;
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
		//When we write the character class include it in this constructor
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
		weight -= item.getWeight();
	}
	
	public void useItem(Item item)
	{
		
	}
	
	public Item itemAt(int i)
	{
		return inventory.get(i);
	}

	public Money getWallet() {
		return wallet;
	}

	public void setWallet(Money wallet) {
		this.wallet = wallet;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
