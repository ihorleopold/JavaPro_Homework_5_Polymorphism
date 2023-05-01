package Shapes;

public class Circle implements Shape {

    private double radius;
    private double result;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return result = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Circle area is: " + result);
    }


}
