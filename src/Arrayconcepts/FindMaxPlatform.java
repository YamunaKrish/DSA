package Arrayconcepts;

public class FindMaxPlatform {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(check(arr, dep));
    }

    public static int check(int[] arr, int[] dep) {
        int platform = 1;
        int result =0;

        int i=1;
        int j=0;

        while (i<arr.length && j<arr.length) {
            if (arr[i] >= dep[j]) {
                platform--;
                j++;
            } else {
                platform++;
                i++;


            }
            if(result<platform){
                result=platform;
            }
        }
        return result;
    }
}





