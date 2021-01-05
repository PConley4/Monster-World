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
	
	static int movement = 0; //the variable storing the roll
	
	static int tens;
	static int ones;
	//the two variables storing the tens and ones place for the 9 sided dice
	static boolean rollchoice;
	static boolean combatchoice; 
	//these booleans translate the user input in to a boolean, which can cause a loop if entered wrong
	//Later this program should be running indefinitely so one may have to be used then.
	
	//these are static because they must be set to a default after they are used
	public static void main(String[] args){
		
		String moving = " ";
		String attacking = " ";
		//these are taking the inputs
		//can only one be used? perhaps but this is easier to look at.
		tens = 0;
		ones= 0;
		rollchoice=false;
		combatchoice = false;
		Scanner input = new Scanner(System.in);  
		
	    System.out.println("Roll the die for movement. Type 'kay' when ready.");
	    //the while loop continues until rollchoice is true, which happens when Kay is input
	    while (rollchoice != true) {
		    moving = input.nextLine();  // Read user input
		    
	    if (moving.equals("kay") || moving.equals("Kay")) {
	    	//this accounts for capital or lowercase
			movement = Dieroll() + 1;
			//dieroll is a method near the bottom.
			rollchoice = true;
			System.out.println("You can move " + movement + " spaces.");
	    }
	    /*
	    else {
	    	rollchoice = false;
	    }
	    */
	} 
	   
	    System.out.println("You choose to basic attack, yes? Time to attack! Type 'Die monster!' when ready!");

	    while (combatchoice != true) {
	    attacking = input.nextLine();  // Read user input
	    	    
	    if(attacking.equals("Die monster!")) {
		tens = Dieroll();
		ones = Dieroll();
	    combatchoice = true;
	    }
	    /*else {
	    	combatchoice = false;
	    }
	    */
	 }  
	    //why is the first 0 not printing? I found a work around but there must be a reason.
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
		/*Atk + (dicedamage) - Def
switch tens:

case 0:
 x2 atk
 
case 1:
x 1.7

case 2:
x 1.5

case 3:
x 1.3

case 4:
 x 1.1
 
case 7:
X 0.7

case 8:
x 0.5

case 9:
X 0.3

if tens and ones = 0; super crit
if tens and ones = 9; fumble
//since these go after the switch statement,they will override it
 */
		}

public static int Dieroll(){
	Random rand = new Random();
	int roll = rand.nextInt(10);
	return roll;
}

}