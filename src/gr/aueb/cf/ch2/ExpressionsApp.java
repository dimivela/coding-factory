package gr.aueb.cf.ch2;

/**
 * Expressions demo
 */

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 20;
        int sum = 0, mul = 0;
        int sub = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0, result2 = 0;


        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        result1 = num1++; //πρώτα εκχώρηση και μετά αύξηση: num1 = 8, result1 = 8, num1 = 9
        result2 = ++num2; //πρώτα αύξηση και μετά εκχώρηση: num1 = 8, result1 = 9, num1 = 9

        num1++; //Same as num1 += 1;
        --num2;


        System.out.println(result1);

    }
}

