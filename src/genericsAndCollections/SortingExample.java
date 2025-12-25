package genericsAndCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingExample {
    static void main() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kunal");
        names.add("Chinna");
        names.add("Sibil");

        Collections.sort(names);

        for(String name: names){
            System.out.println(name);
        }
    }
}
