package Arrayconcepts;

public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=2;
        split(nums,k);

    }
    public static void split(int[] num,int k){

        for(int i=0;i<num.length;i +=k){
            for(int j=i;j< i+k && j<num.length;j++){
                System.out.println(num[j]);

            }
            System.out.println(" ");
        }


    }
}
