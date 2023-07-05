package codility.com;

public class FrogJump {
    public static void main(String args[]){
        int x=10;
        int y=85;
        int d=30;
        System.out.println(miniumFrogJump(x,y,d));
    }

    private static int miniumFrogJump(int x, int y, int d) {

        int sum=10;
        int count=0;
        while(sum < y){
            sum +=d;
            count++;
        }
        return count;
    }

}
