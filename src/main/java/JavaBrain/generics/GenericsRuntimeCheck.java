package JavaBrain.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addToNames (names, "Names 1");
        addToNames (names, "Names 2");
        System.out.println(names);
    //    List names2 = names;
        incorrectAddToNames(names, 100);
        System.out.println(names);
        String names3 = names.get(2);
        System.out.println(names3);  //class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
    }
    private  static void addToNames(List<String> names, String s){
     names.add(s);
    }

    private  static void incorrectAddToNames(List list, Integer i){
        list.add(i);
    }
}
