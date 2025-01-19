package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Demo για typecast, δηλαδή
 * να εκχωρείται μία μεταβλητή ενός τύπου (π.χ. short)
 * σε μία διαφορετικού τύπου (π.χ. int)
 */
public class TypeCastApp {
    public static void main(String[] args) {
        int num1 = 10; //int literals -> int -> 32-bit
        long num2 = 20L; //Στην πραγματικότητα το 20 είναι int, οπότε βάζουμε το L
                            // μετά, για να το κάνουμε long
        num1 = (int) num2;
    }

    /**
     * Converts days, hours, minutes, seconds provided by the user and prints the total seconds.
     */
    public static class DateTimeToSecondsConverter {
        public static void main(String[] args) {

            //Δήλωση εντολών
            int days = 0;
            int daystosec = 0;
            int hours = 0;
            int hourstosec = 0;
            int minutes = 0;
            int minutestosec = 0;
            int seconds = 0;
            int totalsec = 0;
            final int SECONDS_PER_DAY = 86400;
            final int SECONDS_PER_HOUR = 3600;
            final int SECONDS_PER_MINUTE = 60;
            Scanner indays = new Scanner(System.in);
            Scanner inhours = new Scanner(System.in);
            Scanner inminutes = new Scanner(System.in);
            Scanner inseconds = new Scanner(System.in);

            //Εντολές
            System.out.println("Please, enter the amount of days, hours, minutes and seconds you want to convert: ");
            days = indays.nextInt();
            hours = inhours.nextInt();
            minutes = inminutes.nextInt();
            seconds = inseconds.nextInt();
            daystosec = days * SECONDS_PER_DAY;
            hourstosec = hours * SECONDS_PER_HOUR;
            minutestosec = minutes * SECONDS_PER_MINUTE;
            totalsec = daystosec + hourstosec + minutestosec + seconds;

            //Εκτύπωση
            System.out.printf(Locale.US, "There are totaly %,d seconds in the amount of time given.", totalsec);
        }
    }

    /**
     * Λαμβάνει ως input από τον χρήστη
     * ένα διψήφιο ακέραιο και να εκτυπώνει
     * το άθροισμα των ψηφίων του.
     */
    public static class DigitsSum {
        public static void main(String[] args) {

            //Δήλωση μεταβλητών
            int num = 0;
            int firstDigit = 0;
            int secondDigit = 0;
            int sum = 0;
            Scanner inNum = new Scanner(System.in);

            //Εντολες
            System.out.printf("Please, type a number: ");
            num = inNum.nextInt();
            firstDigit = num / 10;
            secondDigit = num % 10;
            sum = firstDigit + secondDigit;

            //Εκτύπωση
            System.out.printf("The first digit of your number is: %d\n", firstDigit);
            System.out.printf("The second digit of your number is: %d\n", secondDigit);
            System.out.printf("The sum of the two-digit number digits is: %d", sum);
        }
    }

    /**
     * Scanner Demo: Reads two integers
     * from std input (keyboard)
     * and calculates the result.
     */
    public static class ScannerAddApp {
        public static void main(String[] args) {

            //Δήλωση και αρχικοποίηση μεταβλητών.
            int num1 = 0;
            int num2 = 0;
            int sum = 0;

            Scanner in = new Scanner(System.in); //Pay attention to the 'new'!

            //Εντολές
            System.out.println("Please, insert two integers");
            num1 = in.nextInt();
            num2 = in.nextInt();
            sum = num1 + num2;

            //Εκτύπωση αποτελεσμάτων.
            System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d", num1, num2, sum);
        }
    }
}