package JavaBrain.collections.Map;

import JavaBrain.collections.compare.Student;

import java.util.HashMap;
import java.util.Map;

public class mapsMain {

    /*
    Map is a dictionary collections

    Key-Value pair
    Map can not contain duplicate keys.
     */

    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();

        Student student1 = new Student("foo", "Baz", 1, "commerce");
        Student student2 = new Student("foo", "Baz", 2, "Arts");
        Student student3 = new Student("jan", "Baz", 3, "Science");

        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);

        students.put(200, null);
        System.out.println(students);
        System.out.println(students.get(2));
        //    System.out.println(students.get(200)); not recommended.

        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        for (Student value : students.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(students.getOrDefault(100, new Student("Test", "Test", 100, "Commerce")));

        students.putIfAbsent(9, new Student("Test2", "Test2", 300, "Commerce"));
        System.out.println(students);

        students.forEach((key, value) -> System.out.println(value));

        System.out.println(students.computeIfAbsent(200, key -> new Student("Sky", "Sea", key, "Astronaut")));
        System.out.println(students.get((200)));
        /*

{1=Student{firstName= foo', lastname='Baz', department='commerce'}, 2=Student{firstName= foo', lastname='Baz', department='Arts'}, 3=Student{firstName= jan', lastname='Baz', department='Science'}, 200=null}
Student{firstName= foo', lastname='Baz', department='Arts'}
1
2
3
200
Student{firstName= foo', lastname='Baz', department='commerce'}
Student{firstName= foo', lastname='Baz', department='Arts'}
Student{firstName= jan', lastname='Baz', department='Science'}
null
1 -> Student{firstName= foo', lastname='Baz', department='commerce'}
2 -> Student{firstName= foo', lastname='Baz', department='Arts'}
3 -> Student{firstName= jan', lastname='Baz', department='Science'}
200 -> null
Student{firstName= Test', lastname='Test', department='Commerce'}
{1=Student{firstName= foo', lastname='Baz', department='commerce'}, 2=Student{firstName= foo', lastname='Baz', department='Arts'}, 3=Student{firstName= jan', lastname='Baz', department='Science'}, 200=null, 9=Student{firstName= Test2', lastname='Test2', department='Commerce'}}
Student{firstName= foo', lastname='Baz', department='commerce'}
Student{firstName= foo', lastname='Baz', department='Arts'}
Student{firstName= jan', lastname='Baz', department='Science'}
null
Student{firstName= Test2', lastname='Test2', department='Commerce'}
Student{firstName= Sky', lastname='Sea', department='Astronaut'}
Student{firstName= Sky', lastname='Sea', department='Astronaut'}

Process finished with exit code 0

         */
    }

    /*
    HashMap performance
    . get - o(1)
    . containsKey - o(1)
    . put - o(1)
     */
}
