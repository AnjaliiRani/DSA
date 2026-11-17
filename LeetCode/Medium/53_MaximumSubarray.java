/**
 * Problem Link : https://leetcode.com/problems/maximum-subarray/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int maxSubArray(int[] nums) {
int n = nums.length;
int sum=0;
int maxsum=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
    sum=sum+nums[i];
    maxsum= Math.max(maxsum,sum);

    if(sum<0){
        sum=0;
    }

}
return maxsum;
    }}
        
    
