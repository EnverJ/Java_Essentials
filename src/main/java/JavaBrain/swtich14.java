package JavaBrain;

import java.util.Scanner;

import static java.util.Calendar.*;

public class swtich14 {
    // this is java 14 feature

    public static void numDays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day:");
        String day = sc.nextLine();
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> 0; // Handle unknown day
        };

        System.out.println("Number of letters: " + numLetters);
    }

    public static void main(String[] args) {
        numDays();
    }
}
