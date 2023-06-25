package codility.com;

import java.util.HashMap;
import java.util.Set;

public class OddOccurrenceHashMap {

    public static void main(String args[]){
        int[] intArray = {9,1,1,3,7,3,9};
        System.out.println(oddOccrenceNumberHashMap(intArray));
    }

    private static int oddOccrenceNumberHashMap(int[] intArray) {
        int oddOccurence = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<intArray.length;i++){
            if(hashMap.containsKey(intArray[i])){
                hashMap.put(intArray[i],hashMap.get(intArray[i])+1);
            }else {
                hashMap.put(intArray[i],1);
            }
        }

        Set keySet = hashMap.keySet();

        for(Object currentKey : keySet) {
            int occurrences = hashMap.get(currentKey);

            //if occurs odd number of times, we found the unpaired value - no need to continue checking
            if(occurrences % 2 != 0) return (int) currentKey;
        }



//        for (Map.Entry<Integer, Integer> mapElement : hashMap.entrySet()) {
//            if (mapElement.getValue() < 2 )
//            oddOccurence = mapElement.getKey();
//        }

        return oddOccurence;
    }

}
