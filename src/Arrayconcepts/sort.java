package Arrayconcepts;

import java.util.Arrays;

class lower{
    public  static void getlower(int[] arr){
        for(int i=0;i<arr.length;i++){
            for( int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                   int temp=arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1]= temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        }

    }


public class sort {
    public static void main(String[] args) {
        int[] arr= {5,7,2,1,1,7,5,4};
        lower l=new lower();
         l.getlower(arr);
        System.out.println(Arrays.toString(arr));

    }
}
