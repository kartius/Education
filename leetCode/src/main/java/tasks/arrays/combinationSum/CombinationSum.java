package tasks.arrays.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
/*
Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
 */

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //all number are positive.
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> part = new ArrayList<>();
        comSum(result, part, 0, 0, candidates, target);
        return result;

    }

    private void comSum(List<List<Integer>> result, List<Integer> part, int index, int sum, int[] candidates, int target) {
        if (sum > target) return;
        if (sum == target) {
            List<Integer> part2return = new ArrayList<>(part);
            result.add(part2return);
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            part.add(candidates[i]);
            comSum(result, part, i, sum + candidates[i], candidates, target);
            part.remove(part.size() - 1);
        }
    }


    //my attempt
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> candidateList;
//        for (int candidate : candidates) {
//            if (target % candidate == 0 ) {
//                candidateList = new ArrayList<>();
//                int temp = candidate;
//                candidateList.add(candidate);
//                while (temp != target) {
//                    candidateList.add(candidate);
//                    temp = temp + candidate;
//                }
//                result.add(candidateList);
//            }
//        }
//        return result;
//    }


    public static void main(String[] args) {
        System.out.println(8 % 2);
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2, 3, 5, 8}, 8));
    }
}
