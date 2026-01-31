//Jonathan Sonnek
//January 30, 2026
//ASCII APP

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//      Find Random number between 1 and 255
        int x = ((int) (Math.random() * 255 + 1));
        System.out.println("Random number: " + x);

//      Convert to Binary
        String b = Integer.toBinaryString(x);
        System.out.println("Number in binary:" + b);

//      Convert to Hexadecimal
        String h;
        h = Integer.toHexString(x).toUpperCase();
        System.out.println("Number in hexadecimal: " + h);

//      Convert to ASCII Character
        char a = (char) x;
        System.out.println("Corresponding  ASCII character: " + a);
    }
}