package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesExercise {
    static void main() {

        Queue<String> myQ = new LinkedList<String>();
        myQ.add("1234");
//        System.out.println(myQ.peek());
        myQ.add("3412");
        myQ.add("0123");
        myQ.add("4321");
//        System.out.println(myQ.peek());


        while (!myQ.isEmpty()){
            System.out.println("Customer " + myQ.poll() + " is being helped");
        }
    }
}
