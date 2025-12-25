package genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class collectionExample {
    static void main() {
        List<String> myList = new ArrayList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");

        myList.remove("one");

        for(String nums : myList){
            System.out.println(nums);
        }
    }
}
