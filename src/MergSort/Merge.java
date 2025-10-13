package MergSort;

import java.util.HashMap;
import java.util.Map;

public class Merge {
    public static void main(String[] args) {
        Map<Integer,Integer> arr1= new HashMap<>();
        arr1.put(1,5);
        arr1.put(2,10);
        arr1.put(4,15);
        arr1.put(5,5);

        Map<Integer,Integer> arr2= new HashMap<>();
        arr2.put(1,5);
        arr2.put(2,10);
        arr2.put(3,15);
        arr2.put(5,5);

        System.out.println(merge(arr1,arr2));

    }
    public  static Map<Integer,Integer> merge(Map<Integer,Integer> arr1,Map<Integer,Integer> arr2) {

        Map<Integer, Integer> merge = new HashMap<>();


        for(Map.Entry<Integer,Integer> res: arr1.entrySet()){
            merge.put(res.getKey(),res.getValue());
            }

            for(Map.Entry<Integer,Integer> res1: arr2.entrySet()){
                if(merge.containsKey(res1.getKey())){
                    merge.put(res1.getKey(),merge.get(res1.getKey()) + res1.getValue());
                }
                else{
                    merge.put(res1.getKey(), res1.getValue());
                }
            }


        return merge;
    }


}
