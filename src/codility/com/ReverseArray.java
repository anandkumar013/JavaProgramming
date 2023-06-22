package codility.com;

import java.util.Arrays;

public class ReverseArray {

    public  static void main(String[] args){
        String [] stringsArray = {"ak","bk","ck","dk"};
        Arrays.stream(reverseArrya(stringsArray)).forEach(System.out::println);
    }

    private static String[] reverseArrya(String[] stringsArray) {
        int length = stringsArray.length;
        int k=0;
        for(int i=0 ; i<length/2; i++){
            k=length-i-1;
            String temp = stringsArray[i];
            stringsArray[i]=stringsArray[k];
            stringsArray[k] = temp;
        }
        return stringsArray;
    }
}
