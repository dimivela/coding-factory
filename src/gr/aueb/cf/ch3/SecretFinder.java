package gr.aueb.cf.ch3;

import java.awt.*;
import java.util.Scanner;

/**
 * Yπάρχει ένα SECRET σε μορφή integer
 * και ο χρήστης έχει μία μόνο προσπάθεια
 * να τον βρει.
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Please, guess the number: ");
        num = inputNum.nextInt();

        if (num == SECRET){
            System.out.println("You found it!");
        } else {
            System.out.println("Oh no! Try again!");
        }
    }
}
