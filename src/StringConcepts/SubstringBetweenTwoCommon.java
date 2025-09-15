package StringConcepts;

import java.util.HashMap;
import java.util.Map;

public class SubstringBetweenTwoCommon {
    public static void main(String[] args) {
        String s = "aa";

        //char[] c= s.toCharArray();
        // SubstringBetweenTwoCommon val= new SubstringBetweenTwoCommon();
        System.out.println(findmax(s));
    }

    public static int findmax(String s) {
        int max=-1;
        Map<Character,Integer> res=new HashMap<>();
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(!res.containsKey(ch)){
              res.put(ch,i);
          }
          else {
              int len = i- res.get(ch)-1;
              max=Math.max(max,len);
          }
      }
        return max;


    }
}