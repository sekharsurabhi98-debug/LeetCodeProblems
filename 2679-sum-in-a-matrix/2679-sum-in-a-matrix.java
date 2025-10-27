class Solution {
    public int matrixSum(int[][] nums) {
        int sum = 0;
        ArrayList<int[]> al = new ArrayList();
        for(int ar[]:nums){
            Arrays.sort(ar);
            al.add(ar);
        }
        for(int i = 1; i <= nums[0].length; i++){
            int max = 0;
            for(int[] ar:al){
                max = (max < ar[ar.length - i]) ? ar[ar.length - i] : max;
            }
            sum = sum + max;
        }
        return sum;
    }
}