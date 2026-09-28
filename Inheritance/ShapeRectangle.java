class Shape { void display() { System.out.println("This is a shape."); } }
class Rectangle extends Shape {
    int length = 10, width = 5;
    void area() { System.out.println("Area: " + length * width); }
}
public class ShapeRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); r.display(); r.area();
    }
}
