package Arrayconcepts;

public class SquareElement {
    public static void main(String[] args) {
        int[] val={-4,-1,0,3,10};
       int[] nums= sortedSquares(val);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
    public static  int[] sortedSquares(int[] nums) {

        int[] res=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
               res[i] = nums[right] * nums[right];
               right--;
            }
    else{
        res[i] = nums[left] * nums[left];
        left++;
            }
        }


        return res;
    }
}
