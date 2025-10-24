class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0,l = 0, prod = 1;
        if(k == 1) return 0;
        for(int r = 0; r < nums.length; r++){

            prod = prod * nums[r];
            while(prod >= k){
                if(l < nums.length)
                prod = prod / nums[l];
                else
                break;
                l++;
            }
            count += r - l + 1;
        }
        return (count > 0) ? count : 0;
    }
}