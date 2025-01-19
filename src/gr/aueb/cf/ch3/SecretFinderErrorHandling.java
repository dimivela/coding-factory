package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearizes the branches and check errors first.
 */
public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        while (true){
            System.out.println("Please, guess the number: ");
            num = inputNum.nextInt();

            if (num != SECRET){
                System.out.println("Oh no! Try again!");
                continue; // Έχει τη λογική το else, αλλά ο κώδικας είναι πιο καλά δομημένος
            }

            System.out.println("You found it!");
            break;
        }
    }
}
