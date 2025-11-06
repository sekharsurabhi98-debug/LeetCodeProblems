class Solution {
    public int rob(int[] nums) {
        //traverse even in even positions
        int evenSum = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            evenSum += nums[i];
        }
        int oddSum = 0;
        for(int i = 1; i < nums.length; i = i + 2)
            oddSum += nums[i];
        return (oddSum > evenSum)  ? oddSum : evenSum;
    }
}