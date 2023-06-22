package colleection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public  static void main(String[] args){

        HashSet<String> set = new HashSet<String>();
        set.add("aa");
        set.add("wc");
        set.add("bb");
        set.add("aa");

        System.out.println(set);
        System.out.println(set.size());

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println( itr.next());
        }

        for(Object var: set){
            System.out.println(var);
        }

        Object[] array = set.toArray();
        System.out.println("set to array");
        for(int i=0 ; i < array.length ; i++){
           Object obj=  array[i];
            System.out.println(obj);
        }
    }
}
