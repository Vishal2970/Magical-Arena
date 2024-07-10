public class player {
    private int health;
    private int strength;
    private int attack;

    public player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void reduceHealth(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
    public String formatDetails(){
        return "Player { health = "+health+" , attack = "+attack+" , strength = "+strength+" }";
    }
}
