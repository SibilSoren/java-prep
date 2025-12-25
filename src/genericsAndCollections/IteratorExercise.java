package genericsAndCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExercise {
    static void main() {
        List<String> name = new LinkedList<String>();
        name.add("Sibil");
        name.add("Sarjam");
        name.add("Soren");

        Iterator iterator = name.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
