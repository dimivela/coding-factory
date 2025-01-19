package gr.aueb.cf.ch4;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.printf("Please, enter a number: ");
        num = scanner.nextInt();

//        if (num >= 0)abs = num;
//        else abs = -num;

        //Ternary Operator
        abs = (num >= 0 ) ? num : -num;

        System.out.println("Absolute value: " + abs);
    }
}
