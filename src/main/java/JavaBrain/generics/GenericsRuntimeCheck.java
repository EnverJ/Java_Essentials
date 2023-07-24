package JavaBrain.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {

    // generic is compile time construct
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        addToNames (namesList, "Names 1");
        addToNames (namesList, "Names 2");
        System.out.println(namesList);
    //    List names2 = namesList;
        incorrectAddToNames(namesList, 100);
        System.out.println(namesList);
        String names3 = namesList.get(0);
        System.out.println(names3);  //class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')

        String[] namesArray = new String[5];
        addToArray(namesArray, "Name 1");
  //      incorrectAddToArray(namesArray, 10);
        String anotherName = namesArray[0];



    }

    private  static void addToArray(String[] namesArray, String s) {
       namesArray[0] = s;
    }

//    private  static void incorrectAddToArray(String[] namesArray, Integer i) {
//        namesArray[0] = i; //java: incompatible types: java.lang.Integer cannot be converted to java.lang.String
//    }
    private  static void addToNames(List<String> names, String s){
     names.add(s);
    }

    private  static void incorrectAddToNames(List list, Integer i){
        // this is not a generic
        list.add(i);
    }
}
