class Solution {
  
   
    public int minRemoval(int[] nums, int k) {


    //     My Approach : Failed
    //     Arrays.sort(nums);

    //     if(nums.length == 2 && nums[0] * k < nums[1]) return 1;
    //     else if(nums.length == 2 && nums[0] * k >= nums[1]) return 0;
    //     int minIdx = 0;
    //     int maxIdx = 0;
        
    //     System.out.println(Arrays.toString(nums));
    //     int l = 0, r = nums.length - 1;
    //     int result1 = 0;
    //     while(l < r){

    //         System.out.println(l+" : "+r+" -> "+(nums[l] * k)+" "+nums[r]+"->"+result1);
    //         if(nums[l] * k >= nums[r]){
    //             break;
    //         }

    //         r--;
    //         result1++;
    //     }
    //     l = 0; r = nums.length - 1;
    //     int result2 = 0;
    //        while(l < r){
    //    System.out.println(l+" : "+r+" -> "+(nums[l] * k)+" "+nums[r]+"->"+result2);
    //         if(nums[l] * k >= nums[r]){
    //             break;
    //         }

    //         l++;
    //         result2++;
    //     }
    //     return (result1 < result2) ? result1 : result2;


        //Sliding Window
        // Sort The array
        // keep incrementing j until nums[i] * k < nums[j]
        // calculate the distance nums.length - (j - i)
        //take the minimum
        //Time Complexity: O(N + N LOG N)
        //Space Complexity: O(1)
        
        Arrays.sort(nums);
        int i = 0;
        int minimumRemovals = nums.length;
        
        int j = 0;
        for(i = 0; i < nums.length; i++){

            while(j < nums.length && nums[i] * k >= nums[j]){
                j++;
            }
            
            minimumRemovals = Math.min(minimumRemovals, nums.length - (j - i));
        }

        return minimumRemovals;

    }
}