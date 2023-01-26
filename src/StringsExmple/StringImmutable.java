package StringsExmple;

import java.util.SortedMap;

public class StringImmutable {
    public  static void main(String args[]){
        System.out.printf("Test java");

        String str2 = "Anand";
        str2.concat("Kumar");
        System.out.println(str2);

        String concat = str2.concat("Kumar");
        System.out.println(concat);
    }

    // Value of a String  Object once created cannot be modified , Any modification on String object creates a
    // new String object


}
