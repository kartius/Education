package tasks.arrays.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */

//    public int majorityElement(int[] nums) {
//        if (nums.length == 0) return -1;
//
//        int maj = nums[0];
//        int count = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != maj) count--;
//            else count++;
//
//            if (count < 0) {
//                maj = nums[i];
//                count = 1;
//            }
//        }
//
//        return maj;
//
//    }


    //My solution
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap(nums.length);
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
