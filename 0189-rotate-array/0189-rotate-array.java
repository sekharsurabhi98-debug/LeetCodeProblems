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
        k = k % nums.length;
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(nums));
        l = 0;
        r = k - 1;
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(nums));
        l = k;
        r = nums.length - 1;
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(nums));
    }
}

