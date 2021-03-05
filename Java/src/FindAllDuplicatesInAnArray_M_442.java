//https://leetcode.com/problems/find-all-duplicates-in-an-array/
/*
442. Find All Duplicates in an Array
Medium

Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
 */

import java.util.*;

public class FindAllDuplicatesInAnArray_M_442 {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultAppearTwice = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
         int next = Math.abs(nums[i]) - 1;
         if(nums[next] < 0) resultAppearTwice.add(next+1);
         nums[next] = -nums[next];
          //   System.out.println(Arrays.toString(nums));
        }
        //System.out.println(Arrays.toString(nums));
        //System.out.println(resultAppearTwice);
        return resultAppearTwice;
    }

    public static void main(String[] args) {
      int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
      System.out.println(findDuplicates(nums));
    }
}
