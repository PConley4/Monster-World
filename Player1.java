package monsterworldpack;
import java.util.Random;
import java.util.Scanner;
public class Player1{
//this is a class based off the Player main class.
	//remember, the Game Master (you) will be making the inputs so there will be no mistakes.
	
	//this class still needs stats
	
	public static void main (String args[]){
		String P1Job = " ";
		int P1Level= 0;
		double P1EXP = 0.0;
		//stats. These will change when the level in
		int HP = 1;
		int Atk = 1;
		int Def = 1;
		int Spd = 1;
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is your job? Make EXTRA sure the input is correctly as this cannot be changed later.");
		//can me make this only assign once?
		System.out.println("The Jobs are: Warrior, Black Mage, White Mage, Tamer, Sniper.");
		P1Job =  input.nextLine();
		//job of the player. For simplicity's sake, this is permanent.
		
		System.out.println("What is your level?");
		P1Level =  input.nextInt();
		//this will be the base level for the player and will change throughout the game. Thus, this will be updated through other methods and classes.
		System.out.println("What is your current EXP?");
		P1EXP =  input.nextDouble();
		//again, this changes throughout the game. Should go from 0.0 to 99.9.
		Player First = new Player (P1Job,P1Level,P1EXP);
		
		System.out.println ("Job:" + First.getJob() + " Level:" + First.getLevel() + " CurrentEXP:" + First.getEXP());
		//What you have seen is that you extend from a class to use it's methods. However here, both Player and Player 1 are in the same package. Meaning you use any publuc method
		//from anywhere.
	}
	
	/*public Statup() {
	}
	*/
	
	
}