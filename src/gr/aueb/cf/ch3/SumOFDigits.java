package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Calculates the sum of the
 *  digits of an integer.
 */
public class SumOFDigits {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;
        int sum = 0;
        int rightDigit = 0;

        System.out.print("Please, enter a positive integer: ");
        num = inputNum.nextInt();

        tempNum = num;

        while (tempNum > 0){
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum /= 10;
        }


        System.out.printf("The sum of the digits of %d is: %d", num, sum);
    }
}
