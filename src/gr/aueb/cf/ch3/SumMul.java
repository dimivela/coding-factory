package gr.aueb.cf.ch3;

import java.util.Locale;

/**
 * Calculate the sum and mul of
 * first 10 digits.
 */
public class SumMul {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10){
            sum += i;
            i++;
        }

        while (j <= 10){
            mul *= j;
            j++;
        }

        System.out.println(sum);
        System.out.println(mul);
    }
}
