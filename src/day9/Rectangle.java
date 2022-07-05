package day9;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }
    public double area() {
        return a*b ;
    }
    public  double perimeter() {
        return (a+b)*2;
    }
}
