package Arrayconcepts;
class Subarray {
    public int maxarray(int[] val) {
        int winmax = 0;
        int max = 0;
        for (int i = 0; i < val.length; i++) {
            if(winmax > 0) {
                winmax += val[i];
            }
            else{
                winmax = val[i];
            }
            if(winmax> max) {
            max=winmax;
        }
        }
        return max;
    }
}
public class largesub {
    public static void main(String[] args) {
        Subarray s = new Subarray();
        int[] val = {-2,1,-3,4,6,-1};
       // int k = 3;
        System.out.println(s.maxarray(val));
    }
}
