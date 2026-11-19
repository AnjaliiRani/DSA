/**
 * Problem Link : https://leetcode.com/problems/longest-consecutive-sequence/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int longestConsecutive(int[] nums) {
    

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set) {

            // Check if num is the starting point
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}
