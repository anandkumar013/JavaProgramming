package colleection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArrayListExample {

    public static void main(String args[]){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("AK");
        list.add(3.0);
        list.add(false);

        System.out.println(list);
        System.out.println(list.size());

        ListIterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Object var : list){
            System.out.println(var);
        }

        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}
