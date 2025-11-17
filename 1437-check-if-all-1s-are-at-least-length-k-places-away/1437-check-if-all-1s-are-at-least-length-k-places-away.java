class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int zeroCount = 0;
        boolean first = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1 && i > 0 && first){
                if(zeroCount < k)
                   return false;
                zeroCount = 0;
            }else if(nums[i] == 0){
                zeroCount++;
            }else if(nums[i] == 1 && !first){
                first = true;
                zeroCount = 0;
            }
        }
        return true;
        
    }
}