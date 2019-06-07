package tasks.arrays.containsDuplicateII;

import java.util.Arrays;

public class ContainsDuplicateII {


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int counter = 0;
        int lastNumber = nums[0];
        boolean flag = false;
        Arrays.sort(nums);
        for (int j = 1; j < nums.length; j++) {
            if (lastNumber == nums[j]) {
                counter++;
                if (counter > k) {
                    return false;
                }
            } else {
                nums[i] = nums[j];
                i++;
                flag = true;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        containsDuplicateII.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
    }
}
