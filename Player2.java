package monsterworldpack;

import java.util.Scanner;

public class Player2 {
	//comments are the same as Player1
	public static void main(String[] args) {
		String P2Job = " ";
		int P2Level= 0;
		double P2EXP = 0.0;
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is your job? Make EXTRA sure the input is correctly as this cannot be changed later.");
		System.out.println("The Jobs are: Warrior, Black Mage, White Mage, Tamer, Sniper.");
		P2Job =  input.nextLine();
		
		System.out.println("What is your level?");
		P2Level =  input.nextInt();
		
		System.out.println("What is your current EXP?");
		P2EXP =  input.nextDouble();
		
		Player Second = new Player (P2Job,P2Level,P2EXP);
		//this is a new instance of the player class.
		
		System.out.println ("Job:" + Second.getJob() + " Level:" + Second.getLevel() + " CurrentEXP:" + Second.getEXP());

	}

}
