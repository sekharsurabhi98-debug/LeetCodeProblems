class Solution {
    public List<Integer> majorityElement(int[] nums) {
        double count = nums.length / 3.0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int v:nums)
           map.put(v, map.getOrDefault(v,0)+1);
        List<Integer> al = new ArrayList<>();
        for(int key :map.keySet()){
            if(map.get(key) > count)
                 al.add(key);
        }
        return al;
    }
}