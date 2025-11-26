class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] ar : accounts){
            int sum = 0;
            for(int money : ar){
                sum += money;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}