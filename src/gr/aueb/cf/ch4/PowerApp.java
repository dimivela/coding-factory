package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
//        int power = 10;
        int power = 100;
        int result = 1;

//        for (int i=1; i <= power; i++) {
//            result *= base;
 //       }
        for (int i=1; i <= power; i++) {
        result *= base;
        bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }


        System.out.printf("2 to the power of 10 is: %d", result);
    }
}
