package tasks.arrays.sortArrayByParity;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
/*
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.



Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.


Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000

 */
    private List<Integer> oddList = new ArrayList<>();

    public int[] sortArrayByParity(int[] A) {
        int j = 0;
        int[] resArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                resArray[j] = A[i];
                j++;
            } else {
                oddList.add(A[i]);
            }
        }

        for (int i = 0; i < oddList.size(); i++) {
            resArray[j] = oddList.get(i);
            j++;
        }
        return resArray;
    }


    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        for (int i : sortArrayByParity.sortArrayByParity(new int[]{3, 5, 7, 9, 10, 5})) {
            System.out.print(i + ",");
        }
    }
}

