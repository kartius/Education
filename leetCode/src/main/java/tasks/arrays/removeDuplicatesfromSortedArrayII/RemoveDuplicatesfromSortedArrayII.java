package tasks.arrays.removeDuplicatesfromSortedArrayII;

public class RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int lastNumber = nums[0];
        //slow pointer
        int i = 1;
        //fast pointer
        int j = 1;
        //current length of duplicates before fast pointer
        int length = 1;
        while (j < nums.length) {
            if (lastNumber == nums[j]) {
                if (length < 2) {
                    length++;
                    nums[i] = nums[j];
                    i++;
                    j++;
                } else {
                    length++;
                    j++;
                }
            } else {
                length = 1;
                lastNumber = nums[j];
                nums[i] = nums[j];
                i++;
                j++;
            }

        }
        return i;
    }


    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII removeDuplicatesfromSortedArrayII = new RemoveDuplicatesfromSortedArrayII();
        removeDuplicatesfromSortedArrayII.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 4});

    }
}
