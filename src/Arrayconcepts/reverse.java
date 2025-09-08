package Arrayconcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

class simple {
    public int[] reverse(int[] val) {
        int i = 0;
        int j = val.length - 1;

        while (i <= j) {
            int temp = val[i];
            val[i] = val[j];
            val[j] = temp;
            i++;
            j--;
        }
        return val;

    }
}

public class reverse {
    public static void main(String[] args) {
        simple s= new simple();
        int[] input= {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(s.reverse(input)));
    }
}
