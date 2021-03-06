package day9;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double halfOfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a)
                *
                (halfOfPerimeter - b) * (halfOfPerimeter - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}
