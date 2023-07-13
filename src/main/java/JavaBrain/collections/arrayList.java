package JavaBrain.collections;

import java.util.ArrayList;

public class arrayList {

    public static void add() {


        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("names " + i);
     //       System.out.println(names);
        }
        System.out.println(names);
        for (int i = 0; i < 20; i++) {
           String value =names.get(i);
            //       System.out.println(names);
            System.out.println(value);
        }

    }

    public static void main(String[] args) {
       add();
       // output : [names0, names1, names2, names3, names4, names5, names6, names7, names8, names9, names10, names11, names12, names13, names14, names15, names16, names17, names18, names19]
    }

}