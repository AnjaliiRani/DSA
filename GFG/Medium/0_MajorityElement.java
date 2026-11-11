/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int majorityElement(int arr[]) {
        int n = arr.length;
        int candidate=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==candidate){
                count1++;
            }
        }
        if(count1>arr.length/2){
            return candidate;
        }
        return -1;
        
      
        
    }
}
