package Shapes;

public class Triangle implements Shape {

    private double base;
    private double height;
    private double result;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return result = 0.5 * base * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Triangle area is: " + result);
    }
}
