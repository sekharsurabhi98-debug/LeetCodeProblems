/*
   Max Consecutive Ones III
   PreRequisite : Array , Sliding window and Two pointers
   Approach : Sliding Window
   Time Complexity : O(N)
   Space Complexity: O(1)
   Explanation :
   Take two pointers l and r
   when you encounter 0 increment zerocount. If the zero count is not greater than the given k then calculate the length. If the calculated maxLength.
   if the zero count is greater than the given k. then increment check wether nums[l] == 0. if it is subtract zero count by one and increment l++; at the ende r++
*/
//Solution
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int l = 0, r = 0, zc = 0;
        while(r < nums.length){
            if(nums[r] == 0)
               zc++;
            while(zc > k){
                if(nums[l] == 0)
                   zc--;
                l++;
            }
            maxLength = (maxLength < r - l + 1) ? r - l + 1 : maxLength;
            r++;
        }
        return maxLength;
    }
}
