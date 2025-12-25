package genericsAndCollections;

import java.util.ArrayList;

public class genericsExample {

    static void main() {
        ArrayList<Object> variables = new ArrayList<Object>();
        Double doubleNum = 1.5;
        String name = "Sibil";
        Character letter = 'a';
        variables.add(doubleNum);
        variables.add(name);
        variables.add(letter);

        for(Object variable : variables){
            displayClassName(variable);
        }
    }

    static <T> void displayClassName(T variable){
        System.out.println(variable.getClass().getName());
    }


}
