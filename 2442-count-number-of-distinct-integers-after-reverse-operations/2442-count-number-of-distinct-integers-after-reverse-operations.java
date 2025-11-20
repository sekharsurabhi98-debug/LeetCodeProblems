class Solution {
    public int countDistinctIntegers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            String ns = i+"";
            String ns1 = "";
            for(char c: ns.toCharArray()){
                ns1 = c + ns1;
            }
            list.add(Integer.parseInt(ns1));
            set.add(i);
            set.add(list.get(list.size()-1));
        }
        return set.size();
    }
}