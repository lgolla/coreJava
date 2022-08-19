package core;

import java.util.Locale;

public class StringTest {

    public static void main(String[] args){
        String s = "Hello Worlds";
        String s1 = new String("Hello");

        System.out.println( s.toLowerCase(Locale.ROOT));
        System.out.println( s.toUpperCase(Locale.CANADA));
        System.out.println( s.codePointAt(1));// returns unicode of 'e'
        System.out.println( (char)101);
        System.out.println(s1.intern());

    }
}
