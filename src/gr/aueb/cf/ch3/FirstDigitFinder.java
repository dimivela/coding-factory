package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user provides a number and
 * the program prints the first
 * (most significant) digit.
 */
public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;
        int firstDigit = 0;

        System.out.print("Please, enter a positive integer: ");
        num = inputNum.nextInt();

        tempNum = num;

        while ( tempNum >= 10){
            tempNum /= 10;
        } // The number enters and is divided till it is smaller than 10.

        System.out.printf("The first digit is %d", tempNum);
    }
}
