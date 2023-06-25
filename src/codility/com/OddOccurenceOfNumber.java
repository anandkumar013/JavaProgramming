package codility.com;

import java.util.Arrays;

public class OddOccurenceOfNumber {

    public static void main(String args[]){
        int [] array1  = {9,3,9,3,7,9,7};
        System.out.println(oddOccurence(array1));
    }

    private static int oddOccurence(int[] array) {
        int OddOccurenceNumber=0;
        for(int i=0 ; i<array.length ;i++){
            int numberExists=0;
            int number = array[i];
            for(int j=0 ; j<array.length;j++){
                if(number==array[j]){
                    numberExists++;
                }
            }
            if(numberExists<2){
                OddOccurenceNumber=number;
            }
        }
            return OddOccurenceNumber;
        }

}
