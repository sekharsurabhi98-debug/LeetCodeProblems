class Solution {
    public int majorityElement(int[] nums) {
        /*
        Time Complexity: O(N)
        Space Complexity: O(N)
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int max = 0;
        for(int val : nums){
            map.put(val, map.getOrDefault(val,0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) >  (nums.length / 2) ){
                 max = key;
                 break;
            }
        }
        return max;*/
        if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                count++;
                if(count > nums.length / 2)
                    return nums[i];
            }else{
                count = 1;
            }
        }
        return 0;
    }
}