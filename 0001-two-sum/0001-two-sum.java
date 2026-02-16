class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};*/
        //two pass solution
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     int compliment = target - nums[i];
        //     if (map.containsKey(compliment) && i != map.get(compliment)) {
        //         return new int[] { i, map.get(compliment) };
        //     }
        // }
        // return new int[] {};
        //optimized solution
        /*
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length;i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                return new int[]{map.get(val),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};*/

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}