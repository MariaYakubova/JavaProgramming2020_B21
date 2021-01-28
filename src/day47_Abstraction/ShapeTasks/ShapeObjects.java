package day47_Abstraction.ShapeTasks;

public class ShapeObjects {

    public static void main(String[] args) {

        // Shape shape = new Shape("Shape");
        Circle circle = new Circle(3.5);
        System.out.println("Area of circle"+circle.area());

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Rectangle area: "+rectangle.area());

        Square square = new Square(5);
        System.out.println("Square area: "+square.area());


    }
}
