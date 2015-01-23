public class Basecard {
    private int health,maxhealth;
    private int attack;
    private boolean ranged;
    private int range;
    private int level;
    private int experience;
    private int expneeded;
    private int rarity;
    private double growthrate;

    public int getrarity(){return this.rarity;}
    public int gethealth() {return this.health;}
    public int getmaxhealth() {return this.maxhealth;}
    public int getattack() {return this.attack;}
    public boolean ranged() {return this.ranged;}
    public int range() {return this.range;}
    public int level() {return this.level;}
    public int expneeded() {return this.expneeded;}
    public int experience() {return this.experience;}
    public double growthrate() {return this.growthrate;}

    public void sethealth(int n) {health = n;}
    public void setmaxhealth(int n) {maxhealth = n;}
    public void setattack(int n) {attack = n;}
    public void setlevel(int n) {level = n;}
    public void setexperience(int n) {experience = n;}
    public void setgrowthrate(double n) {growthrate = n;}
    public void setexpneeded(int n) {expneeded = n;}
    public void setrarity(int n) {rarity = n;}
    /* -------------------------------------------------------------------- */
    /*public class card1() extends Basecard{
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
    
    public class card2() extends Basecard{
	sethealth(33);
	setmaxhealth(33);
	setattack(7);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.2);
    }
    public class card3() extends Basecard{
	sethealth(35);
	setmaxhealth(35);
	setattack(8);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.3);
    }
    public class card4()  extends Basecard{
	sethealth(37);
	setmaxhealth(37);
	setattack(10);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.5);
    }
    public class card5() extends Basecard {
	sethealth(40);
	setmaxhealth(40);
	setattack(12);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.6);
    }
    public class card6() extends Basecard {
	sethealth(43);
	setmaxhealth(43);
	setattack(14);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.7);
    }
    public class card7() extends Basecard {
	sethealth(45);
	setmaxhealth(45);
	setattack(16);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(1.8);
    }
    public class card8() extends Basecard {
	sethealth(47);
	setmaxhealth(47);
	setattack(18);
	setlevel(1);
	setexperience(0);
	setexpneeded(100);
	setgrowthrate(2.0);
    }
    public class spcard1() extends Basecard {
	sethealth(50);
	setmaxhealth(50);
	setattack(24);
	setlevel(1);
	setexperience(0);
	setexpneeded(200);
	setgrowthrate(3.0);
    }
    public class spcard2() extends Basecard {
	sethealth(50);
	setmaxhealth(50);
	setattack(30);
	setlevel(1);
	setexperience(0);
	setexpneeded(300);
	setgrowthrate(3.0);
    }*/
}
