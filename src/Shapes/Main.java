package Shapes;

public class Main {

    public static void main(String[] args) {
        
        Shape circle = new Circle(5);
        circle.calculateArea();
        circle.printInfo();

        Shape square = new Square(5);
        square.calculateArea();
        square.printInfo();

        Shape triangle = new Triangle(2, 5);
        triangle.calculateArea();
        triangle.printInfo();

        Shape[] shapes = new Shape[3];

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);

    }

    static public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}