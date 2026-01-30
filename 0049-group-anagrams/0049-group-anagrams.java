class Solution {
    // public static boolean isAnagram(String s1, String s2){
    //     char ar1[] = s1.toCharArray();
    //     char ar2[] = s2.toCharArray();
    //     Arrays.sort(ar1);
    //     Arrays.sort(ar2);
    //     s1 = new String(ar1);
    //     s2 = new String(ar2);
    //     return (s1.equals(s2));
        
    // }
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

        // HashMap<String, List<String>> map = new HashMap<String,List<String>>();
        // for(String s : strs){
        //     char[] ar = s.toCharArray();
        //     Arrays.sort(ar);
        //     String s1 = String.valueOf(ar);
        //     if(!map.containsKey(s1))
        //          map.put(s1, new ArrayList<String>());
        //     map.get(s1).add(s);
        // }
        // return new ArrayList<>(map.values());

    //     List<List<String>> result = new ArrayList<>();
    //     for(int i = 0; i < strs.length; i++){
    
    //         if(strs[i].equals("taken")) continue;
    //         List<String> list = new ArrayList<>();
    //         int j = i+1;
    //         list.add(strs[i]);
    //         while(j < strs.length){
    //             if(isValid(strs[i], strs[j])){
    //                list.add(strs[j]);
    //                strs[j] = "taken";
    //             }
    //             j++;
    //         }

    //          result.add(list);
    //     }

    //    return result;

        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            
            StringBuilder key = new StringBuilder();
            int[] freq = new int[26];
            for(char c : strs[i].toCharArray()){
                freq[c - 'a']++;
            }

            for(int j = 0; j < 26; j++){
                key.append("#").append(freq[j]);
            }
            System.out.println(key.toString());
            if(map.containsKey(key.toString())){
                map.get(key.toString()).add(strs[i]);
            }else{
                map.put(key.toString(), new ArrayList<>());
                map.get(key.toString()).add(strs[i]);
            }

        }
        return new ArrayList<>(map.values());
    }
    
    public int[] calcFreq(String s){

        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            int idx = c - 97;
            freq[idx]++;
        }
        return freq;
    }

    public boolean isValid(String s1, String s2){

        int[] freq1 = calcFreq(s1);
        int[] freq2 = calcFreq(s2);
        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i])
            return false;
        }
        return true;
    }
    
}