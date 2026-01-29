class Solution {
    public String frequencySort(String s) {

        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        s = new String(ar);
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++){
            count = 1;
            while(i < s.length() - 1 && s.charAt(i+1) == s.charAt(i)){
                count++;
                i++;
            }
            if(i < s.length() - 1){
               System.out.println(s.charAt(i)+" : "+count);
               if(map.containsKey(count)){
                   map.put(count, map.get(count)+s.charAt(i));
               }else{
                map.put(count, ""+s.charAt(i));
               }
            }
            if(i < s.length() - 1 && s.charAt(i+1) != s.charAt(i))
                count = 1;

        }
        System.out.println(s.charAt(s.length() - 1)+" : "+count);
        if(map.containsKey(count)){
            map.put(count, map.get(count)+s.charAt(s.length() - 1));
            }else{
            map.put(count, ""+s.charAt(s.length() - 1));
        }

        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        for(int key : map.keySet()){
            StringBuilder ch = new StringBuilder();
            for(char c:map.get(key).toCharArray()){
                for(int i = 0; i < key; i++){
                    ch.append(c);
                }
            }
            sb.append(ch);
          
        }
        return sb.toString();
    }
}