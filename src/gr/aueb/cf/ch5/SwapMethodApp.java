package gr.aueb.cf.ch5;

public class SwapMethodApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a=%d, b=%d\n", a, b);

        swap(a, b);

        System.out.printf("a=%d, b=%d", a, b);
    }

    /**
     * Mutually exchanges the values of
     * the two input variables.
     * @param a     the first inout
     * @param a     the second input
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
