package tasks.arrays.nRepeatedElementinSize2NArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NRepeatedElementinSize2NArray {

    /*
    In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.



Example 1:

Input: [1,2,3,3]
Output: 3
Example 2:

Input: [2,1,2,5,3,2]
Output: 2
Example 3:

Input: [5,1,5,2,5,3,5,4]
Output: 5

Note:

4 <= A.length <= 10000
0 <= A[i] < 10000
A.length is even
     */


    // My solution
//    public int repeatedNTimes(int[] A) {
//        Arrays.sort(A);
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == A[i + 1]) {
//                return A[i];
//            }
//        }
//        return 0;
//    }


    // solution faster but uses more memory
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])){
                return A[i];
            }else{
                set.add(A[i]);
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        NRepeatedElementinSize2NArray nRepeatedElement = new NRepeatedElementinSize2NArray();
        System.out.println(nRepeatedElement.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4, 5}));

    }
}
