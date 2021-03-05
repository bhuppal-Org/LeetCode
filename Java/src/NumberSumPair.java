import java.util.*;

public class NumberSumPair {

    public static int numIdenticalPairs(int[] nums) {
        int[] trackEachValueCount = new int[101];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += trackEachValueCount[nums[i]]; //Very 1st time, 0 then we will increment by 1 with following array value
            trackEachValueCount[nums[i]]++; //Only increament each time if its same array value
        }
        return count;
    }
    public static void main(String[] args) {
      int[] nums = new int[]{1, 2, 3};
      int count = numIdenticalPairs(nums);
      System.out.println(count);
    }
}
