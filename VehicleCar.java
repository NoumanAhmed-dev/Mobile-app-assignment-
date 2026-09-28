class Vehicle {
    String brand = "Toyota";
    void start() { System.out.println("Vehicle starts."); }
}
class Car extends Vehicle { void drive() { System.out.println(brand + " car is driving."); } }
public class VehicleCar {
    public static void main(String[] args) {
        Car c = new Car(); c.start(); c.drive();
    }
}
