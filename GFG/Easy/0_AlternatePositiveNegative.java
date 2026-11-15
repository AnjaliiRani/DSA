/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
 * Platform     : GFG
 * Difficulty   : Easy
 */


class Solution {
    void rearrange(ArrayList<Integer> arr) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }

        int i = 0, j = 0, k = 0;

        // Place positive and negative alternately
        while (i < pos.size() && j < neg.size()) {
            arr.set(k++, pos.get(i++));
            arr.set(k++, neg.get(j++));
        }

        // Place remaining positive numbers
        while (i < pos.size()) {
            arr.set(k++, pos.get(i++));
        }

        // Place remaining negative numbers
        while (j < neg.size()) {
            arr.set(k++, neg.get(j++));
        }
    }
}

