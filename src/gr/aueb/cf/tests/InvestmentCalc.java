package gr.aueb.cf.tests;

import java.util.Scanner;

public class InvestmentCalc {

    public static void main(String[] args) {
        int months;
        final double INTEREST = 0.02125;
        double monthlyDeposit;
        double monthlySavings = 0.0;
        int totalSavings = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter you expected monthly deposit: ");
        monthlyDeposit = in.nextDouble();

        System.out.println("Please, enter the number of months\nyou want the interest rate to be applied: ");
        months = in.nextInt();

        for (int i = 1; i <= months; i++) {
            monthlySavings = (monthlySavings + monthlyDeposit) * (1.0 + INTEREST);

        }

        totalSavings = (int) monthlySavings;

        System.out.println("The total amount of savings, after " + months + " months \nwith an interest rate of " + INTEREST*100 + "%, will be " + totalSavings + " Euros.");

    }
}
