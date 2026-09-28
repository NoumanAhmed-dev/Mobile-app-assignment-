class Printer {
    void print(String text) { System.out.println("Text: " + text); }
    void print(int number) { System.out.println("Number: " + number); }
    void print(double value) { System.out.println("Decimal: " + value); }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Java"); p.print(100); p.print(12.5);
    }
}
