package setsExample;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    static void main() {
        Set<String> numbers = new HashSet<String>();

        numbers.add("123-222-3333");
        numbers.add("223-222-3333");
        numbers.add("123-332-3333");
        numbers.add("123-222-4433");
        numbers.add("123-222-1133");
        numbers.add("123-222-3333");
        numbers.add("123-222-3333");
        numbers.add("123-232-4533");
        numbers.add("123-562-3333");
        numbers.add("123-000-3333");
        numbers.add("555-222-3333");
        numbers.add("444-222-3333");

        for(String nums: numbers){
            System.out.println(nums);
        }
    }
}
