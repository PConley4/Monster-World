//Paul Conley
package monsterworldpack;
import java.util.Random;
import java.util.Scanner;
public class Player{
/*
The person will pick the Job of unit they want. Up to four players. Here, there will be get methods for stats and such which will be based off of Job which has different moves and stats.
each player (which will extend this) will have experience. This will be permanent. When it reaches 100, they level up. When they do, based off the Job,
stats will have a random chance of getting higher stats. they can also learn techniques. Each Job has a different super move.
*/
	private String Job = " ";
	// the Job of player. This doesn't have to be a string but it makes things easier to read for me.
	private int Level = 0;
	//current level of player. there is no get method for this. the level is stored and made here
	//the class of the player/enemy determines if they calculate with def or res when attacking
	private double EXP = 0;
	//current exp of player
	/*
	private int CurrentHP;
	//there is no get method for this. this is made here. However, this variable has to be lower than MaxHP. 
	//in the getMaxHP method, set this equal to the max hp and make it decrease with inputs
	private int Atk;
	private int Def;
	//used to determine damage
	private int Spd;
	determines who goes first in combat
	*/
	
	//what is this for?
	public Player(String inJob, int inLevel, double inEXP){
		this.Job= inJob;
		this.Level = inLevel;
		this.EXP = inEXP;
	}
	
	public String getJob(){
		return this.Job;
	}
	//VERY IMPORTANT! This has to be used FIRST in order to determine what the stat get methods will look in.
	
	public int getLevel() {
		return this.Level;
	}
	// the level should only be entered when the EXP is >=99
	//there should be a method calculating/storing exp and leveing players up. The exp that the enemy gives will be added to the EXP.
	
	public double getEXP(){
		return this.EXP;
	}
	
	//if (EXPP1 = 100){
		//LevelP1++;
		//return LevelP1;
	//}

	//The set methods will allow the change to instances to the parent classes in the main class.
	public void setJob(String Job1){
		this.Job = Job1;
	}
	
	public void setLevel(int Level1) {
		this.Level = Level1;
	}

	public void setEXP(double EXP1){
		this.EXP = EXP1;
	}
}
