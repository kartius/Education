package tasks.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

/*

    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

            Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
            return [0, 1].

 */

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] source = {3, 3};
        System.out.println(twoSum.twoSum(source, 6));
    }
}

