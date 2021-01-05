package monsterworldpack;
public class dicerollthing{

public static int Dieroll(){
int x = 0;
x = (int)(Math.random()*10);
return x;
//in main program, if 00, fumble. if 99, supah critical
}

}