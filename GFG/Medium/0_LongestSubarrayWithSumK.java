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

            // If the entire subarray sum is k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Check if a previous prefix sum exists
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            // Store the prefix sum only if it is not already present
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
