package party.imata.dnd;

public class Main {

	public static void main(String[] args)
	{
		Item camdenSword = new Item("Sword", "DEEZ NUTS BITCHESSSS", 5, new Money(0,15,0,0));
		Item mead = new Item("Mead", "Yo it's shit", .5, new Money(0,0,0,5));
		MultiItem arrows = new MultiItem("Arrows", "These are sharp and pointy and used for a bow", 2, new Money(0,2,0,0), 20, 10);
		
		InventoryManager inv = new InventoryManager();
		inv.addItem(camdenSword);
		inv.addItem(mead);
		inv.addItem(arrows);
		
		System.out.println(inv.itemAt(0));
		System.out.println(inv.itemAt(1));
		System.out.println(inv.itemAt(2));
	}

}