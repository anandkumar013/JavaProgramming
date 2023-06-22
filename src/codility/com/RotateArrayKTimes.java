package codility.com;

import java.util.Arrays;

public class RotateArrayKTimes {
    public static void main(String args[]) {

        // int[] intArray = {1,2,3,4,5,6};
        int[] intArray = {};
        int k = 1;
        Arrays.stream(rotateArrayByKTimes(intArray, k)).forEach(System.out::println);

    }

    private static int[] rotateArrayByKTimes(int[] A, int K) {

        int length = A.length;
        if (length == 0) return new int[]{ };
        K = K % length;
        int[] resultIntArray = new int[A.length];
        for (int i = 0; i < K; i++) {
            resultIntArray[i] = A[length - K + i];
        }
        for (int p = 0; p < A.length - K; p++) {
            resultIntArray[K + p] = A[p];
        }
        return resultIntArray;
    }

}
