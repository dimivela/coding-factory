package gr.aueb.cf.ch1;

/**
 * These are doccomments or Javadoc to remember what our code in this class does.
 * E.g. Prints Hello world! in
 * standard output (console).
 *
 * @author ThisIsTheAuthor
 */
public class HelloWorld { //Only one 'public' class is allowed.

    public static void main (String[] args) {
        // This is an implementation comment or line comment.

        /*
         *This is a block comment.
         */
        System.out.println("Hello world!");
        //or
        System.out.print("Hello world!");    //The 'print' without 'ln' (line) doesn't leave a line after the text in the console.
        System.out.println();

    }

}
