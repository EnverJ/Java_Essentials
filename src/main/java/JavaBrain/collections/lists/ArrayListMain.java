package JavaBrain.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Name A");
        names.add("Name B");
        System.out.println(names);

        names.add("Names A");
        System.out.println(names);

        // set
        names.set(2, "Name C");
        System.out.println(names);


        System.out.println(names.get(0));

    //    System.out.println(names.get(200));

        // add an element to first location
        names.add(1, "Names D");
        System.out.println(names);

        // remove
        names.remove(1);
        System.out.println(names);

        names.remove("Name A");
        System.out.println(names);

        names.add("Name A");
        System.out.println(names);

        // ArrayList performance
        /*
        .get -o(1)
        .set - o(1);
        .contains - o(n);
        .remove(0) - o(n);
        .add(0) - o(n);
        .add - o(n);

        ArrayList - add performance
        . Best case - o(1)
        . worst case - o(N)
        . Most case - o(1)

        o(1)
        Amortized time

         */



    }

}
