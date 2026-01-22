class Solution {
    public boolean isSorted(List<Integer> nums){
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i-1) > nums.get(i))
            return false;
        }
        return true;
    }
    public int pairSum(List<Integer> list){
          
        int minSum = Integer.MAX_VALUE;
        int minIdx = -1;
        for(int i = 1; i < list.size(); i++){
            if(list.get(i-1) + list.get(i) < minSum){
                minSum = list.get(i-1) + list.get(i);
                minIdx = i-1;
            }
        }
        return minIdx;
    }
    public int minimumPairRemoval(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        for(int v:nums)
        list.add(v);
        if(isSorted(list))
           return 0;
        int count = 0;
        while(!isSorted(list)){
            int minIdx = pairSum(list);
            int sum = list.get(minIdx) + list.get(minIdx+1);
            list.remove(minIdx);
            list.remove(minIdx);
            list.add(minIdx, sum);
            count++;
        }
        return count;
    }
}