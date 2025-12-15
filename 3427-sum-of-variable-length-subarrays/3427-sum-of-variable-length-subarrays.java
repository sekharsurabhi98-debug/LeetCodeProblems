class Solution {
    public int subarraySum(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int start = Math.max(0, i - nums[i]);
            int sum = 0;
            while(start <= i){
                 sum += nums[start];
                 start++;
            }
            res += sum;
        }
        return res;
    }
}