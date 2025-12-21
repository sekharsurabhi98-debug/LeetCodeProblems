class NumArray {
    int nums[];
    public NumArray(int[] nums) {
        for(int i = 1; i < nums.length; i++)
             nums[i] = nums[i] + nums[i-1];
        this.nums = nums;
    }
    
    public int sumRange(int l, int r) {
        if(l == 0)
           return nums[r];
        return nums[r] - nums[l - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */