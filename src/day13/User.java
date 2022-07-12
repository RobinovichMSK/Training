package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    /*- подписывает пользователя на пользователя user */
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    /*возвращает True, если пользователь подписан на пользователя user и False, если не подписан.*/
    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)){
            return true;
        } else {
            return false;
        }
    }

    /*возвращает True, если пользователь user является другом и False, если пользователь user не является другом.
        Подумайте, что такое дружба в контексте соц. сетей.*/
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(user);
    }

    /*отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.*/
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this,user,text);
    }
    /* возвращает строковое представление пользователя (имя пользователя).*/

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }


}
