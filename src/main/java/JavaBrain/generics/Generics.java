package JavaBrain.generics;

import java.util.ArrayList;
import java.util.Date;

public class Generics {
    public static void NoDataType(){
        ArrayList<Date> names = new ArrayList<Date>();
        names.add(new Date());  //Exception in thread "main" java.lang.ClassCastException: class java.util.Date cannot be cast to class java.lang.String (java.util.Date and java.lang.String are in module java.base of loader 'bootstrap')
   //     names.add("Dad");
   //     names.add("Baby");
 //       names.add(100);
   //     String myFn = (String) names.get(0);
   //     System.out.println(myFn);
        Date foo = names.get(0);
        System.out.println(foo);
        }

    public static void main(String[] args) {

        NoDataType();
    }

}
