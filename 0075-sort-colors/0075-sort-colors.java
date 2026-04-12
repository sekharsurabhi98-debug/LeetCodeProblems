class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        // int l = 0;
        // int r = nums.length - 1;
        // int i = 0;
        // while(i <= r){
        //     if(nums[i] == 0){
        //         swap(i,l,nums);
        //         l++;
        //         i++;
        //     }
        //     else if(nums[i] == 1)
        //          i++;
        //     else if(nums[i] == 2){
        //         swap(i,r,nums);
        //         r--;
        //     }
        // }
        // int zc = 0;
        // int oc = 0;
        // int tc = 0;
        // for(int v :nums){
        //     if(v == 0) zc++;
        //     else if(v == 1) oc++;
        //     else tc++;
        // }
        
        // for(int i = 0; i < zc; i++)
        //    nums[i] = 0;
        // for(int i = zc; i < zc+oc; i++)
        //    nums[i] = 1;
        // for(int i = zc+oc; i < zc+oc+tc; i++)
        //    nums[i] = 2;


        int l = 0, r = nums.length - 1,mid = 0;
        while(mid <= r){
            if(nums[mid] == 0){
                swap(mid,l,nums);
                mid++;
                l++;
            }
            else if(nums[mid] == 1){
                mid++;
            }else{
                swap(mid,r,nums);
                r--;
            }
        }
    }
}