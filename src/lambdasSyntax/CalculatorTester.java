package lambdasSyntax;

public class CalculatorTester {
    static void main() {
        Calculator calculator = new Calculator();
        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("*", (a, b) -> a * b);
        calculator.registerOperation("/", (a, b) -> a / b);
        calculator.registerOperation("%", (a, b) -> a % b);

        System.out.println(calculator.calculate(5, "+", 4));
        System.out.println(calculator.calculate(5, "-", 4));
        System.out.println(calculator.calculate(5, "*", 4));
        System.out.println(calculator.calculate(5, "/", 4));
        System.out.println(calculator.calculate(5, "%", 4));
        ;
    }
}
