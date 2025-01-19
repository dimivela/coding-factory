package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the b^power.
 */
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner inputBase = new Scanner(System.in);
        Scanner inputPower = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        System.out.printf("Please, enter the base: ");
        base = inputBase.nextInt();
        System.out.printf("Please, enter the power: ");
        power = inputPower.nextInt();

        while (i <= power){
            result *= base;
            i++;
        }

        System.out.printf("The result is: %d", result);
    }
}
