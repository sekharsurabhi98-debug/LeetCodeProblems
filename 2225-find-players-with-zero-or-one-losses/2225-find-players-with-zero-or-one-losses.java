class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int[] ar:matches){
            map.put(ar[1], map.getOrDefault(ar[1],0)+1);
        }
       Set<Integer> set1 = new TreeSet<>();
        for(int ar[]:matches){
            if(!map.containsKey(ar[0]))
                set1.add(ar[0]);
        }
   
        Set<Integer> set2 = new TreeSet<>();
        for(int k : map.keySet())
             if(map.get(k) == 1)
                  set2.add(k);
        
        List<Integer> winners= new ArrayList<>(set1);
        List<Integer> losers = new ArrayList<>(set2);
        result.add(winners);
        result.add(losers);
        return result;
    }
}