package day6;


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

    public void info() {
        System.out.println("Eto auto");
    }
}





