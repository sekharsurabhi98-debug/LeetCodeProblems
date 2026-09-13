class Solution {
    public int countSpecialIntegers(int[] nums) {
        //  Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        // List<Integer> al = new ArrayList<>();
        // for(int n : nums){
            
        //     map1.put(n, map1.getOrDefault(n,0)+1);
        // }

        // for(int n : map1.keySet()){

        //     if(map1.get(n) >= 3){
        //         al.add(n);
        //     }
            
        // }

        // System.out.println(al);
        // int count = 0;
        // for(Integer v : al){
        //     List<Integer> idx = new ArrayList<>();
        //     for(int i = 0; i < nums.length; i++){
        //         if(v == nums[i]){
        //             idx.add(i);
        //         }
        //     }
        //     boolean canTake = false;
        //     for(int i = 0; i < idx.size() - 2; i++){
        //       if(Math.abs(idx.get(i) - idx.get(i+1)) == Math.abs(idx.get(i+1) - idx.get(i+2)))
        //       canTake = true;
        //     }
        //     if(canTake)
        //     count++;
        // }
        // return count;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        //System.out.println(map);
        int count = 0;
        for(List<Integer> idx : map.values()){
           
           if(idx.size() < 3) continue;
           boolean canTake = true;
           for(int i = 0; i < idx.size() - 2;i++){
         
            if(! (Math.abs(idx.get(i) - idx.get(i+1)) == Math.abs(idx.get(i+1) - idx.get(i+2)))){
                canTake = false;
                break;
              }
           }

           if(canTake)
           count++;
        }
        return count;
    }
}