/**
 * Problem Link : https://leetcode.com/problems/majority-element/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int majorityElement(int[] nums) {
         int n = nums.length;
        int candidate=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==candidate){
                count1++;
            }
        }
        if(count1>nums.length/2){
            return candidate;
        }
        return -1;
        
        
    }
}
