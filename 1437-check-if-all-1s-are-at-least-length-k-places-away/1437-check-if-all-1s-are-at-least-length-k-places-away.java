class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int zeroCount = 0;
        int lastOneIdx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1 && lastOneIdx != -1){
                if(i - lastOneIdx - 1 < k) return false;
                
            }
            if(nums[i] == 1) lastOneIdx = i;
        }
        return true;
        
    }
}