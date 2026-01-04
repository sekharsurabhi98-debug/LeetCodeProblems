class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum1 = 0;
        for(int num : nums){
            int sum2 = 0;
            int count = 0;
            for(int i = 1; i * i <= num; i++){
                if(num % i == 0){
                    count++;
                    sum2 += i;
                    int j = num / i;
                    if(j != i){
                        count++;
                        sum2 += j;
                    }
                    if(count > 4) break;
                }
            }
            if(count == 4) sum1 += sum2;
        }
        
        return sum1;
    }

}