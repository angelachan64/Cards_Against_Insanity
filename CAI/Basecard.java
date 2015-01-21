public class Basecard {
    private int health,maxhealth;
    private int attack;
    private boolean ranged;
    private int range;
    private int level;
    private int experience;
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

    public int experience() {return experience;}
    public int growthrate() {return growthrate;}

    public void sethealth(int n) {health = n;}
    public void setmaxhealth(int n) {maxhealth = n;}
    public void setattack(int n) {attack = n;}
    public void setlevel(int n) {level = n;}
    public void setexperience(int n) {experience = n;}
    public void setgrowthrate(int n) {growthrate = n;}
    /* -------------------------------------------------------------------- */
    public void card1() {
	sethealth(30);
	setmaxhealth(30);
	setattack(5);
	setlevel(1);
	setexperience(0);
	setgrowthrate(1);
    }
    public void card2() {
	sethealth(33);
	setmaxhealth(33);
	setattack(7);
	setlevel(1);
	setexperience(0);
	setgrowthrate(1.2);
    }
    public void card3() {
	sethealth(35);
	setmaxhealth(35);
	setattack(8);
	setlevel(1);
	setexperience(0);
	setgrowthrate(1.3);
    }
    public void card4() {
	sethealth(37);
	setmaxhealth(37);
	setattack(10);
	setlevel(1);
	setexperience(0);
	setgrowthrate(1.5);
    }
    public void card5() {
	sethealth(
}
