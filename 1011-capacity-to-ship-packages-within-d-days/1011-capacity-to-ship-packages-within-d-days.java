class Solution {
    public int findDays(int capacity, int[] nums){
        int days = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(capacity < sum){
                sum = nums[i];
                days++;
            }
        }
        return days + 1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int v : weights){
            max = (max < v) ? v : max;
            sum += v;
        }
        int bsa[] = new int[sum - max+1];
        int idx = 0;
        for(int i = max; i <= sum; i++){
            bsa[idx] = i;
            idx++;
        }
        int l = 0, r = bsa.length - 1;
        int ans = Integer.MAX_VALUE;
        while(l <= r){
            int mid = (l + r) / 2; 
            if(findDays(bsa[mid],weights) <= days){
                ans = Math.min(ans, bsa[mid]);
                r = mid - 1;
            }else{
                l = mid + 1;
            }
            
        }
        return ans;
    }
}