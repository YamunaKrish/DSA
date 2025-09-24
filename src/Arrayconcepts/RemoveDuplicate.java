package Arrayconcepts;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] val= {0,1,1,2,2,3,3,3};
        System.out.println(remove(val));
    }
    public static int remove( int[] nums) {
      int count=0;
      for(int i=1;i<nums.length;i++){
          if(nums[count] != nums[i]){
              count++;
              nums[count]= nums[i];
          }

      }
  return count;
      }

}
