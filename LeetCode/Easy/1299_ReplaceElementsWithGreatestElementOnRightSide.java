/**
 * Problem Link : https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int[] replaceElements(int[] arr) {
        // better approach
        
       int n = arr.length;
       int max=-1;
       for(int i=n-1;i>=0;i--){
        int current = arr[i];
        arr[i]=max;

        max= Math.max(max , current);
       }
       return arr;
}
}
