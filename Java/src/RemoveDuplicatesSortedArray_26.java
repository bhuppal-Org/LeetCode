/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
 */
import java.util.*;
public class RemoveDuplicatesSortedArray_26 {
    public static int removeDuplicates(int[] nums) {
      int length = 0;

      return length;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int[] result = new int[nums.length];
        int d = 3;
        int i = 0;
        int currentIndex = 0;
        while(currentIndex < nums.length) {
            result[currentIndex++] = nums[i++];
            result[currentIndex++] = nums[i++];
        }
        System.out.println(Arrays.toString(result));
        }
}
