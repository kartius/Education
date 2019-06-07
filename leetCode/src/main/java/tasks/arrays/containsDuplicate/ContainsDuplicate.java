package tasks.arrays.containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }


    //My solution  O(n \log n)O(nlogn)
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int i = 0;
//        for (int j = 1; j < nums.length; j++) {
//            if (nums[i] == nums[j]) {
//                return true;
//            } else {
//                nums[i] = nums[j];
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 6});

    }
}
