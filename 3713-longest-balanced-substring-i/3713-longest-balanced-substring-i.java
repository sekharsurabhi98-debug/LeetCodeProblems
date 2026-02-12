class Solution {
    public boolean isValid(Map<Character,Integer> map, char t){

        int count = map.get(t);
        for(char c : map.keySet()){
            if(map.get(c) != count)
            return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            Map<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++){

                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
                if(isValid(map, s.charAt(i))){
                       maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
}