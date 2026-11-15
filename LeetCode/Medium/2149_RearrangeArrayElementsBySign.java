/**
 * Problem Link : https://leetcode.com/problems/rearrange-array-elements-by-sign/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */


class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }
        
        // Place elements alternately
        int k = 0;
        
        for (int i = 0; i < pos.size(); i++) {
            nums[k++] = pos.get(i);
            nums[k++] = neg.get(i);
        }
        
        return nums;
    }
}

