package gr.aueb.cf.ch7;

/**
 * Traverses one by one all string chars.
 */
public class StrTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " "); //κενό ανάμεσα στους χαρακτήρες του στρινγκ
        }

        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--) {

        }
    }
}
