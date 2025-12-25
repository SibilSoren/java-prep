package genericsAndCollections;

import java.util.*;

public class CollectionExercise {
    static void main() {
            Person p1 = new Person("Sibil",18);
            Person p2 = new Person("Kunal",35);

            List<Person> persons = new ArrayList<Person>();
        persons.add(p2);
            persons.add(p1);


            for(Person person:persons){
                System.out.println(person);
            }

        Collections.sort(persons);
        System.out.println("\n-----Sorted------");

        for(Person person:persons){
            System.out.println(person);
        }

//        List<String> listOfItems = new LinkedList<String>();
//        listOfItems.add("Pen");
//        listOfItems.add("Notebook");
//        listOfItems.add("Water Bottle");
//
//        for(String item: listOfItems){
//            System.out.println(item);
//        }
//
//        Collections.sort(listOfItems);
//        System.out.println("\n-----Sorted------\n");
//
//        for(String item: listOfItems){
//            System.out.println(item);
//        }

    }
}
