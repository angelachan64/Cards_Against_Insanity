public class Basecard {
    private int health,maxhealth;
    private int attack;
    private boolean ranged;
    private int range;
    private int level;

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

    public void sethealth(int n) {health = n;}
    public void setmaxhealth(int n) {maxhealth = n;}
    public void setattack(int n) {attack = n;}
    public void setlevel(int n) {level = n;}
}
