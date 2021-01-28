package day47_Abstraction.ShapeTasks;

public abstract class Shape {  // not concrete

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area(); //"what it is" , "how it's done" does not matter
    public abstract double perimeter();


}
class Test {
    public static void main(String[] args) {
        //    Shape obj = new Shape("Shape");
        Rectangle obj2 = new Rectangle(4, 5);
    }
}