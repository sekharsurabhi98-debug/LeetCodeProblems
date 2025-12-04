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
        int res = 0;
        int majority = 0;
        for(int n : nums){
            if(majority == 0)
                res = n;
            majority += (res == n) ? 1 : -1;
        }
        return res;
    }
}