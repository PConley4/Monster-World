package monsterworldpack;

public class warrior{
public int getHPplus(String playerjob){
	//this get method rolls a number and if the number is equal to or lower to 7 (60%), a point is gained. A roll is done again for the second point
	//at half the chance, and again at a quarter of a chance for a third point.
	int upHP = 0;
	//this int is what stores the bonus points added to the stats.
if (playerjob.equals("warrior")){
	//this if statement should be unnecessary as this class will be called if the player is of the warrior class
	int roll = MonsterWorld.Dieroll();
		if(roll <= 8) {
			upHP+=1;
		}
		if(upHP == 1) {
			if(roll <= 4) {
				upHP+=1;
			}
		}
		if(upHP == 2) {
			if(roll <= 2) {
				upHP+=1;
			}
		}
	}
//else(){error handling) does not need to be here since if the class is not warrior, a different class is accessed anyway
return upHP;
}

public int getAtkplus(String playerjob){
	int upAtk = 0;
if (playerjob.equals("warrior")){
	int roll = MonsterWorld.Dieroll();
		if(roll <= 6){
			upAtk+=1;
		}
		if(upAtk == 1) {
			if(roll <= 3) {
				upAtk+=1;
			}
		}
		if(upAtk == 2) {
			if(roll <= 2) {
				upAtk+=1;
			}
		}
	}
//else(){error handling) does not need to be here since if the class is not warrior, a different class is accessed anyway
return upAtk;
}

public int getDefPlus(String playerjob){
	int upDef = 0;
if (playerjob.equals("warrior")){
	int roll = MonsterWorld.Dieroll();
		if(roll <= 4) {
			upDef+=1;
		}
		if(upDef == 1) {
			if(roll <= 2) {
				upDef+=1;
			}
		}
		if(upDef == 2) {
			if(roll <= 1) {
				upDef+=1;
			}
		}
	}
//else(){error handling) does not need to be here since if the class is not warrior, a different class is accessed anyway
return upDef;
}

public int getSpdplus(String playerjob){
	int upSpd = 0;
if (playerjob.equals("warrior")){
	int roll = MonsterWorld.Dieroll();
		if(roll <= 2) {
			upSpd+=1;
		}
		if(upSpd == 1) {
			if(roll <= 1) {
				upSpd+=1;
			}
		}
	}
//else(){error handling) does not need to be here since if the class is not warrior, a different class is accessed anyway
return upSpd;
}

}