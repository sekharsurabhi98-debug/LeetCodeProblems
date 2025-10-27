class Solution {
    public int matrixSum(int[][] nums) {
        int sum = 0;
        int i = 1;
        for(i = 1; i <= nums[0].length;i++){
            int max = 0;
            for(int[] ar : nums){
            Arrays.sort(ar);
            max = Math.max(max, ar[ar.length - i]);
            }
            sum += max;
        }
        return sum;
    }
}