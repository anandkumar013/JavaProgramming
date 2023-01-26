package StringsExmple;

public class StringLiterals {
    public  static void main(String args[]) {
        System.out.printf("Test java");

        String str1 = "Anand";
        // This value stored in "String constant pool" - which is inside the heap memory
        //  if compile finds a String literal , it checks if it exists, it is reused

        String str2 = "Anand";
        //Str2 is created - the existing value from string constant pool is reused .

    }
}
