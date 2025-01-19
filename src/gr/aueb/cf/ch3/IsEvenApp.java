package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checkes if a number is even or nor.
 */
public class IsEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEven = false;
        int num = 0;

        System.out.printf("Please, insert a number: ");
        num = scanner.nextInt();

        isEven = num % 2 == 0;

        System.out.println("Is even: " + isEven);
    }
}
