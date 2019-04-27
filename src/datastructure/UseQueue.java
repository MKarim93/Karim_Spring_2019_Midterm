package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Jane");
        names.add("Rick");
        names.add("Chris");
        System.out.println("peek : " + names.peek());
        System.out.println("remove : " + names.remove());
        System.out.println("poll : " + names.poll());
        for (String x : names) {
            System.out.println("for loop : " + x);
        }
        Iterator it = names.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator : " + it.next());
        }

    }

}
