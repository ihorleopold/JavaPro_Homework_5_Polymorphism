package Shapes;

public class Square implements Shape {

    private double side;
    private double result;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return result = Math.pow(side, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Square area is: " + result);
    }

}
