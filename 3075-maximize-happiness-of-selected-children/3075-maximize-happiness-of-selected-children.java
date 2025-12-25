class Solution {
  
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long max = 0;
        int idx = happiness.length - 1;
        int decrement = 1;
        while(k > 0){
           max += happiness[idx];
           idx--;
           if(idx >= 0 && happiness[idx] - decrement >= 0)
              happiness[idx] -= decrement;
           else if(idx >= 0)
              happiness[idx] = 0;
           decrement++;
           k--;
        }
        return max;
    }
}