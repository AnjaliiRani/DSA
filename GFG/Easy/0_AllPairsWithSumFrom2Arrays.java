/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    public ArrayList<ArrayList<Integer>> allPairs(int target, int arr1[], int arr2[]) {
        
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j= arr2.length-1;
        while(i<arr1.length && j>=0){
            
            int sum= arr1[i]+arr2[j];
            if(sum==target){
                int u = arr1[i];
                int v= arr2[j];
                
                int count1=0;
                int count2=0;
            
            while(i<arr1.length && arr1[i]==u){
                count1++;
                i++;
            }
            while(j>=0 && arr2[j]==v){
                
                count2++;
                j--;
            }
            int count = count1*count2;
            for(int k=0;k<count;k++){
                 ArrayList<Integer>pair=new ArrayList<>();
                 pair.add(u);
                 pair.add(v);
                  
                  result.add(pair);
            }
            
        }
    
    else if(sum<target){
        i++;
    }
    else{
        j--;
    }
        
 }
    return result;
        
    }
}
