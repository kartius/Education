package tasks.arrays.findtheDuplicateNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindtheDuplicateNumber {
/*
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example 1:

Input: [1,3,4,2,2]
Output: 2
Example 2:

Input: [3,1,3,4,2]
Output: 3
Note:

You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 */

    //my first solution
//    public int findDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return nums[j];
//                }
//            }
//        }
//        return 0;
//    }


    //my second solution
//    public int findDuplicate(int[] nums) {
//        int[] res = new int[nums.length];
//        System.arraycopy(nums, 0, res, 0, nums.length);
//        Arrays.sort(res);
//        for (int i = 0; i < res.length; i++) {
//            if (res[i] == res[i + 1]) {
//                return res[i];
//            }
//        }
//        return 0;
//    }

    //my thirt solution
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        FindtheDuplicateNumber findtheDuplicateNumber = new FindtheDuplicateNumber();
        System.out.println(findtheDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
