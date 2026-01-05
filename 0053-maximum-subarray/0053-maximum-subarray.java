class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = Integer.MIN_VALUE;
      
       int prefix = 0;
       for(int num : nums){
           
           prefix += num;
           maxSum = Math.max(maxSum, prefix);
           if(prefix < 0) prefix = 0;
       }
       return maxSum;
    }
}