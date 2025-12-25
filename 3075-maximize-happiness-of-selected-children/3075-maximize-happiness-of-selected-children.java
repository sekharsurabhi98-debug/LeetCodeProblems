class Solution {
  
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long max = 0;
        int idx = happiness.length - 1;
        int decrement = 1;
        k -= 1;
        while(k >= 0){
           max += happiness[idx];
           idx--;
           if(happiness[idx] - decrement >= 0)
              happiness[idx] -= decrement;
           else
              happiness[idx] = 0;
           decrement++;
           k--;
        }
        return max;
    }
}