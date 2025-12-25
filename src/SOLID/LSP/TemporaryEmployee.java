package SOLID.LSP;

public class TemporaryEmployee extends Employee implements BonusEligible{
    public TemporaryEmployee(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public Double calculateBonus() {
        return salary * 0.05;
    }
}
