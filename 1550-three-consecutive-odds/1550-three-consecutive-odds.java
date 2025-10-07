class Solution {
    public boolean threeConsecutiveOdds(int[] nums) {
        if(nums.length < 3)
            return false;
        int count = 1;
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] % 2 == 1 && nums[i+1] % 2 == 1 && nums[i+2] % 2 == 1)
                  return true;
        }
        return false;
    }
}