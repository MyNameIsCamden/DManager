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
	private double weight;
	private Money cost;
	
	public Item()
	{
		
	}
	
	public Item(String name, String description, double weight, Money cost)
	{
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Money getCost() {
		return cost;
	}

	public void setCost(Money cost) {
		this.cost = cost;
	}
	
	public String toString()
	{
		return (name + "\n" + description + "\n" + weight + "lb\nWorth " + cost);
	}
	
	public boolean equals(Item arg)
	{
		if(arg.getName().equals(name) && arg.getCost() == cost && arg.getDescription().equals(description) 
				&& arg.getWeight() == weight)
			return true;
		else
			return false;
	}
}