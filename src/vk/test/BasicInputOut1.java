package vk.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BasicInputOut1 {

    public static void main(String args[]) throws FileNotFoundException {
     /*   10
        2 15
.....####......
.....#.........*/


        FileReader fileReader = new FileReader("/Users/ak/JavaProgramming/src/vk/test/input.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {

            int t = Integer.parseInt(scanner.nextLine());
            int i = 0;
            while (i < t) {
                int n = scanner.nextInt(); // Integer.parseInt(scanner.next());
                int m = scanner.nextInt(); // Integer.parseInt(scanner.next());
                scanner.nextLine();

                char[][] matrix = new char[n][m];
                // input
                int j = 0;
                while (j < n){
                    String row = scanner.nextLine();
                    matrix[j] = row.toCharArray();
                    j++;
                }
                // logic
                int result = 0;
                int count=0;
                int max=0;
                 for (int p = 0 ; p < n;p++){
                     for(int q = 0 ; q < m ; q++){
                         if(matrix[p][q]=='.')
                             {
                                 if(max < count)
                                 max=count;
                                 count=0;

                     }else {
                         count++;
                         }
                     }
                 }
                System.out.println(max);

                // post logic
                i++;
            }
        }
    }
}
//.......######....###..##########..........