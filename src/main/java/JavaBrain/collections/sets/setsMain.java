package JavaBrain.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class setsMain {
    /*
    Sets
    - A collection with no duplicate elements

    Common use case:
    - classifications, Assign student to lecture
    ex:
    A, B C


     contain no pair of elements e1 and e2 such that e1.equals(e2)
     w

    What about null?
    Sen can contain utmost one null element.
    the second null element will break the contract.
     */
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Name A");
        names.add("Name B");
        System.out.println(names);  //[Name B, Name A]  no specific order in Set.

        boolean result = names.add("Name A");
        System.out.println(names); //[Name B, Name A]
        System.out.println(result); //false

        names.remove("Name A");
        System.out.println(names); //[Name B]

        // no get in set
        System.out.println(names.contains("Name B")); //true
    }
}
