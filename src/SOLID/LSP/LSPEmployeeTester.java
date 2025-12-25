package SOLID.LSP;

public class LSPEmployeeTester {
    static void main() {
        BonusEligible[] bonusEligibles = {new PermanentEmployee("Sibil Soren",85000.0),new TemporaryEmployee("Kuanl Singh",92000.5)};
        bonusEligibles[0].calculateBonus();
        for(int i = 0; i < bonusEligibles.length; i++){
            System.out.println(bonusEligibles[i] + " Bonus: " + bonusEligibles[i].calculateBonus());
        }

    }
}
