//Paul Conley
package monsterworldpack;
import java.util.Random;
/*
all of the actions in this game, all of the calculations, will have to be done when the user calls for them
make sure to make specific terms to call methods and make actions
have multiple inputs for the user(me) to user
When making a Player, the type and such will be entered. Player(thing)
*/

public class MonsterWorld{
//try to store stuff with data structures.
	public static void main(String[] args){
		int die1 = 0;
		int die2 = 0;
		int rollfirst = 0;
		int rollsecond = 0;
		Random rand = new Random();

		rollfirst = Dieroll (die1);
		rollsecond = Dieroll (die2);
		
		if(rollfirst == 0 && rollsecond == 0){
			System.out.println("You rolled the super critical! Super move activate!");
			//grab the super move name from the type of player.
		}

		else if(rollfirst == 9 && rollsecond == 9){
			System.out.println("You rolled a fumble... Skip a turn.");
		}
		
		//code must be made to make the damage. When you roll damage, it goes through a formula that takes into account stats and rng
		
		else if (rollfirst <= 3){
			System.out.println("You rolled a " + rollfirst + rollsecond + "...");	
		}

		else{
			System.out.println("You rolled a " + rollfirst + rollsecond + "!");
		}

	}

public static int Dieroll(int roll){
	Random rand = new Random();
	roll = rand.nextInt(10);
	return roll;
}

}