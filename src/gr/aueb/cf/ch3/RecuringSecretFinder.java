package gr.aueb.cf.ch3;

import java.util.Scanner;

public class RecuringSecretFinder {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        do {
            System.out.println("Please, guess the number: ");
            num = inputNum.nextInt();

            if (num == SECRET) {
                System.out.println("You found it!");
            } else {
                System.out.println("Oh no! Try again!");
            }
        } while (num != SECRET);
    }
}