class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int d[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            HashSet<Integer> setLeft = new HashSet<>();
            HashSet<Integer> setRight = new HashSet<>();
            for(int j = 0; j <= i; j++){
                  setLeft.add(nums[j]);
            }
            for(int j = i+1; j < nums.length; j++){
                  setRight.add(nums[j]);
            }
            d[i] = setLeft.size() - setRight.size();
        }
        return d;
    }
}