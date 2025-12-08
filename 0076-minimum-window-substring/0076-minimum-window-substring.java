// class Solution {
//     public String minWindow(String s, String t) {
//         if(s.length() < t.length())
//             return "";
//         if(s.equals(t))
//            return s;
//         HashMap<Character, Integer> needMap = new HashMap<>();
//         HashMap<Character,Integer> currentMap = new HashMap();
//         for(char c : t.toCharArray())
//            needMap.put(c, needMap.getOrDefault(c,0)+1);
//         int having = 0, needCount = needMap.size(), minLength = Integer.MAX_VALUE;
//         int start = 0,l = 0;
//         for(int r = 0; r < s.length(); r++){
//             char ch = s.charAt(r);
//             currentMap.put(ch,currentMap.getOrDefault(ch,0)+1);
//             if(needMap.containsKey(ch) && needMap.get(ch).intValue() == currentMap.get(ch).intValue())
//                 having++;
//             while(having == needCount){
//                 char c = s.charAt(l);
//                 if(minLength > r - l + 1){
//                     minLength = r - l + 1;
//                     start = l;
//                 }
//                 currentMap.put(c, currentMap.get(c) - 1);
//                 if(needMap.containsKey(c) && needMap.get(c) > currentMap.get(c))
//                    having--;
//                 l++;
//             }
//         }
//         return  (minLength == Integer.MAX_VALUE) ? "" : s.substring(start,start + minLength);
//     }
// }



class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        if(s.equals(t)) return s;
        
        Map<Character,Integer> needMap = new HashMap<>();
        Map<Character,Integer> currentMap = new HashMap<>();

        for(char ch : t.toCharArray()){
            needMap.put(ch, needMap.getOrDefault(ch,0)+1);
        }
        int needCount = needMap.size();
        int having = 0;
        int l = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            currentMap.put(ch, currentMap.getOrDefault(ch,0)+1);
            if(needMap.containsKey(ch) && needMap.get(ch).intValue() == currentMap.get(ch).intValue())
                having++;
            while(having == needCount){
                if(r - l + 1 < minLength){
                    minLength = r - l + 1;
                    start = l;
                }
                char c = s.charAt(l);
                currentMap.put(c, currentMap.get(c) - 1);
                if(needMap.containsKey(c) && needMap.get(c) > currentMap.get(c))
                    having--;
                l++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ?   "" : s.substring(start, start + minLength);
    }
}
