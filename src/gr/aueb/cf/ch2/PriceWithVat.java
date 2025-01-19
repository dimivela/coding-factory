package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with VAT.
 */
public class PriceWithVat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double VAT = 0.24;
        double initialPrice = 0.0;
        double finalPrice = 0.0;

        System.out.printf("Please provide the original price in EUR: ");
        initialPrice = in.nextDouble();
        finalPrice = initialPrice * ( 1 + VAT);

        System.out.println("The price of the product, including the VAT, is " + finalPrice + " EUR");
    }
}
