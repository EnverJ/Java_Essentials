package JavaBrain;

public class loops {
    public void singleLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void multiValueLoop() {
        int i, j;
        for (i = 0, j = 0; i < 10; j = 10, i++, j++) {
            System.out.println(j * i);
        }
    }

    // or
    public static void multiLoop() {
        int i, j;
        for (i = 0, j = 10; i < 10; i++, j--) {
            System.out.println(i * j);
        }
    }

    public static void forEacLoop() {
        int[] someNumbers = {2, 3, 4, 5, 0, 6, 7};
        int total = 0;
        for (var num : someNumbers) {
            total = total + num;
            System.out.println(total);
        }
    }

    public static void nestedLoop() {
        int[][] nums = new int[10][20];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                //             nums[i][j] = i*j;
                System.out.println(i * j);
            }
        }
    }

    public static void ForEachTwoDimensional() {
        int[][] someNums = new int[10][20];
        for (int[] subArray : someNums) {
            for (int a : subArray) {
                System.out.println("element is " + a);
            }

        }


    }

    public static void whileLoop() {

    }

    public static void doWhileLoop() {

    }

    public static void main(String[] args) {
        //multiValueLoop();
        //multiLoop();
        //  forEacLoop();
        //  nestedLoop();
        ForEachTwoDimensional();
    }
}
