class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
      HashMap<Integer, List<Integer>> map = new HashMap<>();
       List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && map.get(nums[i]).size() != nums[i]){
                map.get(nums[i]).add(i);
            }else if(map.containsKey(nums[i]) && map.get(nums[i]).size() == nums[i]){
                list.add(new ArrayList<>(map.get(nums[i])));
                map.get(nums[i]).clear();
                map.get(nums[i]).add(i);
            }else{
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
        for(List<Integer> al : map.values()){
            list.add(al);
        }
        return list;
    }
}