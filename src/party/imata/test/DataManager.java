package party.imata.test;

import party.imata.dnd.Item;
import party.imata.dnd.Skill;
import party.imata.dnd.Spell;
import party.imata.player.PlayerClass;

/*
 * So what if we had a data manager, a class
 * with which we could load all of the data we needed for a game
 * and then pass it to all of the other classes that do things (eg.
 * inventory manager, character manager, campaign manager, etc.)
 * and maybe this class could also load more data into it if need be.
 * Like a search function.
 */

public class DataManager
{
	private PlayerClass[] pc;
	private Item[] i;
	private Monster[] m;
	private Spell[] sp;
	private Skill[] sk;
	
	public DataManager(PlayerClass[] pc, Item[] i, Monster[] m, Spell[] sp, Skill[] sk)
	{
		this.pc = pc;
		this.i = i;
		this.m = m;
		this.sp = sp;
		this.sk = sk;
	}
	
}
