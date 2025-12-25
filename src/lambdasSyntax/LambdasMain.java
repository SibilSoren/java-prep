package lambdasSyntax;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class LambdasMain {

    public static long countMatchingString(List<String> input, Predicate<String> condition){
        return input.stream().filter(condition).count();
    }

    static void main() {
        BinaryOperator<Integer> add = (Integer a, Integer b) -> a + b;
//        System.out.println(add.apply(3, 4));

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
//        System.out.println(multiply.apply(3, 4));

        List<String> input = List.of("hello", "    world", "\t  ","", "goodbye");
        System.out.println(countMatchingString(input, s -> s.trim().isEmpty()));
    }
}
