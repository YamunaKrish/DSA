package Arrayconcepts;
class Miss{
    public int missing(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] != i){
                    return i;
                }
            }
        }
        return 0;
    }
}
public class missingno {
    public static void main(String[] args) {
        Miss m= new Miss();
        int[] val= {3,1,0};
        System.out.println(m.missing(val));

     }
}
