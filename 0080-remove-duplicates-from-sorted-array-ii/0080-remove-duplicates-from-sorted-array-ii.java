class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int k = 0; k < nums.length; k++){
            if(i < 2 || (nums[i - 1] != nums[k] || nums[i - 2] != nums[k])){
                nums[i] = nums[k];
                i++;
            }
        }
        return i;
    }
}