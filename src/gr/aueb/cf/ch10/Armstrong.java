package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * e.g. 153 ?= 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int numberOfDigits = 0;
        int originalNum = 0;
        int digit;

        System.out.println("Please, enter a number");
        num = scanner.nextInt();
        numberOfDigits = String.valueOf(num).length();
        System.out.println("The number of digits you entered are: " + numberOfDigits);

         originalNum = num;

         while (num != 0) {
             digit = num % 10;
             sum += (int) Math.pow(digit, numberOfDigits);
             num /= 10;
         }

        System.out.printf("%d%s an Armstrong number", originalNum, (sum == originalNum) ? " is" : " is not");
    }
}
