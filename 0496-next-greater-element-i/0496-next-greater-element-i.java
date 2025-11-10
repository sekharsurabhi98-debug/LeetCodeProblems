class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            boolean found = false;
            int start = 0;
            for(int j = 0; j < nums2.length;j++){
                if(nums2[j] == nums1[i])
                      start = 1;
                if(start == 1 && nums1[i] < nums2[j]){
                    res[i] = nums2[j];
                    found = true;
                    break;
                }
            }
            if(!found)
              res[i] = -1;
        }
        return res;*/

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Stack<Integer> stack = new Stack<>();
        for(int num : nums2){
            if(!stack.isEmpty() && stack.peek() < num)
               map.put(stack.pop(), num);
            stack.push(num);
        }
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}