class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int n:nums)
           sum += n;
        int op = 0;
        if(sum % k == 0) return 0;
        else if(sum < k) return sum;
        else{

            while(sum % k != 0){
            op++;
            sum--;
            }
            return op;
        }
    }
}