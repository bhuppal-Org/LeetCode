import java.util.*;

public class BigO {
    public static int search(int[] x,int target) {
        int result = -1;
        for(int i=0; i< x.length;i++){
            if(x[i] == target) {
                return target;
            }
        }
        //Not found
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        int result = search(nums, 5);
        System.out.println("The value is: " + result);
    }
}
