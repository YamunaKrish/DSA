package StringConcepts;

import java.util.HashMap;
import java.util.Map;

class Matching {
    public void findmatch() {

        Map<Character, Integer> match = new HashMap<>();
        match.put('I', 1);
        match.put('V', 5);
        match.put('X', 10);
        match.put('L', 50);
        match.put('C', 100);
        match.put('D', 500);
        match.put('M', 1000);

        for(Map.Entry<Character,Integer> result : match.entrySet()){
            System.out.println(result.getKey() +" : " + result.getValue());
        }

        //System.out.println(match);
    }
}

    public class First {
        public static void main(String[] args) {
            Matching m = new Matching();
            m.findmatch();

        }
    }


