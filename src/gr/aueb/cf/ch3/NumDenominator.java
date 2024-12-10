package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


        while (true){
            System.out.println("Please, type a numerator (Quit with numerator is 0): ");
            numerator = inputNum.nextInt();



            if (numerator == 0){
                System.out.println("Numenator is zero. Quiting...");
                break;
            }

            System.out.println("Please, type a denominator: ");
            denominator = inputNum.nextInt();

            if (denominator == 0){
                System.out.println("Denominator must not be zero!");
                continue;
            }

            result = numerator / denominator;
            System.out.println("The division is " + result);
        }
    }
}
