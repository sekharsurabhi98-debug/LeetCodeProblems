class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length == 3) return false;
        int fi = 1;
        boolean firstFound = false;
        while(fi < nums.length && nums[fi-1] < nums[fi]){
           fi++;
           firstFound = true;
        }
        
        int mi = fi;
        boolean middleFound = false;
        while(mi < nums.length && nums[mi] < nums[mi - 1]){
            middleFound = true;
            mi++;
        }

        int li = mi;
        boolean lastFound = true;
        while(li < nums.length){
            if(nums[li - 1] >= nums[li])
               lastFound = false;
            li++;
        }

        if(firstFound && middleFound && lastFound)
        return true;
        return false;


        

    }
}