class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int l = 0; l < i; l++){
               leftSum += nums[l];
            }
            for(int r = i; r < nums.length; r++){
               rightSum += nums[r];
            }
            if(Math.abs(leftSum - rightSum) % 2 == 0)
                count++;
        }
        return count;
    }
}