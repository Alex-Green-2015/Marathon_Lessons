package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(Player.MAX_STAMINA - random.nextInt(11)); // between 90 and 100
        Player player2 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player3 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player.info();

        Player player4 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player5 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player6 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player.info();

        while (player3.getStamina() > 0) {
            player3.run();
        }

        System.out.println(Player.getCountPlayers());

    }
}
