package gr.aueb.cf.tests;

import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean isEven;
        isEven = ((num % 2) == 0);
        System.out.println(isEven);
    }
}
