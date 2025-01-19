package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων
 * με τη χρήση μεθόδων.
 */
public class AddMethodApp {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please, enter two integers:");
        a = inputA.nextInt();
        b = inputB.nextInt();

        sum = add(a,b); //Αν θέλω να καλέσω τη μέθοδο εκτός της κλάσσης
                        //τότε πρέπει να το κάνω ως AddMethodApp.add(a,b)
        sub = sub(a,b);

        System.out.println("Sum: " + sum + " Sub: " + sub);
    }


    /**
     * Adds two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int add(int a, int b){
        int result = 0;

        result = a + b;

        return result;
    }

    /**
     * Subtracts one integer from another
     * @param a the first integer
     * @param b the second integer
     * @return the subtraction  a - b
     */
    public static int sub(int a, int b){
        return a - b;
    }
}
