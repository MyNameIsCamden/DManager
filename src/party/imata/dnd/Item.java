package party.imata.dnd;

/*+ Item
- String name
- String description
- int weight
- Money cost

+ getters/setters
+ toString
*/

public class Item
{
	private String name;
	private String description;
	private int weight;
	private Money cost;
	
	public Item()
	{
		
	}
	
	public Item(String name, String description, int weight, Money cost)
	{
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.cost = cost;
	}
}