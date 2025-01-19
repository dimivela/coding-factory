package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints the multiplication of
 * an integer that the user provided
 * with the integers from 1 till 10.
 */
public class MultiplicartionTable {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int  mul = 1;

        System.out.print("Please, provide an integer: ");
        num = inputNum.nextInt();

        while (i <= 10){
            mul = num * i;
            System.out.printf("The multiplication of %d * %2d = %2d", num, i, mul);
            i++;
        }
    }
}
