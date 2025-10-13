package Arrayconcepts;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] val= {0,1,1,2,2,2,3,4,4};
        int count =remove(val);
        System.out.println(count);
        System.out.println();
        for(int i=0;i<count;i++){
            System.out.println(val[i]);
        }
    }
    public static int remove( int[] nums) {




      int count=0;
      for(int i=1;i<nums.length-1;i++){
          if(nums[count] != nums[i]){
              count++;
              nums[count]= nums[i];
          }

      }
  return count+1;
      }

}
