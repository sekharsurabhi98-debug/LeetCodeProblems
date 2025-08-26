/* 
209. Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
*/
// Brute Force Approach TC: O(n^2)
int minSubArrayLen(int target, int[] nums) {
    int n = nums.length;
    int minLen = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            sum += nums[j];
            if (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                break; // No need to extend this subarray further
            }
        }
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
}
//Optimized Sliding Window TC : O(N)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, r = 0, l = 0, minLength = Integer.MAX_VALUE;
        while(r < nums.length){
            sum += nums[r];
            while(sum >= target){
                if(minLength > r - l + 1){
                    minLength = r - l + 1;
                }
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
