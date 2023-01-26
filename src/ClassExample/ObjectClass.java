package ClassExample;

public class ObjectClass {

    public static void main(String args[]){
         String  str = "Testing";
        System.out.println(str.toString());
        System.out.println(str.hashCode());
      //  System.out.println(str.clone());

        if(str instanceof  Object){
            System.out.println("I extend Object ");
        }

    }
}
