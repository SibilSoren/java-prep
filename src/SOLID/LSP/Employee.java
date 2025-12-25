package SOLID.LSP;

public class Employee {
    protected String name;
    protected Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name;
    }
}
