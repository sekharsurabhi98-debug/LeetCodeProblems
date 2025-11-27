class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        int l = 0, r = 0;
        while(r < nums.length){
            
            if(r - l + 1 == 3){
                if((nums[l] + nums[r]) * 2 == nums[l+1]){
                    count++;
                }
                l++;
            }
            r++;
        }
        return count;
    }
}