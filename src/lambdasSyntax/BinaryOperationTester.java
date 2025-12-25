package lambdasSyntax;

public class BinaryOperationTester {
    static void main() {
        BinaryOperation add = (a,b) -> a + b;

        System.out.println(add.apply(4,4));
    }
}
