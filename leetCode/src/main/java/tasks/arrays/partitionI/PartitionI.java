package tasks.arrays.partitionI;

import java.util.Arrays;

public class PartitionI {


    /*Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
*/


    public int arrayPairSum(int[] nums) {
        int res = 0;
        int j;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            res += min(nums[i], nums[j]);
            i++;
            j = +2;
        }
        return res;
    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }


    public static void main(String[] args) {
        PartitionI partitionI = new PartitionI();
        System.out.println(partitionI.arrayPairSum(new int[]{3, 5, 1, 9, 7, 11}));
    }
}
