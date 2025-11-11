class Solution {
    public int largestInteger(int[] nums, int k) {
        int maxResult = -1;
        if(nums.length == k){
            for(int v:nums){
                if(v > maxResult)
                    maxResult = v;
            }
            return maxResult;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= nums.length - k; i++){
            for(int j = i; j < i+k ; j++){
                map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1)
                maxResult = (key > maxResult) ? key : maxResult;
        }
        return maxResult;
    }
}