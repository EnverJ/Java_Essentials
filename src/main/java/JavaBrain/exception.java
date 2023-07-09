package JavaBrain;

public class exception {
    int i = 100;
    int j;
    int a;
    public int devide() {
        for(j =0;j<5;j++){
            try {
                a= i/j;
            } catch (Exception e){
                return 0;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        exception e = new exception();
        System.out.println(e.devide());

    }



}
