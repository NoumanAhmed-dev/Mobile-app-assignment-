class Person {
    String name;
    Person(String name) { this.name = name; }
    void showName() { System.out.println("Name: " + name); }
}
class Student extends Person {
    int marks;
    Student(String name, int marks) { super(name); this.marks = marks; }
    void showMarks() { System.out.println("Marks: " + marks); }
}
public class PersonStudent {
    public static void main(String[] args) {
        Student s = new Student("Ahmed", 85); s.showName(); s.showMarks();
    }
}
