package Arrayconcepts;

import java.util.Arrays;

class sample{
    public int[] find(int[] val, int k){

  reverse(val,0,val.length-1);
  reverse(val,0,k-1);
  reverse(val,k,val.length-1);
return val;

    }
    public int[] reverse(int[] val, int start, int end) {
        while (start <= end) {
            int temp = val[start];
            val[start] = val[end];
            val[end] = temp;
            start++;
            end--;
        }
        return val;

    }
}
public class rotate {
    public static void main(String[] args) {
  sample s= new sample();
  int[] input= {1,2,3,4,5,6};  //{4, 5, 6,1,2,3}

        System.out.println(Arrays.toString(s.find(input,0)));
    }
}
