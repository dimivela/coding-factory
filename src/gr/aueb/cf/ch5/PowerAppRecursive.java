package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {
        int a = 2;
        int n = 6;
        int result = 0;

        result = power(a, n);

        System.out.println("2^6 is " + result);

    }

    /**
     * Recursive version of power app.
     *
     * @param a     the base
     * @param n     the power
     * @return      the base raised to the power.
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return power(a, n-1) * a;

//      return (n == 0) ? 1L : power(a,n-1) * a;
    }
}
