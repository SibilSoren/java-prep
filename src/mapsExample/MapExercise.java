package mapsExample;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    static void main() {
        Person p1 = new Person("Sibil","sibil@mail.com");
        Person p2 = new Person("Kunal","kunal@gmail.com");
        Map<String,Person> mapOfPerson = new HashMap<String,Person>();

        mapOfPerson.put(p1.getEmail(),p1);
        mapOfPerson.put(p2.getEmail(),p2);

        System.out.println(mapOfPerson.get("sibil@mail.com"));
    }
}
