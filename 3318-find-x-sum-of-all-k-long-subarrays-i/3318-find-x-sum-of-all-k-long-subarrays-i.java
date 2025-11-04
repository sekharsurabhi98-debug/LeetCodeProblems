class Solution {
    public int[] Xsum(int[] nums,int k,int x){
        int n = nums.length;
        int res[] = new int[n - k + 1];
        int in = 0;
        for(int i = 0; i < n - k + 1; i++){
            ArrayList<Integer> al = new ArrayList<>();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int j = i; j < k + i; j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
           
            for(int v : map.values()) al.add(v);
            Collections.sort(al);
            int c = 0;
            int inres = 0;
            for(int s = al.size() - 1; s >= 0; s--){
                if(c == x) break;
                int v = al.get(s);
                int taken = 0;
                if(c == x) break;
                for(int key:map.keySet()){
                    if(map.get(key) == v)
                     taken = Math.max(taken, key);
                }
                c++;
                inres += taken * v;
                map.remove(taken);
            }
            res[in++] = inres;
        }
        return res;
    }
       
       
    public int[] findXSum(int[] nums, int k, int x) {
        int res[] = Xsum(nums,k,x);
        return res;
    }
} 