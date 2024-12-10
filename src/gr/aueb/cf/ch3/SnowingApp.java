package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Χιονίζει αν και μόνο αν βρεχει AND θερμοκρασία < 0.
 */
public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner in = new Scanner(System.in);
        int temp = 0;

        System.out.printf("Please, insert if it is raining: ");
        isRaining = in.nextBoolean();
        System.out.printf("Please, insert the current temperature: ");
        temp = in.nextInt();

        isSnowing = isRaining && temp < 0; //Οι τελεστές συσχέτισης έχουν προτεραιότητα
                                            // σε σχέση με τους λογικούς.
                                            // Όπως και ! > && > || στην java.

        System.out.println("Is snowing: " + isSnowing);
    }
}
