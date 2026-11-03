/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
 * Platform     : GFG
 * Difficulty   : Medium
 */



class Solution {
    public int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            int remaining = sum - k;

            if (map.containsKey(remaining)) {

                int len = i - map.get(remaining);

                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
