package JavaBrain.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    /* Lesson 14. How Iterator work
      collection---Iterator---Next.   repeat call next
     */

    /*
    Lesson 15
    Using Iterator

    the Iterator interface:
        public Iterator<E> {
        boolean hasNext();  // Are there more Element?
        E next();         // Get the next element in this Iterator
        void remove();    // Remove the last element by the iterator
        default void forEachRemaining(Consumer<? super E> action);

    }
     */

    // Print all elements in arrayList
    public static void add() {


        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("names " + i);
            //       System.out.println(names);
        }
        for (int i = 0; i < 20; i++) {
            String value = names.get(i);
            //       System.out.println(names);
            System.out.println(value);
        }

    }

    public static void IteratorAdd() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("names " + i);
            //       System.out.println(names);
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        //  add();
        IteratorAdd();
    }


    /*
    Iterator vs for each loop
     */

}
