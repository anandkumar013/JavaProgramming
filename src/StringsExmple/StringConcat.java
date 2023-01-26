package StringsExmple;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class StringConcat {
    public  static void main(String args[]) {
        System.out.println("Test java");

        String s3 = "value1";
        String s4 = "value2";
        System.out.println(java.time.LocalDateTime.now());

        for(int i = 0 ; i < 10000 ; i++){
            s3 = s3 + s4;
        }
        System.out.println(java.time.LocalDateTime.now());




        StringBuffer sb1 = new StringBuffer("Value1");
        String sb2 = "Value2";
        System.out.println(java.time.LocalDateTime.now());

        for(int i = 0 ; i < 10000 ; i++){
            sb2 = sb1 + sb2;
        }
        System.out.println(java.time.LocalDateTime.now());

    }
}
