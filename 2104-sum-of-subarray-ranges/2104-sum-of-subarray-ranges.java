class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            int min = nums[i];
            int max = nums[i];
            for(int j = i+1; j < nums.length; j++){
                min = (min > nums[j]) ? nums[j] : min;
                max = (max < nums[j]) ? nums[j] : max;
                sum += max - min;
            }
            
        }
        return sum;
    }
}