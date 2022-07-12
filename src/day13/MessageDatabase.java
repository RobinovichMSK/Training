package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    /*этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
    Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.*/
    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1,u2,text,new Date()));
    }

    /* возвращает список всех сообщений в “базе данных”.*/
    public static List<Message> getMessages(){
        return messages;
    }

    /*этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
    user1: Привет!
    user2: Привет, user1!
    user1: Как у тебя дела?
    user2: Все ок, спасибо :)
    У вас могут быть любые другие сообщения. Где user1 и user2 - имена пользователей u1 и u2. */
    public static void showDialog(User u1, User u2){
        for (Message mes : messages){
           if (mes.getSender() == u1 && mes.getReceiver() == u2
                    || mes.getSender() == u2 && mes.getReceiver() == u1) {
                System.out.println(mes.getSender() + ": " + mes.getText());
            }
        }
    }
}
