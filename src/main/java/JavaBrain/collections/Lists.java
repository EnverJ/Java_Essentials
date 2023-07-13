package JavaBrain.collections;

import java.util.Date;

public class Lists {

    // arrays
    int[] numbers;
   public  void arrays() {
       numbers = new int[100];
       numbers[0] = 10;
       System.out.println(numbers[0]);
   }

   public  void dates() {
       Date[] date = new Date[10];
       date[5] = new Date();
       System.out.println(date[5]);
   }

}
