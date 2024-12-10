package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user types a number
 * and the program adds all the even
 * numbers till that one.
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int i = 2;
        boolean isEven = false;

        System.out.printf("Please, provide a number: ");
        num = inputNum.nextInt();

        while (i <= num){
            sum += i;
            i += 2;
        }

        System.out.printf("The sum of all even numbers smaller than %d is: %d", num, sum);
    }
}
