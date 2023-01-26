package StringsExmple;

import java.util.Locale;

public class StringUtilityMethods {
    public  static void main(String args[]) {
        System.out.println("Test java");

        String str = "abcdefghijk";
        System.out.println(str.charAt(2));
        System.out.println("ABCDEFGH".length());
        System.out.println("abcdefgh".toString());
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toUpperCase());
        System.out.println(str.chars());
        System.out.println(str.contains("a"));
        System.out.println(str.indexOf("k"));
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(str.substring(4));
        System.out.println(str.toCharArray());
//        System.out.println(str.);
//        System.out.println(str.);
//        System.out.println(str.);
//        System.out.println(str.);
//        System.out.println(str.);


    }
}
