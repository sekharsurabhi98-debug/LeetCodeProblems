class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            set.add(n);
            int revNum = 0;
            while(n > 0){
                int rem = n % 10;
                revNum = revNum * 10 + rem;
                n = n / 10;
            }
            if(!set.contains(revNum))
               set.add(revNum);
        }
        return set.size();
    }
}