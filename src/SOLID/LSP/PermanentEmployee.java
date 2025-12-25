package SOLID.LSP;

public class PermanentEmployee extends Employee implements BonusEligible{
    public PermanentEmployee(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public Double calculateBonus() {
        return salary * 0.10;
    }
}
