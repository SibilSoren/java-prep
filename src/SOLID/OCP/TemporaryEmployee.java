package SOLID.OCP;

public class TemporaryEmployee extends Employee{
    public TemporaryEmployee(String name,Integer id) {
        super(name, id);
    }

    @Override
    public double calculateBonus(Double salary) {
        return salary * 0.05;
    }
}
