package chapters.chapter6.OOP2.Encapsulation.EncapsulationExample;

public class EnhancedPlayer {
    private int healthPoints = 100;
    private String weapon;
    private String name;

    public EnhancedPlayer(int health, String weapon, String name) {
        if(health >=0 && health <= 100){
            this.healthPoints = health;
        }
        this.weapon = weapon;
        this.name = name;
    }

    public int getHealth() {
        return healthPoints;
    }
}
