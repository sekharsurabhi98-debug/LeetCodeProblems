class Solution {
    public int longestBalanced(int[] nums) {
       int maxLength = 0;

       for(int i = 0; i < nums.length; i++){
       Set<Integer> even = new HashSet<>();
       Set<Integer> odd = new HashSet<>();
          for(int j = i; j < nums.length; j++){
               
               if(!(even.contains(nums[j])) && nums[j] % 2 == 0)
                   even.add(nums[j]);
                else if(!(odd.contains(nums[j])) && nums[j] % 2 == 1)
                   odd.add(nums[j]);
                if(even.size() == odd.size())
                    maxLength = Math.max(maxLength, j - i + 1);
                System.out.println(even+" : "+odd);
          }
       }
       return maxLength;
    }
}
