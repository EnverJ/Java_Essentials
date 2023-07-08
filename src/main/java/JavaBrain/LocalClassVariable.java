package JavaBrain;

public class LocalClassVariable {

    public static void main(String[] args) {
       final int i = 10;
        class Foo {
            int x = i;


        }
    //        i = 20;
        System.out.println(i);
    }
}
