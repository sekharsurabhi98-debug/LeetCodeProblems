class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
       int l = 0, r = nums.length - 1;
       int maxSum = 0;
       while(l < r){
           maxSum = (maxSum > nums[l] + nums[r]) ? maxSum : nums[l] + nums[r];
           l++;
           r--;
       }
       return maxSum;
    }
}