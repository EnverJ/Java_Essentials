package JavaBrain.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("name 1");
//        names.add("name 2");
//        printList(names);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printNumber(numbers);
        List<Double> doubles = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
     //   printList(numbers);
        printNumber(doubles);

//        List<String> foo = new ArrayList<>();
//        printNumber(foo); // compile time error

    }
//    public static void printList (List<?> names) {  // replace object with ?. ? an unknown  type
//        names.forEach(System.out::println);
//     //   names.add("names 3");  cannot add things
//    }

    public static void printNumber(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
    }
}
