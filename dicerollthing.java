public static int Dieroll(int one, int two){
int y;
int z;
y = (int)(Math.random()*10);
z = (int)(Math.random()*10);
return y,z;
//in main program, if 00, fumble. if 99, supah critical
}