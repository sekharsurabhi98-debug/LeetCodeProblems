class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int prefix = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int v : nums){
           prefix += v;
           maxSum = Math.max(maxSum, prefix);
           if(prefix < 0)
              prefix = 0;
        }
        int minSum = Integer.MAX_VALUE;
        prefix = 0;
        for(int v : nums){
            prefix += v;
            minSum = Math.min(minSum, prefix);
            if(prefix > 0)
               prefix = 0;
        }
        minSum = Math.abs(minSum);
        System.out.println(minSum+":"+maxSum);
        return (minSum < maxSum) ? maxSum : minSum;
    }
}