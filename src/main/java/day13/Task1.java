package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "1-2, Hi user2!");
        user1.sendMessage(user2, "1-2, How are you?");
        user2.sendMessage(user1, "2-1, Hi user1!");
        user2.sendMessage(user1, "2-1, Not now");
        user2.sendMessage(user1, "2-1, I'm busy");

        user3.sendMessage(user1, "3-1, Hi user1!");
        user3.sendMessage(user1, "3-1, You here?");
        user3.sendMessage(user1, "3-1, How are you?");
        user1.sendMessage(user3, "1-3, Hi user3!");
        user1.sendMessage(user3, "1-3, I'm fine!");
        user1.sendMessage(user3, "1-3, Have a good day!");
        user3.sendMessage(user1, "3-1, Have a good day too!");

        MessageDatabase.showDialog(user1, user3);

        System.out.println();
        user3.sendMessage(user3, "3-3, Favorites notes");
        MessageDatabase.showDialog(user3, user3);
    }
}
