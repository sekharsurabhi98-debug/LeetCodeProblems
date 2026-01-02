class Solution {
    public int repeatedNTimes(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int v : nums){
            if(set.contains(v)){
                result = v;
                break;
            }
            set.add(v);
        }
        return result;
    }
}