package SOLID.OCP;

public class PermanentEmployee extends Employee{
    public PermanentEmployee(String name, Integer id) {
        super(name, id);
    }

    @Override
    public double calculateBonus(Double salary) {
        return salary * .10;
    }


}
