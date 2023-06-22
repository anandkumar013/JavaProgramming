package vk.test;

public class EmployeeRating {

    public static void main(String []args){
       // int [] workload = {3,7,8, 12, 9, 8, 9, 9, 9, 9, 9, 5, 9, 9, 9, 8 , 5};
        int [] workload ={ 12,6,7,10,1,3,5,12,1,8,4,2,4,11,4};
        int hours=6;
        System.out.println(solve(hours,workload));
    }
    static int solve(int N, int[] workload){
        // Write your code here
        int result = 0;
        int count =0;
        int max = 0;
        for(int i=0 ; i < workload.length; i++){
            if(workload[i]>6){
                count++;
            }else{
                if(max < count)
                max=count;
                count=0;
            }
        }
        return max;
    }
}
