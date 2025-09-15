package Searching;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
      int[] nums={7,7,5,5,7,7};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ch=nums[i];
            if(!res.containsKey(ch)){
                res.put(ch,1);
            }
            else{
                res.put(ch,res.get(ch) +1);
            }

            if( res.get(ch) > nums.length /2){
                return ch;

            }

        }

        return 0;
    }
}
