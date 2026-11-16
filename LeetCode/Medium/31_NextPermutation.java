/**
 * Problem Link : https://leetcode.com/problems/next-permutation/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public void nextPermutation(int[] nums) {


        int n = nums.length;

        // Step 1: Find the pivot
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find the next greater element
        if (i >= 0) {
            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap pivot and next greater element
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 4: Reverse the remaining elements
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}

        
    

