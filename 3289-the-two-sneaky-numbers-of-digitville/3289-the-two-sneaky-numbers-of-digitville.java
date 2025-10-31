class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int idx = 0;
        for(int v : nums){
            if(!set.add(v))
               res[idx++] = v;
        }
        return res;
    }
}