package Searching;
class Binsearch {
    public int binaryser(int[] val, int target) {
        int left = 0;
        int right = val.length - 1;
        while (left <= right) {
        int mid = (left + right) / 2;
        if (val[mid] == target) {
                return mid;
            } else if (val[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return 1;
    }
}
public class binary {
    public static void main(String[] args) {
        int[] num= {10,20,30,40,50,60,70};
        Binsearch b= new Binsearch();
       int  target= 50;
       int  result= b.binaryser(num,target);
        System.out.println(result);


    }
}
