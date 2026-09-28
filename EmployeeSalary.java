class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) { this.name = name; this.salary = salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee("Ali", 60000);
        e.setSalary(70000);
        System.out.println(e.getName() + ": " + e.getSalary());
    }
}
