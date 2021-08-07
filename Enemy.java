//Paul Conley
package monsterworldpack;

public class Enemy1{
/*enemy will have a type(Poki, chimera,etc), stats, level, weaknesses, a table of potential drops (linked list?), exp formula that scales with the player
a set of moves they can have (some moves have a higher chance to show up than others. Also only certain level enemys have have certain moves). 

The types should be in a linkedlist OR array and will be randomly picked.

Only "fill" these variables when there is an encounters. Find a way to wipe them after the battle

each type is a different class that extends Enemy. For example, Zombie Dragon extends enemy. Each type will have a certain set of moves, stats, etc.
When the type is referenced, stats and such are returned using methods like "getstats" and such.
these get methods will give stats and such based on the type put in
*/
private string Enemy1Type;
	// the type of player 1. This doesn't have to be a string but it makes things easier to read for me.
	//private int LevelE1;
	//current level of player 1. there is no get method for this. the level is stored and made here
	//private int CurrentHPE1;
	//there is no get method for this. this is made here. However, this variable has to be lower than MaxHP.
	private int MaxHPE1;
	//max hp of player 1.
	private int ATKE1;
	//the attack of player 1. 
	private int DEFE1;
	//def of player 1
	private int SPDE1;
	//spd of player 1
	//the class of the player/enemy determines if they calculate with def or res when attacking

	
	
	public String getE1Type(){
		return this.E1Type;
	}
	//VERY IMPORTANT! This has to be used FIRST in order to determine what the stat get methods will look in.
	
	
	//here, take stats and stuff from the class relating to the type and store them here.
	
}
