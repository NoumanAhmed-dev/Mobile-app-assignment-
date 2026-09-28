class Animal { void sound() { System.out.println("Animal makes a sound."); } }
class Cat extends Animal {
    @Override void sound() { System.out.println("Cat says Meow."); }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Cat(); a.sound();
    }
}
