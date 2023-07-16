package JavaBrain.collections;

import java.util.ArrayList;

public class Equality {

    public static void main(String[] args) {
        Student student1 = new Student("foo","Baz",1,"Science");
        Student student2 = new Student("foo","Baz",1,"Science");
        Student student3 = new Student("jan","Baz",3,"Science");
        Student student4 = new Student("gul","Baz",4,"Science");
        System.out.println(student1.hashCode());  //511754216
        System.out.println(student2.hashCode());  //1721931908
//
//         after hashcode
//         -1917249256
//         -1917249256


        System.out.println(student1 == student2);  //false  this can not be fixed.
        System.out.println(student1.equals(student2));  //false this can be fixed.
        // root cause: they are in two different heats
        // casting alt insert

     // true

        ArrayList<Student> students = new ArrayList<>();
        students.add(student3);
        students.add(student4);
        students.add(student1);
        students.add(student2);
        students.sort(null);
        System.out.println(students);
// [Student{firstName= foo', lastname='Baz', department='Science'}, Student{firstName= foo', lastname='Baz', department='Science'}, Student{firstName= jan', lastname='Baz', department='Science'}, Student{firstName= gul', lastname='Baz', department='Science'}]


    }
}
