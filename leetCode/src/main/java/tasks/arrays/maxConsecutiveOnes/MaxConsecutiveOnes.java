package tasks.arrays.maxConsecutiveOnes;

public class MaxConsecutiveOnes {


    public int findMaxConsecutiveOnes(int[] nums) {

        int maxAmount = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxAmount++;
                if (result < maxAmount) {
                    result = maxAmount;
                }
            } else {
                maxAmount = 0;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}
