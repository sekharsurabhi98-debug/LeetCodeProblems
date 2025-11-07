class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = Integer.MIN_VALUE;
       int prefix = 0;
       for(int v : nums){
           prefix += v;
           maxSum = Math.max(maxSum, prefix);
           if(prefix < 0)
             prefix = 0;
       }
       return maxSum;
    }
}