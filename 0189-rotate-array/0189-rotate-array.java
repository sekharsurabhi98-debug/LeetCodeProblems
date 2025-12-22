class Solution {
    public void rotate(int[] nums, int k) {
        // k = k % nums.length;
        // int l = 0, r = nums.length - 1;
        // while(l < r && r >= 0){

        //     int temp = nums[l];
        //     nums[l] = nums[r];
        //     nums[r] = temp;

        //     l++;
        //     r--;
        // }
        // //reverse the left
        // l = 0; r = k-1 ;
        //  while(l < r){

        //     int temp = nums[l];
        //     nums[l] = nums[r];
        //     nums[r] = temp;

        //     l++;
        //     r--;
        // }
        // //reverse the left part
        // l = k; r = nums.length - 1;
        //  while(l < r){

        //     int temp = nums[l];
        //     nums[l] = nums[r];
        //     nums[r] = temp;

        //     l++;
        //     r--;
        // }

        // k = k % nums.length;
        // int[] temp = new int[nums.length];
        // int idx = 0
        // for(int i = nums.length - k; i < nums.length; i++){
        //     temp[idx++] = nums[i];
        // }
        // for(int i = 0; i < nums.length - k; i++){
        //     temp[idx++] = nums[i];
        // }
        // for(int i = 0; i < nums.length; i++)
        //     nums[i] = temp[i];
        /*
         Best Solution: Time Complexity: O(N)
                        Space Complexity: O(1)
            1. Reverse The array
            2. there reverse the first half by k poititons
            3.reverse the second half by k positionns
        */

        k = k % nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0, k-1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int l, int r){
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}

