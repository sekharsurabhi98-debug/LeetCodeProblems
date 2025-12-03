class Solution {
    public int maxBalancedSubarray(int[] nums) {
       Map<String,Integer> map = new HashMap<>();
       int maxLength = 0;
       map.put("0,0",-1);
       int xor = 0;
       int eoc = 0;
       for(int i = 0; i < nums.length; i++){
           xor ^= nums[i];
           if(nums[i] % 2 == 0)
              eoc++;
            else
              eoc--;
           String k = xor+","+eoc;
           if(map.containsKey(k)){
                maxLength = Math.max(maxLength ,i - map.get(k));
           }else
           map.put(k,i);
       }
       return maxLength;
    }
}