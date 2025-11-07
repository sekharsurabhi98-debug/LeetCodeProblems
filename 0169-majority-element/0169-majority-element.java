class Solution {
    public int majorityElement(int[] nums) {
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
        return max;
    }
}