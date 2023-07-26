package JavaBrain.generics.zoo;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printNumbers(numbers);

    }
    private  static void printNumbers(List<? extends Number> numbers ) {
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
    }
}
