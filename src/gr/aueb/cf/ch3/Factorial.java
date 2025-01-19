package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int fact = 1;
        int i = 1;

        //Εντολές
        System.out.println("Please, insert a number: ");
        inputNum = in.nextInt();

        while (i <= inputNum){
            fact *= i;
            i++;
        }

        //Εκτύπωση
        System.out.println("The factorial of " + inputNum + " is " + fact);
    }
}
