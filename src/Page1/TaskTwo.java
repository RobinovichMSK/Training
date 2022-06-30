package Page1;

public class TaskTwo {
    public static void main(String[] args) {
        Motorbike m1 = new Motorbike("Harley", "Siniy", 2022);
        System.out.println(m1.getName() + " " + m1.getColor() + " " + m1.getAge());
    }
}
    class Motorbike {
        private final String name;
        private final String color;
        private final int age;
        public Motorbike(String name, String color, int age){
            this.name = name;
            this.color = color;
            this.age = age;
        }
        public  String getName() {
            return name;
        }
        public  String getColor() {
            return color;
        }
        public int getAge() {
            return age;
        }
    }

