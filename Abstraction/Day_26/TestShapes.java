package Abstraction.Day_26;

public class TestShapes {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Circle circle = new Circle(5);
        Square square = new Square(10);
        System.out.printf("Area of circle %f", circle.calculateArea());
        System.out.printf("\nArea of Square %f", square.calculateArea());
    }
}
