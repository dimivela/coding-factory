package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");
        int positionofSecondo = cf.indexOf("o", 2); //αρχίζει να ψάχνει από το 2ο χαρακτήρα και μετά
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(0); // "Coding Factory"
        String cf3 = cf.substring(1); // "oding Factory"
        String slice = cf.substring(1, 3); // "od" (beginIndex, endIndex - 1)
    }
}
