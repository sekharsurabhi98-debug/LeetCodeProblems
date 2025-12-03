class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       long sum = 0;
       int l = 0;
       long maxSum = 0;
       for(int r = 0; r < nums.length; r++){
          sum += nums[r];
          map.put(nums[r],map.getOrDefault(nums[r],0)+1);
          if(r - k + 1 >= 0){
            if(map.size() >= k){
                maxSum = Math.max(sum,maxSum);
            }
            sum -= nums[r - k + 1];
            map.put(nums[r - k + 1],map.get(nums[r - k + 1]) - 1);
            if(map.get(nums[r - k + 1]) == 0) map.remove(nums[r - k + 1]);
          }
       }
       return maxSum;
    }
}