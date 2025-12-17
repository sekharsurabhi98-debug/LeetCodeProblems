class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i-1] == nums[i])
                continue;
            int sum = nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int addition = nums[l] + nums[r] + sum;
                if(addition == 0){
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);al.add(nums[l]);al.add(nums[r]);
                    list.add(al);
                    l++;
                    r--;
                    while(l < nums.length  && nums[l] == nums[l-1]) l++;
                    while(r > 0 && nums[r] == nums[r + 1]) r--;    
                    
                }else if(addition < 0){
                      l++;
                }
                else{
                   r--;
                }
            }
        }
        return list;
    }
}