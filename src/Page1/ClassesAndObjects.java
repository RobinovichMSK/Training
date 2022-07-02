package Page1;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Audi");
        car1.setColor("");
        car1.setAge(1994);
        System.out.println(car1.getName() + ", Cvet " + car1.getColor() + ", god vipuska " + car1.getAge());
    }
}


class Car {
    private String name;
    private String color;
    private int age;

    public void setName(String autoName) {
        if (autoName.isEmpty()) {
            System.out.println("Vi ne veli nazvanie auto");
        } else {
            name = autoName;
        }
    }

    public String getName() {
        return name;
    }

    public void setColor(String autoColor) {
            /*if (autoColor.isEmpty()) {
                System.out.println("Vi ne veli cvet");
            } else { */
        color = autoColor;
    }

    public String getColor() {
        if (color == null) {
            System.out.println("Vi ne vveli cvet");
        } else {
            return null;
        }
        return color;
    }


    public void setAge(int autoAge) {
        if (autoAge < 1980) {
            System.out.println("Slishkom staroe auto");
        } else {
            age = autoAge;
        }
    }

    public int getAge() {
        return age;
    }
}





