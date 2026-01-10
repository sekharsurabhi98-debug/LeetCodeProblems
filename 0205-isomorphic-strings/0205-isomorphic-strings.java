class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*
        My Approach
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        System.out.println(map1.size()+" "+map2.size());
        if(map1.size() != map2.size()) return false;
        for(int v1 : map1.values()){
            boolean found = false;
            for(int v2 : map2.values()){
                if(v1 == v2)
                   found = true;
            }
            if(!found) return false;
        }
        return true; */
        if(s.length() != t.length()) return false;
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            boolean found = true;
            if(map1.containsKey(c1)){
                if(map1.get(c1) != c2) return false;
                found = false;
            }
            
            if(map2.containsKey(c2)){
                if(map2.get(c2) != c1) return false;
                found = false;
            }
            
            if(found){
            map1.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}