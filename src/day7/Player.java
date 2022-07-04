package day7;
/*
Дворовый футбол.
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:

Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость”
(англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0,
 выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
Геттеры для полей “выносливость” и “количество игроков”.
run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
 Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6,
то выводит сообщение: “Команды неполные. На поле еще есть ... свободных мест”,
 иначе: “На поле нет свободных мест”. Грамматикой русского языка пренебречь,
 т.е. фраза “еще есть 1 свободных мест” допустима.

Задание: Создать класс Player по вышеописанному шаблону. В методе main()
создать объект класса Random, который будет генерировать случайные числа.
Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно
сгенерированные числа от 90 до 100. Вызвать метод info(). При попытке
создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
*/

public class Player {
    private int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina(Player player, int stamina1) {
        //stamina = MIN_STAMINA;
        if (player.stamina < MAX_STAMINA) {
            player.stamina = stamina + stamina1;
            System.out.println(stamina);
        } else {
            System.out.println("Privishenie stamina. ");
        }
        return stamina;
    }

    public void run(Player player) {
        if (player.stamina == 0) return;
        player.stamina = stamina - 10; // что бы побыстрей устал
        System.out.println(player.stamina);
        if (player.stamina <= 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Komandi ne polnie. Na pole eche est " + (6 - Player.countPlayers) + " svobodnix mest.");
        } else if (countPlayers == 6) {
            System.out.println("Na pole net svobodnix mest");
        }
    }


}

