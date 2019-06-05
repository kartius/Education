package tasks.arrays.removeDuplicatesfromSortedArray;


public class RemoveDuplicatesfromSortedArray {


    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }


    // My solution
//    public int removeDuplicates(int[] nums) {
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int i = 0;
//        for (Integer integer : set) {
//            nums[i] = integer;
//            i++;
//        }
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        return set.size();
//
//    }


    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
        System.out.println(removeDuplicatesfromSortedArray.removeDuplicates(new int[]{1, 1, 2}));
    }

}
