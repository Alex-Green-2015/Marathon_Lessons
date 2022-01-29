package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    private MessageDatabase() {
    }

    public static void addNewMessage(User u1, User u2, String text) {
        Message newMessage = new Message(u1, u2, text);
        messages.add(newMessage);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        // проверяем каждое сообщение в базе
        for (Message message : messages) {
            User sender = message.getSender();
            User receiver = message.getReceiver();

            if (u1.equals(receiver) && u2.equals(sender) || u2.equals(receiver) && u1.equals(sender)) {
                // Элементы в листе 'messages' хранятся по порядку добавления.
                // Следовательно, порядок уже верный (хронологический)
                System.out.println(sender.getUsername() + ": " + message.getText());
            }
        }
    }

}
