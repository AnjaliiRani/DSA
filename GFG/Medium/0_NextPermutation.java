/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/next-permutation5226/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    void nextPermutation(int[] arr) {
        
                int n = arr.length;

                // Step 1: Find the pivot
                int i = n - 2;

                while (i >= 0 && arr[i] >= arr[i + 1]) {
                    i--;
                }

                // Step 2: Find the next greater element
                if (i >= 0) {
                    int j = n - 1;

                    while (arr[j] <= arr[i]) {
                        j--;
                    }

                    // Step 3: Swap pivot and next greater element
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                // Step 4: Reverse the remaining elements
                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
            }
        }

        
        
    
