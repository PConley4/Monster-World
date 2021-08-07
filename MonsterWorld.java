//Paul Conley
package monsterworldpack;
import java.util.Random;
import java.util.Scanner;
/*
All of the actions in this game, all of the calculations, will have to be done when the user calls for them.
Since this is a Tabletop RPG, what happens on the table(like what the user is doing) determines what actions are required from the computer/program.
*/
public class MonsterWorld{
//try to store stuff with data structures.
	
	static int movement; //the variable storing the roll
	
	static int tens;
	static int ones;
	//the two variables storing the tens and ones place for the 9 sided dice
	static boolean rollchoice;
	static boolean combatchoice;
	static boolean continuing = true;
	//These booleans store variables for confirming a roll and combat move?
	
	//these are static because they must be set to a default after they are used
	public static void main(String[] args){
while(continuing = true) {
		String moving = " ";
		String attacking = " ";
		String temp = " ";

		int movement = 0;
		int tens = 0;
		int ones= 0;
		
		boolean rollchoice = false;
		boolean combatchoice = false;
		//setting variables to defaults
		Scanner input = new Scanner(System.in);  
		
	    System.out.println("Roll the die for movement. Type 'kay' when ready.");
	    //the while loop continues until rollchoice is true, which happens when Kay is input
	    while (rollchoice != true) {
		    moving = input.nextLine();  // Read user input 
		    	if (moving.equals("kay") || moving.equals("Kay")) {
		    		//this accounts for capital or lowercase
		    		movement = Dieroll() + 1;
		    		//dieroll is a method.
		    		rollchoice = true;
		    		System.out.println("You can move " + movement + " spaces.");
		    	}

	    } 
	   
	    System.out.println("You choose to basic attack, yes? Time to attack! Type 'Die monster!' when ready!");

	    while (combatchoice != true) {
	    attacking = input.nextLine();	    	    
	    	if(attacking.equals("Die monster!")) {
	    		tens = Dieroll();
	    		ones = Dieroll();
	    		combatchoice = true;
	    	}

	 }  
	    //why are the 0s not printing? I found a work around but there must be a reason.
		if(tens == 0 && ones == 0){
			System.out.println("00! You rolled the super critical! Super move activate!");
			
			//grab the super move name from the type of player.

		}
		
		else if(tens == 0 && ones >= 1){
			System.out.println("0" + ones + "! You rolled a critical! Major damage!");
		}

		else if(tens == 9 && ones != 9){
			System.out.println(tens + ones +". How weak...");
		}
		
		else {
			System.out.println("You rolled a " + tens + ones + ".");
		}
		
	System.out.println("Type end to end the program.");
	temp = input.nextLine();
	if(temp == "end") {
		continuing = false;
	}
		}
	}
public static int Dieroll(){
	Random rand = new Random();
	int roll = rand.nextInt(10);
	return roll;
}

}