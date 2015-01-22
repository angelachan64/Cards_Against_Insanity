public class Basecard {
    private int health,maxhealth;
    private int attack;
    private boolean ranged;
    private int range;
    private int level;
    private int experience;
    private int expneeded;
    private double growthrate;

    public int gethealth() {
	return health;
    }

    public int getmaxhealth() {
	return maxhealth;
    }

    public int getattack() {
	return attack;
    }

    public boolean ranged() {
	return ranged;
    }

    public int range() {
	return range;
    }

    public int level() {
	return level;
    }

    public int expneeded() {
	return expneeded;
    }

    public int experience() {return experience;}
    public double growthrate() {return growthrate;}

    public void sethealth(int n) {health = n;}
    public void setmaxhealth(int n) {maxhealth = n;}
    public void setattack(int n) {attack = n;}
    public void setlevel(int n) {level = n;}
    public void setexperience(int n) {experience = n;}
    public void setgrowthrate(double n) {growthrate = n;}
    public void setexpneeded(int n) {expneeded = n;}
    /* -------------------------------------------------------------------- */
    public void card1() {
	sethealth(30);
	setmaxhealth(30);
	setattack(5);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.0);
    }
    //should always multiply everything by growth rate when you reach next level
    //at 100 exp. Then set growth rate to the current one + .5
    
    public void card2() {
	sethealth(33);
	setmaxhealth(33);
	setattack(7);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.2);
    }
    public void card3() {
	sethealth(35);
	setmaxhealth(35);
	setattack(8);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.3);
    }
    public void card4() {
	sethealth(37);
	setmaxhealth(37);
	setattack(10);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.5);
    }
    public void card5() {
	sethealth(40);
	setmaxhealth(40);
	setattack(12);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.6);
    }
    public void card6() {
	sethealth(43);
	setmaxhealth(43);
	setattack(14);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.7);
    }
    public void card7() {
	sethealth(45);
	setmaxhealth(45);
	setattack(16);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.8);
    }
    public void card8() {
	sethealth(47);
	setmaxhealth(47);
	setattack(18);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(2.0);
    }
    public void spcard1() {
	sethealth(50);
	setmaxhealth(50);
	setattack(24);
	setlevel(1);
	setexperience(0);
	setexpneeded(200);
	setgrowthrate(3.0);
    }
    public void spcard2() {
	sethealth(50);
	setmaxhealth(50);
	setattack(30);
	setlevel(1);
	setexperience(0);
	setexpneeded(300);
	setgrowthrate(3.0);
    }
}