package party.imata.player.races;

public class Dwarf
{
	private char size = 'M';
	//private static Map<String, Integer> abilityMod = new HashMap<String, Integer>();
	private int[] abilityMod = {0,0,2,0,0,-2}; //STR,DEX,CON,INT,WIS,CHA
	private int landSpeed = 20; // feet
	private String[] autoLang = {"Common","Dwarven"};
	private String[] favoredClass = {"Fighter",};

}
