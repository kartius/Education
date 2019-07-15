package tasks.arrays.combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
 */

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0 || candidates == null) {
            return res;
        }
        Arrays.sort(candidates);
        List<Integer> subset = new ArrayList<>();
        helper(candidates, subset, 0, target, res);
        return res;
    }

    private void helper(int[] clist,
                        List<Integer> subset,
                        int startIndex,
                        int resSum,
                        List<List<Integer>> res) {
        if (resSum == 0) {
            res.add(new ArrayList<Integer>(subset));
        }

        for (int i = startIndex; i < clist.length; i++) {
            if (clist[i] > resSum) {
                break;
            }
            // check duplicates
            if (i != startIndex && clist[i] == clist[i - 1]) {
                continue;
            }
            subset.add(clist[i]);
            helper(clist, subset, i + 1, resSum - clist[i], res);
            subset.remove(subset.size() - 1);
        }
    }


    public static void main(String[] args) {
        CombinationSumII combinationSumII = new CombinationSumII();
        List<List<Integer>> lists = combinationSumII.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }
}
