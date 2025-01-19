package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Convert years (age) to days.
 */
public class YearsToDays {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int days = 0;
        final int DAYS_PER_YEAR = 365;

        // Εντολές
        System.out.println("Please, enter an age: ");
        age = scanner.nextInt();
        days = age * 365;

        // Εκτύπωση
        System.out.printf(Locale.GERMAN, "The age you gave, translates to %,d days", days);
    }
}
