package JavaBrain.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printNumbers(integers);
        List<Double> doubles = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printNumbers(doubles);

       // addToList(numbers,10);
        List<Number> numbers = new ArrayList<>();
        numbers.add(1.5);


    }
//    private static  void addToList(List<Integer> numbers, Integer i){
//        numbers.add(i);
//
//    }

//lower bound  write but no read
    private static  void addToList(List<? super Number> numbers, Number i){
        numbers.add(i);

    }
    //upper bound. read but no write
    private  static void printNumbers(List<? extends Number> numbers ) {
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
    }

}


// PECS -> Producer Extends Consumer Super.