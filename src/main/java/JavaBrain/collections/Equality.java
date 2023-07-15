package JavaBrain.collections;

public class Equality {

    public static void main(String[] args) {
        Student student1 = new Student("foo","Baz",1,"Science");
        Student student2 = new Student("foo","Baz",1,"Science");
        System.out.println(student1.hashCode());  //511754216
        System.out.println(student2.hashCode());  //1721931908

        System.out.println(student1 == student2);  //false  this can not be fixed.
        System.out.println(student1.equals(student2));  //false this can be fixed.
        // root cause: they are in two different heats
        // casting alt insert

     // true



    }
}
