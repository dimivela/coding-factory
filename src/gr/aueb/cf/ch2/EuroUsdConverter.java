package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This is a demo for Euro to USD
 * conversion.
 */
public class EuroUsdConverter {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        int euro = 0;
        int usdollars = 0;
        int uscents = 0;
        final int exg = 99;
        Scanner ineuro = new Scanner(System.in);


        //Εντολές
        System.out.printf("Please, insert the amount of euros you want to convert to US currency: ");
        euro = ineuro.nextInt();
        usdollars = euro * exg / 100;
        uscents = euro * exg % 100;

        //Εκτύπωση
        System.out.printf("The amount of %d euros will be %d USD and %d cents.", euro, usdollars, uscents);

        //Pay attention to the use of mod (%) in order to find the amount of cents. That is because it gives us the numbers after the decimals.
    }
}
