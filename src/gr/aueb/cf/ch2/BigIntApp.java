package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Demo της κλάσσης BigInteger
 */

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("123456789123456789"); //Παρατήρησε το import στην αρχή του package
        BigInteger bigNum2 = new BigInteger("987654321987654321");
        BigInteger result;

        result = bigNum1.add(bigNum2); //ΠΡΟΣΟΧΗ

        System.out.printf("%,d", result);
    }
}