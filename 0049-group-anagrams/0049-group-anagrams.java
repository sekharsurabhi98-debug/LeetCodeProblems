class Solution {
    public static boolean isAnagram(String s1, String s2){
        char ar1[] = s1.toCharArray();
        char ar2[] = s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        s1 = new String(ar1);
        s2 = new String(ar2);
        return (s1.equals(s2));
        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        
        /*List<List<String>> result = new ArrayList<>();
        
        for(int i = 0; i < strs.length; i++){
            if(strs[i].equals("false"))
                 continue;
            List<String> group = new ArrayList<String>();
            group.add(strs[i]);
            for(int j = i + 1; j < strs.length; j++){
                 if(strs[j].equals("false"))
                       continue;
                  if(isAnagram(strs[i], strs[j])){

                    group.add(strs[j]);
                    strs[j] = "false";
                  }
            }
     
            result.add(group);
        }
        return result;*/

        HashMap<String, List<String>> map = new HashMap<String,List<String>>();
        for(String s : strs){
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String s1 = String.valueOf(ar);
            if(!map.containsKey(s1))
                 map.put(s1, new ArrayList<String>());
            map.get(s1).add(s);
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
        
    }
}