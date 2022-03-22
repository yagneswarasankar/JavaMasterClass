package chapters.chapter6.OOP2.Encapsulation.EncapsulationExample;

public class Player {

    public int health;
    public String weapon;
    public String name;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("the player is knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
