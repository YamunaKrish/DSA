package Arrayconcepts;

import java.util.HashSet;
import java.util.Set;

class Remove{
    public int[] remove(int[] val){
        Set<Integer> res= new HashSet<>();
        int[] fin=new int[0];
       for(int num : val){
            if(res.contains(num)){
               fin[num] = num;
            }
            res.add(num);
        }
        return fin;
    }
}


public class Sum {
    public static void main(String[] args) {
        int[] val={1,2,2,4,4,1};
        Remove r = new Remove();
        System.out.println(r.remove(val));
    }
}
