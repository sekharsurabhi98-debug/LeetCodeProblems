class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        // 4Sum = outerLoop + 3Sum;
        //TC = O(N) * O(N^2) = O(N^3)
        
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){

            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j = i + 1; j < nums.length; j++){

                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int l = j + 1, r = nums.length - 1;

                while(l < r){

                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){

                        list.add(new ArrayList(List.of(nums[i],nums[j],nums[l],nums[r])));
                        l++;

                        while(l < nums.length && nums[l] == nums[l-1]) l++;

                        r--;

                        while(r >= 0 && nums[r] == nums[r+1]) r--;
                    }
                    else if(sum > target)
                        r--;
                    else
                       l++;
                }
            }
        }
        return list;
    }
}