package tasks.twoSum2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum2 {

    /*
    Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

     */

    public int[] twoSum(int[] nums, int t) {
// fast solution
        int len = nums.length;
        int i = 0, j = len - 1;
        while(i < j) {
            if (nums[i] + nums[j] > t) j--;
            else if (nums[i] + nums[j] < t) i++;
            else return new int[]{i+1,j+1};
        }
        return new int[2];


// solution almost the same as for two sum task
//        int[] result = new int[2];
//        Map<Integer, Integer> map = new LinkedHashMap();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
//                result[0] = i+1;
//                result[1] = map.get(target - nums[i])+1;
//                return result;
//            }
//
//        }
//        return result;
    }
}
