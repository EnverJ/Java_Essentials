package JavaBrain.concurrency;

public class MyRunnable implements Runnable{
    public void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        // alternatives.
        Runnable r2 = () -> System.out.println("Running");

        // or
        new Thread(() -> System.out.println()).start();
    }

}
