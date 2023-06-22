package codility.com;

import java.util.Arrays;

public class RotateArray {
    public static void main(String []args){
        int[] intArray = {1,2,3,4,5,6};
        int k=3;
     Arrays.stream(rotateArray(intArray, k)).forEach(System.out::println);
    }
    private static int[] rotateArray(int[] intArray, int k) {
        int[] rotatedArray = null;
        while(k>0) {
             rotatedArray = rotateArrayLastElement(intArray);
             k--;
        }
        return rotatedArray;
    }
    private static int[] rotateArrayLastElement(int[] intArray ) {
         int temp=intArray[intArray.length-1];
         for(int i=intArray.length-1 ; i>0 ; i--){
             intArray[i]=intArray[i-1];
         }
        intArray[0]=temp;
        return intArray;

    }
}
