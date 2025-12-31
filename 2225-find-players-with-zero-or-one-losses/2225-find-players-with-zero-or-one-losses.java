class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] ar:matches){
            map.put(ar[1], map.getOrDefault(ar[1],0)+1);
        }
        List<Integer> winners= new ArrayList<>();
        for(int ar[]:matches){
            if(!map.containsKey(ar[0]) && !winners.contains(ar[0]))
                winners.add(ar[0]);
        }
        List<Integer> losers = new ArrayList<>();
        for(int k : map.keySet())
             if(map.get(k) == 1)
                  losers.add(k);
        Collections.sort(winners);
        Collections.sort(losers);
        result.add(winners);
        result.add(losers);
        return result;
    }
}