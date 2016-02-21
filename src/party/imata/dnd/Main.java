package party.imata.dnd;

public class Main {

	public static void main(String[] args)
	{
		Weapon camdenSword = new Weapon("Camden's Sword", "It's Camden's sword.", 5.5, 
				new Money (1,0,0,0), "3d6", "Slashing", "Medium", 19, 3, "Martial", 10);
		Item mead = new Item("Mead", "Yo it's shit", .5, new Money(0,0,0,5));
		MultiItem arrows = new MultiItem("Arrows", "These are sharp and pointy and used for a bow",
				2, new Money(0,2,0,0), 20, 10);
		Armor newArmor = new Armor("Mache Armor", "Made of paper", 25,
				new Money(3,2,0,0), 4, 3, -2, 50, 20, "Very Light");
		
		
		InventoryManager inv = new InventoryManager();
		inv.addItem(camdenSword);
		inv.addItem(mead);
		inv.addItem(arrows);
		inv.addItem(newArmor);
		
		System.out.println(inv.itemAt(0));
		System.out.println();
		System.out.println(inv.itemAt(1));
		System.out.println();
		System.out.println(inv.itemAt(2));
		System.out.println();
		System.out.println(inv.itemAt(3));
	}

}