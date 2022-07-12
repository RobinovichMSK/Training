package day13;

import static day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {
    /* В методе main() этого класса необходимо создать трех пользователей.
    Затем необходимо:
    Отправить 2 сообщения от пользователя 1 пользователю 2
    Отправить 3 сообщения от пользователя 2 пользователю 1
    Отправить 3 сообщения от пользователя 3 пользователю 1
    Отправить 3 сообщения от пользователя 1 пользователю 3
    Отправить 1 сообщение от пользователя 3 пользователю 1

    Сообщения могут быть любыми.
    После этого, необходимо вывести диалог пользователя 1 и
    пользователя 3 с помощью метода showDialog().*/
        User u1 = new User("Sergey");
        User u2 = new User("Olga");
        User u3 = new User("Petr");


        u1.sendMessage(u2,"Olga privet!");
        u1.sendMessage(u2,"Kak ti? Kogda uvidemcya?");
        u2.sendMessage(u1,"Sereja privet!");
        u2.sendMessage(u1,"Vse prekrasno!");
        u2.sendMessage(u1,"Davai na etoy nedele gde-to posidim rasskaju");

        u3.sendMessage(u1,"Serega pognali pivo pit");
        u1.sendMessage(u3,"Ne, ya Java zanimaus");
        u3.sendMessage(u1,"Da potom podelaesh, pognali!");
        u1.sendMessage(u3,"ne startuy bez menya");
        u3.sendMessage(u1,"ladno na svyazi");
        u1.sendMessage(u3,"aga..");

        u1.sendMessage(u3,"Ya osvobodilsya, gde vstrechaemcya?");

        showDialog(u1,u3);
    }
}
