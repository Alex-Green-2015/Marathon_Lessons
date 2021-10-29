package day7;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        } else {
            System.out.println("Тебе нужно отдохнуть!");
        }
    }

    public static void info() {
        int freePlace = 6 - countPlayers;

        if (freePlace > 0) {
            System.out.print("Команды неполные. На поле есть еще ");

            switch (freePlace) {
                case 1:
                    System.out.println(freePlace + " свободное место");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(freePlace + " свободных места");
                    break;
                case 5:
                    System.out.println(freePlace + " свободных мест");
                    break;
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
