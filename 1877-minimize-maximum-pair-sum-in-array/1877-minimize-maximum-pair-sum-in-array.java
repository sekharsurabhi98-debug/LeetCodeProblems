class Solution {
    public int minPairSum(int[] nums) {
        int sum[] = new int[nums.length / 2];
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        int maxSum = Integer.MIN_VALUE;
        while(l < r){
             maxSum = Math.max(maxSum, nums[l] + nums[r]);
             l++;
             r--;
        }
        return maxSum;
    }
}