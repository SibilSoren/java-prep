package SOLID.OCP;

public abstract class Employee {
    private String name;
    private Integer id;

    public Employee(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateBonus(Double salary);

    @Override
    public String toString() {
        return name;
    }
}
