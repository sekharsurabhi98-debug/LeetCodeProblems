class Solution {
    public long getDescentPeriods(int[] nums) {
        long count = 1;
        int l = 0, r = 1;
        while(r < nums.length){
            
            while(l < r && nums[r]+1 != nums[r-1]){
                l++;
            }
            
     
            count += r - l + 1;
            r++;
        }
        return count;
    }
}