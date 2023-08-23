package JavaBrain.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_PrimeNumberWithConcurrencyHoldingThreads {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        Runnable statusReporter = () -> {
            try {
                while (true) {

                    Thread.sleep(5000);
                    printThread(threads);
                }

            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

        };

        Thread reporterThread = new Thread(statusReporter);
        reporterThread.start();
        while (true) {
            // pause 5 seconds
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number. Enter n: ");
            int n = sc.nextInt();
            if (n == 0) {
                reporterThread.interrupt();
                break;
            }
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    int number = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("\n Result: ");
                    System.out.println("\n Value of " + n + " the prime: " + number);
                }
            };
            Thread t = new Thread();
            threads.add(t);
            t.start();
        }
    }

    public static void printThread(List<Thread> threads) {
        System.out.println("\n Threads status: ");
        threads.forEach(thread -> {
            System.out.println(thread.getState() + " ");
        });
        System.out.println("");
    }
}
