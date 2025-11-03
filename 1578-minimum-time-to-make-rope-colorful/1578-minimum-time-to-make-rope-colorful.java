class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minTime = Integer.MAX_VALUE;
        int time = 0;
        int next = neededTime[0];
        for(int i = 1; i < colors.length(); i++){
            if(colors.charAt(i-1) == colors.charAt(i)){
                time += Math.min(next,neededTime[i]);
                next = Math.max(next,neededTime[i]);
            }else{
                next = neededTime[i];
            }
        }
        return time;
    }
}