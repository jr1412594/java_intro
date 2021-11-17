public class Monster {

    //Class Variables or fields
    //You declare constants with final

    public final String TOMBSTONE = "Here Lies a Dead monster";

    //Private fields are not visible outside of the class
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;


    //public variables are visible outside of the class
    //you should have as few as possible public fields
    public String name = "Big Monster";

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;

        if (health < 0) {
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth; 

        if (health < 0) {
            alive = false;
        }
    }

    public Monster(
        int newHealth, int newAttack, int newMovement) {
            health = newHealth;
            attack = newAttack;
            movement = newMovement;
        }
    
    //Default Constructor
    public Monster() {
        
    }

public static void main(String[] args) {
    Monster Frank = new Monster();

    Monster Pierogi = new Monster(5000, 20000, 400);

    System.out.println(Frank.alive);
    System.out.println(Pierogi.attack);
}

}