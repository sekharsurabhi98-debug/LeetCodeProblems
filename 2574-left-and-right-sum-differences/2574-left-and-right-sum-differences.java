class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int rsum = 0;
            int lsum = 0;
            for(int r = 0; r < i; r++){
                rsum += nums[r];
            }
            for(int l = i+1; l < nums.length; l++){
                lsum += nums[l];
            }
            res[i] = Math.abs(rsum - lsum);
        }
        return res;
    }
}