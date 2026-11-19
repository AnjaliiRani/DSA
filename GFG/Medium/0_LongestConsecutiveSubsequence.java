/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int longestConsecutive(int[] arr) {
        

                HashSet<Integer> set = new HashSet<>();

                for (int num : arr) {
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
       
        
    
