package chapters.chapter6.OOP2.Encapsulation.EncapsulationExample;

public class Main {
    public static void main(String[] args) {
      /*  Player player = new Player();
        player.health = 20;
        player.name= "tim";
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health ="+ player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health ="+ player.healthRemaining());
*/
        EnhancedPlayer player = new EnhancedPlayer(150,"Sword","Girija");
        System.out.println("Current health is ="+player.getHealth());

    }


}
