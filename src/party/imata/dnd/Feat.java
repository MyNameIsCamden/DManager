package party.imata.dnd;

/*
 * - String name
  - String description
  - Boolean bonusFighter
  - Boolean bonusMonk
  
  + meetsPrereq
  + getters/setters
  + toString

 */

public class Feat
{
	private Boolean bonusFighter;
	private Boolean bonusMonk;
	
	public Feat()
	{
		
	}
	
	public Boolean getBonusFighter()
	{
		return bonusFighter;
	}
	
	public Boolean getBonusMonk()
	{
		return bonusMonk;
	}
	
	public Boolean meetsPrereq()
	{
		return true;
	}
	
	
}
