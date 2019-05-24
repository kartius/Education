package tasks.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i])!=i) {
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

