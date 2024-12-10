package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δίνει:
 * 1. τους συνολικούς βαθμούς μαθημάτων
 * 2. το πλήθος των μαθημάτων
 *
 * Θα υπολογίζει το μέσο όρο και θα χαρακτηρίζει
 * 'Άριστα' αν ο μέσος όρος
 * είναι >=9, 'Πολύ καλά' >=7, 'Καλώς' >=5 και
 * 'Αποτυχίας' αν <=5.
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.printf("Please, insert total marks: ");
        totalMarks = inputNum.nextInt();

        if (totalMarks <= 0) {
            System.out.printf("Total marks must not be zero or negative.");
            System.exit(1);
        }

        System.out.printf("Please insert courses count: ");
        coursesCount = inputNum.nextInt();

        if (coursesCount <= 0 ) {
            System.out.printf("Courses count must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.printf("Error. The average must be less or equal than 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.printf("Excellent! Your grade is %d", average);
        } else if (average >= 7) {
            System.out.printf("Very Good! Your grade is %d", average);
        } else if (average >= 5) {
            System.out.printf("Good! Your grade is %d", average);
        } else {
            System.out.printf("You failed! :-(");
        }
    }
}
