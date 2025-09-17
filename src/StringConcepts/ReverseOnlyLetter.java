package StringConcepts;

public class ReverseOnlyLetter {
    public static void main(String[] args) {
        String s="ab-cd";
        System.out.println(ReverseOnlyLetters(s));

    }
    public static String ReverseOnlyLetters(String s) {
        // TODO: Implement your logic here
        char[] chars=s.toCharArray();
        int start=0;
        int end=chars.length-1;
        while(start<end){
            if(!Character.isLetter(chars[start])){
                start++;
            }
            else if(!Character.isLetter(chars[end])){
                end--;
            }
            else{
                char temp = chars[start];
                chars[start]= chars[end];
                chars[end] = temp;
                start++;
                end--;
            }

        }
        return new String(chars);
    }
}
