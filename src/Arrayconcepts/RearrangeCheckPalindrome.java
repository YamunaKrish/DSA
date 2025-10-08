package Arrayconcepts;

import java.util.HashMap;
import java.util.Map;

public class RearrangeCheckPalindrome {
    public static void main(String[] args) {
    String s="bangalore";
        System.out.println(check(s));
    }
    public static boolean check(String s){
        Map<Character,Integer> ch=new HashMap<>();
      int oddcount =0;

        for(char fin:s.toCharArray()){
            if(!ch.containsKey(fin)){
                ch.put(fin,1);
            }
else{
    ch.put(fin,ch.get(fin)+1);
            }
        }

        for(Map.Entry<Character,Integer> count:ch.entrySet()){
            if(count.getValue() % 2 != 0){
                oddcount++;
            }
            if(oddcount > 1){
                return false;
            }
        }


        return true ;
    }
}
