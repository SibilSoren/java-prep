package SOLID.OCP;

public class EmployeeTester {
    static void main() {
        Employee sibil = new PermanentEmployee("Sibil Soren", 1);
        Employee kunal = new TemporaryEmployee("Kunal Singh", 2);

        System.out.println(sibil + " Bonus: " + sibil.calculateBonus(65000.0));
        System.out.println(kunal + " Bonus: " + sibil.calculateBonus(85000.0));
    }
}
