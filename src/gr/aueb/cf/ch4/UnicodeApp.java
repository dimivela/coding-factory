package gr.aueb.cf.ch4;

/**
 * Demo of surrogate pairs
 */
public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600;

        System.out.println("Smile: \uD83D\uDE03");
        System.out.println("Smile: ");
        System.out.println(Character.toChars(codePoint));
    }
}