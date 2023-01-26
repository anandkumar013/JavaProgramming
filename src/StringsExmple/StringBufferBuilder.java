package StringsExmple;

public class StringBufferBuilder {
    public  static void main(String args[]) {
        System.out.println("Test java");

        //String vs string buffer
        /*
        . Objects of type String are immutable . String buffer is used to represent values that can be modified
        . In situation where values are modified a number of times , String buffer yield significant performance result
        . Both String and StringBuffer are threadsafe
        . StringBuffer is implemented by using synchronised keywords on all methods
         */

        //String builder vs String Buffer
        /*
        String builder is not thread safe . so it performs better in situation where thread safety is not required
         */


    }
}
