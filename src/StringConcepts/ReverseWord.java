package StringConcepts;

class Solution{
    public String reverseWords(String s) {
        String[]  chars= s.trim().split("\\s+");
         int left= 0 ;
        int right=chars.length-1;
        while(left<right){
            String temp = chars[left];
                chars[left] = chars[right];
            chars[right]= temp;
            left++;
            right--;

        }
        return String.join(" ",chars);
    }
}
public class ReverseWord {
    public static void main(String[] args) {
        Solution sol= new Solution();
        String s ="Learning is My Hobby";
        System.out.println(sol.reverseWords(s));

    }
}
