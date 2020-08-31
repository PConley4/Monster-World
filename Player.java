//Paul Conley
public class Player{
/*
The person will pick the type of unit they want. Up to four players. Here, there will be get methods for stats and such which will be based off of type which has different moves and stats.
each player (which will extend this) will have experience. This will be permantant. When it reaches 100, they level up. When they do, based off the type,
stats will have a random chance of getting higher stats. they can also learn techniques. Each type has a different super move.
*/
	private string PType1;
	// the type of player 1. This doesn't have to be a string but it makes things easier to read for me.
	
	private int LevelP1 = 0;
	//current level of player 1. there is no get method for this. the level is stored and made here
	
	//private int CurrentHPP1;
	//there is no get method for this. this is made here. However, this variable has to be lower than MaxHP. 
	//in the getMaxHP method, set this equal to the max hp and make it decrease with inputs
	
	//the class of the player/enemy determines if they calculate with def or res when attacking
	private double EXPP1;
	//current exp of player 1
	
	
	public String getType(){
		return this.Type;
	}
	//VERY IMPORTANT! This has to be used FIRST in order to determine what the stat get methods will look in.
	
	//there should be a method calculating/storing exp and leveing players up. The exp that the enemy gives will be added to the EXPP1.
	public double getEXPP1(){
		
	}
	
	//if (EXPP1 = 100){
		//LevelP1++;
		//return LevelP1;
	//}

	//here, take stats and stuff from the class relating to the type and store them here.
	
}
