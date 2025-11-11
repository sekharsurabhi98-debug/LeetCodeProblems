class Solution {
    public int largestInteger(int[] nums, int k) {
        int maxResult = -1;
        if(nums.length == k){
            for(int v:nums){
                if(v > maxResult)
                    maxResult = v;
            }
            return maxResult;
        }
        int[] freq = new int[51];
        for(int i = 0; i <= nums.length - k; i++){
            for(int j = i; j < i+k; j++){
                freq[nums[j]] += 1;
            }
        }
        for(int i : nums){
            if(freq[i] == 1){
                maxResult = Math.max(i, maxResult);
            }
        }
        return maxResult;
    }
}