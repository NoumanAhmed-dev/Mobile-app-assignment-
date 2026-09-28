abstract class Shape {
    abstract void area();
    void message() { System.out.println("Calculating area."); }
}
class Circle extends Shape {
    void area() { double r = 5; System.out.println("Area: " + 3.14 * r * r); }
}
public class AbstractShape {
    public static void main(String[] args) {
        Circle c = new Circle(); c.message(); c.area();
    }
}
