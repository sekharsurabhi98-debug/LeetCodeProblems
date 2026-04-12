class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
 
        for(char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        for(char c : s.toCharArray()){
            if(!map1.get(c).equals(map2.get(c)))
            return false;
        }
        return true; */
        
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];

        for(char c :s.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c :t.toCharArray()){
            freq[c - 'a']--;
        }

        for(int i : freq){
            if(i > 0) return false;
        }
        return true;

    }
}