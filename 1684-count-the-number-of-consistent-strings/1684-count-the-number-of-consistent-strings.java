class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Map<Character, Integer> map1= new HashMap<>();
        for(char c:allowed.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for(String word :words){
            Map<Character,Integer> map = new HashMap<>();
            for(char c:word.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            boolean take = true;
            for(char c:map.keySet()){
                if(!map1.containsKey(c)){
                    take = false;
                }   
            }
            if(take)
               count++;
        }
        return count;
    }
}