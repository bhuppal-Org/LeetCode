import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <=1) return 1;
        int index = 1;
        for (int i=0; i<nums.length-1; i++)
            if (nums[i] != nums[i + 1]) {
                System.out.println(index + "--" + i + "---"+ nums[i]);
                nums[index++] = nums[i + 1];
            }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,3};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
