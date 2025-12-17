class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean found = false;
        int idx1 = 0;
        int idx2 = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    idx1 = i;
                    idx2 = j;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return new int[]{idx1+1, idx2+1};
    }
}